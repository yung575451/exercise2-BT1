package com.hungphamcom.exercise2bt1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView im=findViewById(R.id.img);
        registerForContextMenu(im);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater im=getMenuInflater();
        im.inflate(R.menu.optionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        MenuInflater im=getMenuInflater();
        im.inflate(R.menu.contextmenu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        return true;
    }
}