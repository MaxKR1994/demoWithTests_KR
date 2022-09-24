package com.example.demowithtests.repository;

import com.example.demowithtests.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
//@Component
public interface Repository extends JpaRepository<Employee, Integer> {
    Employee findByName(String name);

    //Обновление имени по Id
    Employee updateNameById(Integer id, String name);

    //Обновление страны по Id
    Employee updateCountryById(Integer id, String country);

    //Обновление почты по Id
    Employee updateEmailById(Integer id, String email);
}
