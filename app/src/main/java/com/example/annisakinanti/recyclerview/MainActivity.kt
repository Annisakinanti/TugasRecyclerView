package com.example.annisakinanti.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.annisakinanti.recyclerview.adapter.ItemAdapter
import com.example.annisakinanti.recyclerview.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inisialisasi data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

         // Fungsi ini untuk tidak mengubah ukuran tata letak RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}