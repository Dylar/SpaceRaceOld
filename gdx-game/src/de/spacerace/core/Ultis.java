package de.spacerace.core;

import java.util.*;

public class Ultis
{
	private static Random rndGenerator = new Random();
	
	public static int getRandom(int from,int to){
		return rndGenerator.nextInt(to) + from;
	}

	public static String getRandomString(){
		return "random string";
	}
}
