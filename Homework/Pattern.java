import java.util.Scanner;
class Pattern{
    int n; // number of lines
    Pattern(int n){
        this.n = n;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int ch;
        
        System.out.println("Please select the pattern you want: ");
        demo();

        System.out.println("Enter Your choice [1 - 11]: ");
        ch = s.nextInt();

        System.out.println("Please enter the number of lines: ");
        int n = s.nextInt();

        Pattern p = new Pattern(n);
        
        System.out.println();

        p.show_pattern(ch);

    }

    static void demo(){
        System.out.print("1. *\n");
        System.out.print("   * *\n");
        System.out.print("   * * *\n");
        System.out.print("   * * * *\n");
        System.out.print("\n");
        System.out.print("2. 1\n");
        System.out.print("   1 2\n");
        System.out.print("   1 2 3\n");
        System.out.print("   1 2 3 4\n");
        System.out.print("\n");
        System.out.print("3. 1\n");
        System.out.print("   2 2\n");
        System.out.print("   3 3 3\n");
        System.out.print("   4 4 4 4\n");
        System.out.print("\n");
        System.out.print("4. 1\n");
        System.out.print("   2 3\n");
        System.out.print("   4 5 6\n");
        System.out.print("   7 8 9 10\n");
        System.out.print("\n");
        System.out.print("5. * * * *\n");
        System.out.print("   * * *\n");
        System.out.print("   * *\n");
        System.out.print("   *\n");
        System.out.print("\n");
        System.out.print("6.       *\n");
        System.out.print("       * *\n");
        System.out.print("     * * *\n");
        System.out.print("   * * * *\n");
        System.out.print("\n");
        System.out.print("7.       *\n");
        System.out.print("       * * *\n");
        System.out.print("     * * * * *\n");
        System.out.print("   * * * * * * *\n");
        System.out.print("\n");
        System.out.print("8.       *\n");
        System.out.print("       * * *\n");
        System.out.print("     * * * * *\n");
        System.out.print("   * * * * * * *\n");
        System.out.print("     * * * * *\n");
        System.out.print("       * * *\n");
        System.out.print("         *\n");
        System.out.print("\n");
        System.out.print("9.       1\n");
        System.out.print("       1 0 1\n");
        System.out.print("     1 0 1 0 1\n");
        System.out.print("   1 0 1 0 1 0 1\n");
        System.out.print("\n");
        System.out.print("10. * * * * * * * * *\n");
        System.out.print("    * * * *   * * * *\n");
        System.out.print("    * * *       * * *\n");
        System.out.print("    * *           * *\n");
        System.out.print("    *               *\n");
        System.out.print("\n");
        System.out.print("11. * * * * * * * * *\n");
        System.out.print("    * * * *   * * * *\n");
        System.out.print("    * * *       * * *\n");
        System.out.print("    * *           * *\n");
        System.out.print("    *               *\n");
        System.out.print("    * *           * *\n");
        System.out.print("    * * *       * * *\n");
        System.out.print("    * * * *   * * * *\n");
        System.out.print("    * * * * * * * * *\n");
        System.out.print("\n\n");

        
    }
    void show_pattern(int ch){
        int temp=0;
        switch(ch){
            
            case 1: 
                for(int i=0; i<n; i++){
                    for(int j=0; j<=i; j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            
            case 2:
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=i; j++){
                        System.out.print(j+" ");
                    }
                    System.out.print("\n");
                }
                break;
            
            case 3:
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=i; j++){
                        System.out.print(i+" ");
                    }
                    System.out.print("\n");
                }
                break;
            
            case 4:
                
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=i; j++){
                        System.out.print(temp++ +" ");
                    }
                    System.out.print("\n");
                }
                break;
            
            case 5:
                for(int i=n; i>=1; i--){
                    for(int j=i; j>=1; j--){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            
            case 6:
                for(int i=0; i<n; i++){
                    for(int k=0; k< n-i-1; k++){
                        System.out.print("  ");
                    }
                    for(int j=0; j<=i; j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            
            case 7:
                for(int i=0; i<n; i++){
                    for(int k=0; k< n-i-1; k++){
                        System.out.print("  ");
                    }
                    for(int j=0; j<i*2+1; j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            
            case 8:
                for(int i=0; i<n; i++){
                    for(int k=0; k< n-i-1; k++){
                        System.out.print("  ");
                    }
                    for(int j=0; j<i*2+1; j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                for(int l=n-1; l>0; l--){
                    for(int j=0; j<n-l; j++){
                        System.out.print("  ");
                    }
                    for(int k=0; k<l*2-1; k++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            
            case 9:
                for(int i=0; i<n; i++){
                    for(int k=1; k<=n-i-1; k++){
                        System.out.print("  ");
                    }
                    for(int j=1; j<=i*2+1; j++){
                        temp = (j%2 == 0) ? 0 : 1;
                        System.out.print(temp+" ");
                    }
                    System.out.print("\n");
                }
                break;
            
            case 10:
                for(int i=0; i<n; i++){
                    for(int j=0; j<n-i; j++){
                        System.out.print("* ");
                    }
                    for(int l=1; l<=i*2-1 && i>0; l++){
                        System.out.print("  ");
                    }
                    for(int k=0; k<n-i && k<n-1; k++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            
            case 11:
                for(int i=0; i<n; i++){
                    for(int j=0; j<n-i; j++){
                        System.out.print("* ");
                    }
                    for(int l=1; l<=i*2-1 && i>0; l++){
                        System.out.print("  ");
                    }
                    for(int k=0; k<n-i && k<n-1; k++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                for(int i=1; i<n; i++){
                    for(int j=0; j<=i ; j++){
                        System.out.print("* ");
                    }
                    for(int k=0; k < (n-(i+1))*2-1; k++){
                        System.out.print("  ");
                    }
                    for(int j=0; j<=i && j<n-1; j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            default: 
                System.out.println("No valid choice was selected, Program Ended!");

        }
    }
}