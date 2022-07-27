
class Literal{
	public static void main(String []args){
		String n = "Takeshi Castle";
		int len = n.length();	
		System.out.println(n.length());
		boolean b1 = n.contains("Ca");
		System.out.println(b1);
		String low = n.toLowerCase();
		String high = n.toUpperCase();
		System.out.println(low + " " + high);
		String sub = n.substring(0,6);
		System.out.println(sub);
		String rep = n.replace("Castle","House");
		System.out.println(rep);



	}
}