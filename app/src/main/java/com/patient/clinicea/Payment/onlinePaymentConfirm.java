package com.patient.clinicea.Payment;

import static com.patient.clinicea.appointments.doc_appointment.dateAppoint;
import static com.patient.clinicea.appointments.doc_appointment.docName;
import static com.patient.clinicea.appointments.doc_appointment.patiName;
import static com.patient.clinicea.appointments.doc_appointment.timeAppoint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.patient.clinicea.Consultation.SpecializationFieldActivity;
import com.patient.clinicea.Dashboard.appointmentFragment;
import com.patient.clinicea.Dashboard.dashboardActivity;
import com.patient.clinicea.R;

public class onlinePaymentConfirm extends AppCompatActivity {

    TextView patTv,docNameTV,timeAppointTV,dateAppointTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_payment_confirm);

        patTv=findViewById(R.id.patTv);
        docNameTV=findViewById(R.id.docNameTV);
        timeAppointTV=findViewById(R.id.timeAppointTV);
        dateAppointTV=findViewById(R.id.dateAppointTV);
        patTv.setText(patiName);
        docNameTV.setText(docName);
        timeAppointTV.setText(timeAppoint);
        dateAppointTV.setText(dateAppoint);
    }

    public void btn_dashboard(View view) {
        startActivity(new Intent(getApplicationContext(), SpecializationFieldActivity.class));
    }

    public void btn_onlineConfirmPayment(View view) {

        startActivity(new Intent(getApplicationContext(), dashboardActivity.class));
    }
}