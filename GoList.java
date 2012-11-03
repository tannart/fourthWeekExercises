public class GoList{
	
	public static void main(String[] args){

	ListIntSet theStarter = new ListIntSet(0);

	theStarter.add(9);
    theStarter.add(35);
	theStarter.add(5);
	theStarter.add(57);
	theStarter.add(999);
	theStarter.add(666);
	theStarter.add(1);

	theStarter.contains(5);
	theStarter.contains(89);

	theStarter.containsVerbose(90);
	theStarter.containsVerbose(1);

	System.out.println(theStarter.toString());

	}
}