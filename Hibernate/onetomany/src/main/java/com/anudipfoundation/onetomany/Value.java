package com.anudipfoundation.onetomany;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Value 
{
	
   	public static void main( String[] args )
    {
       try
       {
    	 Connect s1=new Connect();
    	 s1.print();
    	 System.out.println("Datas Stored Successfully");
       }
       catch(HibernateException e)
       {
    	   System.out.println(e);
       }
       
    }
}
