package com.cg.fms.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.bean.User;
import com.cg.fms.exception.FlightException;


public class UserDaoImpl implements UserDao {
	private List<User> userList;
	//private Map<Integer,User> map;
	
	public UserDaoImpl()
	{
		userList = new ArrayList<User>();
	}
	

	
	@Override
	public User addUser(User user) throws FlightException   {
		
	 boolean flag = userList.stream().anyMatch(p-> p.getUserId()==user.getUserId());
	 if(flag==true)
	 {
		 throw new FlightException("Id already exists");
	 }
	 userList.add(user);
	 return user;
	}

	@Override
	public User viewUser(int userId) throws FlightException {
	
		
	User user = null;

	boolean flag = userList.stream().anyMatch(p-> p.getUserId()==userId);
	if(!flag)
	{
		throw new FlightException(" Id not found");
	}
	List<User> list = userList.stream().collect(Collectors.toList());
	for (User u : list) {
	      if (u.getUserId()==userId) {
	    	 int index = userList.indexOf(u);
		     user =   userList.get(index);
		     System.out.println(user.getUserName());
		        break;
	      }
	}
	return user;
	  
	}
	@Override
	public List<User> viewUser() {
		
		List<User> list = userList.stream().collect(Collectors.toList());
		return list;
	}

	@Override
	public User updateUser(User user) throws FlightException 
	{   // from the given user, use the the userid and get the oldUser 
		//oldUser.setTele(newUser.getTel());
		//boolean flag=false; 
    boolean  flag = userList.stream().anyMatch(p-> p.getUserId()==user.getUserId());
		
		if(flag)
		{
			user.setUserId(user.getUserId());
			//userList.get()
			userList.add(user);
			//userList.add(user.getUserId());
		}
		else
		{
			throw new FlightException("Id not found");
		}
		return user;
	}

	@Override
	public void deleteUser(int userId) throws FlightException{
		
		boolean flag = userList.stream().anyMatch(p -> p.getUserId()==userId);
		if(!flag)
		{
			throw new FlightException(" Id not found");
//			for (User u : userList) {
//				
//			      if (u.getUserId()==userId) {
//				        userList.remove(u);
//				        break;
			      }
		User user = userList.stream().filter(p-> p.getUserId()==userId).findFirst().get();
		userList.remove(user);
		}
		

		//userList.
		//userList.removeIf(p -> p.getUserId()==userId);
		//List<User> list = userList.stream().collect(Collectors.toList());
		//flag = list.contains(userId);
		//if(flag) {
		
		       
		
		     
	
	
	



}