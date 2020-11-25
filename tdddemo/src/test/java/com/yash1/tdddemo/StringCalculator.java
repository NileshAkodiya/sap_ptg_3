package com.yash1.tdddemo;

public class StringCalculator {

	public int calculate(String input) {
		
		if(input.isEmpty()) {
			return 0;
			
		}else if(input.indexOf(",")!=-1){

			String[] tokens=input.split(",");
			int sum=0;
			for(String token: tokens) {
				sum+=Integer.parseInt(token);
			}

			return sum;

		}else
			return Integer.parseInt(input);
	}

}
/**
 * if(input.isEmpty()) {
			return 0;
			
		}else{
		return Arrays.stream(input.split(",").mapTOInt(Integer::parseInt).sum();
		}
 * 
 * 
 * */
 */