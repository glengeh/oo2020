import java.util.Scanner;

public class Converter {
  public static void main(String[] args) {
    
	Scanner scan = new Scanner(System.in);
    System.out.println("\n Sisesta kraadid: ");
    float kraadid = scan.nextFloat(); 
    
    Scanner scan1 = new Scanner(System.in);
    System.out.println("\n Kas soovid teisendada cel => fah [1] või vastupidi [2] ?");
    int vastus = scan1.nextInt();
    
    if (vastus == 1) {
    	float cel = kraadid;
	    float fah = cel * 9/5 + 32;
	    System.out.println("\n Fahrenheitides teeb see kokku: " +fah);
    	
    } else {
    	float fah = kraadid;
    	float cel = (fah - 32) * 5/9;
    	System.out.println("\n Celsiustes teeb see kokku: " +cel);
    }  
    scan.close();
    scan1.close();
 
    	
    
  }
  
}