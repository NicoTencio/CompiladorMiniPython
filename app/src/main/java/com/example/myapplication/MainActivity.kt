package com.example.myapplication

import com.example.myapplication.generated.*

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.antlr.runtime.tree.ParseTree
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.RecognitionException
import android.graphics.Color

class MainActivity : AppCompatActivity() {

    private val PICK_FILE_REQUEST_CODE = 1000 // Código de solicitud personalizado
    private lateinit var textViewInfo: TextView
    private lateinit var textViewInfo2: TextView
    private var fileContent = "" //Aquí se va a almacenar el contenido del archivo selecionado

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewInfo = findViewById(R.id.textView) //aquí se va a mostrar el texto del txt
        textViewInfo2 = findViewById(R.id.textView2) //aquí se va a mostrar los errores

        val openFileButton = findViewById<Button>(R.id.button)

        openFileButton.setOnClickListener {
            //Restablece el texto cuando se abre el explorador de archivos
            textViewInfo.text = "Texto del archivo..."
            textViewInfo2.setTextColor(Color.BLACK)
            textViewInfo2.text = "Errores..."
            openFileChooser()
        }

        val analyzeButton = findViewById<Button>(R.id.analyzeButton)
        analyzeButton.setOnClickListener {
            //Compila
            analyzeFile(fileContent)
        }

    }




    private fun openFileChooser() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "*/*" // Tipo de archivo para abrir cualquier tipo de archivo
        startActivityForResult(intent, PICK_FILE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == PICK_FILE_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            val selectedFileUri = data?.data
            selectedFileUri?.let {
                // Obtiene el contenido del archivo y lo muestra en el TextView
                fileContent = readTextFromUri(selectedFileUri)
                textViewInfo.text = formatFileContentWithLineNumbers(fileContent)
            }
        }
    }

    private fun analyzeFile(fileContent: String) {
        // Configurar el analizador léxico y sintáctico
        val inputStream = CharStreams.fromString(fileContent)
        val lexer = archivosLexer(inputStream)
        val tokens = CommonTokenStream(lexer)
        val parser = archivosParser(tokens)

        // Configurar tu error listener personalizado si lo tienes
        val errorListener = MyErrorListener()
        lexer.addErrorListener(errorListener)
        parser.addErrorListener(errorListener)

        try {
            val tree = parser.program()

            if(errorListener.hasErrors()){//Si hay errores entra acá
                textViewInfo2.setTextColor(Color.RED)
                textViewInfo2.text = errorListener.errorMsgs.toString()//tree.toStringTree(parser)
            }else{//Si NO hay errores entra acá
                textViewInfo2.setTextColor(Color.GREEN)
                textViewInfo2.text =  "Complilación exitosa!..."
            }
        } catch (e: RecognitionException) {
            //textViewInfo2.text = errorListener.toString()
        }
    }

    //Este método cambia el formato de un texto y agrega un número al inicio de cada linea
    private fun formatFileContentWithLineNumbers(fileContent: String): String {
        val lines = fileContent.split("\n")
        val formattedContent = StringBuilder()

        for ((index, line) in lines.withIndex()) {
            val lineNumber = index + 1
            formattedContent.append("$lineNumber. $line\n")
        }

        return formattedContent.toString()
    }

    private fun readTextFromUri(uri: Uri): String {
        val inputStream = contentResolver.openInputStream(uri)
        val reader = BufferedReader(InputStreamReader(inputStream))
        val stringBuilder = StringBuilder()
        var line: String?
        try {
            while (reader.readLine().also { line = it } != null) {
                stringBuilder.append(line).append("\n")
            }
        } catch (e: IOException) {
            e.printStackTrace()
        } finally {
            try {
                inputStream?.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return stringBuilder.toString()
    }
}

