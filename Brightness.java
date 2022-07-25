class LED{
	void show(){
		System.out.println("LED is ON!");
	}
}

class Bulb{
	void show(){
		System.out.println("Bulb is ON!");
	}	
}

class Brightness{
	public static void main(String[] args){
		LED l = new LED();
		l.show();
		Bulb b = new Bulb();
		b.show();
	}
}