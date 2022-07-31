import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Skyscraper {
	
	public static void floorbuild(int size, int floor) {
		ArrayList<Integer> store= new ArrayList<Integer>();
		for(int i=1 ; i<=size-1; i++) {
			if (floor>size) {
				System.out.println("Given floor count to build is not appropriate");
			} else if (floor<size) {
				store.add(Integer.valueOf(floor));
			} else if (floor==size) {
				Collections.sort(store);
				System.out.println("Day : "+ i);
				System.out.print(store +"\n");
			}
			
		}
	}
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the total number of building floor : ");
		int size = scan.nextInt();
		//ArrayList<Integer> floor = new ArrayList<Integer>();		
		Scanner scan2 = new Scanner(System.in);
		for(int k=1; k<=size-1; k++ ) {
			System.out.println("Enter the floor size given on day : " + k +"\n");
			int floor = scan2.nextInt();
			floorbuild(size, floor);
		}
		scan.close();
		scan2.close();
			
	}

}
