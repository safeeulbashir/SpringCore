package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Accountant;

@Configuration
public class AccountantConfig {

	@Bean(name="accountant")
	public Accountant accountant()
	{
		System.out.println("I am configured with accountant settings");
		return new Accountant();
	}
}
