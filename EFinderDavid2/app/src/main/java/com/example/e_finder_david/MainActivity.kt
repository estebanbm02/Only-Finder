package com.example.e_finder_david

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
     public void onBackPressed() {
        
        if (bottomNav.getSelectedItemId() != R.id.navigation_home) {
            // Cambia a la pestaña de inicio al presionar el botón de retroceso
            bottomNav.setSelectedItemId(R.id.navigation_home);
        } else {
            // Si ya estás en la pestaña de inicio, realiza el comportamiento predeterminado del botón de retroceso
            super.onBackPressed();
        }
    }
     */
}