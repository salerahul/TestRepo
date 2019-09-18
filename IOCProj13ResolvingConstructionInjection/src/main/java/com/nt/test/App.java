package com.nt.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	XmlBeanDefinitionReader reader = null;
        DefaultListableBeanFactory factory = null;
        Student student = null;
        //create IOC container
        factory = new DefaultListableBeanFactory();
        //get reader
        reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
        student = factory.getBean("student", Student.class);
        System.out.println(student);
        
    }
}
