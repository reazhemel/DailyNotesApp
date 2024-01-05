package com.example.dailynotesapp.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepository @Inject constructor(
    private val noteDao: NoteDao) {

    suspend fun insertNote(noteEntity: NoteEntity){
        noteDao.insertNote(noteEntity)
    }

    suspend fun deleteNote(noteEntity: NoteEntity){
        noteDao.deleteNote(noteEntity)
    }

    suspend fun updateNote(noteEntity: NoteEntity){
        noteDao.updateNote(noteEntity.id, noteEntity.title, noteEntity.title)
    }

    suspend fun getAllNotes(): List<NoteEntity> {
        return noteDao.getALlNotes()
    }

}