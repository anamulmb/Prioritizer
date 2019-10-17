import java.util.*;
import java.util.Collections;
import java.util.Random;
//Priortizer 3:  No representation invariant.
class Prioritize3<T> implements Prioritizer<T>{
    //Declaring Arraylist to hold the data
    public ArrayList<T> list;
    // public ArrayList<T> list2;
    //phase is True if the Prioritizer is in Insertion phase and False ,if in Removal phase
    boolean isInInsertionPhase;
    Comparator<T> compareObj;

    Prioritize3(Comparator<T> comparator1){
        this.compareObj = comparator1;
        this.isInInsertionPhase = false;
    }
    //top to peek at the last element of the ArrayList
    public void top(){
        if(this.list.size()>0){
            int index=this.list.size()-1;
            System.out.println(this.list.get(index));
        }}

    public void insert(T i) {
        this.isInInsertionPhase = true;
        if (isInsertionPhase())
        {
            this.list.add(i);

        } else {

            System.out.println("Please Change the phase.");
        }
    }

    @Override
    public void removeNextInOrder(T i) {
        if (this.list.size()>0){
            this.list.remove(this.list.get(0));
        }

    }

    public void removeAny(){
        if(this.size()>=1){
            Random random=new Random();
            int rand=random.nextInt(this.size());
            this.list.remove(rand);
        }
        else{
            this.list=new ArrayList<>();
        }}

    public int size(){
        return list.size();
    }

    public boolean isInsertionPhase(){
        return this.isInInsertionPhase==true;
    }

    public void changePhase(){
        if(this.isInInsertionPhase){
            this.isInInsertionPhase=false;

        }
        else{
            this.isInInsertionPhase=true;
        }
    }
}
