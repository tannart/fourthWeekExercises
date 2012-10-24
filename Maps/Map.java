public class Map implements SimpleMap{
    private Element currentKey;
	private Element nextKey;
	private static int elementNumber = 0;
	
	public Map(){
	    Element startElement = new Element(0,"S");
	    Element nextElement = new Element(1000000,"S");
		this.currentKey = startElement;
		this.nextKey = nextElement;
	}
	
    public String put(int key, String name){
	    Element newElement = new Element(key, name);
		
		currentKey.addElement(newElement);

		System.out.println(name + " has been added to the map");
		elementNumber++;
		return name;
	}
	
	public String get(int key){
	    System.out.println("Searching...");
	    String name = currentKey.search(currentKey, key);
		System.out.println(name + " is at position " + key);
		return name;
	}
	
	public void remove(int key){
	    String name = currentKey.search(currentKey, key);
		System.out.println(name + " has been removed from the map");
	    String deleted = nextKey.deleteElement(currentKey, key);
		elementNumber--;
	}
	
	public boolean isEmpty(){
	    if(currentKey.getNext() == null){
	    
		    return true;
	    } else{
	    
		return false;
	    }
    }
	
	public void getMapDetails(){
	    System.out.println("There are currently " +elementNumber + " elements in the map");
	}
}