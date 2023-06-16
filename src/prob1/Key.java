package prob1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Key key = (Key) o;
        return Objects.equals(lastName, key.lastName) && Objects.equals(firstName, key.firstName);
	}
	@Override
    public int hashCode() {
		int result = Objects.hashCode(firstName);
		result = 31 * result + (lastName!= null? lastName.hashCode() : 0);
		return result;
	}

}
