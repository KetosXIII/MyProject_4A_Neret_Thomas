package com.example.myproject_4a_neret_thomas.injection
import android.content.Context
import androidx.room.Room
import com.example.myproject_4a_neret_thomas.data.local.models.AppDatabase
import com.example.myproject_4a_neret_thomas.data.local.models.DatabaseDao
import com.example.myproject_4a_neret_thomas.data.repository.UserRepository
import com.example.myproject_4a_neret_thomas.domain.usecase.CreateUserUseCase
import com.example.myproject_4a_neret_thomas.domain.usecase.GetUserUseCase
import com.example.myproject_4a_neret_thomas.presentation.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel(get(),get()) }

}
val domainModule = module {
    factory { CreateUserUseCase(get()) }
    factory { GetUserUseCase(get()) }
}
val dataModule= module {
   single {  UserRepository(get())}
    single{createDataBase(androidContext())
    }
}

fun createDataBase(context: Context):DatabaseDao {

    val appDatabase = Room.databaseBuilder(context,
         AppDatabase::class.java,"database-name"
    ).build()
    return appDatabase.databaseDao()
}

