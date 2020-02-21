package com.cg.fms.dao;
import java.util.List;

import com.cg.bean.User;
import com.cg.fms.exception.FlightException;
public interface UserDao {
public List<User> userList = null;
	
	public  User addUser(User user) throws FlightException; 
	public User viewUser(int userId) throws FlightException ;
	public List<User> viewUser() throws FlightException;
	public User updateUser(User user)throws FlightException;
	public  void deleteUser(int userId) throws FlightException;
	
}
