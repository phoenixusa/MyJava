public class Array {
	public static void main(String[] args) {
		int[] arr = new int[5];
	//нумерация всех элементов
		for(int i = 0, j=1; i<arr.length; i++, j++) {
			arr[i] = j;
		}
	//перебор элементов в прямом порядке
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
		System.out.println();
		
	//перебор элементов в обратном порядке
		for(int i=arr.length-1;i>=0; i--) {
			System.out.println(arr[i] + " ");
		}
	}

}
