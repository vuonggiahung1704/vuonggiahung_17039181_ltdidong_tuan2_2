package com.example.bai5;

public abstract class Employee {
    private String id;
    private String ten;

    public Employee(){

    }

    public Employee(String id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public abstract double tinhLuong();

    @Override
    public String toString() {
        return id + " " + ten;
    }
}
