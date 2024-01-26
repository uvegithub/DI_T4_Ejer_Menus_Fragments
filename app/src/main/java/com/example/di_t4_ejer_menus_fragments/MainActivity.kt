package com.example.di_t4_ejer_menus_fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.accion_ver){
            val intent = Intent(this, Ver_perfil::class.java)
            startActivity(intent)
        }else if(item.itemId == R.id.accion_editar){
            val intent = Intent(this, editar_perfil::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}