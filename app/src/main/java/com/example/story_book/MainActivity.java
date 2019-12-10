package com.example.story_book;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.action_About:
                Toast.makeText(MainActivity.this,"This is a Story Book. Created By Shimul Chandra Gharami",Toast.LENGTH_LONG).show();
                break;
            case R.id.action_exit:
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    public void midas(View view){
        Intent intent = new Intent(MainActivity.this,Midas.class);
        startActivity(intent);
    }
    public void egg(View view){
        Intent intent = new Intent(MainActivity.this,egg.class);
        startActivity(intent);
    }
    public void gold(View view){
        Intent intent = new Intent(MainActivity.this,gold.class);
        startActivity(intent);
    }
    public void wolf(View view){
        Intent intent = new Intent(MainActivity.this,wolf.class);
        startActivity(intent);
    }
    public void bird(View view){
        Intent intent = new Intent(MainActivity.this,bird.class);
        startActivity(intent);
    }
    public void tiger(View view){
        Intent intent = new Intent(MainActivity.this,tiger.class);
        startActivity(intent);
    }
    public void student(View view){
        Intent intent = new Intent(MainActivity.this,student.class);
        startActivity(intent);
    }
    public void the(View view){
        Intent intent = new Intent(MainActivity.this,the.class);
        startActivity(intent);
    }
    public void baby(View view){
        Intent intent = new Intent(MainActivity.this,baby.class);
        startActivity(intent);
    }
    public void well(View view){
        Intent intent = new Intent(MainActivity.this,well.class);
        startActivity(intent);
    }
    public void exit(View view){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }




    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

}
