public class No2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) { 
            for (int j = 1; j <= 6; j++) { 
                
                if (j == 1) {
                    System.out.print(i + " "); 
                } else {
                    System.out.print((i + j - 1) + " "); 
                }
            }
            System.out.println(); 
        }
    }
}
