package com.example.bai5;

public class EmployeePartTime extends Employee {
    public EmployeePartTime() {

    }

    public EmployeePartTime(String id, String ten) {
        super(id, ten);
    }

    @Override
    public double tinhLuong() {
        return 150;
    }

    @Override
    public String toString() {
        return super.toString() + "--->Part time = "+ tinhLuong();
    }
}
