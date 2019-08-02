package pl.mturuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.mturuk.task.TaskService;


@Configuration
public class Runner {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");

		TaskService taskService = context.getBean("myService", (TaskService.class));

		String serviceId = taskService.getServiceId();

		System.out.println("Id serwisu to: " + serviceId);

	}
}
