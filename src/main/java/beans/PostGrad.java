package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import interfaces.Type;

@Component
public class PostGrad implements Type {

	public void sayYourDegree() {
		// TODO Auto-generated method stub
		System.out.println("I am an postgrad");
	}

}
