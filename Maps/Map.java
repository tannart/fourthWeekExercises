public class Map implements SimpleMap{
    private Element currentKey;
	private Element nextKey;
	
    public String put(int key, String name){
	    Element newElement = new Element(key, name);
		
		if(currentKey == null){
		    currentKey = newElement;
			
		} else {
		
		    currentKey.addElement(newElement);
			
		}
		
	    return name;
		System.out.println(name + " has been added to the map");
	}
	
	public String get(int key){
	    
	}
	
	public void remove(int key){
	}
	
	public boolean isEmpty(){
	if(){
	    
		return true;
	} else{
	    
		return false;
	}