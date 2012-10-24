public class Supermarket{

    public static void main(String[] args){
        
        Person firstGuy = new Person(6);
        Person secondGuy = new Person(7);
        Person thirdGuy = new Person(8);
        Person fourthGuy = new Person(113);
        Person fifthGuy = new Person(89);
        Person sixthGuy = new Person(220);
        
        Queue theQueue = new Queue(firstGuy);
        
        theQueue.insert(secondGuy);
        theQueue.insert(thirdGuy);
        theQueue.insert(fourthGuy);
        theQueue.insert(fifthGuy);
        theQueue.insert(sixthGuy);
        
        theQueue.showQueue();
        
        theQueue.retrieve();
        
        theQueue.showQueue();
        
        theQueue.retrieve();
        
        theQueue.showQueue();
        
        theQueue.retrieve();
        
        theQueue.showQueue();
        
        theQueue.retrieve();
        
        theQueue.showQueue();
        
        theQueue.retrieve();
        
        theQueue.showQueue();
    }
}