package com.patient.clinicea.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.patient.clinicea.Dashboard.dashboardActivity;
import com.patient.clinicea.Edoctor.EdoctorActivity;
import com.patient.clinicea.Patient_Data;
import com.patient.clinicea.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class loginActivity extends AppCompatActivity {

    static String patient_url="http://192.168.0.121:8000/patientapi/";
    public static ArrayList<Patient_Data> logged = new ArrayList<>();
    String output="";
    EditText emailAddress,pass;
    Button login,E_docCareBtn;
    boolean flag=false;
    static ArrayList<Patient_Data> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailAddress=findViewById(R.id.emailAddressTV);
        pass=findViewById(R.id.passTV);
        login=findViewById(R.id.loginButton);
        E_docCareBtn=findViewById(R.id.E_docCareBtn);

        changeStatusBarColor();

        E_docCareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), EdoctorActivity.class));
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//              Toast myToast = Toast.makeText(loginActivity.this, "abc", Toast.LENGTH_SHORT);
                fetch();

                for (int i=0;i<data.size();i++)
                {
//                    Toast myToast = Toast.makeText(loginActivity.this, String.valueOf(i), Toast.LENGTH_SHORT);
//                    myToast.show();
                    if(emailAddress.getText().toString().equals(data.get(i).email.toString()) && pass.getText().toString().equals(data.get(i).password.toString()))
                    {
                        Patient_Data logged_in = new Patient_Data(
                                data.get(i).id,
                                data.get(i).name,
                                data.get(i).username,
                                data.get(i).password,
                                data.get(i).email,
                                data.get(i).address,
                                data.get(i).contact,
                                data.get(i).cnic,
                                data.get(i).gender,
                                data.get(i).dob,
                                data.get(i).block_status
                        );

                        logged.add(logged_in);
                        flag=true;

                        startActivity(new Intent(getApplicationContext(), dashboardActivity.class));
                    }

                }
                if (flag==false)
                {
                    Toast myToast = Toast.makeText(loginActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT);
                    myToast.show();
                }


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


    void fetch()
    {
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        JsonArrayRequest objectRequest = new JsonArrayRequest(
                Request.Method.GET,
                patient_url,
                null,
                new Response.Listener<JSONArray>()
                {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {
                            for(int i=0;i<response.length();i++)
                            {
                                Patient_Data xyz = new Patient_Data(
                                        response.getJSONObject(i).get("id").toString(),
                                        response.getJSONObject(i).get("name").toString(),
                                        response.getJSONObject(i).get("username").toString(),
                                        response.getJSONObject(i).get("password").toString(),
                                        response.getJSONObject(i).get("email").toString(),
                                        response.getJSONObject(i).get("address").toString(),
                                        response.getJSONObject(i).get("contact").toString(),
                                        response.getJSONObject(i).get("cnic").toString(),
                                        response.getJSONObject(i).get("gender").toString(),
                                        response.getJSONObject(i).get("dob").toString(),
                                        response.getJSONObject(i).get("block_status").toString()
                                );
                                data.add(xyz);

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
                    }
                }
        );
//        objectRequest.setRetryPolicy(new RetryPolicy() {
//            @Override
//            public int getCurrentTimeout() {
//                return 50000;
//            }
//
//            @Override
//            public int getCurrentRetryCount() {
//                return 50000;
//            }
//
//            @Override
//            public void retry(VolleyError error) throws VolleyError {
//
//            }
//        });
        requestQueue.add(objectRequest);
    }



    void add()
    {
        try {
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            JSONObject jsonBody = new JSONObject();
            jsonBody.put("id", 5);
            jsonBody.put("name", "new name");
            jsonBody.put("username", "new username");
            jsonBody.put("password", "new password");
            jsonBody.put("email", "new email");
            jsonBody.put("address", "new address");
            jsonBody.put("contact", "00000000000");
            jsonBody.put("cnic", "00000000000000");
            jsonBody.put("gender", "Male");
            jsonBody.put("dob", "12-4-2021");
            jsonBody.put("block_status", 0);
            final String requestBody = jsonBody.toString();

            StringRequest stringRequest = new StringRequest(Request.Method.POST, patient_url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.i("VOLLEY", response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("VOLLEY", error.toString());
                }
            }) {
                @Override
                public String getBodyContentType() {
                    return "application/json; charset=utf-8";
                }

                @Override
                public byte[] getBody() throws AuthFailureError {
                    try {
                        return requestBody == null ? null : requestBody.getBytes("utf-8");
                    } catch (UnsupportedEncodingException uee) {
                        VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", requestBody, "utf-8");
                        return null;
                    }
                }

                @Override
                protected Response<String> parseNetworkResponse(NetworkResponse response) {
                    String responseString = "";
                    if (response != null) {
                        responseString = String.valueOf(response.statusCode);
                        // can get more details such as response.headers
                    }
                    return Response.success(responseString, HttpHeaderParser.parseCacheHeaders(response));
                }
            };

            requestQueue.add(stringRequest);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}