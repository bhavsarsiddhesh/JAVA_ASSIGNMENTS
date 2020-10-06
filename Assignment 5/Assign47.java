import java.util.Scanner;

class A{
	A()
	{
		System.out.println("No-arg Constructor");
	}
	A(int i)
	{
		System.out.println("Para Constructor");
	}
}

class B extends A{
	B()
	{
		System.out.println("No-arg Constructor B");
	}
	B(int i)
	{
		System.out.println("Para Constructor B");
	}
	
}

class Que47{
	public static void main(String args[]){
		B b = new B();
	}

}