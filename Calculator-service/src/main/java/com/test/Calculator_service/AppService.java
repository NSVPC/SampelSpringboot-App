package com.test.Calculator_service;

import org.springframework.stereotype.Service;



@Service
public class AppService {
	
	public int  add(int x,int y)
	{
	     return (x+y);
	}
	public  int  sub(int x,int y)
	{
		return (x-y);
	}
}