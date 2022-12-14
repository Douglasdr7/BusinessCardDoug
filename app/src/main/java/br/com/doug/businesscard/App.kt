package br.com.doug.businesscard

import android.app.Application
import br.com.doug.businesscard.data.AppDatabase
import br.com.doug.businesscard.data.BusinessCardRepository

class App:Application (){
    val database by lazy { AppDatabase.getDatabase(this)
    val repository by lazy { BusinessCardRepository (database.businessDao())}}
}