class person{
    private int age;
	private String  name;
	person(){
		age=18;
		name="Aditya";
	}
	person(int age,String name){
		this.age = age;
		this.name = name;
	}
	void show(){
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
	}
}

class PersonDemo{
    public static void main(String args[]){
	person p = new person();
	person p1 = new person(22,"Siddhesh");
		p.show();
		p1.show();
	}
}