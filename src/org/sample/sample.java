package org.sample;

import java.awt.Polygon;

import org.facebook.BaseClass;

import POJ.Pojo;

public class sample extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		url("https://adactinhotelapp.com/");
		switchTo();
		
		Pojo l=new Pojo();
		toinPut(l.getTxtuser(), "python");
		
		
		driver.navigate().refresh();
		
		toinPut1(l.getTxtuser(), "java");
		
		
		
		
		
		
		
		
	}

}
