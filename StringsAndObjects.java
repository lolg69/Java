class StringsAndObjects{
	public static void main(String[] Args){
		String fname = "Mayur";
		String lname = "Mayur";
		if (fname == lname){
			System.out.println("Same 1");
		}else{
			System.out.println("NotSame 1");
		}
		String s = new String("Mayur");
		String s1 = new String("Dahi");
		if (s.equals(s1)){
			System.out.println("Same 2");
		}else{
			System.out.println("NotSame 2");
		}
		if (fname == s){
			System.out.println("Same 3");
		}else{
			System.out.println("NotSame 3");
		}
		if (s.equals(fname)){
			System.out.println("Same 4");
		}else{
			System.out.println("NotSame 4");
		}
	}
}
