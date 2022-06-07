package com.patient.clinicea.Consultation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.patient.clinicea.Dashboard.dashboardActivity;
import com.patient.clinicea.R;
import com.patient.clinicea.Specialization.SpecializationProfileActivity;

public class SpecializationFieldActivity extends AppCompatActivity {

    LinearLayout d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27,d28,
            d29,d30,d31,d32,d33,d34,d35,
            a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16;
    public static String specialization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialization_field);

        d1=findViewById(R.id.d1);
        d2=findViewById(R.id.d2);
        d3=findViewById(R.id.d3);
        d4=findViewById(R.id.d4);
        d5=findViewById(R.id.d5);
        d6=findViewById(R.id.d6);
        d7=findViewById(R.id.d7);
        d8=findViewById(R.id.d8);
        d9=findViewById(R.id.d9);
        d10=findViewById(R.id.d10);
        d11=findViewById(R.id.d11);
        d12=findViewById(R.id.d12);
        d13=findViewById(R.id.d13);
        d14=findViewById(R.id.d14);
        d15=findViewById(R.id.d15);
        d16=findViewById(R.id.d16);
        d17=findViewById(R.id.d17);
        d18=findViewById(R.id.d18);
        d19=findViewById(R.id.d19);
        d20=findViewById(R.id.d20);
        d21=findViewById(R.id.d21);
        d22=findViewById(R.id.d22);
        d23=findViewById(R.id.d23);
        d24=findViewById(R.id.d24);
        d25=findViewById(R.id.d25);
        d26=findViewById(R.id.d26);
        d27=findViewById(R.id.d27);
        d28=findViewById(R.id.d28);
        d29=findViewById(R.id.d29);
        d30=findViewById(R.id.d30);
        d31=findViewById(R.id.d31);
        d32=findViewById(R.id.d32);
        d33=findViewById(R.id.d33);
        d34=findViewById(R.id.d34);
        d35=findViewById(R.id.d35);
        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a3=findViewById(R.id.a3);
        a4=findViewById(R.id.a4);
        a5=findViewById(R.id.a5);
        a6=findViewById(R.id.a6);
        a7=findViewById(R.id.a7);
        a8=findViewById(R.id.a8);
        a9=findViewById(R.id.a9);
        a10=findViewById(R.id.a10);
        a11=findViewById(R.id.a11);
        a12=findViewById(R.id.a12);
        a13=findViewById(R.id.a13);
        a14=findViewById(R.id.a14);
        a15=findViewById(R.id.a15);
        a16=findViewById(R.id.a16);



        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Dermatologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);

            }
        });

        d35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Child Specialist";
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Gynecologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Pediatrician";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Orthopedic Surgeon";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Neurologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Urologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Psychiatrist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Dentist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Cardiologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Pulmonologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "General Surgeon";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Nephrologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Operative Dentist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Psycologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Nutritionist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Homeopath";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Dietitian";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Neurosurgeon";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Thoracic Surgeon";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Radiologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Comsetic Dentist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Physiotherapist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "ENT Specialist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });
        d24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "General Physician";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Eye Specialist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Gastroenterologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Diabetologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Counselor";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Eye Surgeon";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Chiropractor";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Rheumatologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Obstetrician";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Plastic Surgeon";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        d34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Physician";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Orthopedic Surgeon";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "General Physician";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Physician";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Gastroenterologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Dermatologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Gynecologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Dermatologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Gastroenterologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Gastroenterologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "General Physician";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Neurologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Pulmonologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Diabetologist";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "Orthopedic Surgeon";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });
        a15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "General Physician";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });

        a16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                specialization = "General Physician";
//                Toast.makeText(SpecializationFieldActivity.this,specialization , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SpecializationFieldActivity.this, SpecializationProfileActivity.class);
                startActivity(intent);
            }
        });






    }



    public void btn_dashboard(View view) {

        startActivity(new Intent(getApplicationContext(), dashboardActivity.class));
    }
//
//    public void btn_Dermatologist(View view) {
//
//    }

//    public void btn_moveToProfile(View view) {
//        startActivity(new Intent(getApplicationContext(), SpecializationProfileActivity.class));
//    }
}