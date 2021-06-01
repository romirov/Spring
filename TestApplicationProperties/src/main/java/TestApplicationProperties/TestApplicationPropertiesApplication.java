package TestApplicationProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(Test.class)
public class TestApplicationPropertiesApplication {

	public static void main(String[] args) {
		final ApplicationContext ctx = SpringApplication.run(TestApplicationPropertiesApplication.class, args);
		final Test test = ctx.getBean(Test.class);
		System.out.println(test.getParam1());
		System.out.println(test.getParam2());
		System.out.println(test.getParam1());
	}
}
