package com.patient.clinicea.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.patient.clinicea.Hospitals.hospitalsProfileActivity;
import com.patient.clinicea.R;
import com.patient.clinicea.Specialization.DoctorsProfileActivity;

import java.util.ArrayList;

public class hospitalsAdapter extends BaseAdapter {

    private ArrayList name;
    private ArrayList location;
    Context context;

    public hospitalsAdapter(ArrayList name, ArrayList location, Context context) {
        this.name = name;
        this.location = location;
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
        v= LayoutInflater.from(this.context).inflate(R.layout.hospital_layout,viewGroup,false);
        TextView nameTV,locationTV;
        Button btn_hospitalProfile;

        nameTV = v.findViewById(R.id.nameTV);
        locationTV = v.findViewById(R.id.locationTV);
        btn_hospitalProfile=v.findViewById(R.id.btn_hospitalProfile);

        nameTV.setText(name.get(i)+"");
        locationTV.setText(location.get(i)+"");
        btn_hospitalProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), hospitalsProfileActivity.class);
                intent.putExtra("name",name.get(i).toString());
                intent.putExtra("location",location.get(i).toString());
                context.startActivity(intent);
            }
        });
        return v;
    }
}
