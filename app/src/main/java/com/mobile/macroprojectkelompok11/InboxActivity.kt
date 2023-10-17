package com.mobile.macroprojectkelompok11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class InboxActivity : AppCompatActivity() {

    private lateinit var newRecyclerview : RecyclerView
    private lateinit var newArrayList : ArrayList<Inbox_Message_Alert>
    lateinit var inbox_image_alert : Array<Int>
    lateinit var inbox_text_alert : Array<String>
    lateinit var inbox_textdate_alert : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inbox)

        inbox_image_alert = arrayOf(
            R.drawable.emoji_tidaksehat_mini,
            R.drawable.emoji_tidaksehat_mini,
            R.drawable.emoji_sgttidaksehat,
            R.drawable.emoji_tidaksehat_mini,
            R.drawable.emoji_tidaksehat_mini
        )

        inbox_text_alert = arrayOf(
            "Perhatian! Kualitas udara di Codet saat ini <b>tidak sehat</b>. Jaga kesehatan Anda dan hindari aktivitas di luar ruangan jika memungkinkan.",
            "Perhatian! Kualitas udara di Codet saat ini <b>tidak sehat</b>. Jaga kesehatan Anda dan hindari aktivitas di luar ruangan jika memungkinkan.",
            "Perhatian! Kualitas udara di Codet saat ini <b>sangat tidak sehat</b>. Jaga kesehatan Anda dan hindari aktivitas di luar ruangan jika memungkinkan.",
            "Perhatian! Kualitas udara di Codet saat ini <b>tidak sehat</b>. Jaga kesehatan Anda dan hindari aktivitas di luar ruangan jika memungkinkan.",
            "Perhatian! Kualitas udara di Codet saat ini <b>tidak sehat</b>. Jaga kesehatan Anda dan hindari aktivitas di luar ruangan jika memungkinkan."
        )

        inbox_textdate_alert = arrayOf(
            "21 Sep, 8:09",
            "18 Sep, 22:15",
            "2 Sep, 10:00",
            "25 Agu, 13:09",
            "24 Agu, 18:15"
        )

        newRecyclerview = findViewById(R.id.recyclerView)
        newRecyclerview.layoutManager = LinearLayoutManager(this)
        newRecyclerview.setHasFixedSize(true)

        newArrayList = arrayListOf<Inbox_Message_Alert>()
        getUserdata()
    }

    private fun getUserdata() {
        for (i in inbox_image_alert.indices){
            val inboxmessagealert = Inbox_Message_Alert(inbox_image_alert[i], inbox_text_alert[i], inbox_textdate_alert[i])
            newArrayList.add(inboxmessagealert)
        }

        newRecyclerview.adapter = InboxAlertAdapter(newArrayList)
    }
}