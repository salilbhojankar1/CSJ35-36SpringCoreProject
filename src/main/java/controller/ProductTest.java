package controller;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Product;
public class ProductTest {
	public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("productApp.xml");
	Product p=context.getBean("productObj",Product.class);
	Map<Integer ,String>map = p.getProductInfo();
//	Set<Entry<Integer,String>> entries = map.entrySet();
//	for(Entry<Integer,String>e:entries)
//	{
//		System.out.println(e.getKey()+" "+e.getValue());
//	}
	
	
	
	Set<Integer>setOfKey=map.keySet();
	Iterator<Integer> itr =setOfKey.iterator();
	while(itr.hasNext())
	{
		int key =itr.next();
		String value =map.get(key);
		System.out.println(key+" "+value);
	}
	map.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
	System.out.println(Arrays.toString(p.getCategory()));
	}
}
