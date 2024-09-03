
public class Java_Uppgifter_7 {
        
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

        
        System.out.print("Array innehåller: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); 

      
        System.out.println("Första siffran: " + numbers[0]);
        System.out.println("Sista siffran: " + numbers[numbers.length - 1]);

     
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("alla siffror: " + sum);

        
        int result = sum / 2;
        System.out.println("delad på 2: " + result);
    }
}
