public class SuperArray {
	private String[] data;
	private int size; //current size

	public SuperArray(){
		this.data = new String[10];
		this.size = 0;
	}
	
	public int size(){
		return this.size;
	}

	public boolean add(String element){
		if (size == this.data.length){
			this.resize();
		} 
		this.data[size] = element;
		this.size++;
		return true;
	}

	public String get(int index){
		return this.data[index];
	}

	public String set(int index, String element){
		//If the element at this index is null, increase the size
		if (this.data[index] == null) this.size++;
		
		String replacee = this.data[index];
		this.data[index] = element;
		return replacee;
	}

	public void resize(){
		String[] newArray = new String[this.data.length + 10];
		for (int i = 0; i < this.data.length; i++){
			newArray[i] = this.data[i];
		}	
		this.data = newArray;
	}

	public boolean isEmpty(){
		return this.size == 0;
	}

	public void clear(){
		this.data = new String[this.data.length];
		this.size = 0;
	}

	public String toString(){
		String result = "[";
		
		if (this.isEmpty()){
			return "[]";
		}

		for (int i = 0; i < this.data.length; i++){
			if (this.data[i] != null){
				result += this.data[i];
				result += ", ";
			}
		}

		if (result.substring(result.length() - 2).equals(", ")){
			result = result.substring(0, result.length() - 2) + "]";
		}
		return result;
	}

	public boolean contains(String s){
		boolean result = false;
		for (int i = 0; i < this.data.length; i++){
			if (this.data[i] != null && this.data[i].equals(s)){
				result = true;
			}
		}
		return result;
	}
}
