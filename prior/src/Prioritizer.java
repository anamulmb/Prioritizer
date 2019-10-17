import java.util.ArrayList;
interface Prioritizer<T>{
    public void insert(T t);
    public void removeNextInOrder(T i);
    public void removeAny();
    public boolean isInsertionPhase();
    public void changePhase();
    public int size();
}

