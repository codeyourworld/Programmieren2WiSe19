package aufgabe2.a3;

public class Contact implements Comparable<Contact>{

	private String phoneNumber;
	private String name;
	
	public Contact(String phoneNumber, String name) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Contact o) {
		return name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return String.format("%s\t(%s)", name, phoneNumber);
	}
	
}
