package org.yash;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.yash.domain.Student;

/**
 * Hello world!
 *
 * BeanFactory  both are lazy
 * AplicationContext
 */
public class App 
{
    public static void main( String[] args )
    {
      // System.out.println( "Hello World!" );
      /*  Resource resource = new ClassPathResource("spring.xml");
     BeanFactory beanFactory = new XmlBeanFactory(resource);
       //  Student student = (Student) beanFactory.getBean("s1"); */

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) applicationContext.getBean("s2");
        System.out.println(student);
        /*Student student = (Student) applicationContext.getBean("s1");
        Student student1 = (Student) applicationContext.getBean("s1");
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());*/
    }
}
