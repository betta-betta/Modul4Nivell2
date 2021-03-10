import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Modul4Nivell2 {

	public static void main(String[] args) {
		int euro5=5;
		int euro10=10;
		int euro20=20;
		int euro50=50;
		int euro100=100;
		int euro200=200;
		int euro500=500;
		int total=0;
		String eleccio;
		int resp=1;
		boolean verificacio=false;
		
		String[] menu = new String[2];
		Integer[] preu = new Integer[2];
		
		Scanner sc =new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		for(int i=0;i<menu.length;i++) 
		{
			System.out.println("Introdueix el nom del "+(i+1)+" plat del menu: ");
		    String nomPlat= sc.nextLine();
		    	menu[i]= nomPlat;
		do {
		    	try { 	
		    		
		    		
		    		System.out.println("Introdueix el preu del "+(i+1)+" plat del menu: ");
		    		
		    		Integer preuPlat = sc1.nextInt();	
					preu[i]=preuPlat;
					verificacio=false;
		    		}
						catch(InputMismatchException e) 
						{
							System.out.println(" Error,solo se puede introducir un precio");
							sc1.next();
							
							verificacio=true;
						
						} 
		              
					}
						while (verificacio==true);
		
		}
			for(int i=0;i<menu.length;i++) 
		{
			System.out.println("EL preu del plat número "+i+" "+menu[i]+" és : "+preu[i] );
		}
		
		
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		ArrayList<String> comanda = new  ArrayList <String>();
		System.out.println(" ");
		while  (resp>=1) {
			
			System.out.println("Introdueixi el nombre del plat que vol demanà:");
			eleccio=sc3.nextLine();
			System.out.println("plat demanat :"+ eleccio);
			for(int i=0;i<menu.length-1;i++) 
			{
				if (sc3.equals(menu[i])) 
				{
					comanda.add(eleccio);
				System.out.println("si existe"+i);
				
				}
				
				else {
				System.out.println("no existe plat "+i);	
				
				
				}
			
			}
			
			
			
			System.out.println("Si vols demanar un altre plat marca el número 1, si vols acabar de demanar, marcael número 0");	
			resp=sc4.nextInt();
			 
			}
		sc.close();
		sc1.close();
		sc3.close();
		sc4.close();

		
		
		//System.out.println(comanda.size());
		//System.out.println(menu.length);	
			for(int i=0;i<=comanda.size()-1;i++)
		{    
				boolean trobat= false;
				
				for (int j=0;j<=menu.length-1;j++)
				{	
				
					if (comanda.get(i).equalsIgnoreCase(menu[j])) 
					{
					total+=preu[j];
					trobat=true;
					}
				}		
				if (trobat==false) {
					System.out.println("El plat "+comanda.get(i)+" no existeix");
				}
		}	
			System.out.println("El total de la conta són: "+total);
			
	}

}
