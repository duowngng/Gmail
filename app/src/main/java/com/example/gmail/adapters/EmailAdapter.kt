package com.example.gmail.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.R
import com.example.gmail.models.EmailModel


class EmailAdapter(private val emailList: List<EmailModel>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val senderNameTextView: TextView = itemView.findViewById(R.id.senderNameTextView)
        val subjectTextView: TextView = itemView.findViewById(R.id.subjectTextView)
        val contentPreviewTextView: TextView = itemView.findViewById(R.id.contentPreviewTextView)
        val timestampTextView: TextView = itemView.findViewById(R.id.timestampTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.senderNameTextView.text = email.senderName
        holder.subjectTextView.text = email.subject
        holder.contentPreviewTextView.text = email.contentPreview
        holder.timestampTextView.text = email.timestamp
    }

    override fun getItemCount(): Int = emailList.size
}



