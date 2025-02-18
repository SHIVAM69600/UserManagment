package com.shivam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.Entity.UserMaster;

public interface UserMasterRepository extends JpaRepository<UserMaster, Long>{

}
