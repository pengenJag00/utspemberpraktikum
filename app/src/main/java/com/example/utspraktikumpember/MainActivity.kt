package com.example.utspraktikumpember

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: myAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.list -> recyclerView.layoutManager = LinearLayoutManager(this)
            R.id.grid -> recyclerView.layoutManager = GridLayoutManager(this,2)
        }
        return true
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<datakuu>()
        data.add(datakuu(R.drawable.puan,"Puan","micTesting"))
        data.add(datakuu(R.drawable.test,"Maulidi","besiHunter"))
        data.add(datakuu(R.drawable.megawati,"Megachan","ketawaKyott"))
        data.add(datakuu(R.drawable.puan,"Puan","micTesting"))
        data.add(datakuu(R.drawable.test,"Maulidi","besiHunter"))
        data.add(datakuu(R.drawable.megawati,"Megachan","ketawaKyott"))
        data.add(datakuu(R.drawable.puan,"Puan","micTesting"))
        data.add(datakuu(R.drawable.test,"Maulidi","besiHunter"))
        data.add(datakuu(R.drawable.megawati,"Megachan","ketawaKyott"))
        data.add(datakuu(R.drawable.puan,"Puan","micTesting"))
        data.add(datakuu(R.drawable.test,"Maulidi","besiHunter"))
        data.add(datakuu(R.drawable.megawati,"Megachan","ketawaKyott"))
        data.add(datakuu(R.drawable.test,"uts","pember"))
        data.add(datakuu(R.drawable.test,"disaat","liburan"))
        data.add(datakuu(R.drawable.puan,"lawak","skali"))
        data.add(datakuu(R.drawable.test,"semua","bungkus"))
        data.add(datakuu(R.drawable.megawati,"kue","kita"))
        data.add(datakuu(R.drawable.test,"bungkus","project"))
        data.add(datakuu(R.drawable.puan,"ke","zip"))
        data.add(datakuu(R.drawable.test,"maaf","gambar"))
        data.add(datakuu(R.drawable.megawati,"gak beragam","utamakan"))
        data.add(datakuu(R.drawable.test,"fungsi","penting"))
        data.add(datakuu(R.drawable.test,"dadi","dan mari"))
        data.add(datakuu(R.drawable.puan,"makasih dan","jumpa lagi"))


        adapter = myAdapter(data)
    }

}