import java.util.ArrayList;
interface Prioritize<T>{
    public void insert(T t);
    //public void removeNextInOrder();
    public void removeAny(T t);
    public boolean isInsertionPhase();
    public void changePhase();
    public int size();
}

