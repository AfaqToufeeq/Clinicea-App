package com.patient.clinicea.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.patient.clinicea.Doctor_Data;
import com.patient.clinicea.R;
import com.patient.clinicea.Specialization.DoctorsProfileActivity;
import com.patient.clinicea.Specialization.SpecializationProfileActivity;
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

                int count = 0;
                String sub_city = SpecializationProfileActivity.doctors_data.get(i).getCity_id().toString();
                String final_city = "";
                for (int j = 0; j < sub_city.length(); j++) {
                    if (sub_city.charAt(j) == '\"') {
                        count++;
                    }
                    if (count == 5) {
                        if (sub_city.charAt(j) != '\"') {
                            final_city += sub_city.charAt(j);
                        }

                    }
                }
                int count1 = 0;
                String sub_major = SpecializationProfileActivity.doctors_data.get(i).getMajor_id().toString();
                String final_major = "";
                for (int j = 0; j < sub_major.length(); j++) {
                    if (sub_major.charAt(j) == '\"') {
                        count1++;
                    }
                    if (count1 == 5) {
                        if (sub_major.charAt(j) != '\"') {
                            final_major += sub_major.charAt(j);
                        }

                    }
                }
                int count2 = 0;
                String sub_hospital = SpecializationProfileActivity.doctors_data.get(i).getH_id().toString();
                String final_hospital = "";
                for (int j = 0; j < sub_hospital.length(); j++) {
                    if (sub_hospital.charAt(j) == '\"') {
                        count2++;
                    }
                    if (count2 == 13) {
                        if (sub_hospital.charAt(j) != '\"') {
                            final_hospital += sub_hospital.charAt(j);
                        }

                    }
                }

                SpecializationProfileActivity.doctors_selected.clear();
                Doctor_Data selected = new Doctor_Data(
                        SpecializationProfileActivity.doctors_data.get(i).getId().toString(),
                        final_hospital,
                        SpecializationProfileActivity.doctors_data.get(i).getUsername().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getEmail().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getPassword().toString(),
                        final_major,
                        SpecializationProfileActivity.doctors_data.get(i).getName().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getDob().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getContact().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getCnic().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getAddress().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getEducation().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getGender().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getM_status().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getLanguage().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getProf_membership().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getAbout().toString(),
                        final_city,
                        SpecializationProfileActivity.doctors_data.get(i).getA_end().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getA_start().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getM_end().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getM_start().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getE_end().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getE_start().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getCfees().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getPfees().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getExperience().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getBlock_status().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getStatus().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getAccount_detail().toString()
                );

                SpecializationProfileActivity.doctors_selected.add(selected);

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

                int count = 0;
                String sub_city = SpecializationProfileActivity.doctors_data.get(i).getCity_id().toString();
                String final_city = "";
                for (int j = 0; j < sub_city.length(); j++) {
                    if (sub_city.charAt(j) == '\"') {
                        count++;
                    }
                    if (count == 5) {
                        if (sub_city.charAt(j) != '\"') {
                            final_city += sub_city.charAt(j);
                        }

                    }
                }
                int count1 = 0;
                String sub_major = SpecializationProfileActivity.doctors_data.get(i).getMajor_id().toString();
                String final_major = "";
                for (int j = 0; j < sub_major.length(); j++) {
                    if (sub_major.charAt(j) == '\"') {
                        count1++;
                    }
                    if (count1 == 5) {
                        if (sub_major.charAt(j) != '\"') {
                            final_major += sub_major.charAt(j);
                        }

                    }
                }
                int count2 = 0;
                String sub_hospital = SpecializationProfileActivity.doctors_data.get(i).getH_id().toString();
                String final_hospital = "";
                for (int j = 0; j < sub_hospital.length(); j++) {
                    if (sub_hospital.charAt(j) == '\"') {
                        count2++;
                    }
                    if (count2 == 13) {
                        if (sub_hospital.charAt(j) != '\"') {
                            final_hospital += sub_hospital.charAt(j);
                        }

                    }
                }

                SpecializationProfileActivity.doctors_selected.clear();
                Doctor_Data selected = new Doctor_Data(
                        SpecializationProfileActivity.doctors_data.get(i).getId().toString(),
                        final_hospital,
                        SpecializationProfileActivity.doctors_data.get(i).getUsername().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getEmail().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getPassword().toString(),
                        final_major,
                        SpecializationProfileActivity.doctors_data.get(i).getName().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getDob().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getContact().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getCnic().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getAddress().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getEducation().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getGender().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getM_status().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getLanguage().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getProf_membership().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getAbout().toString(),
                        final_city,
                        SpecializationProfileActivity.doctors_data.get(i).getA_end().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getA_start().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getM_end().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getM_start().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getE_end().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getE_start().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getCfees().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getPfees().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getExperience().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getBlock_status().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getStatus().toString(),
                        SpecializationProfileActivity.doctors_data.get(i).getAccount_detail().toString()
                );

                SpecializationProfileActivity.doctors_selected.add(selected);

               Intent intent = new Intent(context.getApplicationContext(),doc_appointment.class);
//                intent.putExtra("name",name.get(i).toString());
//                intent.putExtra("degree",degree.get(i).toString());
                context.startActivity(intent);

            }
        });

        return v;
    }
}
