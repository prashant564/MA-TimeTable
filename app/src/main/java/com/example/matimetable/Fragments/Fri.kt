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
import kotlinx.android.synthetic.main.fragment_fri.view.*
import kotlinx.android.synthetic.main.wed_item_row.view.*

class Fri : Fragment(){

    val fri_type: Array<String> = arrayOf("LAB","LEC","LEC","LEC","LEC")
    val fri_subject: Array<String> = arrayOf("Psychology Lab-1","Social Science Perspective","Cognitive Psychology","Indigenous Psychology","Theories of Personality")
    val fri_venue: Array<String> = arrayOf("301","203","316","301","301")
    val fri_faculty: Array<String> = arrayOf("Dr Sujeet","Mr. Gautam","Dr. Sandhya","Dr. Arun","Ms. Rubi")
    val fri_time: Array<String> = arrayOf("9:05-11:00","11:05-12:00","12:05-1:00","3:05-4:00","4:05-5:00")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_fri,container,false)

        val adapter =  GroupAdapter<ViewHolder>()

        for(i in 0..4){

            adapter.add(FriItemRow(fri_type[i], fri_subject[i], fri_venue[i], fri_faculty[i], fri_time[i])
            )

        }

        view!!.recyclerView_Friday.adapter = adapter
        view!!.recyclerView_Friday.addItemDecoration(DividerItemDecoration(view.context, DividerItemDecoration.VERTICAL))
        return view

    }
    class FriItemRow(val type: String, val subject: String, val venue:String, val faculty: String, val time: String): Item<ViewHolder>(){
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