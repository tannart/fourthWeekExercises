public class Element{
    private int eKey;
	private String eName;
	private Element next;
	private int position;
	
	public Element getNext(){
	    return next;
	}
	
	public String geteName(){
	    return eName;
	}
	
	public int geteKey(){
	    return eKey;
	}
	
	public Element(int eKey, String eName){
	    this.eKey = eKey;
		this.eName = eName;
		this.next = null;
	}
	
	public void addElement(Element newElement){
	    if(this.next == null){
		    this.next = newElement;
		} else{
		    this.next.addElement(newElement);
		}
	}
	
	
	public String search(Element currentKey, int key){
	
	    Element searchKey = null;
		String gotKey = null;
		
	    for(searchKey = currentKey ; searchKey.eKey != key; searchKey = searchKey.next){
		    position++;
		}
		for(searchKey = currentKey ; searchKey != null; searchKey = searchKey.next){
		    if(searchKey.eKey == key){
			    gotKey = searchKey.eName;
			}  
		}
		
		return gotKey;
	}
	
	public String deleteElement(Element currentKey, int key){
	    Element searchKey = null;
		Element deletedKey = null;
	    for(searchKey = currentKey ; searchKey.next!= null; searchKey = searchKey.next){
		    if(searchKey.next.eKey == key){
			    deletedKey = searchKey.next;
			    searchKey.next = searchKey.next.next;
			}  
		}
	    return deletedKey.eName;
	}
}
	
