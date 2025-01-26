class Practical6 {
	public static void displayPattern1(int num){
		int row;int column;int space;
		// to print row for straight pyramide
		for(row = 1;row <= num;row++){
			// to print space in pattern
			for(space = 1;space <= num-row;space++){
				System.out.print(" ");
			}
			//to print the column for this pattern we have to print +
			for(column = 1;column <= 2*row-1;column++){
				System.out.print("+");
			}
			// to print new line after each row
			System.out.println("");
		}
		//to print inverted pyramide
		for(row = num-1;row > 0;row--){
			//to print space in pattern
			for(space = 1;space<= num-row;space++){
				System.out.print(" ");
			}
			//to print + for inveted pryamide
			for(column = 1;column <= 2*row-1;column++){
				System.out.print("+");
			}
			//to print new line after each row
			System.out.println("");
		}
	}
	public static void displayPattern2(int num){
		int row;int column;int space;
		//to print row for the pattern 
		for(row = 1;row <= num;row++){
			//to print space in the pattern
			for(space = 1;space <= num - row;space++){
				System.out.print(" ");
			}
			//to print the pattern of + and * column vise
			for(column = 1;column <= 2*row-1;column++){
				//condition of printing * and + for row and column
			 	//for evern row
			 	if(row % 2 == 0){
			 		//for even column
			 		if(column % 2 == 0){
			 			System.out.print("*");
			 		}
			 		//for odd column
			 		else{
			 			System.out.print("+");
			 		}
			 	}	
				 //for odd row
			 	else{
			 		//for even column
			 		if(column % 2 == 0){
			 			System.out.print("+");
			 		}
			 		//for odd column
			 		else{
			 			System.out.print("*");
			 		}
			 	}
			}
			//to print new line after each row
	        	System.out.println("");	
		}
		//to print inverted pyramide
		//to print row
		for(row = num;row > 0;row--){
			//to print space
			for(space = 1;space <= num-row;space++){
				System.out.print(" ");
			}
			//to print column
			for(column = 1;column <= 2*row-1;column++){
				//for evern row
				if(row % 2 == 0){
					//for even column
					if(column % 2 == 0){
						System.out.print("+");
					}
					//for odd column
					else{
						System.out.print("*");
					}
				}
				//for odd row
				else{
					//for even column
					if(column % 2 ==0){
						System.out.print("*");
					}						        	
	 				//for odd column
	 				else{
	 					System.out.print("+");
	 				}
	 			}
	 		}
	 		//to print new line after each row
	 		System.out.println("");	
	 	}
	 }
	 public static void displayPattern3(int num){
	 	int row;int column;int space;
	 	//to print row for prymide
	 	for(row = 1;row <= num;row++){
	 		//to print space
	 		for(space = 1;space <= num-row;space++){
	 			System.out.print(" ");
	 		}
	 		//to print column
	 		for(column = 1;column <= 2*row-1;column++){
	 			//condition for even column
	 			if(column % 2 ==0){
	 				System.out.print(" ");
	 			}
	 			else{
	 				System.out.print("+");
	 			}			
	 		}
	 		//to print new line after each row
	 		System.out.println("");
	 	}
	 	//to print pattern of inverted pryamide
	 	for(row = num -1;row > 0;row--){
	 		//to print space
	 		for(space = 1;space <= num-row;space++){
	 			System.out.print(" ");
	 		}
	 		//to print column
	 		for(column = 1;column <= 2*row-1;column++){
	 			//for even column
	 			if(column % 2 ==0){
	 				System.out.print(" ");
	 			}
	 			else{
	 				System.out.print("*");
	 			}		
	 		}
	 		//to print new line 
	 		System.out.println("");
	 	}
	 }		
	 //main for testing 
	 public static void main(String [] arg){
	 	displayPattern1(3);
	 	System.out.println();
	 	displayPattern2(4);
	 	System.out.println();
	 	displayPattern3(3); 					
	 	System.out.println();
	 }
}	 						
			  				
