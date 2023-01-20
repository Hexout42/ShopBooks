package ru.lernup.shopbooks.Db.model;

public class EmployeeBuilder {
    private  String nameEmployee;
    private  long idEmployee;
    public EmployeeBuilder(){

    }
    public EmployeeBuilder withName(String nameEmployee){
        this.nameEmployee = nameEmployee;
        return this;
    }
    public Employee build(){
        Employee employee = new Employee();
        employee.setName(nameEmployee);
        return employee;
    }
}