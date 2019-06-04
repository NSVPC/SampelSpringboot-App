package com.test.Calculator_service;


import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class test {
 
	 @InjectMocks 
	  AppController t2= new AppController();
	 
	   @Mock
	  AppService t3;
     
	   @Test
	   public void addtest(){
	     
	      when(t3.add(10,20)).thenReturn(30);
			
	      
	      Assert.assertEquals(t2.add(10, 20),30,0);
	   }
}
