package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import interfaces.Type;

@Component
public class Student {
	@Value("Safee")
	String studentName;
	@Autowired
	@Qualifier("postGrad")
	Type studentType;
	public void speak() {
		System.out.println("My name is "+studentName);
		studentType.sayYourDegree();
	}
}
