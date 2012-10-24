public class Element{
    public int eKey;
	public String eName;
	public Element next;
	private int Position
	
	public Element(int eKey, String eName){
	    this.eKey = eKey;
		this.eName = eName;
		this.next = null;
	}
	
	public void addElement(Element newElement){
	    if(this.next == null){
		    this.next = new Element;
		} else{
		    this.next.addElement(newElement);
		}
	}
	
	
	public void search(Element currentKey, int key){
	
	    Element searchKey;
		
	    for(searchkey = currentKey ; searchKey.key != key; searchKey = searchKey.next){
		    position++;
		}
		
		return searchKey.name;
	}