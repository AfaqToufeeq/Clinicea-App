package com.patient.clinicea.Consultation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.patient.clinicea.Dashboard.dashboardActivity;
import com.patient.clinicea.R;
import com.patient.clinicea.Specialization.SpecializationProfileActivity;

public class SpecializationFieldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialization_field);
    }

    public void btn_dashboard(View view) {

        startActivity(new Intent(getApplicationContext(), dashboardActivity.class));
    }

    public void btn_Dermatologist(View view) {

    }

    public void btn_moveToProfile(View view) {
        startActivity(new Intent(getApplicationContext(), SpecializationProfileActivity.class));
    }
}