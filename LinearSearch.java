import java.util.*;
public class Solution{
	public static void class(String[] rk){
		
		Scanner sc = new Scanner(System.in);
		int a[]=new int [sc.nextInt()];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int save =0;
		int search = sc.nextInt();
		for(int i=0;i<n;i++){
			if(search==a[i]){
				save = i ;
				break;
			}
		}
		System.out.println("found at location "+i);
	}
}