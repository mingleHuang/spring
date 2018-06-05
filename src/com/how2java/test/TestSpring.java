package com.how2java.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.how2java.pojo.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
    //public static void main(String[] args) {
    //    ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
 
        //Category c = (Category) context.getBean("c");
        
        //System.out.println(c.getName());
        //a new class product get reflected!
        //Product p = (Product) context.getBean("p");
        
        //System.out.println(p.getName());
        //System.out.println(p.getCategory().getName());
        
        //ProductService s = (ProductService) context.getBean("s");
        //s.doSomeService();
        @Autowired
        Category c;
        
        @Test
        public void test() {
        	System.out.println(c.getName());
        }
        
    //}
}
