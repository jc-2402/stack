//valid parenthesis
//given a string containg just the characters (,), {,}, [,] dtermine if the i/p string is valid
import java.util.*;
public class Stack9{
    public static boolean isvalid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else{
                //closing
                if(s.isEmpty()){
                   return false; // eg - ")))"
                }
                //check pair
                if( (s.peek() == '(' && ch == ')')
                   || (s.peek() == '{' && ch == '}')
                   || (s.peek() == '[' && ch == ']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({}[])";
        System.out.println(isvalid(str));
    }
}