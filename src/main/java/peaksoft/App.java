package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat cat = applicationContext.getBean("cat", Cat.class);
        System.out.println("Cat: " + cat.getName());
        System.out.println("Cat: " + cat.getAge());

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Cat1: " + cat1.getName());
        System.out.println("Cat1: " + cat1.getAge());

        Boolean comparison = cat.equals(cat1);
        System.out.println("comparison: " + comparison);
    }
}
