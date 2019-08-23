package com.example.matimetable

import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.matimetable.model.InfoClass
import com.example.matimetable.ui.main.SectionsPagerAdapter
import com.google.firebase.database.FirebaseDatabase
import java.util.*

class MainActivity : AppCompatActivity() {

//    val day: Array<String> = arrayOf("Wednesday", "Thrusday", "Friday","Saturday","Sunday","Monday")
//
//    val wed_type: Array<String> = arrayOf("LEC","LEC","LAB")
//    val wed_subject: Array<String> = arrayOf("Indigenous Psychology","Theories of Personality","Psychology Lab-1")
//    val wed_venue: Array<String> = arrayOf("301","316","317")
//    val wed_faculty: Array<String> = arrayOf("Dr Arun","Rubi","Anjali")
//    val wed_time: Array<String> = arrayOf("10:05-11:00","12:05-1:00","3:05-5:00")
//
//    val thur_type: Array<String> = arrayOf("LEC","LEC","LEC","LAB")
//    val thur_subject: Array<String> = arrayOf("Indigenous Psychology","Social Science Perspective","Cognitive Psychology","Psychology Lab-1")
//    val thur_venue: Array<String> = arrayOf("301","203","316","317")
//    val thur_faculty: Array<String> = arrayOf("Dr Arun","Gautam","Dr Sandhya","Anjali")
//    val thur_time: Array<String> = arrayOf("10:05-11:00","11:05-12:00","12:05-1:00","3:05-5:00")
//
//    val fri_type: Array<String> = arrayOf("LAB","LEC","LEC","LEC","LEC")
//    val fri_subject: Array<String> = arrayOf("Psychology Lab-1","Social Science Perspective","Cognitive Psychology","Indigenous Psychology","Theories of Personality")
//    val fri_venue: Array<String> = arrayOf("301","203","316","301","301")
//    val fri_faculty: Array<String> = arrayOf("Dr Sujeet","Gautam","Dr. Sandhya","Dr. Arun","Rubi")
//    val fri_time: Array<String> = arrayOf("9:05-11:00","11:05-12:00","12:05-1:00","3:05-4:00","4:05-5:00")
//
//    val sat_type: Array<String> = arrayOf("LAB","LEC","LEC","LEC","LEC")
//    val sat_subject: Array<String> = arrayOf("Psychology Lab-1","Social Science Perspective","Cognitive Psychology","Indigenous Psychology","Theories of Personality")
//    val sat_venue: Array<String> = arrayOf("301","203","316","301","301")
//    val sat_faculty: Array<String> = arrayOf("Dr Sujeet","Gautam","Dr. Sandhya","Dr. Arun","Rubi")
//    val sat_time: Array<String> = arrayOf("9:05-11:00","11:05-12:00","12:05-1:00","3:05-4:00","4:05-5:00")
//
//    val sun_type: Array<String> = arrayOf("LAB","LEC","LEC","LEC")
//    val sun_subject: Array<String> = arrayOf("Psychology Lab-1","Social Science Perspective","Cognitive Psychology","Theories of Personality")
//    val sun_venue: Array<String> = arrayOf("301","203","316","301")
//    val sun_faculty: Array<String> = arrayOf("Dr Sujeet","Gautam","Dr. Sandhya","Rubi")
//    val sun_time: Array<String> = arrayOf("9:05-11:00","11:05-12:00","12:05-1:00","4:05-5:00")
//
//    val mon_type: Array<String> = arrayOf("LEC","LEC","LEC","LEC")
//    val mon_subject: Array<String> = arrayOf("Social Science Perspective","Cognitive Psychology","Indigenous Psychology","Theories of Personality")
//    val mon_venue: Array<String> = arrayOf("203","316","301","301")
//    val mon_faculty: Array<String> = arrayOf("Gautam","Dr. Sandhya","Dr. Arun","Rubi")
//    val mon_time: Array<String> = arrayOf("11:05-12:00","12:05-1:00","3:05-4:00","4:05-5:00")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

       val calendar = Calendar.getInstance()
       val dayofweek: Int = calendar.get(Calendar.DAY_OF_WEEK)
       Log.d("MainActivity","${dayofweek}")
       if(dayofweek==4){
           viewPager.setCurrentItem(0,true)
       }
       else if(dayofweek==5){
           viewPager.setCurrentItem(1,true)
       }
       else if (dayofweek==6){
           viewPager.setCurrentItem(2,true)
       }
       else if (dayofweek==7){
           viewPager.setCurrentItem(3,true)
       }
       else if (dayofweek==8){
           viewPager.setCurrentItem(4,true)
       } else if (dayofweek==1||dayofweek==2){
           viewPager.setCurrentItem(5,true)
       }


    }


}