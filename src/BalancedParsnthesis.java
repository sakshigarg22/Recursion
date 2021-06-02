import java.util.Stack;
public class BalancedParsnthesis<T> {
    public static void main(String[] args) {
//        Stack<Character> string = new Stack<>();
//        String str = "{ a + [ b+ (c + d)] + (e + f) } ";
//        for(int j = 0; j<str.length(); j++) {
//            if (str.charAt(j) == '{' || str.charAt(j) == '(' || str.charAt(j) == ')' || str.charAt(j) == '[' || str.charAt(j) == ']'
//                    || str.charAt(j) == '}') {
//                string.push(str.charAt(j));
//            }
//        }
//        for(int i = 0; i<str.length(); i++){
//            if(str.charAt(i)=='{' || str.charAt(i)=='(' ||str.charAt(i)==')' ||str.charAt(i)=='[' ||str.charAt(i)==']'
//                    ||str.charAt(i)=='}' ) {
//                if((str.charAt(i) == '(' && string.peek() ==')' )||(str.charAt(i) == '[' && string.peek() ==']' )||
//                        (str.charAt(i) == '{' && string.peek() =='}')|| (str.charAt(i) == ')' && string.peek() =='(' )||
//                        (str.charAt(i) == '}' && string.peek() =='{' ) || (str.charAt(i) == ']' && string.peek() =='[' )){
//                    string.pop();
//
//                }
//                else{
//                    break;
//                }
//
//            }
//
//
//        }
//        if(string.isEmpty()){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//
//        }
        BalancedParsnthesis p = new BalancedParsnthesis();
        Stack<Character> string = new Stack<>();
        String str = " { a + [ b - c } ]";
        for(int i = 0; i<str.length(); i++){
            char t = str.charAt(i);
            if(p.isRightParanthesis(t)==true){
                string.push(str.charAt(i));

            }
            else if(p.isLeftParanthesis(t) == true){
                char q = string.peek();
                if(q =='(' && t==')' || q =='[' && t == ']' || q == '{' && t =='}'){
                    string.pop();
                }
            }

        }
        System.out.println(string.isEmpty());

    }
    boolean isRightParanthesis(char r){
        if(r == '(' || r == '[' || r =='{'){
            return true;
        }
        else{
            return false;
        }

    }
    boolean isLeftParanthesis(char i){
        if(i == ')' || i == '}' || i ==']' ){
            return true;
        }
        else{
            return false;
        }
    }
}
