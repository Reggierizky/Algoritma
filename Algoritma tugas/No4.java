public class No4 {
    public static void main(String[] args) {
        int rows = 3;

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= 5; j++) {
                
                if (i % 2 == 1) { 
                    if (j % 2 == 1) { 
                        System.out.print("S "); 
                    } else { 
                        System.out.print("0 "); 
                    }
                } else { 
                    if (j % 2 == 1) { 
                        System.out.print("0 "); 
                    } else { 
                        System.out.print("S "); 
                    }
                }
            }
            System.out.println(); 
        }
    }
}
