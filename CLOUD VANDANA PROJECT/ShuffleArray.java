package jdbc_programs;

//Create An Array And Shuffle It
import java.util.Random;
import java.util.Scanner;
/**
 *@author:G.Sravan Kumar  
 */
public class ShuffleArray {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		Random random = new Random();
		for(int i=a.length-1;i>0;i--) {
			int j=random.nextInt(i+1);
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		for(int n:a) {
			System.out.print(n+" ");
		}
	}
}
