
import java.util.Stack;

//reverse a string using stack
public class Stack5{
    public static String reversestring(String str){
        Stack <Character>  s = new Stack<>();
        int index =0;
        //push elements
        while(index < str.length()){
            s.push(str.charAt(index));
            index++;
        }
        //stringbuilder to store result
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "jiya";
        String result = reversestring(str);
        System.out.print(result);
    }
}