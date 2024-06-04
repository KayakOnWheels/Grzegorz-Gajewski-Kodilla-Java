package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    public CompanyFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public void processSearch(CompanyDto company, EmployeeDto employee){
        LOGGER.info("Searching for employee by {} in last name", employee.partOfEmployeeName());
        List<Employee> employees = employeeDao.retrieveEmployeesByPartPhrase(employee.partOfEmployeeName());

        if (employees.isEmpty()) {
            LOGGER.info(CompanyFacadeException.EMPLOYEE_NOT_FOUND);
        } else {
            System.out.println(employees);
            LOGGER.info("Found {} records", employees.size());
        }

        LOGGER.info("Searching for company by {}", company.partOfCompanyName());
        List<Company> companies = companyDao.retrieveCompaniesByPartPhrase(company.partOfCompanyName());

        if (employees.isEmpty()) {
            LOGGER.info(CompanyFacadeException.COMPANY_NOT_FOUND);
        } else {
            System.out.println(employees);
            LOGGER.info("Found {} records", companies.size());
        }


    }
}
