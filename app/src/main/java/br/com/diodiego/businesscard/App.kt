package br.com.diodiego.businesscard

import android.app.Application
import br.com.diodiego.businesscard.data.AppDatabase
import br.com.diodiego.businesscard.data.BusinessCardRepository

class App: Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}