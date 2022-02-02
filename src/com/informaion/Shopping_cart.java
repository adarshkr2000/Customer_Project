package com.informaion;

import java.util.Scanner;

public class Shopping_cart {

	public static void main(String[] args) throws Exception{
		
			label:
				while(true) {
					System.out.println("Press 1 for adding data");
					System.out.println("Press 2 for deleting data");
					System.out.println("Press 3 for showing data");
					System.out.println("Press 4 for Update data");
					System.out.println("Press 5 for exit");
					Scanner sc =new Scanner(System.in);
					int option=sc.nextInt();
	
					switch(option) {
					case 1:  
							Add_data a=new Add_data();
							a.Make_Customer_id();
							break;
					
							
					case 2:	
							Scanner sc2 =new Scanner(System.in);
							Delete_id d=new Delete_id();
							d.Remove_id();
							break;

					case 3: 
							Scanner sc3 =new Scanner(System.in);
							Display  di=new Display();
							di.Show();
							break;
				
					case 4: 
							Scanner sc4 =new Scanner(System.in);
							Update_id u=new Update_id();
							u.Edit();
							break;
			         		
					case 5: break label;
					
					default:System.out.println("Invalid input!!");
					
			}
	
		}
			System.out.println("Thanks!!!!");
	}

}
