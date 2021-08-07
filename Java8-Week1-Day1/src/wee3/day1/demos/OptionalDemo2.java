//package wee3.day1.demos;
//
//// Entity Class
//class User {
//	private String userId;
//	private String password;
//
//	public String getUserId() {
//		return userId;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public User(String userId, String password) {
//		super();
//		this.userId = userId;
//		this.password = password;
//	}
//
//
//}
//
//
//class DBDao {
//
//	public static User getUserData() {
//		User user = null;
//		return user; // hitting the DB and found no records
//	}
//}
//
//
//public class OptionalDemo2 {
//
//	public static void main(String[] args) {
//
//		User user = DBDao.getUserData();
//
//		if (user != null) {
//
//			if (DBDao.getUserData()
//			         .getUserId()
//			         .equals("S001")) {
//
//				System.out.println("Hi user U R Authenticated!");
//
//			}
//		}else {
//			System.out.println("Sorry No Record Found!");
//		}
//
//	}
//
//}
