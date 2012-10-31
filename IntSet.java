public interface TreeIntSet{

	void add(int newNumber); //adds a new int to the set; if it is there already, nothing happens

	boolean contains(int n); // returns true if the number is in the set, false or otherwise

	boolean containsVerbose(int n); // returns the same values as the previous method but for every element that is checked, the value is printed on the screen.

	String toString(); // returns a string with the valuse of the elements in the set separated by commas.
}

