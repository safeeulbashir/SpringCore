package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Accountant {
	@Value("Accountant")
	String role;

	public void speak() {
		System.out.println("I am a " + role);
	}
}
