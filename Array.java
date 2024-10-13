package javapractice;

public class Array {

	public static void main(String[] args) {
//Array:it is continious block of memory /similar datatype/index/predefined/
//single dimentional
		// int num []; //initialization
		// int num1[]=new int[10]; //initialization & declaration
		// num1[0]=10;
		// num1[1]=20; //assign values at index
		// int num2[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }; // initialization &
		// declaration
		// System.out.println(num2 [6]);
		// System.out.println(num1.length);
		// System.out.println(num2.length);

		/*
		 * for(int i=0;i<num2.length;i++) { for(int j=i+1;j<num2.length;j++) {
		 * if(num2[i]<num2[j]) { int k=num2[i]; num2[i]=num2[j]; num2[j]=k; } } }
		 * for(int i=0;i<num2.length;i++) { System.out.println(num2[i]); }
		 

//Multi dimentional array
		String an="srj";
		int a[][]=new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		System.out.println("No of rows "+ a.length);
		System.out.println("No of coloumns "+a[0].length);
		
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("No of rows "+ b.length);
		System.out.println("No of coloumns "+b[0].length);
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.println(b[i][j]);
			}
		}
		*/
		int a[]= {1,7,5,8,3};
		int temp;
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
