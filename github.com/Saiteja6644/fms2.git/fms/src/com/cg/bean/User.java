package com.cg.bean;

public class User {
		
		private String userType;
		private int userId;
		private String userName;
		private String password;
		private double userPhone;
		private String userEmail;
		public User(String userType, int userId, String userName, String password, double userPhone,
				String userEmail) {
			super();
			this.userType = userType;
			this.userId = userId;
			this.userName = userName;
			this.password = password;
			this.userPhone = userPhone;
			this.userEmail = userEmail;
		}
		public User() {
			super();
		}
		public String getUserType() {
			return userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public double getUserPhone() {
			return userPhone;
		}
		public void setUserPhone(double userPhone) {
			this.userPhone = userPhone;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		public String toString()
		{
			return userId+" "+userName+" "+password+" "+userPhone+" "+userEmail;
		}
		
		
		
		
		
		

	}


