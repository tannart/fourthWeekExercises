public class IntegerTreeNode{
    private int value;
	private static int depth;
	private static int maxDepth = 0;
	private static int minDepth = 0;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	private String str = "[" + Integer.toString(this.value);
	private	String str1 = "";
	private	String strR = "";
	private	String strL = "";
	private IntegerTreeNode hold;

	
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
	
	    while(this.left != null || this.right != null){
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
	
	public String toTheString(){ // constructs string of branches with values
	   
        	str = str + "L[";


        	if(this.left == null){  // checks the left branch for values
        		str = str + "]";
        	} else {
        		str = str  + Integer.toString(this.left.value);
        	}

        	str = str + "R[";

        	if(this.right!=null) {  //checks the right branch for values
        		str = str + Integer.toString(this.right.value);
        	} else {
        		str = str + "]";
        	}

        	if(this.right != null && this.left != null){
        		hold = this;
        		this.left = this.left.toTheString();
        	} 

        System.out.println(str);

        return str;
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