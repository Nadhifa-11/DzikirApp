package com.nadhifa.dzikirapp.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nadhifa.dzikirapp.MainActivity
import com.nadhifa.dzikirapp.R
import com.nadhifa.dzikirapp.adapter.DzikirDoaAdapter
import com.nadhifa.dzikirapp.databinding.ActivityQauliyahBinding
import com.nadhifa.dzikirapp.model.DataDzikirDoa
import com.nadhifa.dzikirapp.model.DzikirDoa

class QauliyahActivity : AppCompatActivity() {
    private lateinit var qauliyahBinding: ActivityQauliyahBinding
    private var listQauliyah: ArrayList<DzikirDoa> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        qauliyahBinding = ActivityQauliyahBinding.inflate(layoutInflater)
        setContentView(qauliyahBinding.root)
        supportActionBar?.hide()
        showRecycler()
        back()
    }

    private fun back() {
        qauliyahBinding.ivBackQauliyah.setOnClickListener {
            startActivity(MainActivity.getLaunchService(this))
        }
    }

    private fun showRecycler() {
        qauliyahBinding.rvDzikirDoaQauliyah.layoutManager = LinearLayoutManager(this)
        listQauliyah.clear()
        listQauliyah.addAll(DataDzikirDoa.listQauliyah)
        qauliyahBinding.rvDzikirDoaQauliyah.adapter = DzikirDoaAdapter(listQauliyah)
        qauliyahBinding.rvDzikirDoaQauliyah.setHasFixedSize(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }

    companion object {
        fun getLaunchService(from: Context) = Intent(from, QauliyahActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }
}