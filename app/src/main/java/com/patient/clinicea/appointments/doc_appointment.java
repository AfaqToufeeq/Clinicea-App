package com.patient.clinicea.appointments;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

    TextView dateTV,selectDateTV,chosendateTV,nameTV,degreeTV,date2TV;
    EditText patientNameTV,patientRelationTV,patientContactTV;
    ImageView refresh;
    Spinner morningSpinner,afterNoonSpinner,eveningSpinner;
    String[] morning = {"9:00", "9:30", "10:00","10:30","11:00","11:30"};
    String[] afterNoon = {"1:30", "2:00", "2:30","3:00","3:30","4:00"};
    String[] evening = {"5:30", "6:00", "6:30","7:00","7:30","8:00","8:30","9:00","9:30"};
    DatePickerDialog.OnDateSetListener setListener;
    RadioButton morningRadioButton,noonRadioButton,eveningRadioButton;
    RadioGroup radioGroupMorning,radioGroupCheck;
    LinearLayout linearLayoutMySelf,linearLayoutSomeoneElse;
    Button confrimBooking;
    boolean patientEntryCheck =true;
    int checkDate = 0;
    int patientEntry=0;
    String time;
    String datePickers;
    String morningTime,noonTime,eveningTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_appointment);

        nameTV=findViewById(R.id.nameTV);
        degreeTV=findViewById(R.id.degreeTV);
        dateTV=findViewById(R.id.dateTV);
        date2TV=findViewById(R.id.date2TV);
        patientNameTV=findViewById(R.id.PatientnameTV);
        refresh=findViewById(R.id.refresh);
        patientContactTV=findViewById(R.id.phonePatientTV);
        patientRelationTV=findViewById(R.id.relationTV);

        selectDateTV=findViewById(R.id.selectDateTV);
        chosendateTV=findViewById(R.id.chosendateTV);
        morningSpinner=findViewById(R.id.morningSpinner);
        afterNoonSpinner=findViewById(R.id.afterNoonSpinner);
        eveningSpinner=findViewById(R.id.eveningSpinner);
        morningRadioButton=findViewById(R.id.morningRadioButton);
        noonRadioButton=findViewById(R.id.afterNoonRadioButton);
        eveningRadioButton=findViewById(R.id.eveningRadioButton);
        radioGroupMorning=findViewById(R.id.radioGroupMorning);
        linearLayoutMySelf=findViewById(R.id.linearLayoutMyself);
        linearLayoutSomeoneElse=findViewById(R.id.linearLayoutSomoneElse);
        radioGroupCheck=findViewById(R.id.radioGroupCheck);
        confrimBooking=findViewById(R.id.confirmBookingBtn);
        linearLayoutMySelf.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        linearLayoutSomeoneElse.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);


        Bundle bundle =getIntent().getExtras();
        if(bundle!=null)
        {
            nameTV.setText(bundle.getString("name"));
            degreeTV.setText(bundle.getString("degree"));
        }

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
                checkDate=1;
                month = month+1;
               datePickers = day+"/"+month+"/"+year;
                chosendateTV.setVisibility(View.VISIBLE);
                chosendateTV.setText(datePickers);
                refresh.setVisibility(View.VISIBLE);

                if(morningRadioButton.isChecked())
                {
                    date2TV.setText(datePickers+", "+morningTime+" AM");
                }
                else if(noonRadioButton.isChecked())
                {
                    date2TV.setText(datePickers+", "+noonTime+" PM");
                }
                else if(eveningRadioButton.isChecked())
                {
                    date2TV.setText(datePickers+", "+eveningTime+" PM");
                }

                dateTV.setText("Change Date");
                selectDateTV.setText("Date For Appointment");
            }
        };


        morningSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),morning[i] , Toast.LENGTH_LONG).show();
                morningTime=morning[i];
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
                noonTime=afterNoon[i];
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
                eveningTime=evening[i];
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

        radioGroupCheck.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton rb = (RadioButton) radioGroup.findViewById(checkedId);
                if (null != rb && checkedId > -1) {
                    if(rb.getText().equals("For Myself"))
                    {
                        patientEntry=1;
                        TransitionManager.beginDelayedTransition(linearLayoutMySelf,new AutoTransition());
                        linearLayoutMySelf.setVisibility(View.VISIBLE);
                        linearLayoutSomeoneElse.setVisibility(View.GONE);
                        Toast.makeText(doc_appointment.this, rb.getText(), Toast.LENGTH_SHORT).show();
                    }
                    else if(rb.getText().equals("For Someone Else"))
                    {
                        patientEntry=0;
                        TransitionManager.beginDelayedTransition(linearLayoutSomeoneElse,new AutoTransition());
                        linearLayoutSomeoneElse.setVisibility(View.VISIBLE);
                        linearLayoutMySelf.setVisibility(View.GONE);
                        Toast.makeText(doc_appointment.this, rb.getText(), Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        confrimBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateField(patientNameTV);
                validateField(patientContactTV);
                validateField(patientRelationTV);

                if(patientEntryCheck)
                {
                    patientEntry=2;
                }

                if(checkDate==1)
                {
                    if(patientEntry!=0)
                    {
                        Toast.makeText(doc_appointment.this, "Booking Confirmed", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(doc_appointment.this, "Error: Fill the Entries", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(doc_appointment.this, "Error: Select Date", Toast.LENGTH_SHORT).show();
                }
            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(morningRadioButton.isChecked())
                {
                    date2TV.setText(datePickers+", "+morningTime+" AM");
                }
                else if(noonRadioButton.isChecked())
                {
                    date2TV.setText(datePickers+", "+noonTime+" PM");
                }
                else if(eveningRadioButton.isChecked())
                {
                    date2TV.setText(datePickers+", "+eveningTime+" PM");
                }
            }
        });

    }

    public void validateField(EditText field)
    {

        if(field.getText().toString().isEmpty())
        {
            field.setError("Required");
            patientEntryCheck=false;
        }
        else{
            patientEntryCheck=true;
        }
    }

    public void btn_dashboard(View view) {
        startActivity(new Intent(getApplicationContext(), SpecializationFieldActivity.class));
    }
}