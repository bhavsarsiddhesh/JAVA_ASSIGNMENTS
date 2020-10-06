class Foo{
	Foo(){
		System.out.println("Foo non-arg constructor");
	}
	Foo(int a){
		System.out.println("Foo arg constructor");
	}
}

class Foo1{
	Foo1(){
		this();
		System.out.println("Foo1 non-arg constructor");
	}
	Foo1(int a){
		System.out.println("Foo1 arg constructor");
	}

}


class main{
		public static void main(String args[]){
			Foo1 f = new Foo1();
		}
}