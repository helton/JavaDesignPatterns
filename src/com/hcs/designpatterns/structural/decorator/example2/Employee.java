package com.hcs.designpatterns.structural.decorator.example2;

import java.util.Date;

public interface Employee {

	public void join(Date joinDate);

	public void terminate(Date terminateDate);
	
	public String getName();
	
}