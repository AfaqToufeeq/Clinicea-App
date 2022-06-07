package com.patient.clinicea.Specialization;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.patient.clinicea.Adapters.specProfileAdapter;
import com.patient.clinicea.Consultation.SpecializationFieldActivity;
import com.patient.clinicea.Dashboard.HomeFragment;
import com.patient.clinicea.Dashboard.dashboardActivity;
import com.patient.clinicea.Doctor_Data;
import com.patient.clinicea.R;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class SpecializationProfileActivity extends AppCompatActivity {

     ListView profileListView;
     SearchView searchView;
     int x=0;
    public static String URL_Doctor = "http://192.168.0.121:8000/pakistan/doctor/";
     String selected_city= dashboardActivity.city, selected_specialization= SpecializationFieldActivity.specialization;
     public static ArrayList<Doctor_Data> doctors_data = new ArrayList<>();
     public static ArrayList<Doctor_Data> doctors_selected = new ArrayList<>();

    private ArrayList name;
    private ArrayList profession;
    private ArrayList degree;
    private ArrayList bank_detail;
    private ArrayList experience;
    private ArrayList gender;
    private ArrayList e_end;
    private ArrayList e_start;
    private ArrayList m_end;
    private ArrayList m_start;
    private ArrayList a_end;
    private ArrayList a_start;
    private ArrayList cfees;
    private ArrayList pfees;
    private ArrayList hospital;



    specProfileAdapter profileAdapter;
    String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialization_profile);
        doctors_selected.clear();
        doctors_data.clear();
        profileListView = findViewById(R.id.SpecProfileListView);
        searchView = findViewById(R.id.searchView);

        name = new ArrayList();
        profession = new ArrayList();
        degree = new ArrayList();
        bank_detail = new ArrayList();
        experience = new ArrayList();
        gender = new ArrayList();
        e_end = new ArrayList();
        e_start = new ArrayList();
        m_end = new ArrayList();
        m_start = new ArrayList();
        a_end = new ArrayList();
        a_start = new ArrayList();
        cfees = new ArrayList();
        pfees = new ArrayList();
        hospital = new ArrayList();

        show();



        profileListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                doctors_selected.clear();

                    int count = 0;
                    String sub_city = doctors_data.get(i).getCity_id().toString();
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
                    String sub_major = doctors_data.get(i).getMajor_id().toString();
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

                Doctor_Data selected = new Doctor_Data(
                        doctors_data.get(i).getId().toString(),
                        final_hospital,
                        doctors_data.get(i).getUsername().toString(),
                        doctors_data.get(i).getEmail().toString(),
                        doctors_data.get(i).getPassword().toString(),
                        final_major,
                        doctors_data.get(i).getName().toString(),
                        doctors_data.get(i).getDob().toString(),
                        doctors_data.get(i).getContact().toString(),
                        doctors_data.get(i).getCnic().toString(),
                        doctors_data.get(i).getAddress().toString(),
                        doctors_data.get(i).getEducation().toString(),
                        doctors_data.get(i).getGender().toString(),
                        doctors_data.get(i).getM_status().toString(),
                        doctors_data.get(i).getLanguage().toString(),
                        doctors_data.get(i).getProf_membership().toString(),
                        doctors_data.get(i).getAbout().toString(),
                        final_city,
                        doctors_data.get(i).getA_end().toString(),
                        doctors_data.get(i).getA_start().toString(),
                        doctors_data.get(i).getM_end().toString(),
                        doctors_data.get(i).getM_start().toString(),
                        doctors_data.get(i).getE_end().toString(),
                        doctors_data.get(i).getE_start().toString(),
                        doctors_data.get(i).getCfees().toString(),
                        doctors_data.get(i).getPfees().toString(),
                        doctors_data.get(i).getExperience().toString(),
                        doctors_data.get(i).getBlock_status().toString(),
                        doctors_data.get(i).getStatus().toString(),
                        doctors_data.get(i).getAccount_detail().toString()
                );

                doctors_selected.add(selected);
                Intent intent = new Intent(getApplicationContext(),DoctorsProfileActivity.class);
