package exercice;

public class LengthExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int arr1[]= new int[10];
		int arr2[]= {1,2,3,4,5};
		for (i=0; i<arr1.length; i++)
			arr1[i]=i*i;
		//copy arr1 to arr2
		if (arr2.length <= arr1.length)
			for (i=0; i<arr2.length; i++)
			
				arr2[i]=arr1[i];
		for (i=0; i<arr2.length; i++)
		System.out.println(arr2[i] + " ");
		for (i=0; i<arr1.length; i++)
			System.out.println(arr1[i] + " ");

	}

}
