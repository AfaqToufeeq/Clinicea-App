package com.patient.clinicea.Payment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.patient.clinicea.Dashboard.dashboardActivity;
import com.patient.clinicea.R;

public class onlinePayment_Activity extends AppCompatActivity {

    TextView nameTv,accountNumberTv,bankNameTv;
    EditText transactionID;
    Button confirm_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_payment);
        nameTv=findViewById(R.id.DocfullName);
        accountNumberTv=findViewById(R.id.accountNumber);
        bankNameTv=findViewById(R.id.bankName);
        transactionID=findViewById(R.id.transactionID);
        confirm_btn=findViewById(R.id.confirm_btn);

        Bundle bundle =getIntent().getExtras();
        if(bundle!=null)
        {
            nameTv.setText(bundle.getString("name"));
            accountNumberTv.setText("02377902098876");
            bankNameTv.setText("Habib Bank Limited (HBL)");

        }

        String transaction=transactionID.getText().toString();

        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(transaction.isEmpty())
                {
                    transactionID.setError("Required");
                }
                else
                {
                    Toast.makeText(onlinePayment_Activity.this, "Payment Completed, You'll receive your meeting time soon", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),onlinePaymentConfirm.class));
                }
            }
        });
    }

    public void btn_dashboard(View view) {
        startActivity(new Intent(getApplicationContext(), dashboardActivity.class));
    }

}