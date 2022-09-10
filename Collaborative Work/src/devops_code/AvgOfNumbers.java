package devops_code;
import java.util.Scanner;
public class AvgOfNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the Number of elements you want to calculate average for: ");
		Scanner sc= new Scanner(System.in);
		float n=sc.nextInt();
		float sum=0;
		for(float i=0;i<=n;i++) {
			sum=sum+i;
		}
		float avg=(sum/n);
		int m=(int)n;
		System.out.println("The average of "+m+" number is: "+avg);
		

	}

}
