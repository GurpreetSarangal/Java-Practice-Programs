import java.util.Scanner;
class NumberPlay{
    int num;

    NumberPlay(int num){
        this.num = num;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("Please Enter Your choice: ");
        menu();
        int ch=s.nextInt();

        System.out.print("Value of N : ");
        int n=s.nextInt();
        NumberPlay numPlay = NumberPlay(n);
        numPlay.play(ch);
    }
    void play(int ch){
        String res;
        switch(ch){
            case 1:
                int sum = n * (n-1) / 2;
                System.out.println("Sum of "+n+" Natural Numbers : " + sum);
                break;
            case 2:
                int fact = 1;
                while(n>0){
                    fact *= n--;
                }
                System.out.println("Factorial of "+n+" is : "+fact);
                break;
            case 3:
                System.out.println("count of Even : "+n/2);
                System.out.println("count of Odd : "+(n/2 + n%2));
                break;
            case 4:
                int rev=0, rem, temp = n;
                while(n>0){
                    rem = n % 10;
                    rev = (rev*10) + rem;
                    n = n / 10;
                }
                System.out.println(temp+ "<-->" +rev);
                break;
            case 5:
                int rev=0, rem, temp = n;
                while(n>0){
                    rem = n % 10;
                    rev = (rev*10) + rem;
                    n = n / 10;
                }
                res = (temp == rev)? "Palindrome" : "Not Palindrome";
                System.out.println(temp+" is "+res);
                break;
            case 6:
                res = "Prime";
                for(int i=2; i*i < n; i++ ){
                    if(n%i == 0){
                        res = "Composite";
                        break;
                    }
                }
                System.out.println(n+" is "+res);
                break;
            case 7:
                int rem, asr, temp = n;
                while(n>0){
                    rem = n % 10;
                    asr += rem * rem * rem;
                    n = n/10;
                }

                res = (temp == asr) ? "an Armstrong" : "Not an Armstrong";
                
                System.out.println(temp+" is "+res+" Number");
                break;
            case 8:
                
                break;
            case 9:
                break;
            default:
                System.out.println("No Valid choice was selected.")

        }
    }

    static void menu(){
        System.out.println("Do Something With a Number -->");
        System.out.println("    1. Sum of 'n' Natural Numbers.");
        System.out.println("    2. Factorial of n.");
        System.out.println("    3. Count of Even & Odd Numbers upto n.");
        System.out.println("    4. Reverse a Number.");
        System.out.println("    5. Check if the number is Palidrome or not.");
        System.out.println("    6. Check if the number is Prime or not.");
        System.out.println("    7. Chech if the number is Armstrong or not.");
        System.out.println("");
        System.out.println("Print a Series -->");
        System.out.println("    8. Fibonacci Series.");
        System.out.println("    9. Prime Numbers upto n.");
    }
}