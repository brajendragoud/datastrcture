package com.green.arrays;



public class A_002_ArrayAsParameters {
	
    public static void main(String[] args) {
    	
    	double b[] = new double[5];
    	
    	for (int i = 0; i < b.length; i++) {
			b[i] = i ;
		}
    	
    	System.out.println(b.length);
    	System.out.println("Before b[4] =" + b[4]);
    	System.out.println("Average :" + avg(b));
    	System.out.println("After b[4] =" + b[4]);
    	
        
       
    }
    
    
    public static double avg(double a[]){
    	double sum = 0;
    	
    	a[4] = 14.0;
    	for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
    	double avg =  sum/a.length;
    	
    	a = new double[20];
    	
    	return avg;
    	
    }
}
