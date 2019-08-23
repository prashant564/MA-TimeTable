package com.example.matimetable.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

class InfoClass(val uid: String, val type: String, val subject: String, val venue:String, val faculty: String, val time: String) {

    constructor():this("","","","","","")
}