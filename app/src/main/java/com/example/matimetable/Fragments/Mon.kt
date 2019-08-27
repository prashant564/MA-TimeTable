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
import kotlinx.android.synthetic.main.fragment_mon.view.*
import kotlinx.android.synthetic.main.wed_item_row.view.*

class Mon : Fragment(){

    val mon_type: Array<String> = arrayOf("LEC","LEC","LEC","LEC")
    val mon_subject: Array<String> = arrayOf("Social Science Perspective","Cognitive Psychology","Indigenous Psychology","Theories of Personality")
    val mon_venue: Array<String> = arrayOf("203","316","301","301")
    val mon_faculty: Array<String> = arrayOf("Mr. Gautam","Dr. Sandhya","Dr. Arun","Ms. Rubi")
    val mon_time: Array<String> = arrayOf("11:05-12:00","12:05-1:00","3:05-4:00","4:05-5:00")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_mon,container,false)

        val adapter =  GroupAdapter<ViewHolder>()

        for(i in 0..3){

            adapter.add(MonItemRow(mon_type[i], mon_subject[i], mon_venue[i], mon_faculty[i], mon_time[i]))

        }

        view!!.recyclerView_Monday.adapter = adapter
        view!!.recyclerView_Monday.addItemDecoration(DividerItemDecoration(view.context, DividerItemDecoration.VERTICAL))
        return view
    }

    class MonItemRow(val type: String, val subject: String, val venue:String, val faculty: String, val time: String): Item<ViewHolder>(){
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