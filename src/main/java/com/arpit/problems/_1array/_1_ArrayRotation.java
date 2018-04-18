package com.arpit.problems._1array;

public class _1_ArrayRotation {

	public static void main(String[] args) {
		int[] array = {4,5,6,7,8,9};
		int rotationFactor = 2;
		
		
		
		System.out.println("before rotation Array is ");
		printArray(array);
		
		int[] rotatedArray = rotateArray(array,rotationFactor);
		System.out.println();
		
		System.out.println("rotated Array by "+rotationFactor+" is ");
		printArray(rotatedArray);

	}
	
	public static void printArray(int[] array){
		for(int i=0;i<array.length;i++){
			if(i>0){
				System.out.print(",");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
	
	public static int[] rotateArray(int[] array,int rotationFactor){
		int[] tempArray = new int[rotationFactor];
		//int[] newArray = new int[array.length];
		
		for(int i=array.length-rotationFactor,j=0;i<array.length;i++,j++){
			tempArray[j] = array[i];
		}
		
		for(int i=0,j=rotationFactor;j < array.length;i++,j++){
			array[j] = array[i];
		}
		
		for(int i=0;i<tempArray.length;i++){
			array[i] = tempArray[i];
		}
		return array;
		
	}

}
