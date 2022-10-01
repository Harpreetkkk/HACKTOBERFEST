import java.util.Scanner;
public class stack {
    public static class stak{
        static int top,max;
        static int[] ar=new int[50];
        static Scanner in=new Scanner(System.in);
        stak(){
            top=-1;
            max=50;
        }
        public static boolean isfull(){
            if(top==max-1){
                return true;
            }
            else{
                return false;
            }
        }
        public static boolean isempty(){
            if(top<0){
                return true;
            }
            else{
                return false;
            }
        }
        public static void push(){
            if(isfull()){
                System.out.println("Overflow condition");
            }
            else if(isempty()){
                top++;
                System.out.println("Enter number");
                ar[top]=in.nextInt();
                System.out.println("Element added successfully");
            }
            else{
                top++;
                System.out.println("Enter number");
                ar[top]=in.nextInt();
                System.out.println("Element added successfully");
            }
        }
        public static void pop(){
            if(isempty()){
                System.out.println("Underflow condition");
            }
            else{
                top--;
                System.out.println("Element deleted succcessfully");
            }
        }
        public static void peek(){
            int a;
            a=ar[top];
            System.out.println("Element found is"+a);
        }
        public static void display(){
            if(isempty()){
                System.out.println("Underflow condition");
            }
            else{
                for(int i=0;i<=top;i++){
                    System.out.println(ar[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        int a;
        stak s=new stak();
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("Enter 1-push");
            System.out.println("Enter 2-pop");
            System.out.println("Enter 3-peek");
            System.out.println("Enter 4-display");
            System.out.println("Enter 5-exit");
            a=in.nextInt();
            switch(a){
                case 1:
                s.push();
                break;
                case 2:
                s.pop();
                break;
                case 3:
                s.peek();
                break;
                case 4:
                s.display();
                break;
                case 5:
                System.exit(0);
                break;
                default:
                System.out.println("No  match to your selection");
                break;
            }
        }
    }
}
