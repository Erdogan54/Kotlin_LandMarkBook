package com.ozgurerdogan.kotlin_landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozgurerdogan.kotlin_landmarkbook.databinding.ActivityShowBinding

class ShowActivity : AppCompatActivity() {

    private lateinit var binding:ActivityShowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent=intent

        val selectedLandmark=intent.getSerializableExtra("landmark") as Landmark

        binding.image.setImageResource(selectedLandmark.picture)
        println(selectedLandmark.picture)
        binding.countryText.text=selectedLandmark.country
        binding.landMarkText.text=selectedLandmark.name




    }
}