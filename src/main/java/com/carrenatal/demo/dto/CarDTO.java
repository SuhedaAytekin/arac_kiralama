package com.carrenatal.demo.dto;


import com.carrenatal.demo.model.Car;

public class CarDTO {

    private Long id;
    private String marka;
    private String model;
    private String vites;
    private String plaka;
    private String empId;
    private String renk;
    private int yas;
    private String personalEmail;
    private String mobileNo;



    public CarDTO() {
    }

    public CarDTO(Car car) {
        this.marka = car.getMarka();
        this.model = car.getModel();
        this.vites = car.getVites();
        this.plaka = car.getPlaka();
        this.empId = car.getEmpId();
        this.renk = car.getRenk();
        this.yas = car.getYas();
        this.personalEmail = car.getPersonalEmail();
        this.mobileNo = car.getMobileNo();
        this.id = car.getId();
    }

    public CarDTO(String marka, String model) {
        this.marka = marka;
        this.model = model;
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


    public void setPlaka(String plaka) {
        this.plaka = plaka;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}


//
//package com.carrenatal.demo.dto;
//
//
//        import com.carrenatal.demo.model.Car;
//
//public class CarDTO {
//
//    private Long id;
//    private String firstName;
//    private String lastName;
//    private String userName;
//    private String emailId;
//    private String empId;
//    private String bloodGp;
//    private int age;
//    private String personalEmail;
//    private String mobileNo;
//
//    public CarDTO() {
//    }
//
//    public CarDTO(Car car) {
//        this.firstName = car.getFirstName();
//        this.lastName = car.getLastName();
//        this.userName = car.getUserName();
//        this.emailId = car.getEmailId();
//        this.empId = car.getEmpId();
//        this.bloodGp = car.getBloodGp();
//        this.age = car.getAge();
//        this.personalEmail = car.getPersonalEmail();
//        this.mobileNo = car.getMobileNo();
//        this.id = car.getId();
//    }
//
//    public CarDTO(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
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
//
//    public String getLastName() {
//        return lastName;
//    }
//
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//
//    public String getUserName() {
//        return userName;
//    }
//
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//
//    public String getEmailId() {
//        return emailId;
//    }
//
//
//    public void setEmailId(String emailId) {
//        this.emailId = emailId;
//    }
//
//
//    public String getEmpId() {
//        return empId;
//    }
//
//
//    public void setEmpId(String empId) {
//        this.empId = empId;
//    }
//
//
//    public String getBloodGp() {
//        return bloodGp;
//    }
//
//
//    public void setBloodGp(String bloodGp) {
//        this.bloodGp = bloodGp;
//    }
//
//
//    public int getAge() {
//        return age;
//    }
//
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//
//    public String getPersonalEmail() {
//        return personalEmail;
//    }
//
//
//    public void setPersonalEmail(String personalEmail) {
//        this.personalEmail = personalEmail;
//    }
//
//
//    public String getMobileNo() {
//        return mobileNo;
//    }
//
//
//    public void setMobileNo(String mobileNo) {
//        this.mobileNo = mobileNo;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//}
