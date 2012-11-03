public class ListIntSet implements IntSet{
    private ListIntSet next;
    private ListIntSet previous;
    private ListIntSet current;
    private int value;


	public ListIntSet(int number){
		this.next = null;
		this.previous = null;
		this.value = number;

	}



	public void add(int newNumber){
		ListIntSet newGuy = new ListIntSet(newNumber);
		if (current == null){
			current = newGuy;
			this.next = newGuy;

		} else{

			current.next = newGuy;
			newGuy.previous = current;
			current = newGuy;
		}


	}

	public boolean contains(int n){
		ListIntSet holder = this;
		while(holder != null){

		    if(holder.value == n){
			    return true;
		    }
		    holder = holder.next;
		}
		return false;

	}

	public boolean containsVerbose(int n){
		ListIntSet holder = this;
		while(holder != null){
			System.out.println(holder.value);

		    if(holder.value == n){
			    return true;
		    }
		    holder = holder.next;
		}
		return false;

	}

	public String toString(){
		String str = Integer.toString(this.value);
		while(this.next != null){
			str += Integer.toString(this.next.value);
			this.next = this.next.next;
		}
		return str;
	}

}