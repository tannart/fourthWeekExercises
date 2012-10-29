public class goTree{
    
	public static void main(String[] args){
	    
		IntegerTreeNode theTree = new IntegerTreeNode(6);
		
		theTree.add(5);
		theTree.add(3);
		theTree.add(9);
    	theTree.add(10);
		theTree.add(14);
		theTree.add(25);
		theTree.add(36);
		theTree.add(46);
		theTree.add(57);
		theTree.add(35);



		
		theTree.contains(532);
		theTree.contains(66);
		
		//theTree.getMax();
		//theTree.getMin();
		
		theTree.toString();
		
	}
}	