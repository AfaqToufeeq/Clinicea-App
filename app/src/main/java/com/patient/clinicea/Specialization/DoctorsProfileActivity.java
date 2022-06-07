package com.patient.clinicea.Specialization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.patient.clinicea.R;

public class DoctorsProfileActivity extends AppCompatActivity {
    TextView nameTV,professionTV,degreeTV,hospital,experience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_profile);
        nameTV=findViewById(R.id.nameTV);
        professionTV=findViewById(R.id.professionTV);
        degreeTV=findViewById(R.id.degreeTV);
        hospital=findViewById(R.id.hospital);
        experience=findViewById(R.id.experience);

        nameTV.setText(SpecializationProfileActivity.doctors_selected.get(0).getName());
        professionTV.setText(SpecializationProfileActivity.doctors_selected.get(0).getMajor_id());
        degreeTV.setText(SpecializationProfileActivity.doctors_selected.get(0).getEducation());
        hospital.setText(SpecializationProfileActivity.doctors_selected.get(0).getH_id());
        experience.setText(SpecializationProfileActivity.doctors_selected.get(0).getExperience());

//        Bundle bundle =getIntent().getExtras();
//        if(bundle!=null)
//        {
//            Toast.makeText(this, bundle.getString("experience").toString(), Toast.LENGTH_SHORT).show();
//            nameTV.setText(bundle.getString("name"));
//            professionTV.setText(bundle.getString("profession"));
//            degreeTV.setText(bundle.getString("degree"));
//            hospital.setText(bundle.getString("hospital"));
//            experience.setText(bundle.getString("experience"));
//        }
    }

    public void btn_dashboard(View view) {
        startActivity(new Intent(getApplicationContext(),SpecializationProfileActivity.class));
    }
}