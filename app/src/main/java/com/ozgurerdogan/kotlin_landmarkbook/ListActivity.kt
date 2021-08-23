package com.ozgurerdogan.kotlin_landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozgurerdogan.kotlin_landmarkbook.databinding.ActivityListBinding

import kotlin.collections.ArrayList


class ListActivity : AppCompatActivity() {

    private lateinit var binding:ActivityListBinding
    private lateinit var landmarkArray:ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        landmarkArray=ArrayList<Landmark>()

        val ayasofya=Landmark("Ayasofya","Istanbul/Turkiye",R.drawable.ayasofya2)
        val pisa=Landmark("Pisa","Pisa/Italy",R.drawable.pisa)
        val eiffel=Landmark("Eiffel","Paris/France",R.drawable.eiffel)
        val colesseo=Landmark("Colesseo","Roma/Italy",R.drawable.colesseo)
        val londonbridge=Landmark("London Bridge","United Kingdom",R.drawable.londonbridge)

        landmarkArray.add(ayasofya)
        landmarkArray.add(pisa)
        landmarkArray.add(eiffel)
        landmarkArray.add(colesseo)
        landmarkArray.add(londonbridge)

        binding.recyclerview.layoutManager=LinearLayoutManager(this)
        val adapter=RcAdapter(landmarkArray,this)
        binding.recyclerview.adapter=adapter







    }
}