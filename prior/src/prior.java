import java.util.*;
import java.util.Collections;
import java.util.Random;

class Prioritize1<T> implements Prioritizer<T>{
    //Declaring Arraylist to hold the data
    public ArrayList<T> list;
   // public ArrayList<T> list2;
    //phase is True if the Prioritizer is in Insertion phase and False ,if in Removal phase
    boolean phase;

    Prioritize1(boolean phase){
        this.list=new ArrayList<>();
        this.phase=phase;
    }
    //top to peek at the last element of the ArrayList
    public void top(){
        if(this.list.size()>0){
        int index=this.list.size()-1;
        System.out.println(this.list.get(index));
    }}

    public void insert(T i) {

        if (isInsertionPhase()) {
            if (phase) {
                this.list.add(i);
            }
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
        return this.phase==true;
    }
    public void changePhase(){
        if(this.phase){
            this.phase=false;

        }
        else{
            this.phase=true;
        }
    }
}
class prior{
public static void main(String[] args){
    Prioritize1<Integer> prioritized= new Prioritize1<Integer>(true);
    if(prioritized.isInsertionPhase()){
        prioritized.insert(6);
        prioritized.insert(5);
        prioritized.insert(4);
        prioritized.insert(3);
        prioritized.insert(2);
        prioritized.insert(1);
    }

    Iterator iterator = prioritized.list.iterator();
    while (iterator.hasNext())
        System.out.println(iterator.next() + " ");
    System.out.println(prioritized.list);
    prioritized.removeAny();

}}