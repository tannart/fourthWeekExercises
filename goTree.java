public class goTree{
    
	public static void main(String[] args){
	    
		IntegerTreeNode theTree = new IntegerTreeNode(6);
		
		theTree.add(5);
		theTree.add(3);
		theTree.add(9);
		theTree.add(34);
		theTree.add(52);
		theTree.add(69);
		theTree.add(25);



		/*theTree.contains(52);
		theTree.contains(66);
		theTree.contains(69);
		theTree.contains(9);*/

		/*theTree.getMax();
		theTree.getMin();
		theTree.getDepth();*/

		theTree.containsVerbose(3);
		theTree.containsVerbose(78);
		theTree.containsVerbose(25);


		//System.out.println(theTree.toString());
		
	}
}