public class SuperArray {
	private String[] data;
	private int size; //current size

	public SuperArray(int initialCapacity){
		this.data = new String[initialCapacity];
		this.size = 0;
	}

	public int size(){
		return this.size;
	}

	public boolean add(String element){
		//if this.data is full, then resize it
		if (size == this.data.length){
			this.resize();
		}

		this.data[size] = element;
		this.size++;
		return true;
	}

	public void add(int index, String element){
		if (this.data[index] == null) {
			this.data[index] = element;
			this.size++;
		} else {
			if (size + 1 > this.data.length){
				this.resize();
			}
			int oldCapacity = this.data.length;
			//Create a new array. Copy all the elements up to element to it, set index to element, then shift all the elements after
			String[] newArray = new String[this.data.length];

			for (int i = 0; i < index; i++){
				newArray[i] = this.data[i];
			}
			newArray[index] = element;
			for (int i = index; i < oldCapacity - 1; i++){
				newArray[i+1] = this.data[i];
			}

			//Finally, set this.data to newArray
			this.data = newArray;
		}
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
		String[] newArray = new String[this.data.length * 2];
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
			}
			result += ", ";
		}

		result = result.substring(0, result.length() - 2) + "]";

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
