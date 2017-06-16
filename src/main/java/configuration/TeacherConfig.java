package configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import beans.Teacher;

@Configuration
public class TeacherConfig {
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Bean(name = "teacher")
	public Teacher teacher() {
		System.out.println("I am configured with teacher settings");
		return new Teacher();
	}

	@PostConstruct
	private void init() {
		System.out.println("initializing: " + System.identityHashCode(this));
	}

	@PreDestroy
	public void cleanUp() throws Exception {
		System.out.println("Teacher deleted.");
	}
}
