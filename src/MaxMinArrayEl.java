public class MaxMinArrayEl {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(min(arr));
		System.out.println(max(arr));
		}
		
	//min
		public static int min(int[] arr) {
			int xmin = arr[0];
			for(int i=0; i<arr.length; i++) {
				if(xmin<arr[i])
					xmin = arr[i];
			}
			return xmin;
		}
		
	//max
		public static int max(int[] arr) {
			int xmax = arr[0];
			for(int i=0; i<arr.length; i++) {
				if(xmax>arr[i])
					xmax = arr[i];
			}
			return xmax;
		}
	}

