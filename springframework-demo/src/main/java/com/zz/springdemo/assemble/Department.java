package com.zz.springdemo.assemble;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Francis.zz on 2016/3/1.
 * 描述：
 */
public class Department {
    private String name;
    private String[] departName;
    private List<Employee> employeeList;
    private Set<Employee> employeeSet;
    private Map<String, Employee> employeeMap;
    private Properties pp;

    public Properties getPp() {
        return pp;
    }

    public void setPp(Properties pp) {
        this.pp = pp;
    }

    public Map<String, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDepartName() {
        return departName;
    }

    public void setDepartName(String[] departName) {
        this.departName = departName;
    }
}
