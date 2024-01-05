package com.example.dailynotesapp.data

import androidx.room.*

@Dao
interface NoteDao {

    @Insert
    suspend fun insertNote(noteEntity: NoteEntity)

    @Delete
    suspend fun deleteNote(noteEntity: NoteEntity)

    @Query("Select * from note_table order by id ASC")
    fun getALlNotes(): List<NoteEntity>

    @Query("UPDATE note_table Set title= :title, note= :note WHERE id= :id")
    suspend fun updateNote(id: Int?, title: String?, note: String?)

}