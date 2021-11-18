package com.nadhifa.dzikirapp.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nadhifa.dzikirapp.MainActivity
import com.nadhifa.dzikirapp.R
import com.nadhifa.dzikirapp.adapter.DzikirDoaAdapter
import com.nadhifa.dzikirapp.databinding.ActivityDzikirSetiapSaatBinding
import com.nadhifa.dzikirapp.model.DataDzikirDoa
import com.nadhifa.dzikirapp.model.DzikirDoa

class DzikirSetiapSaatActivity : AppCompatActivity() {
    private lateinit var dzikirSetiapSaatBinding: ActivityDzikirSetiapSaatBinding
    private var listDzikirSetiapSaat: ArrayList<DzikirDoa> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dzikirSetiapSaatBinding = ActivityDzikirSetiapSaatBinding.inflate(layoutInflater)
        setContentView(dzikirSetiapSaatBinding.root)
        supportActionBar?.hide()
        showRecyclerlist()
        back()
    }


    private fun back() {
        dzikirSetiapSaatBinding.ivBackSetiapsaat.setOnClickListener {
            startActivity(MainActivity.getLaunchService(this))
        }

    }

    private fun showRecyclerlist() {
        dzikirSetiapSaatBinding.rvDzikirSetiapsaat.layoutManager = LinearLayoutManager(this)
        listDzikirSetiapSaat.clear()
        listDzikirSetiapSaat.addAll(DataDzikirDoa.listDzikir)
        dzikirSetiapSaatBinding.rvDzikirSetiapsaat.adapter = DzikirDoaAdapter(listDzikirSetiapSaat)
        dzikirSetiapSaatBinding.rvDzikirSetiapsaat.setHasFixedSize(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
    companion object{
        fun getLaunchService(from : Context) = Intent(from,DzikirSetiapSaatActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }
}