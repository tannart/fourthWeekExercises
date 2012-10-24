public class goTree{
    
	public static void main(String[] args){
	    
		IntegerTreeNode theTree = new IntegerTreeNode(7);
		
		theTree.add(4);
		theTree.add(29);
		theTree.add(106);
		theTree.add(532);
		theTree.add(6);
		theTree.add(88);
		theTree.add(90);
		theTree.add(120);
		theTree.add(1);
		theTree.add(2);
		theTree.add(78);
		theTree.add(66);
		theTree.add(44);
		theTree.add(39);
		theTree.add(999);
		
		theTree.contains(532);
		theTree.contains(66);
		
		theTree.getMax();
		theTree.getMin();
		
		theTree.toString();
		
	}
}	