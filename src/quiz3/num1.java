/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;

import java.util.Scanner;

/**
 *
 * @author Clarisse Angeline
 */
public class num1 {

    static int MAX = 9;
    private int [] data = new int [MAX];
    private int front = -1;
    private int rear = -1;
    
    public void insert(int item) throws Exception {
        if (rear == MAX - 1) {
        throw new Exception("Queue is full");
        }
                if (front == -1) {
            front = rear = 0;
            data[front] = item;
        } else {
            if (front != 0) {
                data[++rear] = item;
            } else {
                for (int i = rear + 1; i > 0; i--) {
                    data[i] = data[i - 1];
                }
                data[0] = item;
                rear++;
            }
        }
    }
        public void display () throws Exception {
        if (front == -1){
             throw new Exception ("Queue is empty");
        }
        
        for (int i = front; i < rear + 1; i++){
            System.out.println(data[i]);
        }
        
        System.out.println("NULL"); // print null 
    }
    
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      num1 list = new num1();
  
      while(true){
          System.out.println("1. Insert");
          System.out.println("2. Display");
          int choice = scn.nextInt();
          switch(choice){
              case 1:
                  System.out.println("Enter the element");
                  int index = scn.nextInt();
                  list.insert(index);
                  break;
              case 2: 
                  list.display();
                  break;
              default:
                  throw new AssertionError();    
          }
          
      }
    }
    
}
