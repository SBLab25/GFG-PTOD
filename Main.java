import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        StringBuilder output = new StringBuilder();
        while (t-- > 0) {
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long d = scanner.nextLong();

            long a = 0;
            boolean found = true;

                        for (int i = 0; i <= 61; i++) {
                long mask = 1L << i;
                
                long bi = b & mask;
                long ci = c & mask;
                long di = d & mask;

                if (di == 0) {
                    
                    if (bi != 0 && ci == 0) {
                        found = false;
                        break;
                    }
                } else {
                   
                    if (bi == 0 && ci != 0) {
                        found = false;
                        break;
                    }
                    if (bi == 0 && ci == 0) {
                        a |= mask;
                    }
                }
            }
            
            if (found) {
                output.append(a).append("\n");
            } else {
                output.append("-1\n");
            }
        }

        System.out.print(output);
        scanner.close();
    }
}
