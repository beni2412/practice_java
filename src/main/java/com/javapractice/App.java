package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static  final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

	LOG.info("byeee");
	LOG.info("Auf wiedersehen");

	LOG.info("Holaa");
	LOG.info("Hiii");
	LOG.info("master12");
        LOG.info("Hello World");
    }
}
