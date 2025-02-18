package com.shivam.ServiceInterfase;

import com.shivam.Entity.Role;
import com.shivam.Entity.UserMaster;

public interface UserInterfase {

public UserMaster cretaUser(UserMaster user);
public UserMaster updateMaster( Long id ,UserMaster user);
public void dlt(Long id);


}
