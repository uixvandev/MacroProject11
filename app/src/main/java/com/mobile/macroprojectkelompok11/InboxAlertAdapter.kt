package com.mobile.macroprojectkelompok11

import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InboxAlertAdapter(private val inboxalertlist : ArrayList<Inbox_Message_Alert>) :
    RecyclerView.Adapter<InboxAlertAdapter.MyViewHolder>() {

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_inbox_alert, parent, false)
        return  MyViewHolder(itemView, mListener)
    }

    override fun getItemCount(): Int {
        return  inboxalertlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = inboxalertlist[position]
        holder.inbox_image_alert.setImageResource(currentItem.inbox_image_alert)
        holder.inbox_text_alert.text = currentItem.inbox_text_alert
        holder.inbox_textdate_alert.text = currentItem.inbox_textdate_alert

        val fornmattedText = Html.fromHtml(currentItem.inbox_text_alert, Html.FROM_HTML_MODE_LEGACY)
        holder.inbox_text_alert.text = fornmattedText

        holder.inbox_textdate_alert.text = currentItem.inbox_textdate_alert
    }

    class MyViewHolder(itemView : View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView){

        val inbox_image_alert : ImageView = itemView.findViewById(R.id.image_inbox_alert)
        val inbox_text_alert : TextView = itemView.findViewById(R.id.textView_inbox_alert)
        val inbox_textdate_alert : TextView = itemView.findViewById(R.id.textView_inbox_alert_date)

        init {
            itemView.setOnClickListener{
                listener.onItemClick(adapterPosition)
            }
        }


    }
}