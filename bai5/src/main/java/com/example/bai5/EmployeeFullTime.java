package com.example.bai5;

public class EmployeeFullTime extends Employee {
    public EmployeeFullTime() {
    }

    public EmployeeFullTime(String id, String ten) {
        super(id, ten);
    }

    @Override
    public double tinhLuong() {
        return 500;
    }

    @Override
    public String toString() {
        return super.toString() + "--->Fulltime = "+ tinhLuong();
    }
}
