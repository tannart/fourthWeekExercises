public class ElementMap implements SimpleMap{
    private static int elementNumber;
	private static String theMap[];
	
	public ElementMap(int size){
        String[] theMap = new String[100];
	}
	
    public String put(int key, String name){
        theMap[key] = name;
		elementNumber++;
		return name;
	}
	
	public String get(int key){
        String getName = theMap[key];
		System.out.println(getName + " is in position " + key);
		System.out.println("");
		return getName;
	}
	
	public void remove(int key){
	    String getName = theMap[key];
	    theMap[key] = null;
		System.out.println(getName + " has been removed from the map.");
		System.out.println("");
		elementNumber--;
	}
	
	public boolean isEmpty(){
	
	    int a = 0;
		
	    for(int i = 0; i < 100; i++){
		
	        if(theMap[i] != null){
	    
		        a = 1;
		
			
	        }
		
        }
		if(a == 1){
		    return false;
		} else {
		    return true;
		}
	}
	
	public void getMapDetails(){
	    System.out.println("There are currently " + elementNumber + " elements in the ElementMap");
	}
}