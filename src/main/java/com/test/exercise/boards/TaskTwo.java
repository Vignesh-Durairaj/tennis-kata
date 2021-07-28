package com.test.exercise.boards;




public class TaskTwo {
	
	public static void main(String[] args) {
		TaskTwo task = new TaskTwo();
		task.secondLargeValue();
	}

	public void secondLargeValue() {
		int[] array= {14,0,12,3,-1,3,1,14};
		
		if(array.length>=2) {
			System.out.println(getSencondLarge(array));
		}else {
			System.out.println("Array size is only " + array.length);
		}
	}
	
	public int getSencondLarge(int[] array) {
		int len = array.length;
		
		int large=array[0];
		int second=array[1];
		if(second>large) {
			int m = large;
			large = second;
			second = m;
			
		}
		if(len==2) {
			return second;
		}
		for(int i=2; i<len;i++) {
			if(array[i]>large) {
				int m = large;
				large= array[i];
				second=m;
			}else if(array[i]<=large && array[i]>second) {
				second = array[i];
			}
		}
		
		return second;
		
	}
	
}
