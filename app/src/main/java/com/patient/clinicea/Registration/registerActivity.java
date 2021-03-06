package com.patient.clinicea.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.patient.clinicea.R;

public class registerActivity extends AppCompatActivity {
    Spinner genderSpinner;
    TextView alreadyAccount;
    String[] gender = {"Male", "Female", "Prefer Not To Say"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        genderSpinner=findViewById(R.id.genderSpinner);
        alreadyAccount=findViewById(R.id.alreadAccount);
        genderSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),gender[i] , Toast.LENGTH_LONG).show();
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.BLACK);
                ((TextView) adapterView.getChildAt(0)).setTextSize(16);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter gen = new ArrayAdapter(this,android.R.layout.simple_spinner_item,gender);
        gen.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(gen);
        changeStatusBarColor();

        alreadyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alreadyAccount.setTextColor(Color.BLUE);
                Intent logins = new Intent(getApplicationContext(),loginActivity.class);
                startActivity(logins);
                finish();

            }
        });

    }
        private void changeStatusBarColor () {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
                window.setStatusBarColor(getResources().getColor(R.color.jerBlue2));
            }
        }

    public void btn_login(View view) {
        startActivity(new Intent(this, loginActivity.class));
        overridePendingTransition(R.anim.slide_in_left, android.R.anim.slide_out_right);
    }

}