package headfirst.sd.chapter7;

public class User {
	private String mAddress;
	private String mFirstName;
	private String mLastName;
	public String getAddress() { return mAddress; }
	public String getFirstName() { return mFirstName; }
	public String getLastName() { return mLastName; }
	public User(String firstName, String lastName, String address) {
		mFirstName = firstName;
		mLastName = lastName;
		mAddress = address;
	}
	}

