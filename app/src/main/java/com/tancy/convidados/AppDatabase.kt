package com.tancy.convidados

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Convidado::class], version = 1)
abstract class AppDatabase: RoomDatabase(){


    companion object{
        val DATABASE_NAME = "convidados"
        private lateinit var INSTANCE: AppDatabase

        fun getInstance(context: Context): AppDatabase{
            if(!::INSTANCE.isInitialized){
                INSTANCE = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    DATABASE_NAME
                ).allowMainThreadQueries().build()
            }
            return INSTANCE
        }
    }

}