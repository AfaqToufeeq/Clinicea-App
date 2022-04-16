package com.patient.clinicea.Specialization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.patient.clinicea.R;

public class DoctorsProfileActivity extends AppCompatActivity {
    TextView nameTV,professionTV,degreeTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_profile);
        nameTV=findViewById(R.id.nameTV);
        professionTV=findViewById(R.id.professionTV);
        degreeTV=findViewById(R.id.degreeTV);

        Bundle bundle =getIntent().getExtras();
        if(bundle!=null)
        {
            nameTV.setText(bundle.getString("name"));
            professionTV.setText(bundle.getString("profession"));
            degreeTV.setText(bundle.getString("degree"));
        }
    }

    public void btn_dashboard(View view) {
        startActivity(new Intent(getApplicationContext(),SpecializationProfileActivity.class));
    }
}