package com.postgre.Entity;
import javax.persistence.*;


@Entity
@Table(name = "student")


public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rollno;

    private String Name;

    private String Branch;

    private String Address;


    public Student() {
        super();
    }

    public Student(String name, String branch, String address) {
        super();
        Name = name;
        Branch = branch;
        Address = address;
    }

    @Id

    public Long getRollno() {
        return rollno;
    }
    public void setRollno(Long rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getBranch() {
        return Branch;
    }
    public void setBranch(String branch) {
        Branch = branch;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }


    @Override
    public String toString() {
        return "Students [rollno=" + rollno + ", Name=" + Name + ", Branch=" + Branch + ", Address=" + Address + "]";
    }

}