package Ifra

import android.content.Context

//  tudo isso é para armazenar e pegar uma string quando quiser, vulgo os dados do usuario, não funciona pra muoita informação

class Securityclasses ( context: Context){

    private val mSharedPreferences =
        context.getSharedPreferences("motivation",Context.MODE_PRIVATE)

    fun storeString (key: String, value:String){
        mSharedPreferences.edit().putString(key,value).apply()
    }

    fun getString(key:String):String{
         return mSharedPreferences.getString(key,"") ?: ""
    }
}