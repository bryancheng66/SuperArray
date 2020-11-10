public class Demo{
	public static void removeDuplicates(SuperArray s){ 
		for (int i  = s.size(); i >= 0; i--){
			if (s.get(i) != null){
				if (s.indexOf(s.get(i)) != i){
					s.remove(i);
				}		
			}
		}
	}

	public static SuperArray findOverlap(SuperArray a, SuperArray b){
		SuperArray intersection = new SuperArray();
		for (int i  = 0; i < a.size(); i++){
			if (b.contains(a.get(i)) && i == a.indexOf(a.get(i))){
				intersection.add(a.get(i));
			}
		}
		SuperArray result = new SuperArray(intersection.size());
		for (int i = 0; i < intersection.size(); i++){
			result.add(intersection.get(i));
		}
		return result;

	}

	public static SuperArray zip(SuperArray a, SuperArray b){
		SuperArray result = new SuperArray(a.size() + b.size());
		for (int i = 0; i < a.size(); i++){
			if (i < a.size() && a.get(i) != null){
				result.add(a.get(i));
			}
			if (i < b.size() && b.get(i) != null){
				result.add(b.get(i));
			}
		}
		return result;
	}

	public static void main(String[]args){
		SuperArray words = new SuperArray();
		//grouped to save vertical space
		words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
		words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
		words.add("una");    words.add("ebi");     words.add("toro"); 
	
		System.out.println(words);
		removeDuplicates(words);
		System.out.println(words); 

		SuperArray a = new SuperArray(6);
		a.add("9");	a.add("1");	a.add("2");	a.add("2");	a.add("3");	a.add("4");	

		SuperArray b = new SuperArray(5);
		b.add("0");	b.add("4");	b.add("2");	b.add("2");	b.add("9");	

		System.out.println(findOverlap(a, b).toString());
		System.out.println(zip(a, b).toString());
	}
}
