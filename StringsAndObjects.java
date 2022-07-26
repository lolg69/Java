class StringsAndObjects{
	public static void main(String[] Args){
		String fname = "Mayur";
		String lname = "Mayur";
		if (fname == lname){
			System.out.println("Same 1");
		}else{
			System.out.println("NotSame 1");
		}
		String s = new String("Ravi");
		String s1 = new String("Dahi");
		if (s.equals(s1)){
			System.out.println("Same 2");
		}else{
			System.out.println("NotSame 2");
		}
	}
}