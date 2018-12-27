package exercises;

public class twoDlayout {

	public twoDlayout() {
		// TODO Auto-generated constructor stub
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myArray;
		int i,j;

		myArray = new int[10][10];//initialize the array
		for(i=0; i<myArray.length; i++) {//increase one for the first[]
			for(j = 0; j<myArray[i].length; j++) {//increase until the second [] is full		

				myArray[i][j]=j+1 + i * 10;//insert values into array, and add 10-50 for numbers		
			}
		}
		for(int c = 0; c<10; c++)
		{
		    for(int d = 0; d<10; d++)
		    {
		    	if(c == 0) {
		    		if(d<9)
		    		System.out.print("0");
		    	}
		        System.out.print(myArray[c][d] + " ");
		    }
		    System.out.println();
		}
		
	/*		
		for(i = 0; i < myArray.length; i++) {
			int count = 0;
			
			System.out.print("\n");//print a  { at the start of the second line
			for(int element : myArray[i]) {

			System.out.print(element);
			if(count <= 8) {//make sure only the front 9 number have comma behind it
			System.out.print("  ");	
			count++;
			  }
			}

*/
		}
}
	