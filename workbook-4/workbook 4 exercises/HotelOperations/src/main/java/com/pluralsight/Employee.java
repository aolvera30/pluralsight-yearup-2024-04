package com.pluralsight;

import java.time.LocalTime;

public class Employee
{
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double lastPunchTime; // Variable to track the last punch time

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;


    }

    public double getTotalPay() {
        return getRegularPay() + getOvertimePay();
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0);
    }

    private double getRegularPay() {
        return getRegularHours() * payRate;
    }

    private double getOvertimePay() {
        return getOvertimeHours() * payRate * 1.5; // Assuming overtime pay is 1.5 times the regular pay
    }

    // Other getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Punch in method
    public void punchIn(double time) {
        lastPunchTime = time;
    }

    // Punch out method
    public void punchOut(double time) {
        if (lastPunchTime != 0) {
            hoursWorked += time - lastPunchTime; // Calculate hours worked and add to total
            lastPunchTime = 0; // Reset last punch time
        } else {
            System.out.println("Employee hasn't punched in yet.");
        }
    }


}
