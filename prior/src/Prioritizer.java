public interface Prioritizer<T>{
    void insert(int a);
    void changePhase(int a);
    void removeNextInOrder(int a);
    void removeAny(int a);
    void isInInsertionPhase(int a);
}
