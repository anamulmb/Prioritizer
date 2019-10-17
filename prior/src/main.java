import java.util.Iterator;
public class main {
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

    }


}

class DetailsComparator implements Comparable<>{

    @Override
    public int compareTo(Object o1,Object o2) {
        if(o1.getData < o2.getData){
            return -1
        }else if(o1.getData > o2.getData){
            return 1;
        }
        return 0;
    }
}
