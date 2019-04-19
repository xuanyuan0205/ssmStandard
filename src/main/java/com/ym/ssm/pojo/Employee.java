package com.ym.ssm.pojo;

import com.ym.ssm.pojoex.EmpoyeeStatus;

public class Employee {
    private Integer id;

    private String lastName;

    private String gender;

    private String email;

    public EmpoyeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmpoyeeStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {

        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }

    private Integer deptId;

    private EmpoyeeStatus status;

    public Employee(Integer id, String lastName, String gender, String email, Integer deptId,EmpoyeeStatus status) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.deptId = deptId;
        this.status = status;
    }

    public Employee() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }


}