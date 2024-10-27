package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.adapters.EmailAdapter
import com.example.gmail.models.EmailModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var emailAdapter: EmailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        emailAdapter = EmailAdapter(getEmailItems())
        recyclerView.adapter = emailAdapter
    }

    private fun getEmailItems(): List<EmailModel> {
        return listOf(
            EmailModel("John Doe", "Meeting Reminder", "Don\'t forget about the meeting scheduled for tomorrow.", "Oct 27, 2024"),
            EmailModel("John Doe", "Meeting Reminder", "Don\'t forget about the meeting scheduled for tomorrow.", "Oct 27, 2024"),
            EmailModel("John Doe", "Meeting Reminder", "Don\'t forget about the meeting scheduled for tomorrow.", "Oct 27, 2024"),
            EmailModel("John Doe", "Meeting Reminder", "Don\'t forget about the meeting scheduled for tomorrow.", "Oct 27, 2024"),
            EmailModel("John Doe", "Meeting Reminder", "Don\'t forget about the meeting scheduled for tomorrow.", "Oct 27, 2024"),
            EmailModel("John Doe", "Meeting Reminder", "Don\'t forget about the meeting scheduled for tomorrow.", "Oct 27, 2024"),
            EmailModel("John Doe", "Meeting Reminder", "Don\'t forget about the meeting scheduled for tomorrow.", "Oct 27, 2024"),
            EmailModel("John Doe", "Meeting Reminder", "Don\'t forget about the meeting scheduled for tomorrow.", "Oct 27, 2024"),
            EmailModel("John Doe", "Meeting Reminder", "Don\'t forget about the meeting scheduled for tomorrow.", "Oct 27, 2024"),
            EmailModel("John Doe", "Meeting Reminder", "Don\'t forget about the meeting scheduled for tomorrow.", "Oct 27, 2024"),
        )
    }
}
