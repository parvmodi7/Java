package Stack; 
import java.util.Stack; 

public class Validpalthesis { 
    public static boolean isValid(String str) { 
        Stack<Character> s = new Stack<>(); 
        
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            
            // Step 1: Push opening brackets to the stack
            if (ch == '(' || ch == '{' || ch == '[') { 
                s.push(ch); 
            } 
            // Step 2: Handle closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') { 
                // If stack is empty, there is no matching opening bracket
                if (s.isEmpty()) { 
                    return false; 
                } 
                
                char top = s.peek();
                // Check if the top of the stack matches the current closing bracket
                if ((top == '(' && ch == ')') || 
                    (top == '{' && ch == '}') || 
                    (top == '[' && ch == ']')) { 
                    s.pop(); 
                } else { 
                    return false; // Mismatched brackets
                } 
            } 
        } 
        
        // If stack is empty, all brackets were properly matched
        return s.isEmpty(); 
    } 

    public static void main(String args[]) { 
        String str = "(){}[]"; 
        System.out.print(isValid(str)); // Will output: true
    } 
}
