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
		if (this.data[index] == null) size++;
		
		String replacee = this.data[index];
		this.data[index] = element;
		return replacee;
	}
}
