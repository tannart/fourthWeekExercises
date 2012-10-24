public class IntegerTreeNode{
    private int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	
	public int getValue(){
	    return value;
	}
	
	public add(int newNumber){
	    if(newNumber > this.value){ // checks to see if the number to be added is larger or smaller than the current integer
		    if(right == null{  //Checks if there is anything on the right node
			    right = new IntegerTreeNode(newNumber); // adds number to the rightnode
				
			} else {
			
			    right.add(newNumber); // if the right node has a value, moves to that value and reimplements the add method
			}
			
		} else {
		
		    if(left == null){
			    left = new IntegerTreeNode(newNumber);  // does the same thing with the left node if new value is lower than original node value
				
			} else {
			
			    left.add(newNumber);
			}
		}
	}
	
	public contains(int n){
	
	    if (n == this.value){
	    return true;
			
		} else if (n > this.value){
        return right.contains(n);
			
		} else {
		return left.contains(n);
			
		}
		return false;
	}
	public void getMax(){
	   if(this.right == null){
	        System.out.println(this.getValue());
		} else {
		    this.right.getMax();
	}
	
	public void getMin(){
	   if(this.left == null){
	        System.out.println(this.getValue());
		} else {
		    this.left.getMin();
	}
	
}