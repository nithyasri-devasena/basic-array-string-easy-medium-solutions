
public class Arr_max_min
{
	public static void main(String[] args) {
		int arr[] = {12, 13, 1, 10, 34, 10};
		int large = arr[0];
		int small = arr[0];
		for(int i=1;i<arr.length;i++){
			if(large >arr[i])
				large = arr[i];
			if(small <arr[i])
				small = arr[i];
			
		}
		System.out.print(large);
		System.out.print(small);
	}
}
