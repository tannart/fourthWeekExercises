public class IntegerTreeNode{
    private int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	
	public IntegerTreeNode(int value){
	    this.value = value;
	}
	
	public int getValue(){
	    return value;
	}
	
	public void add(int newNumber){
	    if(newNumber > this.value){ 
		    if(right == null){  
			    right = new IntegerTreeNode(newNumber); 
				
			} else {
			
			    right.add(newNumber); 
			}
			
		} else {
		
		    if(left == null){
			    left = new IntegerTreeNode(newNumber);  
				
			} else {
			
			    left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n){
	
	    if (n == this.value){
		System.out.println("The value " + n + " is present in the tree");
	    return true;
			
		} else if (n > this.value){
        return right.contains(n);
			
		} else if(n < this.value) {
		    return left.contains(n);	
		} else {
		    return false;
		}
	}
	
	public void getMax(){
	   if(this.right == null){
			System.out.println("The value " + this.getValue() + " is the maximum present in the tree");
		} else {
		    this.right.getMax();
	    }
	}
	
	public void getMin(){
	   if(this.left == null){
			System.out.println("The value " + getValue() + " is the minimum present in the tree");
		} else {
		    this.left.getMin();
	    }	
    }
}