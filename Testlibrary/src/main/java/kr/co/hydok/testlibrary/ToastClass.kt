package kr.co.hydok.testlibrary

import android.content.Context
import android.widget.Toast

object ToastClass {

    fun showToast(context:Context, msg : String): Toast = Toast.makeText(context,msg,Toast.LENGTH_SHORT)
    //g호호호호호호호호
}