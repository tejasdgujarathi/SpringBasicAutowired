import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	String name;

	Address address;

	
	public Person() {
	}

	//@Autowired
	public Person(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCity() {
		return getAddress().getCity();
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
