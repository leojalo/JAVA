
public class U2 {

   
    public static void main(String[] args) {
        
        
        
        
        
        int[] array1 = {5, 10, 25, 75, 125};
        
        int[] array2 = {50, 100, 250, 750, 25};

        
        
        int sum1 = calculate(array1);
        
        int sum2 = calculate(array2);

        
        System.out.println("array1: " + sum1);
        System.out.println("array2: " + sum2);

       
        if (sum2 != 0) {
            double result = (double) sum1 / sum2;
            System.out.println(": " + result);
        } else {
            System.out.println("No.");
        }
    }

    
    public static int calculate(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
        }
                  }

