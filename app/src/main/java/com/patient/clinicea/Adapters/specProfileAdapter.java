package com.patient.clinicea.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.patient.clinicea.R;
import com.patient.clinicea.Specialization.DoctorsProfileActivity;
import com.patient.clinicea.appointments.doc_appointment;

import java.util.ArrayList;

public class specProfileAdapter extends BaseAdapter {
    private ArrayList name;
    private ArrayList profession;
    private ArrayList degree;
    Context context;

    public specProfileAdapter(ArrayList name, ArrayList profession, ArrayList degree, Context context) {
        this.name = name;
        this.profession = profession;
        this.degree = degree;
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
        v= LayoutInflater.from(this.context).inflate(R.layout.doctorsappointmentlayout,viewGroup,false);
        TextView nameTV,professionTV,degreeTV;
        Button btn_docProfile,btn_bookAppointment;

        nameTV = v.findViewById(R.id.nameTV);
        professionTV = v.findViewById(R.id.professionTV);
        degreeTV = v.findViewById(R.id.degreeTV);
        btn_docProfile=v.findViewById(R.id.btn_docProfile);
        btn_bookAppointment=v.findViewById(R.id.btn_bookAppointment);

        nameTV.setText(name.get(i)+"");
        professionTV.setText(profession.get(i)+"");
        degreeTV.setText(degree.get(i)+"");

        btn_docProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), DoctorsProfileActivity.class);
                intent.putExtra("name",name.get(i).toString());
                intent.putExtra("profession",profession.get(i).toString());
                intent.putExtra("degree",degree.get(i).toString());
                context.startActivity(intent);
            }
        });

        btn_bookAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(context.getApplicationContext(),doc_appointment.class);
                intent.putExtra("name",name.get(i).toString());
                intent.putExtra("degree",degree.get(i).toString());
                context.startActivity(intent);

            }
        });

        return v;
    }
}
