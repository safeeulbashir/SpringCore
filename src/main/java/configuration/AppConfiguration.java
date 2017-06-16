package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages="beans")
@Import({AccountantConfig.class, TeacherConfig.class})
public class AppConfiguration {

	
}
