import java.util.Queue;
public class prior{
    int queue[]= new int[5];
    int size;
    int front;
    int rear;

    public void insert(int data)
    {
        queue[rear]=data;
        rear=rear+1;
        size=size+1;
    }
    public void show()
    {
        System.out.println("Elements :");
        for(int i=0; i<size; i++){
            System.out.print(queue[i]+" ");
        }
    }
    public static void main(String args[]){
        prior q=new prior();
        q.insert(5);
        q.insert(2);
        q.show();
    }
}
