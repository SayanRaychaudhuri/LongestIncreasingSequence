
public class LongestIncreasingSequence {

	public static void main(String[] args) {
	int[] a = {};
	System.out.println(longestSortedSequence(a));
	}
		public static int longestSortedSequence(int[] array) {
		    int maxCount = 0, count = 0;
		    if (array.length==0){
		       maxCount = 0;
		    } else {
		    int prev = array[0];
		        for(int num : array) {
		            if(prev <= num) {
		                count++;
		            } else {
		                count = 1;
		            }
		            if(count > maxCount)
		                maxCount = count;
		            prev = num;
		        }
		}
			return maxCount;
	}

}
