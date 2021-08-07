package wee3.day1.demos;

import java.util.Optional;

// Entity Class
class User {
	private String userId;
	private String password;

	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public User(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}


}


class UserNotAvaialableException extends Exception {
	public UserNotAvaialableException() {
		// TODO Auto-generated constructor stub
	}

	public UserNotAvaialableException(String msg) {
		super(msg);
	}
}


class DBDao {

	public static Optional<User> getUserData() throws UserNotAvaialableException {
		User user = null;
		User user1 = (User) Optional.ofNullable(user)
		                            .orElseThrow(() -> new UserNotAvaialableException(
		                                "Sorry No User Available"));

		// User user1 = (User) Optional.ofNullable(user).orElseThrow(UserNotAvaialableException::new);
		// //pre defined exception classes
		Optional<User> optionalUser = Optional.of(user);
		// var user = new User("skilled@sabaribalaji.com","12345");
		// Optional<User> optionalUser = Optional.ofNullable(user);

		return optionalUser; // hitting the DB and found no records
	}
}


public class OptionalDemo3 {

	public static void main(String[] args) throws UserNotAvaialableException {

		Optional<User> optionalUser = DBDao.getUserData();

		User user = null;

		// if (optionalUser.isPresent())
		//
		// user = optionalUser.get();
		//
		//
		// System.out.println(user.getUserId());

		// optionalUser.ifPresent((u) -> System.out.println(u.getPassword())); //One Line Of Statement

		optionalUser.ifPresentOrElse((u) -> System.out.println(u.getPassword()),
		    () -> System.out.println("Sorry Object Is NUll"));
		// Optional.

	}

}
