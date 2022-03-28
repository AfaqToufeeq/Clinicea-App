package com.patient.clinicea.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.patient.clinicea.Dashboard.dashboardActivity;
import com.patient.clinicea.R;

public class loginActivity extends AppCompatActivity {

    EditText emailAddress,pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailAddress=findViewById(R.id.emailAddressTV);
        pass=findViewById(R.id.passTV);
        login=findViewById(R.id.loginButton);

        changeStatusBarColor();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), dashboardActivity.class));
            }
        });
    }


    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
            window.setStatusBarColor(getResources().getColor(R.color.jerBlue2));
        }
    }

    public void btn_register(View view) {
        startActivity(new Intent(this,registerActivity.class));

    }
}