import java.util.Scanner;

class ArraySearcher {


	public void search(int n[][]){
	
	Scanner user_input=new Scanner(System.in);
	int numLook;
	System.out.println("Which number are you looking for?");

	numLook=user_input.nextInt();
 

	for (int i=0;i<n.length;i++){

		for (int a=0;a<n.length;a++){

		if (n[i][a]==numLook){
		System.out.println("Found the number!");

			}
	 
		}
		}


	System.out.println("Number not found!");
 
	}

	public static void main(String[]args){

		int fAr[][]=new int[4][4];

		//Fill the array with numbers here:

		fAr[1][0]=15;
		fAr[2][1]=12;

		// Create a new ArraySearcher and call the search method!


		ArraySearcher n= new ArraySearcher();
		n.search(fAr);

		}
	}