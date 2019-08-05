package pl.mturuk.task;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class TaskService {

	public String getServiceId() {
		return "taskService#1";
	}
@PostConstruct
	public void init() {
		System.out.println("Pobieranie zasobów");
	}
@PreDestroy
	public void destroy() {
		System.out.println("Zwalnianie zasobów");
	}

}
