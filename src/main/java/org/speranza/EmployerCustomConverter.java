/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.speranza;

import java.util.Date;
import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

/**
 *
 * @author feder
 */
@Record
public class EmployerCustomConverter {
    
    @Field(at = 0)
    private String firstName;
    @Field(at = 1)
    private String secondName;
    @Field(at = 2)
    private String title;
    @Field(at = 3,  type =Double.class)
    private Double salary;
    @Field(at = 4, format = "dd/mm/yyyy")
    private Date hireDate;

    public EmployerCustomConverter(String firstName, String secondName, String title, double salary, Date hireDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.title = title;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the secondName
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * @param secondName the secondName to set
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the hireDate
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    
    
}
