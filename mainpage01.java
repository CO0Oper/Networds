package exercises;

import java.util.ArrayList;

public class mainpage01 {
	
	int length = 10;
	public int c, r, g, h;//g is for temporary column
						  //h is for temporary rows
						  //c is for column
	  					  //r is for rows
	
	ArrayList <Integer> listone;//list store word groups
	int dArray[][];//2D array for store coordinates
	ArrayList <Integer> listtwo;
	/**
	 * Constructor to initialize a new array-list.
	 */
	public mainpage01() {
		this.c = 9;
		this.r = 9;
		this.g = 1;
		this.h = 0;
		listone = new ArrayList<>();
		for(int i = 1; i < 101; i++) {
			listone.add(new Integer(i));
		}
		dArray = new int[10][10];
		dArray[0][0] = 1;
	}
	
	/**
	 * In order to save index with coordinates to a 2D array.
	 */
	public void to2dArray() {
		int i = 99;//index of the array
		int bb = 0;//count variable 1
		int bbb = 0;//count variable 2
		int countt = 2;//count variable 3
		do {
		for(; g <= c+bbb ; g++ ) {
			dArray[g][h] = listone.get(i);//insert values from top to bottom on left side
			i--;//subtract index number after every insert.
		}
		g--;//
		h++;
		for(; h <= r+bbb ; h++) {
			dArray[g][h] = listone.get(i);//from left to right on bottom side.
			i--;
		}
		h--;
		g--;
		for(int ii = c-c+bb; ii <= g+bbb ; g--) {//from bottom to above on right side.
			dArray[g][h] = listone.get(i);
			i--;
		}
		g++;
		h--;
		for(int ii = r-r+bb; ii <= h+bbb; h--) {//from right side to left
			dArray[g][h] = listone.get(i);
			i--;
		}
		g = countt;
		h = countt-1;
		c-=2;
		r-=2;

		bb+=2;
		bbb++;
		countt++;
		
		}while(c > 0 && r > 0);
		


		
		System.out.print("g: " + g + " h: " + h + " i: " + i + "\n" );
	}//end of method
	
	public void get2DIndex() {
		listtwo = new ArrayList<>();
		for(int i = 0; i<10; i++)
		{
		    for(int j = 0; j<10; j++)
		    {
		        listtwo.add(dArray[i][j]);
		    }
		}
		
	}


	public static void main(String[] args) {
		mainpage01 a = new mainpage01();//new object
		int count = 0;
		for(int i : a.listone) {
		    
			System.out.print(i + " ");
			if(count == 9) {
				System.out.print("\n");
				count = 0;
			}
			
			count++;
		}//print 1 - 100
		System.out.println("");
		a.to2dArray();//create 2d array.
//		for(int kkk : a.dArray) {
//			System.out.print(kkk);
//		}
		for(int c = 0; c<10; c++)
		{
		    for(int d = 0; d<10; d++)
		    {
//		    	if(c == 0) {
//		    		if(d<9)
//		    		System.out.print("0");
//		    	}
		        System.out.print(a.dArray[c][d] + " ");
		    }
		    System.out.println();
		}
		System.out.print("\n The length of dArray" + a.dArray.length);

		
	/*
	 * Out the the listtwo.
	 */
	a.get2DIndex();
	System.out.println("");
	int count2 = 0;
	for(int i : a.listtwo) {
		System.out.print(i + " ");
		count2++;
		if(count2==10) {
			System.out.println("");
			count2=0;
		}

	}
	

	}//print the 2d array

}
//do {
//int i = 99;
//while(c > g) {					
//		dArray[g][h-1] = listone.get(i);
//		//System.out.println(listone.get(i) + "1");
//		g++; i--;	
//}//end of for loop
//while(r > h) {
//	    dArray[g-1][h] = listone.get(i);
//	    h++; i--;
//}
//
//while(g > 1) {
//	  	dArray[g-2][h-1] = listone.get(i);
//	  	g--; i--;
//}
//
//while(h > 1) {
//		dArray[g-1][h-2] = listone.get(i);
//		h--; i--;
//}
//g-=2; h-=2;
//}while(g < 3 && h < 3);
