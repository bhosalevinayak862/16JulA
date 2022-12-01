package constructor;

public class sample8 
{
	int num1;
	int num2;
	 sample8(int a,int b)
	 {
		num1=a;
		num2=b;
	 }
	 sample8()
	 {
		 num1=20;
		 num2=20;
	 }
	 public void add()
	 {
		 System.out.println(num1+num2);
	 }
	 public void mul()
	 {
		 System.out.println(num1*num2);
	 }
	 public void sub()
	 {
		 System.out.println(num1-num2);
	 }
	 

}
