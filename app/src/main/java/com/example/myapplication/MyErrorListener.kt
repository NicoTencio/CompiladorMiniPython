package com.example.myapplication

import com.example.myapplication.generated.*
import org.antlr.v4.runtime.BaseErrorListener
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer

//Clase generada por el profesor
//En base a esta se obtienen la errorListener
class MyErrorListener : BaseErrorListener() {
    val errorMsgs = ArrayList<String>()

    init {
        errorMsgs.clear()
    }

    override fun syntaxError(
        recognizer: Recognizer<*, *>?,
        offendingSymbol: Any?,
        line: Int,
        charPositionInLine: Int,
        msg: String?,
        re: RecognitionException?
    ) {
        if (recognizer is archivosParser) {
            errorMsgs.add("PARSER ERROR - line $line:$charPositionInLine $msg")
        } else if (recognizer is archivosLexer) {
            errorMsgs.add("SCANNER ERROR - line $line:$charPositionInLine $msg")
        } else {
            errorMsgs.add("Other Error")
        }
    }

    fun hasErrors(): Boolean {
        return errorMsgs.isNotEmpty()
    }

    /*    fun getErrorMsgs(): ArrayList<String> {
            return errorMsgs
        }*/

    override fun toString(): String {
        if (!hasErrors()) return "0 errors"
        val builder = StringBuilder()
        for (s in errorMsgs) {
            builder.append("$s\n")
        }
        return builder.toString()
    }
}
