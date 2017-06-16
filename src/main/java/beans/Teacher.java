package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Teacher {
	@Value("Teacher")
	String role;
	
	public void speak() {
		System.out.println("I am a " + role);
	}
}
