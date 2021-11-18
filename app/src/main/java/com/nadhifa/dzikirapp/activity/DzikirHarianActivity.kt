package com.nadhifa.dzikirapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nadhifa.dzikirapp.R
import com.nadhifa.dzikirapp.adapter.DzikirDoaAdapter
import com.nadhifa.dzikirapp.databinding.ActivityDzikirHarianBinding
import com.nadhifa.dzikirapp.model.DataDzikirDoa
import com.nadhifa.dzikirapp.model.DzikirDoa

class DzikirHarianActivity : AppCompatActivity() {
    private lateinit var dzikirHarianBinding: ActivityDzikirHarianBinding
    private var listdzikirDoaharian : ArrayList<DzikirDoa> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dzikirHarianBinding = ActivityDzikirHarianBinding.inflate(layoutInflater)
        setContentView(dzikirHarianBinding.root)
        supportActionBar?.hide()
        showRecyclerLlist()
    }

    private fun showRecyclerLlist() {
        listdzikirDoaharian.clear()
//        listdzikirDoaharian.addAll(DataDzikirDoa.)
        dzikirHarianBinding.rvDzikirHarian.layoutManager = LinearLayoutManager(this)
        dzikirHarianBinding.rvDzikirHarian.adapter = DzikirDoaAdapter(listdzikirDoaharian)
    }
}