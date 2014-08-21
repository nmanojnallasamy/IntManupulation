package intArray;

import java.util.Scanner;


public class Value {
static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a []  ={0,1,2,3,4,5,6,7,8,9};
int n=a.length;
for(int i=0;i<n;i++)
{
	System.out.println("the nos are: " + a[i]);

}
System.out.println("enter the position");
Scanner s=new Scanner(System.in);
int s1=s.nextInt();
System.out.println(""+s1);

for(int i=0;i<n;i++)
{
	if(i==s1)
	{
		a[i]=70;   
		//a[i]=a[2]+a[3];
}


System.out.println("the modified no: "+a[i]);


}
	}

}
