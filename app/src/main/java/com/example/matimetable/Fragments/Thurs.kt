package com.example.matimetable.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.matimetable.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_thurs.view.*
import kotlinx.android.synthetic.main.thur_item_row.view.*
import kotlinx.android.synthetic.main.wed_item_row.view.*

class Thurs : Fragment(){


    val thur_type: Array<String> = arrayOf("LEC","LEC","LEC","LAB")
    val thur_subject: Array<String> = arrayOf("Indigenous Psychology","Social Science Perspective","Cognitive Psychology","Psychology Lab-1")
    val thur_venue: Array<String> = arrayOf("301","203","316","317")
    val thur_faculty: Array<String> = arrayOf("Dr Arun","Mr. Gautam","Dr Sandhya","Ms. Anjali")
    val thur_time: Array<String> = arrayOf("10:05-11:00","11:05-12:00","12:05-1:00","3:05-5:00")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_thurs,container,false)

        val adapter =  GroupAdapter<ViewHolder>()

        for(i in 0..3){

            adapter.add(ThurItemRow(thur_type[i],thur_subject[i],thur_venue[i],thur_faculty[i],thur_time[i]))

        }

        view!!.recyclerView_Thursday.adapter = adapter
        view!!.recyclerView_Thursday.addItemDecoration(DividerItemDecoration(view.context, DividerItemDecoration.VERTICAL))
        return view
    }

    class ThurItemRow(val type: String, val subject: String, val venue:String, val faculty: String, val time: String): Item<ViewHolder>(){
        override fun bind(viewHolder: ViewHolder, position: Int) {

            viewHolder.itemView.textView_faculty_thur.text = faculty
            viewHolder.itemView.textView_subject_thur.text = subject
            viewHolder.itemView.textView_time_thur.text = time
            viewHolder.itemView.textView_type_thur.text = type
            viewHolder.itemView.textView_venue_thur.text = venue
        }

        override fun getLayout(): Int {
            return R.layout.thur_item_row
        }
    }
}