//                Toast.makeText(SpecializationProfileActivity.this, doctors_data.get(i).getEmail().toString(), Toast.LENGTH_SHORT).show();
//                intent.putExtra("name",doctors_data.get(i).getName().toString());
//                intent.putExtra("name",doctors_data.get(i).getName().toString());
//                intent.putExtra("profession",doctors_data.get(i).getProf_membership().toString());
//                intent.putExtra("degree",doctors_data.get(i).getEducation().toString());
//                intent.putExtra("experience",doctors_data.get(i).getExperience().toString());
//                intent.putExtra("hospital",doctors_data.get(i).getH_id().toString());


                startActivity(intent);
            }
        });

    }

    public void btn_dashboard(View view) {
        startActivity(new Intent(getApplicationContext(), SpecializationFieldActivity.class));
    }

    void show()
    {
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        JsonArrayRequest objectRequest = new JsonArrayRequest(
                Request.Method.GET,
                URL_Doctor,
                null,
                new Response.Listener<JSONArray>()
                {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {

                            for(int i=0;i<response.length();i++)
                            {
                                int count=0;
                                String sub_city=response.getJSONObject(i).get("city_id").toString();
                                String final_city="";
                                for(int j=0;j<sub_city.length();j++)
                                {
                                    if (sub_city.charAt(j)=='\"')
                                    {
                                        count++;
                                    }
                                    if (count==5)
                                    {
                                        if(sub_city.charAt(j)!='\"')
                                        {
                                            final_city+=sub_city.charAt(j);
                                        }

                                    }
                                }
                                int count1=0;
                                String sub_major=response.getJSONObject(i).get("major_id").toString();
                                String final_major="";
                                for(int j=0;j<sub_major.length();j++)
                                {
                                    if (sub_major.charAt(j)=='\"')
                                    {
                                        count1++;
                                    }
                                    if (count1==5)
                                    {
                                        if(sub_major.charAt(j)!='\"')
                                        {
                                            final_major+=sub_major.charAt(j);
                                        }

                                    }
                                }
                                if (final_city.equals(selected_city) && final_major.equals(selected_specialization))
                                {
                                    Doctor_Data xyz = new Doctor_Data(
                                            response.getJSONObject(i).get("id").toString(),
                                            response.getJSONObject(i).get("h_id").toString(),
                                            response.getJSONObject(i).get("username").toString(),
                                            response.getJSONObject(i).get("email").toString(),
                                            response.getJSONObject(i).get("password").toString(),
                                            response.getJSONObject(i).get("major_id").toString(),
                                            response.getJSONObject(i).get("name").toString(),
                                            response.getJSONObject(i).get("dob").toString(),
                                            response.getJSONObject(i).get("contact").toString(),
                                            response.getJSONObject(i).get("cnic").toString(),
                                            response.getJSONObject(i).get("address").toString(),
                                            response.getJSONObject(i).get("education").toString(),
                                            response.getJSONObject(i).get("gender").toString(),
                                            response.getJSONObject(i).get("m_status").toString(),
                                            response.getJSONObject(i).get("language").toString(),
                                            response.getJSONObject(i).get("prof_membership").toString(),
                                            response.getJSONObject(i).get("about").toString(),
                                            response.getJSONObject(i).get("city_id").toString(),
                                            response.getJSONObject(i).get("a_end").toString(),
                                            response.getJSONObject(i).get("a_start").toString(),
                                            response.getJSONObject(i).get("m_end").toString(),
                                            response.getJSONObject(i).get("m_start").toString(),
                                            response.getJSONObject(i).get("e_end").toString(),
                                            response.getJSONObject(i).get("e_start").toString(),
                                            response.getJSONObject(i).get("cfees").toString(),
                                            response.getJSONObject(i).get("pfees").toString(),
                                            response.getJSONObject(i).get("experience").toString(),
                                            response.getJSONObject(i).get("block_status").toString(),
                                            response.getJSONObject(i).get("status").toString(),
                                            response.getJSONObject(i).get("account_detail").toString()
                                    );

                                    doctors_data.add(xyz);
//                                    Toast.makeText(SpecializationProfileActivity.this, response.getJSONObject(i).get("email").toString(), Toast.LENGTH_SHORT).show();
//                                    Toast.makeText(SpecializationProfileActivity.this, doctors_data.get(doctors_data.size()-1).getEmail().toString(), Toast.LENGTH_SHORT).show();

                                }

                            }

                            if (doctors_data.size()>0)
                            {
                                for (int k=0;k<doctors_data.size();k++)
                                {
//                                    Toast.makeText(SpecializationProfileActivity.this,doctors_data.get(k).getH_id().toString(),Toast.LENGTH_SHORT).show();

                                    name.add(doctors_data.get(k).getName().toString());
                                    profession.add(selected_specialization);
                                    bank_detail.add(doctors_data.get(k).getAccount_detail().toString());
                                    experience.add(doctors_data.get(k).getExperience().toString());
                                    gender.add(doctors_data.get(k).getGender().toString());
                                    e_end.add(doctors_data.get(k).getE_end().toString());
                                    e_start.add(doctors_data.get(k).getE_start().toString());
                                    a_end.add(doctors_data.get(k).getA_end().toString());
                                    a_start.add(doctors_data.get(k).getA_start().toString());
                                    m_end.add(doctors_data.get(k).getM_end().toString());
                                    m_start.add(doctors_data.get(k).getM_start().toString());
                                    cfees.add(doctors_data.get(k).getCfees().toString());
                                    pfees.add(doctors_data.get(k).getPfees().toString());
                                    degree.add(doctors_data.get(k).getEducation().toString());
                                    hospital.add(doctors_data.get(k).getH_id().toString());
                                }
                                profileAdapter = new specProfileAdapter( name,  profession,  degree,SpecializationProfileActivity.this);
                                profileListView.setAdapter(profileAdapter);
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(),"No Doctor Available yet",Toast.LENGTH_SHORT).show();
                            }



                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Error.Response", error.toString());
                        output=error.toString();
//                        out.setText(output);
                    }
                }
        );
        requestQueue.add(objectRequest);
    }

}