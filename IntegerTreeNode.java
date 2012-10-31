public class IntegerTreeNode{
    private int value = 0;
	private static int maxDepth = 0;
	private static int minDepth = 0;
	private static int depth;
	private IntegerTreeNode left;
	private IntegerTreeNode right;



	
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
			    System.out.println("new tree value " + newNumber);
			    
			} else {
			
			    right.add(newNumber); 
			}
			
		} else {
		
		    if(left == null){
			    left = new IntegerTreeNode(newNumber);  
			    System.out.println("new tree value " + newNumber);

			} else {
			
			    left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n){

	    while(this.left != null || this.right != null){

	    if (n == this.value){

		    System.out.println("The value " + n + " is present in the tree");
	        return true;
			
		} else if (n > this.value && this.right != null){
            return right.contains(n);
			
		} else if(n < this.value && this.left != null) {
		    return left.contains(n);

		} else {
			
		    return false;
		}
	}
	    System.out.println("The requested value "+ n + " was not found in the tree.");
		return false;
	}

	
	public void getMax(){
	   if(this.right == null){
			System.out.println("The value " + this.getValue() + " is the maximum present in the tree");
		} else {
		    maxDepth++;
		    this.right.getMax();
	    }
	}
	
	public void getMin(){
	   if(this.left == null){
			System.out.println("The value " + getValue() + " is the minimum present in the tree");
		} else {
		    minDepth++;
		    this.left.getMin();
	    }	
    }


	
	public String toString(){ // constructs string of branches with values
        String str = "" + Integer.toString(this.value);

      
        if(left != null){
        	str +=  left.toString();
        }

        if(right != null){
        	str +=  right.toString();
        }

        return "[" +str+ "]";
        
    }


	
	public int getDepth(){
		if(maxDepth > minDepth){
		    depth = maxDepth;
		} else {
		    depth = minDepth;
		}
		
		System.out.println("The current tree has " + depth + " levels.");
		return depth;
	}
	
	
	
	
	
}