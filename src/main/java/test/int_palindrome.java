package test;

public class int_palindrome {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,3,2,1};
		
		int mid=arr.length/2;
		int[] sub= new int[mid];
		int j=0;
		for(int i=arr.length-1;i>=mid;i--) {

			sub[j]=arr[i];
			j++;
		}
		
		boolean flag = false;
		for(int k=0;k<sub.length;k++) {
			System.out.println(arr[k]+" "+sub[k]);
			if(arr[k]==(sub[k])) {
				flag=true;
				
			}
			else
				flag=false;
			
		}
		if(flag==true)
		System.out.println("given integer is a palindrome");
		else
			System.out.println("given integer is not a palindrome");

	}

}
