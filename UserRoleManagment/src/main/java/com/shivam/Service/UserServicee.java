package com.shivam.Service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeEvent;
import org.springframework.stereotype.Service;

import com.shivam.Entity.Role;
import com.shivam.Entity.UserMaster;
import com.shivam.Repository.RoleRepository;
import com.shivam.Repository.UserMasterRepository;
import com.shivam.ServiceInterfase.UserInterfase;
@Service
public class UserServicee implements UserInterfase{
  
@Autowired
private UserMasterRepository UMR;
@Autowired
private RoleRepository rLRepository ;

public UserMaster cretaUser(UserMaster user) {
	return UMR.save(user);
	
}

public UserMaster updateMaster(Long id, UserMaster user) {
    Optional<UserMaster> exit = UMR.findById(id);  
    if (exit.isPresent()) {  
        UserMaster existingUser = exit.get(); 
        existingUser.setEmail(user.getEmail());
        existingUser.setMobile(user.getMobile());
        existingUser.setStatus(user.getStatus());
        existingUser.setCreateBy(user.getCreateBy());
       return UMR.save(existingUser);  
    }
    return null;  
}
@Override
public void dlt(Long id) {
		UMR.deleteById(id);
	}

}



