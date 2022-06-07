package com.patient.clinicea.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.patient.clinicea.Payment.onlinePaymentConfirm;
import com.patient.clinicea.R;
import com.patient.clinicea.Specialization.DoctorsProfileActivity;

import java.util.ArrayList;

public class appointmentAdapter extends BaseAdapter {
    private ArrayList name;
    private ArrayList profession;
    private ArrayList hospital;
    Context context;

    public appointmentAdapter(ArrayList name, ArrayList profession, ArrayList hospital, Context context) {
        this.name = name;
        this.profession = profession;
        this.hospital = hospital;
        this.context = context;
    }


    @Override
    public int getCount() {
        return name.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup viewGroup) {
        v= LayoutInflater.from(this.context).inflate(R.layout.dashboard_appointment_layout,viewGroup,false);
        TextView nameTV,professionTV,hospitalTV;
        Button viewDetails_btn,btn_cancelAppointment;

        nameTV = v.findViewById(R.id.nameTV);
        professionTV = v.findViewById(R.id.professionTV);
        hospitalTV = v.findViewById(R.id.hospitalTV);
        viewDetails_btn=v.findViewById(R.id.viewDetails_btn);
        btn_cancelAppointment=v.findViewById(R.id.btn_cancelAppointment);

        nameTV.setText(name.get(i)+"");
        professionTV.setText(profession.get(i)+"");
        hospitalTV.setText(hospital.get(i)+"");

        viewDetails_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), onlinePaymentConfirm.class);
                context.startActivity(intent);
            }
        });

        btn_cancelAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Appointment is Canceled", Toast.LENGTH_SHORT).show();

            }
        });

        return v;
    }
}
