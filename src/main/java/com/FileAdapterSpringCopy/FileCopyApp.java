package com.FileAdapterSpringCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

/**
 * Hello world!
 *
 */
public class FileCopyApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("fileCopyApplicationContext.xml");
    	Properties prop = new Properties();
    	try {
    		Thread.sleep(2000);
    		FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir") + "/output/fileToCopy.properties"));
			prop.load(fis);
			System.out.println(prop);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
