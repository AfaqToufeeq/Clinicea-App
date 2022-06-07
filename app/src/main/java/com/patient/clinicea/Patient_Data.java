package com.patient.clinicea;

public class Patient_Data {
    public String id, name, username, password, email, address, contact, cnic, gender,dob,block_status;

    public Patient_Data(String id, String name, String username, String password, String email, String address, String contact, String cnic, String gender, String dob, String block_status) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.contact = contact;
        this.cnic = cnic;
        this.gender = gender;
        this.dob = dob;
        this.block_status = block_status;
    }
}
