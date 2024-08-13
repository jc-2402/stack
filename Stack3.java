//stack using java frameworks
import java.util.*;
public class Stack3{
    public static void main(String args[]){
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(9);
        s.push(20);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}