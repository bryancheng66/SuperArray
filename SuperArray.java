public class SuperArray {
	private String[] data;
	private int size; //current size

	public SuperArray(){
		this.data = new String[0];
		this.size = 0;
	}
	
	public int size(){
		return this.size;
	}

	public boolean add(String element){
		String[] interArray = new String[this.size + 1];
		for (int i = 0; i < this.size; i++){
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
}
