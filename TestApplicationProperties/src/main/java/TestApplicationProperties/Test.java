package TestApplicationProperties;



//import javax.annotation.PostConstruct;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

//@Configuration
//@Component

@ConfigurationProperties(prefix = "demo")
@Validated
public class Test {
	private String param1;
	private String param2;
	
	
	public void setParam1(String param1) {
		this.param1 = param1;
	}


	public String getParam1() {
		return  param1;
	}
	
	public void setParam2(String param2) {
		this.param2 = param2;
	}


	public String getParam2() {
		return param2;
	}

}
