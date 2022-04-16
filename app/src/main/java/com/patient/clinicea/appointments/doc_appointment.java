package com.patient.clinicea.appointments;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.patient.clinicea.Consultation.SpecializationFieldActivity;
import com.patient.clinicea.R;
import com.patient.clinicea.Specialization.DoctorsProfileActivity;

import java.util.Calendar;

public class doc_appointment extends AppCompatActivity {

    TextView dateTV,selectDateTV,chosendateTV;
    Spinner morningSpinner,afterNoonSpinner,eveningSpinner;
    String[] morning = {"9:00", "9:30", "10:00","10:30","11:00","11:30"};
    String[] afterNoon = {"1:30", "2:00", "2:30","3:00","3:30","4:00"};
    String[] evening = {"5:30", "6:00", "6:30","7:00","7:30","8:00","8:30","9:00","9:30"};
    DatePickerDialog.OnDateSetListener setListener;
    RadioButton morningRadioButton,noonRadioButton,eveningRadioButton;
    RadioGroup radioGroupMorning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_appointment);

        dateTV=findViewById(R.id.dateTV);
        selectDateTV=findViewById(R.id.selectDateTV);
        chosendateTV=findViewById(R.id.chosendateTV);
        morningSpinner=findViewById(R.id.morningSpinner);
        afterNoonSpinner=findViewById(R.id.afterNoonSpinner);
        eveningSpinner=findViewById(R.id.eveningSpinner);
        morningRadioButton=findViewById(R.id.morningRadioButton);
        noonRadioButton=findViewById(R.id.afterNoonRadioButton);
        eveningRadioButton=findViewById(R.id.eveningRadioButton);
        radioGroupMorning=findViewById(R.id.radioGroupMorning);

        Calendar calendar = Calendar.getInstance();
        final int year= calendar.get(Calendar.YEAR);
        final int month= calendar.get(Calendar.MONTH);
        final int day= calendar.get(Calendar.DAY_OF_MONTH);

        dateTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(doc_appointment.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth
                ,setListener,year,month,day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        setListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                month = month+1;
                String date = day+"/"+month+"/"+year;
                chosendateTV.setVisibility(View.VISIBLE);
                chosendateTV.setText(date);
                dateTV.setText("Change Date");
                selectDateTV.setText("Date For Appointment");

            }
        };



        morningSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),morning[i] , Toast.LENGTH_LONG).show();
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.BLACK);
                ((TextView) adapterView.getChildAt(0)).setTextSize(16);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter mor = new ArrayAdapter(this,android.R.layout.simple_spinner_item,morning);
        mor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        morningSpinner.setAdapter(mor);


        afterNoonSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),afterNoon[i] , Toast.LENGTH_LONG).show();
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.BLACK);
                ((TextView) adapterView.getChildAt(0)).setTextSize(16);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter noon = new ArrayAdapter(this,android.R.layout.simple_spinner_item,afterNoon);
        noon.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        afterNoonSpinner.setAdapter(noon);

        eveningSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),evening[i] , Toast.LENGTH_LONG).show();
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.BLACK);
                ((TextView) adapterView.getChildAt(0)).setTextSize(16);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter even = new ArrayAdapter(this,android.R.layout.simple_spinner_item,evening);
        even.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        eveningSpinner.setAdapter(even);


    }

    public void btn_dashboard(View view) {
        startActivity(new Intent(getApplicationContext(), SpecializationFieldActivity.class));
    }
}