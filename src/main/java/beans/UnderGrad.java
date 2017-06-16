package beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import interfaces.Type;
@Component
@Primary // Can be used if you don't want to use Qualifier
public class UnderGrad implements Type{

	public void sayYourDegree() {
		// TODO Auto-generated method stub
		System.out.println("I am an undergrad");
	}

}
