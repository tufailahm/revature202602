package org.example;

public class Employee {
    private int employeeId;
    private String employeeName;
    private Department department;      //composition
}

class Department
{
    private int deptId;
    private String departmentName;
    private String departmentLocation;
}
