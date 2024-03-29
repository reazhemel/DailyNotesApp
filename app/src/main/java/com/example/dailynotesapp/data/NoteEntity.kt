package com.example.dailynotesapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
   @ColumnInfo(name = "title") val title: String?,
   @ColumnInfo(name = "note") val note: String?,
   @ColumnInfo(name = "date") val date: String?
)