package com.patient.clinicea.Hospitals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.patient.clinicea.R;
import com.patient.clinicea.Specialization.SpecializationProfileActivity;

public class hospitalsProfileActivity extends AppCompatActivity {
    TextView nameTV,locationTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals_profile);

        nameTV=findViewById(R.id.nameTV);
        locationTV=findViewById(R.id.locationTV);

        Bundle bundle =getIntent().getExtras();
        if(bundle!=null)
        {
            nameTV.setText(bundle.getString("name"));
            locationTV.setText(bundle.getString("location"));
        }
    }

    public void btn_dashboard(View view) {
        startActivity(new Intent(getApplicationContext(), hospitals_Activity.class));
    }
}