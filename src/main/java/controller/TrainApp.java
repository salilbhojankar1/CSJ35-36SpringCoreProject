package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import model.Train;
public class TrainApp {
	public static void main(String[] args) {
		ApplicationContext ctx= new FileSystemXmlApplicationContext("./src/main/java/configuration/TrainConfig.xml");
		Train t = ctx.getBean("trainObj",Train.class);
		System.out.println(t);
	}

}
