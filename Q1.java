import java.util.*;
class Q1 {
        public static int factorial(int num){
                int result = 1;
                for(int i = num;i>0;i--){
                        result*=i;
                }
                return result;
        }
        public static void main(String[] args) {
                int num;
                System.out.println("Enter a number:");
                Scanner sc = new Scanner(System.in);
                num = sc.nextInt();
                System.out.println("Factorial of "+num+" is "+factorial(num));
        }
}
