package auribises.com.visitorbook.Class;

import java.io.Serializable;

public class Visitorentry implements Serializable {
    int id;
    String name,phone,email,gender,address,purpose,date,time,teacher,branch,idproof,idproofnumber,vehicle,vehiclenumber;

    public Visitorentry() {
    }

    public Visitorentry(int id, String name, String phone, String email, String gender, String address, String purpose, String date, String time, String teacher, String branch, String idproof, String idproofnumber, String vehicle, String vehiclenumber) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.purpose = purpose;
        this.date = date;
        this.time = time;
        this.teacher = teacher;
        this.branch = branch;
        this.idproof = idproof;
        this.idproofnumber = idproofnumber;
        this.vehicle = vehicle;
        this.vehiclenumber = vehiclenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
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

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getIDProof() {
        return idproof;
    }

    public void setIDProof(String idproof) {
        this.idproof = idproof;
    }

    public String getIDProofnumber() {
        return idproofnumber;
    }

    public void setIDProofnumber(String idproofnumber) {
        this.idproofnumber = idproofnumber;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehiclenumber() {
        return vehiclenumber;
    }

    public void setVehiclenumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber;
    }

    @Override
    public String toString() {
        return "Details of visitorentry\n" +
                "\nID is: " + id +
                "\nName is: " + name +
                "\nPhone is: " + phone +
                "\nEmail is: " + email +
                "\nGender is: " + gender +
                "\nAddress is: " + address +
                "\nPurpose is: " + purpose +
                "\nDate is: " + date +
                "\nTime is: " + time +
                "\nTeacher is: " + teacher +
                "\nBranch is: " + branch +
                "\nIdProof is: " + idproof +
                "\nIDProofnumber is: " + idproofnumber +
                "\nVehicle is: " + vehicle +
                "\nVehiclenumber is: " + vehiclenumber ;
    }
}

