package com.example.menuapplictation

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val infaltor = menuInflater
        infaltor.inflate(R.menu.example_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> Toast.makeText(this,"This is the first item",Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this, "This is the Second Item",Toast.LENGTH_SHORT).show()
            R.id.item3 -> Toast.makeText(this,"This is the Third Item",Toast.LENGTH_SHORT).show()
        }
        return true;
    }
}
