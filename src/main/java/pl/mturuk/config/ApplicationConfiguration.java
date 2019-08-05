package pl.mturuk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.mturuk.task.TaskService;

@Configuration
public class ApplicationConfiguration {
	
	@Bean(name={"myService"})
	public TaskService taskService() {
		return new TaskService();
		
	}

}
