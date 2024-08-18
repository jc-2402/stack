
import java.util.Stack;

//vvvimp .. hard
//maximum rectangle area in histogram
public class Stack11{
    public static void maxArea(int arr[]){
        int maxarea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller right
        Stack <Integer> s = new Stack<>();
        for(int i= arr.length-1 ; i>=0; i--){ // for right reverse loop
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){ // to remove larger ele and get smaller
                s.pop();
            }
            if(s.isEmpty()){
                //-1 .. not found
                nsr[i] = arr.length; //eg -6
            }
            else{
                //top
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s = new Stack<>(); //empty thr same stack
        for(int i=0; i<arr.length; i++){ //left
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){ //smaller
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1; // not found
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //current area
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currarea = height * width;
            maxarea = Math.max(currarea, maxarea);
        }

        System.out.println("max area in histogram = "+maxarea);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3}; //ans - 10
        maxArea(arr);
    }
}