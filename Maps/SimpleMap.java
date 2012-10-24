public interface SimpleMap{
    
    String put(int key, String name);
	
	String get(int key);
	
	void remove(int key);
	
	boolean isEmpty();
}