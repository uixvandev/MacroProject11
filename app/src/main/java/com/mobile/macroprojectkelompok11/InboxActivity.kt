package com.mobile.macroprojectkelompok11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mobile.macroprojectkelompok11.databinding.ActivityInboxBinding
import com.mobile.macroprojectkelompok11.databinding.ActivityProfileBinding

class InboxActivity : AppCompatActivity() {

    lateinit var binding : ActivityInboxBinding

    private lateinit var newRecyclerview : RecyclerView
    private lateinit var newArrayList : ArrayList<Inbox_Message_Alert>
    lateinit var inbox_image_alert : Array<Int>
    lateinit var inbox_text_alert : Array<String>
    lateinit var inbox_textdate_alert : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInboxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        inbox_image_alert = arrayOf(
            R.drawable.emoji_tidaksehat_mini,
            R.drawable.emoji_tidaksehat_mini,
            R.drawable.emoji_sgttidaksehat,
            R.drawable.emoji_tidaksehat_mini,
            R.drawable.emoji_tidaksehat_mini,
            R.drawable.emoji_tidaksehat_mini
        )

        inbox_text_alert = arrayOf(
            "Perhatian! Kualitas udara di Condet saat ini <b>tidak sehat</b>. Jaga kesehatan Anda dan hindari aktivitas di luar ruangan jika memungkinkan.",
            "Perhatian! Kualitas udara di Condet saat ini <b>tidak sehat</b>. Jaga kesehatan Anda dan hindari aktivitas di luar ruangan jika memungkinkan.",
            "Perhatian! Kualitas udara di Condet saat ini <b>sangat tidak sehat</b>. Jaga kesehatan Anda dan hindari aktivitas di luar ruangan jika memungkinkan.",
            "Perhatian! Kualitas udara di Condet saat ini <b>tidak sehat</b>. Jaga kesehatan Anda dan hindari aktivitas di luar ruangan jika memungkinkan.",
            "Perhatian! Kualitas udara di Condet saat ini <b>tidak sehat</b>. Jaga kesehatan Anda dan hindari aktivitas di luar ruangan jika memungkinkan.",
            "Perhatian! Kualitas udara di Condet saat ini <b>tidak sehat</b>. Jaga kesehatan Anda dan hindari aktivitas di luar ruangan jika memungkinkan."
        )

        inbox_textdate_alert = arrayOf(
            getString(R.string.inbox_message_tgl1),
            getString(R.string.inbox_message_tgl2),
            getString(R.string.inbox_message_tgl3),
            getString(R.string.inbox_message_tgl4),
            getString(R.string.inbox_message_tgl5),
            getString(R.string.inbox_message_tgl6)
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

        val adapter = InboxAlertAdapter(newArrayList)
        newRecyclerview.adapter = adapter
        adapter.setOnItemClickListener(object : InboxAlertAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                val intent = Intent(this@InboxActivity, DetailDataLokasiActivity::class.java)
                startActivity(intent)

            }
        } )

        binding.imageback.setOnClickListener{
            finish() // menutup halaman inbox
        }
    }
}