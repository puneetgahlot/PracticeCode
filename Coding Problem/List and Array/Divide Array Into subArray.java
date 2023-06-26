import java.util.*;
class Main
{
	public static void main(String[] args) {
		int[] original = {0, 2, 3, 4, 5, 6, 7, 8, 9,};
		int splitSize = 3;
		List<int[]> list = splitArray(original, splitSize);
		list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
	}
	
	public static List<int[]> splitArray(int[] array, int splitSize) {
	    
	    List<int[]> listOfArray = new ArrayList<int[]>();
	    int arrlength = array.length;
	    int numberOfSubArr = arrlength/splitSize;
	    
	    int k = 0;
	    for(int i=0; i<numberOfSubArr;  i++){
	        int newArray[] = new int[splitSize];
	        for(int j=0; j<splitSize; j++){
	            newArray[j] = array[k++];
	        }
	        listOfArray.add(newArray);
	    }
	    int reminder = arrlength%splitSize;
	    if( reminder !=0){
	        int newArray[] = new int[reminder];
	        for(int i=0; i<reminder; i++){
	            newArray[i] = array[k++];
	        }
	        listOfArray.add(newArray);
	    }
	    return listOfArray;
	}
}


