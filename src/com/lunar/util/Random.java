package com.lunar.util;

@SuppressWarnings( "serial" )
public class Random extends java.util.Random {
	/** 
	 * Returns a pseudo-random number between min and max, inclusive. 
	 * The difference between min and max can be at most 
	 * <code>Integer.MAX_VALUE - 1</code>. 
	 * 
	 * @param min Minimum value 
	 * @param max Maximum value.  Must be greater than min. 
	 * @return Integer between min and max, inclusive. 
	 * @see java.util.Random#nextInt(int) 
	 */ 
	public int randInt(int min, int max) {
	 
	    // NOTE: Usually this should be a field rather than a method 
	    // variable so that it is not re-seeded every call. 
	 
	    // nextInt is normally exclusive of the top value, 
	    // so add 1 to make it inclusive 
	    int randomNum = this.nextInt((max - min) + 1) + min;
	 
	    return randomNum;
	} 
	
	public static int getA(){
		return 0;
	}
}
