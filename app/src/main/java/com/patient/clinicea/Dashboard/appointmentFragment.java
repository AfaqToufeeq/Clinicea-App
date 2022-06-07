package com.patient.clinicea.Dashboard;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.patient.clinicea.Adapters.appointmentAdapter;
import com.patient.clinicea.Adapters.specProfileAdapter;
import com.patient.clinicea.Consultation.SpecializationFieldActivity;
import com.patient.clinicea.R;
import com.patient.clinicea.Specialization.DoctorsProfileActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link appointmentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class appointmentFragment extends Fragment {

    ListView appointListView;
    SearchView searchView;
    private ArrayList name;
    private ArrayList profession;
    private ArrayList hospital;
    appointmentAdapter appointAdapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public appointmentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment appointmentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static appointmentFragment newInstance(String param1, String param2) {
        appointmentFragment fragment = new appointmentFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_appointment, container, false);
        appointListView = v.findViewById(R.id.appointmentListView);
        searchView = v.findViewById(R.id.searchView);

        name = new ArrayList();
        profession = new ArrayList();
        hospital = new ArrayList();

        name.add("Dr.Afaq Toufeeq");
        profession.add("Dermatologist");
        hospital.add("Islamabad");


        name.add("Dr.Ahmed Sheikh");
        profession.add("Dermatologist,Cosmetologist");
        hospital.add("Karachi");

        name.add("Dr.Zain Hanif");
        profession.add("Cosmetologist,Dermatologist");
        hospital.add("Rawalpindi");

        name.add("Dr.Zohaib Ali");
        profession.add("Cosmetologist");
        hospital.add("Bahawalpur");

        name.add("Dr.Malik");
        profession.add("Cosmetologist,Dermatologist");
        hospital.add("Faisalabad");

        name.add("Dr.Amna Shoki");
        profession.add("Cosmetologist,Dermatologist");
        hospital.add("Rawalpindi");

        name.add("Dr.Rimsha Kokila");
        profession.add("Dermatologist");
        hospital.add("Islamabad");


        appointAdapter = new appointmentAdapter(name, profession, hospital, getActivity());
        appointListView.setAdapter(appointAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList filteredName = new ArrayList();

                for (int i = 0; i < name.size(); i++) {
                    if (name.get(i).toString().toLowerCase().contains(searchView.toString().toLowerCase())) {
                        filteredName.add(name.get(i));
                    }
                }

                // appointAdapter = new specProfileAdapter(filteredName,profession,hospital,getActivity());
                appointListView.setAdapter(appointAdapter);

                return false;
            }
        });

        appointListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getActivity(), DoctorsProfileActivity.class);
                intent.putExtra("name", name.get(i).toString());
                intent.putExtra("profession", profession.get(i).toString());
                intent.putExtra("hospital", hospital.get(i).toString());
                startActivity(intent);
            }
        });
        return v;
    }


    public void btn_dashboard(View view) {
        startActivity(new Intent(getActivity(), SpecializationFieldActivity.class));
    }

}