public class No5 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("* "); 
            }

            for (int k = rows - i - 1; k < rows; k++) {
                System.out.print(k + " "); 
            }

            System.out.println(); 
        }
    }
}
