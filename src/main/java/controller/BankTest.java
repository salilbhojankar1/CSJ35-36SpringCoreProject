package controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import model.Bank;
public class BankTest {

	public static void main(String[] args) {
	
		ApplicationContext ctx=null;
		ctx=new FileSystemXmlApplicationContext("./src/main/java/bankApp.xml");
		
		
		Bank b1 = ctx.getBean("bankObj1",Bank.class);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer id");
		String id=sc.next();
		String msg =b1.getLogin(id);
		System.out.println(msg);
		
		
		Bank b2 = ctx.getBean("bankObj2",Bank.class);
		System.out.println("enter Employee id");
		String id1=sc.next();
		String msg1 =b2.getLogin(id1);
		System.out.println(msg1);
		

	}

}
