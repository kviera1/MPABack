/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SSDIproject.ManpowerAllocatorSSDI.repository;

import com.SSDIproject.ManpowerAllocatorSSDI.model.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author kolby
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
    
}
