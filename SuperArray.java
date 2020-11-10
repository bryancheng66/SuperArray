public class SuperArray {
	private String[] data;
	private int size; //current size

	//Constructor with no parameter
	public SuperArray(){
		this.data = new String[10];
		this.size = 0;
	}

	//Constructor with capacity parameter
	public SuperArray(int initialCapacity){
		this.data = new String[initialCapacity];
		this.size = 0;
	}

	//Return size
	public int size(){
		return this.size;
	}

	//Adds an element. If the size equals the capacity, then calls resize.
	public boolean add(String element){
		//if this.data is full, then resize it
		if (size == this.data.length){
			this.resize();
		}

		this.data[size] = element;
		this.size++;
		return true;
	}

	//Add with a parameter for index. Shifts all the elements starting from the index to the right if there is already an element on the index.
	public void add(int index, String element){
		if (index < 0){
		
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
			this.size++;
		}
	}

	//Returns the element at the given index.
	public String get(int index){
		return this.data[index];
	}

	//Sets the the element at the given index to a new element. Returns the original element.
	public String set(int index, String element){
		//If the element at this index is null, increase the size
		if (this.data[index] == null) this.size++;

		String replacee = this.data[index];
		this.data[index] = element;
		return replacee;
	}

	//Resize the array by a factor of 2.
	public void resize(){
		String[] newArray = new String[this.data.length * 2];
		for (int i = 0; i < this.data.length; i++){
			newArray[i] = this.data[i];
		}
		this.data = newArray;
	}

	//Returns whether the array is empty or not.
	public boolean isEmpty(){
		return this.size == 0;
	}

	//Clears the array, but keeps the capacity.
	public void clear(){
		this.data = new String[this.data.length];
		this.size = 0;
	}

	//Returns a string containing all the elements. 
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
	
		result = result.substring(0, result.length() - 2) + "]";

		return result;
	}

	//Returns a boolean representing if the SuperArray contains the given string.
	public boolean contains(String s){
		boolean result = false;
		for (int i = 0; i < this.data.length; i++){
			if (this.data[i] != null && this.data[i].equals(s)){
				result = true;
			}
		}
		return result;
	}

	//Removes the element at the given index. Returns the given element.
	public String remove(int index){
		String result = this.data[index];

		for (int i = index; i < this.data.length - 1; i++){
			this.data[i] = this.data[i+1];
		}
		this.data[this.data.length - 1] = null;
		return result;
	}

	//Returns the index of a string.
	public int indexOf(String s){
		int result = -1;
		for (int i = 0; result == -1 && i < this.data.length; i++){
			if (this.data[i] != null && this.data[i].equals(s)){
				result = i;
			}
		}
		return result;
	}

	//Returns an array containing all the elements.
	public String[] toArray(){
		String[] result = new String[this.data.length];
		for (int i  = 0; i < this.data.length; i++){
			result[i] = this.data[i];
		}
		return result;
	}
}
