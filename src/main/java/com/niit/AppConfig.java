package com.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("emp1")
    public Employee getEmployeeDetail(){
        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setEmpName("sam");
        employee.setSalary(2000);
        return employee;
    }
    @Bean
    public Department getDepartment(){
       return new Department("HR",101);
    }

}
