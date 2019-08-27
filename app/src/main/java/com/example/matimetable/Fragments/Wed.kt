package com.example.matimetable.Fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.OrientationEventListener
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.DividerItemDecoration.*
import com.example.matimetable.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_wed.*
import kotlinx.android.synthetic.main.fragment_wed.view.*
import kotlinx.android.synthetic.main.wed_item_row.view.*

class Wed : Fragment(){

    val wed_type: Array<String> = arrayOf("LEC","LEC","LAB")
    val wed_subject: Array<String> = arrayOf("Indigenous Psychology","Theories of Personality","Psychology Lab-1")
    val wed_venue: Array<String> = arrayOf("301","316","317")
    val wed_faculty: Array<String> = arrayOf("Dr Arun","Ms. Rubi","Ms. Anjali")
    val wed_time: Array<String> = arrayOf("10:05-11:00","12:05-1:00","3:05-5:00")
    val counter:Int = 3


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View? = inflater.inflate(R.layout.fragment_wed,container,false)

        val adapter =  GroupAdapter<ViewHolder>()

        for(i in 0..counter-1){

            adapter.add(WedItemRow(wed_type[i],wed_subject[i],wed_venue[i],wed_faculty[i],wed_time[i]))

        }

        view!!.recyclerView_Wednesday.adapter = adapter
        view!!.recyclerView_Wednesday.addItemDecoration(DividerItemDecoration(view.context, VERTICAL))
        return view

    }

    class WedItemRow(val type: String, val subject: String, val venue:String, val faculty: String, val time: String): Item<ViewHolder>(){
        override fun bind(viewHolder: ViewHolder, position: Int) {

            viewHolder.itemView.textView_faculty_wed.text = faculty
            viewHolder.itemView.textView_subject_wed.text = subject
            viewHolder.itemView.textView_time_wed.text = time
            viewHolder.itemView.textView_type_wed.text = type
            viewHolder.itemView.textView_venue_wed.text = venue
        }

        override fun getLayout(): Int {
            return R.layout.wed_item_row
        }
    }
}


