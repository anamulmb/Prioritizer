import java.util.*;
class Prioritize1<T> implements Prioritize<T>{
    private ArrayList<T> list;
    //phase is True if the Prioritizer is in Insertion phase and False ,if in Removal phase
    boolean phase;
    Prioritize1(boolean phase){
        this.list=new ArrayList<>();
        this.phase=phase;
    }
    public void insert(T i) {
        if (isInsertionPhase()) {
            if (phase) {
                list.add(i);
            }
        } else {

            System.out.println("Please Change the phase.");
        }
    }
    public void removeAny(T i){

        list.remove(i);
    }
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
    Prioritize1<Integer> prioritize= new Prioritize1<Integer>(true);

}}