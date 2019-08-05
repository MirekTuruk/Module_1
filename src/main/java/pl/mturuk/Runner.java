package pl.mturuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import pl.mturuk.config.ApplicationConfiguration;
import pl.mturuk.task.TaskService;

@Configuration
public class Runner {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		AbstractApplicationContext abstractContext = (AbstractApplicationContext) context;
		abstractContext.registerShutdownHook();

		TaskService taskService = context.getBean(TaskService.class);

		TaskService secondTaskService = context.getBean(TaskService.class);

		if (taskService == secondTaskService) {
			System.out.println("Referencje s¹ takie same");
		} else {
			System.out.println("Referencje s¹ ró¿ne");

		}

		String serviceId = taskService.getServiceId();

		System.out.println("Id serwisu to: " + serviceId);

	}
}
