package iodevblue.sandbox.springboot.myspringbootsandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootSandboxApplication {

	public static void main(String[] args) {
		SpringApplication myServer = new SpringApplication(MySpringBootSandboxApplication.class);
		var ctx = SpringApplication.run(MySpringBootSandboxApplication.class, args);
	}

}
