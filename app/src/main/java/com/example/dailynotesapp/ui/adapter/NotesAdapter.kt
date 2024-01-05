package com.example.dailynotesapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dailynotesapp.R
import com.example.dailynotesapp.data.NoteEntity

class NotesAdapter() : RecyclerView.Adapter<NotesAdapter.NotesViewHolder>() {

    private val notesList: List<NoteEntity> = emptyList()


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NotesAdapter.NotesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return NotesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return notesList.size
    }

    override fun onBindViewHolder(holder: NotesAdapter.NotesViewHolder, position: Int) {

    }


    inner class NotesViewHolder(notesView: View) :
        RecyclerView.ViewHolder(notesView)


}