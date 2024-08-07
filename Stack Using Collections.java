import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            stack.push(a);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}