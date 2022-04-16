package com.patient.clinicea.Specialization;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.patient.clinicea.Adapters.specProfileAdapter;
import com.patient.clinicea.Consultation.SpecializationFieldActivity;
import com.patient.clinicea.Dashboard.dashboardActivity;
import com.patient.clinicea.R;

import java.util.ArrayList;

public class SpecializationProfileActivity extends AppCompatActivity {

     ListView profileListView;
     SearchView searchView;
    private ArrayList name;
    private ArrayList profession;
    private ArrayList degree;
    specProfileAdapter profileAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialization_profile);

        profileListView = findViewById(R.id.SpecProfileListView);
        searchView = findViewById(R.id.searchView);

        name = new ArrayList();
        profession = new ArrayList();
        degree = new ArrayList();

       name.add("Dr.Afaq Toufeeq");
       profession.add("Dermatologist");
       degree.add("MBBS,FCPS (Dermatology");


        name.add("Dr.Ahmed Sheikh");
        profession.add("Dermatologist,Cosmetologist");
        degree.add("MBBS,FCPS (Dermatology");

        name.add("Dr.Zain Hanif");
        profession.add("Cosmetologist,Dermatologist");
        degree.add("MBBS,FCPS (Dermatology");

        name.add("Dr.Zohaib Ali");
        profession.add("Cosmetologist");
        degree.add("MBBS,FCPS (Dermatology");

        name.add("Dr.Malik");
        profession.add("Cosmetologist,Dermatologist");
        degree.add("MBBS,FCPS (Dermatology");

        name.add("Dr.Amna Shoki");
        profession.add("Cosmetologist,Dermatologist");
        degree.add("MBBS,FCPS (Dermatology");

        name.add("Dr.Rimsha Kokila");
        profession.add("Dermatologist");
        degree.add("MBBS,FCPS (Dermatology");


         profileAdapter = new specProfileAdapter(name,profession,degree,this);
        profileListView.setAdapter(profileAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList filteredName = new ArrayList();

                for (int i=0;i<name.size();i++ )
                {
                    if(name.get(i).toString().toLowerCase().contains(searchView.toString().toLowerCase()))
                    {
                        filteredName.add(name.get(i));
                    }
                }

                profileAdapter = new specProfileAdapter(filteredName,profession,degree,getApplicationContext());
                profileListView.setAdapter(profileAdapter);

                return false;
            }
        });

        profileListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(),DoctorsProfileActivity.class);
                intent.putExtra("name",name.get(i).toString());
                intent.putExtra("profession",profession.get(i).toString());
                intent.putExtra("degree",degree.get(i).toString());
                startActivity(intent);
            }
        });

    }

    public void btn_dashboard(View view) {
        startActivity(new Intent(getApplicationContext(), SpecializationFieldActivity.class));
    }
}