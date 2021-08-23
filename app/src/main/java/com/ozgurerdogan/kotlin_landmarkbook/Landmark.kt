package com.ozgurerdogan.kotlin_landmarkbook

import android.content.res.Resources
import android.graphics.BitmapFactory
import android.graphics.ImageDecoder
import java.io.Serializable

class Landmark(name: String, country: String,picture:Int):Serializable {

    var name:String= name
    var country:String= country
    var picture:Int=picture

}