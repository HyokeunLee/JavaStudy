
public class BubbleSort {
	public static void main(String[] args) {
		/*
		 *  BubbleSort Algorithm
		 * 	GitTest
		 */
		
	 int [] array = { 1, -3, 0, 9, 7 };
	 bubbleSort(array);
	
//	 for(int i=0; i<array.length; i++){
//		 System.out.println(array[i]);
//	 }
 
	 for(int i : array){
		 System.out.println(i);
	 }
	}
	
	private static void bubbleSort(int array[]){
		boolean isNeedsort = true; 
		
		while(isNeedsort){		
			isNeedsort = false;
			for(int index=0; index<array.length-1; index++){
				if(array[index]>array[index+1]){
					int temp = array[index+1];
					array[index+1] = array[index];
					array[index] = temp;
					isNeedsort=true;
				}
			}
		}
	}
}
