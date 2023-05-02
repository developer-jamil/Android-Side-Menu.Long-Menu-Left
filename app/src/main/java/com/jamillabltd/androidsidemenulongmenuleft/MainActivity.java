package com.jamillabltd.androidsidemenulongmenuleft;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private Fragment selectedFragment = null;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: Default Set Fragment Home
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.containerId, new HomeFragment());
        transaction.commit();

        //TODO: Navigation Drawer
        NavigationView navigationView = findViewById(R.id.nav_view);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //find drawer layout
        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //TODO: Onclick for navigation drawer header layout access
        LinearLayout sideMenuArea = navigationView.getHeaderView(0).findViewById(R.id.side_menu_area);
        // cancel area
        LinearLayout cancelArea = sideMenuArea.findViewById(R.id.cancelAreaId);
        cancelArea.setOnClickListener(v -> {
            // Close the Navigation Drawer
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(MainActivity.this, "Closed", Toast.LENGTH_SHORT).show();
        });

        ImageView imageViewHome = sideMenuArea.findViewById(R.id.imageViewId);
        ImageView imageViewAbout = sideMenuArea.findViewById(R.id.imageViewAboutId);
        ImageView imageViewProjects = sideMenuArea.findViewById(R.id.imageViewProjectsId);
        ImageView imageViewContact = sideMenuArea.findViewById(R.id.imageViewContactId);
        ImageView imageViewHelp = sideMenuArea.findViewById(R.id.imageViewHelpId);

        //home area
        LinearLayout homeArea = sideMenuArea.findViewById(R.id.homeAreaId);
        homeArea.setOnClickListener(v -> {
            // Close the Navigation Drawer
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();

            //set home frag
            selectedFragment = new HomeFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.containerId, selectedFragment).commit();

            imageViewHome.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.green), PorterDuff.Mode.SRC_IN);
            imageViewAbout.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewProjects.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewContact.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewHelp.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
        });
        //aboutArea
        LinearLayout aboutArea = sideMenuArea.findViewById(R.id.aboutAreaId);
        aboutArea.setOnClickListener(v -> {
            // Close the Navigation Drawer
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(MainActivity.this, "aboutArea", Toast.LENGTH_SHORT).show();

            //set about frag
            selectedFragment = new AboutFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.containerId, selectedFragment).commit();


            imageViewHome.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewAbout.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.green), PorterDuff.Mode.SRC_IN);
            imageViewProjects.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewContact.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewHelp.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
        });

        //setting area
        LinearLayout settingArea = sideMenuArea.findViewById(R.id.settingAreaId);
        settingArea.setOnClickListener(v -> {
            // Close the Navigation Drawer
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(MainActivity.this, "settingArea", Toast.LENGTH_SHORT).show();

            //set setting frag
            selectedFragment = new SettingFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.containerId, selectedFragment).commit();

            imageViewHome.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewAbout.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewProjects.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.green), PorterDuff.Mode.SRC_IN);
            imageViewContact.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewHelp.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
        });

        //contactArea
        LinearLayout contactArea = sideMenuArea.findViewById(R.id.contactAreaId);
        contactArea.setOnClickListener(v -> {
            // Close the Navigation Drawer
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(MainActivity.this, "contactArea", Toast.LENGTH_SHORT).show();

            //set contact frag
            selectedFragment = new ContactFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.containerId, selectedFragment).commit();

            imageViewHome.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewAbout.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewProjects.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewContact.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.green), PorterDuff.Mode.SRC_IN);
            imageViewHelp.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
        });

        //helpArea
        LinearLayout helpArea = sideMenuArea.findViewById(R.id.helpAreaId);
        helpArea.setOnClickListener(v -> {
            // Close the Navigation Drawer
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(MainActivity.this, "helpArea", Toast.LENGTH_SHORT).show();

            //set help frag
            selectedFragment = new HelpFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.containerId, selectedFragment).commit();

            imageViewHome.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewAbout.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewProjects.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewContact.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.white), PorterDuff.Mode.SRC_IN);
            imageViewHelp.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.green), PorterDuff.Mode.SRC_IN);
        });

        //exitArea
        LinearLayout exitArea = sideMenuArea.findViewById(R.id.exitAreaId);
        exitArea.setOnClickListener(v -> finish());





    }

    //onBackPressed
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            // Close the drawer if it is open
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            // Allow the back button to exit the app
            super.onBackPressed();
        }
    }



}
