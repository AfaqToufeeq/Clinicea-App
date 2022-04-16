package com.patient.clinicea.Hospitals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.patient.clinicea.Adapters.hospitalsAdapter;
import com.patient.clinicea.Adapters.specProfileAdapter;
import com.patient.clinicea.Consultation.SpecializationFieldActivity;
import com.patient.clinicea.Dashboard.dashboardActivity;
import com.patient.clinicea.R;
import com.patient.clinicea.Specialization.DoctorsProfileActivity;

import java.util.ArrayList;

public class hospitals_Activity extends AppCompatActivity {

    ListView hospitalListView;
    SearchView searchView;

    private ArrayList name;
    private ArrayList location;
    hospitalsAdapter hospAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);
        hospitalListView = findViewById(R.id.hospitalListView);
        searchView = findViewById(R.id.searchView);

        name = new ArrayList();
        location = new ArrayList();

        name.add("Sheikh Zaid Hospital");
        location.add("Lahore");

        name.add("Islamabad_Center");
        location.add("Islamabad");


        name.add("Al_Maroof Hospital");
        location.add("Islamabad");

        name.add("Doctors Hospital");
        location.add("Lahore");

        name.add("Shaukat Khanum Memorial Hospital.");
        location.add("Lahore");

        name.add("Faisal Hospital");
        location.add("Faisalabad");

        name.add("The National Hospital");
        location.add("Faisalabad");


        hospAdapter = new hospitalsAdapter(name,location,this);
        hospitalListView.setAdapter(hospAdapter);

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

                hospAdapter = new hospitalsAdapter(name,location,getApplicationContext());
                hospitalListView.setAdapter(hospAdapter);

                return false;
            }
        });

        hospitalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(),  hospitalsProfileActivity.class);
                intent.putExtra("name",name.get(i).toString());
                intent.putExtra("location",location.get(i).toString());
                startActivity(intent);
            }
        });

    }

    public void btn_dashboard(View view) {
        startActivity(new Intent(getApplicationContext(), dashboardActivity.class));
    }
}