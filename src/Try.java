
import java.util.Scanner;

public class Try {
    static int MAX= 10;
    private int[]data=new int[MAX];
    private int front;
    private int rear;
    
    
    private void insertion(int index)throws Exception{

        if ((front==0&&rear==MAX-1)|| (rear+1==front)) {
            
            throw new Exception("Queue is full");
        }
        if (rear==MAX-1) {
            
            rear=0;
        }else if(front==1){ 
            front=0;
        }else{
            data[rear++]=index;
        }
    }
    
    private int deletion()throws Exception{
        if (front== -1) {
            throw new Exception("Queue is empty");
        }
        int temporary=data[front];
        
        if (front==rear) {
            front=rear=-1;
            
        }else if (front==MAX-1) {
            front=0;
            
        }else{
            front++;
        }
        return temporary;
        
    }
    
    private void display()throws Exception{
        if (front==-1) {
            throw new Exception("Queue is empty");
        }
        
        if (rear<front) {
            for (int i = front; i <= MAX-1; i++) {
                System.out.println(data[i]+" ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.println(data[i]+" ");
            }
            
        }else{
            for (int i = front; i < rear; i++) {
                System.out.println(data[i]+" ");
            }
        }
        System.out.println("Null");
    }
        
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        Try list=new Try();
        
        while(true){
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            int choice=scn.nextInt();
        
            switch (choice) {
                case 1:
                    System.out.println("Enter Node: ");
                    int index=scn.nextInt();
                    list.insertion(index);
                    break;
                case 2:
                    list.deletion();
                    break;
                case 3:
                    list.display();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
}