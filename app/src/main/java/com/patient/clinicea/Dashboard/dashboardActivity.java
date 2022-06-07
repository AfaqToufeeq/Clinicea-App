package com.patient.clinicea.Dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.patient.clinicea.R;
import com.patient.clinicea.Registration.loginActivity;

public class dashboardActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Spinner profile;

    public static String city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        bottomNavigationView = findViewById(R.id.bottomNavBar);
        String abc=loginActivity.logged.get(0).name;
        String[] profileName = {abc,"Sign Out"};
        Fragment fragment=null;
        fragment= new HomeFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft =  fm.beginTransaction();
        ft.replace(R.id.frameLayout,fragment);
        ft.addToBackStack(null);
        ft.commit();
        profile = findViewById(R.id.profile);

        profile.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),profileName[i] , Toast.LENGTH_SHORT).show();
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.BLACK);
                ((TextView) adapterView.getChildAt(0)).setTextSize(16);
                if(profileName[i].equals("Sign Out"))
                {
                    Toast.makeText(getApplicationContext(), "you are logged out", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter nam = new ArrayAdapter(this,android.R.layout.simple_spinner_item,profileName);
        nam.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        profile.setAdapter(nam);


//        user.setText(loginActivity.logged.get(0).name);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId())
                {
                    case R.id.HomeMenu:
                        fragment = new HomeFragment();
                        break;
                    case R.id.appointmentMenu:
                        fragment = new appointmentFragment();
                        break;
                    case R.id.ProfileMenu:
                        fragment = new HomeFragment();
                        break;
                }
                //Sets the selected Fragment into the Framelayout
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
                return true;
            }
        });


    }
}