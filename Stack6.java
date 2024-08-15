//reverse a stack without extra space
import java.util.*;
public class Stack6{
    public static void pushatbottom(Stack <Integer> s, int data){
        if(s.isEmpty()){ //add new element when stack is empty
           s.push(data);
           return;
        }
        int top = s.pop();
        pushatbottom(s, data);
        s.push(top);
    }
    public static void reversestack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reversestack(s);
        pushatbottom(s, top);
    }
    public static void printstack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

       // printstack(s);
        reversestack(s);
        printstack(s);
    } 
}
