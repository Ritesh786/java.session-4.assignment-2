import java.util.Scanner;

public class SqreMat {

	public static void main(String[] args) {
		int pos,i,n,x,j;
		 Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int arr[] = new int[n+2];
	        System.out.println("Enter all the elements:");
	        for( i = 0; i < n; i++)
	        {
	            arr[i] = s.nextInt();
	        }
	        for(i=0;i<n;i++){
	        	for(j=i+1;j<n;j++){
	        		if(arr[i]>arr[j]){
	        			int temp=arr[i];
	        			arr[i]=arr[j];
	        			arr[j]=temp;
	        		}
	        	}
	        }
	        System.out.println("Your sorted element is");
	        for(i=0;i<n;i++){
				System.out.println(+arr[i]);
			}
	        System.out.print("Enter the position where you want to insert element:");
	        pos = s.nextInt();
	        System.out.print("Enter the element you want to insert:");
	        x = s.nextInt();
	
		for(i=n-1; i>=pos-1; i--){
			arr[i+1] = arr[i];
		}
			arr[pos-1]=x;
			for(i=0;i<n+1;i++){
				System.out.println(+arr[i]);
			}
}
}