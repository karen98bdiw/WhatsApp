package com.example.whatsapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.chatsfragment_layout.view.*

class ChatsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.chatsfragment_layout,container,false)
        view.chatsbtn.setOnClickListener {
            Toast.makeText(this.context,"ChatsFragment", Toast.LENGTH_LONG).show()
        }
        return view

    }

}