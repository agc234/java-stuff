public class Fib {
    public static void main(String[] args) {
        int x = fib(5);
        System.out.println(x);
    }


    public static int fib (int n) { 
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return fib(n-1) + fib(n-2);
    }
    
}

// fib(1) -> 1 -> fib(2) -> return 2 -> fib(3)