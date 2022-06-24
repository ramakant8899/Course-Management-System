package com.apicourse.cm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apicourse.cm.pojo.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
