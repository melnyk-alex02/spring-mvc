package com.sasha.spring.mvc;

import com.sasha.spring.mvc.validation.checkemail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
    @NotBlank(message = "surname is required")
    private String surname;
    @Min(value = 500, message = "must be grater then 499")
    @Max(value = 1500, message = "must be less then 1501")
    private int salary;
    private String department;
    private String car_brand;
    private Map<String, String> departments;
    private Map<String, String> cars;
    private String[] languages;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message ="please use pattern XXX-XX-XX")
    private String phone_number;
    @checkemail
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Map<String, String> getLanguagesMap() {
        return languagesMap;
    }

    public void setLanguagesMap(Map<String, String> languagesMap) {
        this.languagesMap = languagesMap;
    }

    private Map<String, String> languagesMap;

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", " IT");
        departments.put("HR", "HR");
        departments.put("Sales", "Sales");
        cars = new HashMap<>();
        cars.put("tesla", "tesla");
        cars.put("bmw", "bmw");
        cars.put("mb", "mb");
        languagesMap = new HashMap();
        languagesMap.put("EN", "English");
        languagesMap.put("DE", "Deutch");
        languagesMap.put("UA", "Ukrainian");
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
