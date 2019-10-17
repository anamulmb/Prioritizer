import java.util.Comparator;
import java.util.Iterator;
public class main {
    public static void main(String[] args){
        Prioritize1<Integer> prioritized= new Prioritize1<Integer>(new DetailsComparator());
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

    }


}

class DetailsComparator implements Comparator<Integer> {

    @Override
    public int compare(int o1,int o2) {
        if(o1 < o1){
            return -1;
        }else if(o1 > o2){
            return 1;
        }
        return 0;
    }

}
