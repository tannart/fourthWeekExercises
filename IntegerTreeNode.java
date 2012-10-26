public class IntegerTreeNode{
    private int value;
	private static int depth;
	private static int maxDepth = 0;
	private static int minDepth = 0;
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
	
	public String toString(){
	    value = this.value;
		String str = null;
	    String str1 = null;
		String strR = null;
		String strL = null;
	    str1 = Integer.toString(this.value);

		if(this.left != null){
		    strL = strL + Integer.toString(this.left.value);
		    this.left.toString();
		} else { 
		    strL = strL + "]";
		}
		if(this.right != null){
            this.right.toString();
			strR = strR + Integer.toString(this.right.value);
		} else{
			strR = strR + "]";
		}
		
		str = str1+strL+strR;

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