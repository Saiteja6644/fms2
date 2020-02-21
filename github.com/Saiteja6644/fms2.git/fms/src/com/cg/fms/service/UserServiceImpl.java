package com.cg.fms.service;

import java.util.List;
import java.util.Random;

import com.cg.bean.User;
import com.cg.fms.dao.UserDao;
import com.cg.fms.dao.UserDaoImpl;
import com.cg.fms.exception.FlightException;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	public UserServiceImpl()
	{
		userDao = new UserDaoImpl();
	}
	
	
	public void validateUser(User user) throws FlightException
	{
		//String input = user.getUserName();
		String mail = user.getUserEmail();
		String pass = user.getPassword();
		String userPhone = String.valueOf(user.getUserPhone());
		if(mail.matches("[a-zA-z0-9]+") && pass.matches("[a-zA-Z0-9]+") && userPhone.matches("[0-9]{8}"));
		throw new FlightException("Invalid input");
		
	}
	
	
	@Override
	public User addUser(User user) throws FlightException {
		String name = user.getUserName();
		if(name.matches("[a-zA-Z]+")               )
		{
			Random rand = new Random();
			int id = rand.nextInt(100)+1000;
			user.setUserId(id);
		}
		else
		{
			throw new FlightException(" Name should be characters");
		}

		return userDao.addUser(user);
	}

	@Override
	public User viewUser(int userId) throws FlightException{
		String str = String.valueOf(userId);
		if(!str.matches("[0-9]{4}"))
		{
			throw new FlightException(" Id is not valid");
		}
		return userDao.viewUser(userId);
	}

	@Override
	public List<User> viewUser() throws FlightException {
		
		return userDao.viewUser();
	}

	@Override
	public User updateUser(User user) throws FlightException{
		String str = String.valueOf(user.getUserId());
		if(!str.matches("[0-9]{4}"))
		{
			throw new FlightException(" Id is not valid");
		}
		return userDao.updateUser(user);
	}

	@Override
	public void deleteUser(int userId) throws FlightException{
		// TODO Auto-generated method stub
		
		userDao.deleteUser(userId);
	}

}
