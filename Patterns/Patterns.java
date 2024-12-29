public class Patterns {
    public void pattern1(int n) {
        System.out.println("Pattern 1 ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void pattern2(int n) {
        System.out.println("Pattern 2 ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3(int n) {
        System.out.println("Pattern 3 ");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    
    public void pattern4(int n) {
        System.out.println("Pattern 4 ");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    public void pattern5(int n) {
        System.out.println("Pattern 5 ");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void pattern6(int n) {
        System.out.println("Pattern 6 ");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public void pattern7(int n) {
        System.out.println("Pattern 7");
        for (int i = 0; i < n; i++) {
            //(space, star, space)
            //space - j<n-i-1  --> n = 5 i=0 j=5-0-1 = 4 space 
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            //star - j<2*i+1  -->  i=0 j=2*0+1 = 0+1 = 1
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            //space - j<n-i-1  --> n = 5 i=0 j=5-0-1 = 4 space 
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public void pattern8(int n) {
        System.out.println("Pattern 8");
        for (int i = 0; i<n; i++) {
            //(space, star, space)
            //space - j<n-i-1  --> n = 5 i=0 j=5-0-1 = 4 space 
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //star - j<2*i+1  -->  i=0 j=2*0+1 = 0+1 = 1
            for (int j = 0; j < 2*n-(2 * i + 1); j++) {
                System.out.print("*");
            }

            //space - j<n-i-1  --> n = 5 i=0 j=5-0-1 = 4 space 
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public void pattern9(int n) {
        System.out.println("Pattern 9");
        pattern7(n);
        pattern8(n);
    }
    
    public void pattern10(int n) {
        System.out.println("pattern 10");
        for (int i = 1; i < 2 * n + 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void pattern11(int n) {
        System.out.println("Pattern 11");
        for (int i = 0; i < n; i++) {
            int start = 1;
            if (i % 2 != 0)
                start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
   
    public void pattern12(int n) {
        int space = 2 * (n - 1);
        System.out.println("Pattern 12");
        for (int i = 1; i <= n; i++) {
            //count --> i 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //space 
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //count --> in reverse
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
            space -= 2;
        }
    }
   
    public void pattern13(int n) {
        System.out.println("Pattern 13");
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    
    public void pattern14(int n) {
        System.out.println("Pattern 14");
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
    public void pattern15(int n) {
        System.out.println("Pattern 15");
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
   
    public void pattern16(int n) {
        System.out.println("Pattern 16");
        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();

        }
    }
   
    public void pattern17(int n) {
        System.out.println("Pattern 17");
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            //char
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for (int j = 1; j <=2*i+1; j++) {
                System.out.print(ch);
                if (j <= breakPoint)
                    ch++;
                else ch--;
            }

            //space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern18(int n) {
        System.out.println("Pattern 18");
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
    public void pattern19(int n) {
        System.out.println("Pattern 19");
        int space = 0;
        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
        //reverse
        space = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }

    }
    
    public void pattern20(int n) {
        System.out.println("Pattern 20");
        int spaces = 2 * n - 2;
        
        for (int i = 1; i <= 2*n-1; i++) {

            int star = i;
            if (i > n)
                star = 2*n - i;
            //stars
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            if (i < n)
                spaces-=2;
            else
                spaces+=2;
            System.out.println();

        }
    }

    public void pattern21(int n) {
        System.out.println("Pattern 21");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public void pattern22(int n) {
        System.out.println("Pattern 22");
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top = i, left = j, right = (2*n-2)-j, down = (2*n-2)-i;
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
            }
            System.out.println();
            }
            
        }
    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.pattern1(4);
        p.pattern2(4);
        p.pattern3(4);
        p.pattern4(4);
        p.pattern5(5);
        p.pattern6(5);
        p.pattern7(5);
        p.pattern8(5);
        p.pattern9(5);
        p.pattern10(5);
        p.pattern11(5);
        p.pattern12(5);
        p.pattern13(5);
        p.pattern14(5);
        p.pattern15(5);
        p.pattern16(5);
        p.pattern17(5);
        p.pattern18(5);
        p.pattern19(5);
        p.pattern20(5);
        p.pattern21(4);
        p.pattern22(4);
    }
}