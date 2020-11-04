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
		//Make an intermediary array with a length 1 greater, and copy all the elements of this.data into it, as well as the new element
		String[] interArray = new String[this.data.length + 1];
		for (int i = 0; i < this.data.length; i++){
			interArray[i] = this.data[i];
		}
		interArray[interArray.length - 1] = element;

		this.data = interArray;
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
}
