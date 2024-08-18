
import java.util.Stack;

//duplicate parentheses
public class Stack10{
    public static boolean isduplicate(String str){
        Stack <Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //closing
            if(ch == ')'){
                int count =0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; // duplicate
                }
                else{
                    s.pop(); //opening pair
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; //true
        String str1 = "(a-b)";//false
        System.out.print(isduplicate(str1));
    }
}