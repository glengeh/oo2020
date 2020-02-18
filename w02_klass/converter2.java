import java.util.Scanner;

public class Converter {

    static void celToFah(){
      float cel = kraadid;
	    float fah = cel * 9/5 + 32;
	    System.out.println("\n Fahrenheitides teeb see kokku: " +fah);
    }

    static void fahToCel(){
      float fah = kraadid;
    	float cel = (fah - 32) * 5/9;
    	System.out.println("\n Celsiustes teeb see kokku: " +cel);
    }

    static void andmed(){

    Scanner scan = new Scanner(System.in);
    System.out.println("\n Sisesta kraadid: ");
    float kraadid = scan.nextFloat(); 
    
    Scanner scan2 = new Scanner(System.in);
    System.out.println("\n Kas soovid teisendada cel => fah [1] v�i vastupidi [2] ?");
    int vastus = scan2.nextInt();
    scan.close();
    scan2.close();
    }


  public static void main(String[] args) {
    
    andmed();
    
      
    if (vastus == 1) {
        celToFah();

    } else {
        fahToCel();
    }
   
  }
  
}