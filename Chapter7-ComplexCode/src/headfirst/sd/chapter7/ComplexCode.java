package headfirst.sd.chapter7;


import java.util.Calendar;

public class ComplexCode {
	public class UserCredentials {
		private String mToken;
		
		UserCredentials(String token) {
			mToken = token;
		}
		public String getUserToken() { return mToken; }
	}
	
	public UserCredentials login(String userId, String password) {
		if (userId == null) {
			throw new IllegalArgumentException("userId cannot be null");
		}
		if (password == null) {
			throw new IllegalArgumentException("password cannot be null");
		}
		
		User user = findUserByIdAndPassword(userId, password);
		if (user != null) {
			return new UserCredentials(generateToken(userId, password, 
					Calendar.getInstance().getTimeInMillis()));
		}

		throw new RuntimeException("Can't find user: " + userId);
	}
	
	private User findUserByIdAndPassword(String userId, String password) {
		if (userId.equals("Dan") && password.equals("Rules!")) {
			return new User("Dan", "Pilone", "123 S. North St.");
		}
		return null;
	}
	
	private String generateToken(String userId, String password, long nonce) {
		return Double.toString(Math.random());
	}
}
