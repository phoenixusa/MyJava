import java.util.Arrays;

public class MnogomernyieArrays {
	public static void main(String[] args) {
		int[][] arr1 = new int[4][5];
	//нумерация всех элементов двумерного(или многомерного) массива
		int n = 1;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = n;
				n++;
			}
		};
		System.out.println("arr1(4 строки, 5 столбцов): "+Arrays.deepToString(arr1));
		
		System.out.println();
		
		int[][] arr2 = {
				{1,2,3,4},
				{5,6,7,8}
		};
		System.out.println("arr2(2 строки, 4 столбцов): " + Arrays.deepToString(arr2));
		System.out.println("arr2[0][3] = " + arr2[0][3]);
		arr2[1][3] = 64;
		System.out.println(arr2[1][3]);
		System.out.println("new arr2: " + Arrays.deepToString(arr2));
		
		System.out.println();
		
		System.out.println("Chernovik");
		int[] arr3 = new int[10];
		/*for(int i=0, j=1; i<arr3.length; i++, j++) {
			arr3[i]=j;
			System.out.println(arr3[i] + " ");
		}*/
		for(int i=arr3.length-1, j=10; i>=0; i--,j--) {
			System.out.println(arr3[i]=j);
		}
		System.out.println("Chernovik2");
		int[][] arr4 = new int[4][2];
		int n4 = 1;
		for(int i = 0; i<arr4.length; i++) {
			for(int j=0; j<arr4[i].length; j++) {
				arr4[i][j]=n4;
				n4++;
				System.out.println(Arrays.deepToString(arr4));
			}
		}
		
	}
	}
