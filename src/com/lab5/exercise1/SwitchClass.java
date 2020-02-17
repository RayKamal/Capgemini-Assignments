package com.lab5.exercise1;

public class SwitchClass {
	String signalLight;
	SwitchClass(String Signal)
	{
		signalLight=Signal;
	}
	
	public void trafficLight() {
		
		switch(signalLight)
		{
		case "red":{System.out.println("STOP");}
		break;
		case "yellow":{System.out.println("READY");}
		break;
		case "green":{System.out.println("GO");}
		break;
		default:{System.out.println("wrong input");}
		break;
		
		}
		
	}

}
