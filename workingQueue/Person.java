public class Person {

    public Person next;
    public int items;
    
    public Person(int items){
        this.items = items;
    }
    
    public void addPerson(Person newPerson){
        if(this.next == null){
            this.next = newPerson;
            System.out.println(this.next);
        }else {
            this.next.addPerson(newPerson);
        }
    }
}
        
        
    