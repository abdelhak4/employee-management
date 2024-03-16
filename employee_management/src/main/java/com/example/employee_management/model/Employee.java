package com.example.employee_management.model;

public class Employee {
    private Long employeeId;
    private String employeeName;
    private String employeeDept;
    private Double employeeSalary;
    private String message;

    public Employee(Long employeeId, String employeeName, String employeeDept, Double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDept = employeeDept;
        this.employeeSalary = employeeSalary;
    }
    public Employee() {
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDept='" + employeeDept + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", message='" + message + '\'' +
                '}';
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeDept(String employeeDept) {
        this.employeeDept = employeeDept;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDept() {
        return employeeDept;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getMessage() {
        return message;
    }
}
