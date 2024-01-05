package com.example.dailynotesapp.di

import android.app.Application
import androidx.room.Room
import com.example.dailynotesapp.data.NoteDao
import com.example.dailynotesapp.data.NoteDatabase
import com.example.dailynotesapp.data.NoteRepository
import com.example.dailynotesapp.util.AppConstant.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DailyNotesModule {

    @Provides
    @Singleton
    fun provideDailyNotes(application: Application):NoteDatabase{
        return Room.databaseBuilder(
            application,
            NoteDatabase::class.java,
            DATABASE_NAME,
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteDao(database: NoteDatabase):
            NoteDao = database.getNoteDao()


    @Provides
    @Singleton
    fun provideNoteRepository(noteDao: NoteDao):
            NoteRepository = NoteRepository(noteDao)
}