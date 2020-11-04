public class Test {
	public static void main(String[] Args){
		//add() and get()
		SuperArray SA1 = new SuperArray();
		SA1.add("hello");
		SA1.add("maestro");
		System.out.println(SA1.get(0));
		System.out.println(SA1.get(1));
		System.out.println(SA1.set(1, "yello"));
		System.out.println(SA1.get(1));
		SA1.resize();
		System.out.println(SA1.toString());
		System.out.println(SA1.contains("yello"));
		SA1.clear();
		System.out.println(SA1.isEmpty());
		System.out.println(SA1.toString());
	}
}
