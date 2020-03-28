/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SSDIproject.ManpowerAllocatorSSDI.repository;

import com.SSDIproject.ManpowerAllocatorSSDI.model.Attendance;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author kolby
 */
public interface AttendanceRepository extends CrudRepository<Attendance, Integer>{

 @Query(value= "Select * from attendance", nativeQuery=true)
 public List<Attendance> getAll();
    
   
}
