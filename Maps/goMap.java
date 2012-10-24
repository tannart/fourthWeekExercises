public class goMap{

    public static void main(String[] args){
	    
		Map theMap = new Map();
		
		theMap.put(1,"James");
		theMap.put(2,"Holly");
		theMap.put(3,"Raoul");
		theMap.put(4,"Percy");
		theMap.put(5,"Bertie");
		
		theMap.getMapDetails();
		
		theMap.get(2);
		
		theMap.get(3);
		
		theMap.remove(3);
		
		theMap.getMapDetails();
		
		theMap.put(3,"Joffrey");
		
		theMap.get(3);
	}
}
		