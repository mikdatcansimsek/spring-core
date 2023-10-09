package yte.intern.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

		ComponenTest componentTest = context.getBean(ComponenTest.class);

		//componentTest.print();

		DependencyInjectionTest dependencyInjectionTest = context.getBean(DependencyInjectionTest.class);
		//dependencyInjectionTest.print();

		LifecycleBean lifecycleBean = context.getBean(LifecycleBean.class);
		//lifecycleBean.print();

		InjectionTest injectionTest = context.getBean(InjectionTest.class);
		injectionTest.print();

	}

}
