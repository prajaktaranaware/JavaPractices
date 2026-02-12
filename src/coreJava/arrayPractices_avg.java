package coreJava;

public class arrayPractices_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {10,20,30,40};
      int sum=0;
   
      
     //sum of array 
      for (int num:arr) {
    	  sum=+num;
      }
     //length of array
      int arraylength=arr.length;
     //calculate avg
      double average = (double) sum / arraylength;
      System.out.println("Avg of array" + average);
      
	}

}
