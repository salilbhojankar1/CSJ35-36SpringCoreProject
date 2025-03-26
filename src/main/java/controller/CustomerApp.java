package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import model.Customer;

public class CustomerApp {

	public static void main(String[] args) {

   Resource resource=new ClassPathResource("firstApp.xml");
   BeanFactory  factory=new XmlBeanFactory(resource);
   Customer c=(Customer)   factory.getBean("customerObj1");
	System.out.println(c);	
	System.out.println(c.hashCode());
	
	
	Customer c1=(Customer)   factory.getBean("customerObj1");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter customer id");
	long id=sc.nextLong();
	System.out.println("enter customer name");
String name=sc.next();
System.out.println("enter customer email");
String email=sc.next();
System.out.println("enter customer phone");
long ph=sc.nextLong();
	
	c1.setCustomerId(id);
	c1.setCustomerEmail(email);
	c1.setCustomerName(name);
	
	List<Long> listOfPhone=new ArrayList();
	listOfPhone.add(1234L);
	listOfPhone.add(33553L);
	c1.setCustomerPhone(listOfPhone);
	System.out.println(c1);	
	System.out.println(c1.hashCode());
		
		
		

	}

}
