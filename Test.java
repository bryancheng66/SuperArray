public class Test {
	public static void main(String[] Args){
		//add() and get()
		SuperArray SA1 = new SuperArray(10);
		SA1.add("hello");
		SA1.add("maestro");
		System.out.println(SA1.get(0));
		System.out.println(SA1.get(1));
		System.out.println(SA1.set(2, "yello"));
		System.out.println(SA1.get(1));

		//resize(), toString(), contains(), and isEmpty()
		SA1.resize();
		System.out.println(SA1.toString());
		System.out.println(SA1.contains("yello"));
		SA1.clear();
		System.out.println(SA1.isEmpty());
		System.out.println(SA1.toString());

		//void add()
		SA1.add("0");
		SA1.add("1");
		SA1.add("2");
		SA1.add(-5, "imnumberone");

		System.out.println(SA1.toString());

		SA1.clear();
		SA1.add("0");
		SA1.add("1");
		SA1.add(5, "5");
		SA1.add(0, "new1");
		System.out.println(SA1.toString());

		//remove()
		SA1.remove(1);
		System.out.println(SA1.toString());

		//indexOf()
		System.out.println(SA1.indexOf("eeeee"));
		System.out.println(SA1.indexOf("5"));

		//toArray()
		System.out.println(SA1.toArray().toString());
		System.out.println(SA1.toString());
		
		//equals()
		SuperArray SA2 = new SuperArray(10);
		SuperArray SA3 = new SuperArray(20);
		SA2.add("2");
		SA2.add("5");
		SA2.add("7");
		SA2.add("4");
		SA3.add("2");
		SA3.add("5");
		SA3.add("7");
		SA3.add("4");
		System.out.println(SA2.equals(SA3));

		SuperArray SA4 = new SuperArray(-4);
	}
}
