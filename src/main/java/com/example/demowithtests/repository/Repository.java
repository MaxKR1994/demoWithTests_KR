package com.example.demowithtests.repository;

import com.example.demowithtests.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
//@Component
public interface Repository extends JpaRepository<Employee, Integer> {
    Employee findByName(String name);

    //Обновление поля 'name' по номеру Id
    Employee updateNameById(Integer id, String name);
    Employee updateCountryById(Integer id, String country);
}
