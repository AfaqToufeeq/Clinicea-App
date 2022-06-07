package com.patient.clinicea;

public class confirm_booking {

    String d_id,p_id,date,time,type,status,o_proof,o_status;

    public String getD_id() {
        return d_id;
    }

    public void setD_id(String d_id) {
        this.d_id = d_id;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getO_proof() {
        return o_proof;
    }

    public void setO_proof(String o_proof) {
        this.o_proof = o_proof;
    }

    public String getO_status() {
        return o_status;
    }

    public void setO_status(String o_status) {
        this.o_status = o_status;
    }

    public confirm_booking(String d_id, String p_id, String date, String time, String type, String status, String o_proof, String o_status) {

        this.d_id = d_id;
        this.p_id = p_id;
        this.date = date;
        this.time = time;
        this.type = type;
        this.status = status;
        this.o_proof = o_proof;
        this.o_status = o_status;
    }
}
