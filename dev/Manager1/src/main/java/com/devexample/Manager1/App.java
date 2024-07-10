package com.devexample.Manager1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devexampleManager1.beem.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*System.out.println( "Hello World!" );
        
        JavaCourse java = new JavaCourse();
        java.startLearn();
        PythonCourse python = new PythonCourse();
        python.startLearn();
        
        CourseStatus status = new JavaCourse();
        status.startLearn();*/
    	
    	ApplicationContext contect =new ClassPathXmlApplicationContext("./Resource/Beans.xml");
    	PythonCourse status = contect.getBean(PythonCourse.class);
    	status.startLearn();
    	System.out.print("done");
    	
    	
    }

}
