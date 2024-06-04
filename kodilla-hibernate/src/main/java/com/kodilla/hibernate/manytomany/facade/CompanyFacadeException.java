package com.kodilla.hibernate.manytomany.facade;

public class CompanyFacadeException  extends Exception {

    public static final String COMPANY_NOT_FOUND = "Company not found";
    public static final String EMPLOYEE_NOT_FOUND = "Employee not found";

    public CompanyFacadeException(String message) {
        super(message);
    }
}