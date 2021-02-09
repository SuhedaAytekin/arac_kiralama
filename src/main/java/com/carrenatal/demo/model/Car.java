package com.carrenatal.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="marka")
    private String marka;

    @Column(name="model")
    private String model;

    @Column(name="vites")
    private String vites;

    @Column(name="plaka")
    private String plaka;

    @Column(name="emp_id")
    private String empId;

    @Column(name="renk")
    private String renk;

    @Column(name="yas")
    private int yas;

    @Column(name="personal_email")
    private String personalEmail;

    @Column(name="mobile_no")
    private String mobileNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {this.plaka= plaka;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

}




//@Entity
//@Table(name = "car")
//public class Car {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name="first_name")
//    private String firstName;
//
//    @Column(name="last_name")
//    private String lastName;
//
//    @Column(name="user_name")
//    private String userName;
//
//    @Column(name="email_id")
//    private String emailId;
//
//    @Column(name="emp_id")
//    private String empId;
//
//    @Column(name="blood_gp")
//    private String bloodGp;
//
//    @Column(name="age")
//    private int age;
//
//    @Column(name="personal_email")
//    private String personalEmail;
//
//    @Column(name="mobile_no")
//    private String mobileNo;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getEmailId() {
//        return emailId;
//    }
//
//    public void setEmailId(String emailId) {
//        this.emailId = emailId;
//    }
//
//    public String getEmpId() {
//        return empId;
//    }
//
//    public void setEmpId(String empId) {
//        this.empId = empId;
//    }
//
//    public String getBloodGp() {
//        return bloodGp;
//    }
//
//    public void setBloodGp(String bloodGp) {
//        this.bloodGp = bloodGp;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getPersonalEmail() {
//        return personalEmail;
//    }
//
//    public void setPersonalEmail(String personalEmail) {
//        this.personalEmail = personalEmail;
//    }
//
//    public String getMobileNo() {
//        return mobileNo;
//    }
//
//    public void setMobileNo(String mobileNo) {
//        this.mobileNo = mobileNo;
//    }
//
//}
