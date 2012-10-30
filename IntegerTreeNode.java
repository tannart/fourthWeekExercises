public class IntegerTreeNode{
    private int value;
	private static int depth;
	private static int maxDepth = 0;
	private static int minDepth = 0;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	private String str;
	private	String str1 = "";
	private	String strR = "";
	private	String strL = "";

	
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
	
	public String toString(){ // constructs string of branches with values
	    str = "[" + Integer.toString(this.value);
	    boolean nullValues = false;
	    boolean nullValuesL = false;
	    boolean nullValuesR = false;
	    String nullL = "";
	    String nullR = "";

        while(nullValues == false){
        	str = str + "L[";


        	if(this.left == null){  // checks the left branch for values
        		nullValuesL = true;
        	} else {
        		strL = strL  + Integer.toString(this.left.value);
        	}

        	str = str + "R[";

        	if(this.right!=null) {  //checks the right branch for values
        		str = str + Integer.toString(this.right.value);
        	} else {
        		nullValuesR = true;
        		nullR = nullR + "]";
        	}

        	if(nullValuesR == true && nullValuesL == true){
        		nullValues = true;
        		break;
        	} else if(nullValuesR == true){
        		this.left = this.left.left;
        	} else if(nullValuesL == true){
        		this.right = this.right.right;
        	} else {
        		this.left = this.left.left;
        		this.right = this.right.right;
        	}
        }
        str = str + strL + strR + "]";

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