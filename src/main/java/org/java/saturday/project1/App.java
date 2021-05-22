package org.java.saturday.project1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App c = new App() ;
        System.out.println(c.add(10,20));
    }
    
    public int add(int a, int b)
    {
    	return a + b;
    }
    
}
