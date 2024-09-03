public class Java_Uppgifter_5 {
    public static void main(String[] args) {
        
        int poäng = 26;
        
        
        int vitsord;

      
        if (poäng >= 90 && poäng <= 100) {
            vitsord = 5;
            System.out.println("Vitsord: 5 - BESTEST !");
        } else if (poäng >= 80 && poäng < 90) {
            vitsord = 4;
            System.out.println("Vitsord: 4 - very good !");
        } else if (poäng >= 70 && poäng < 80) {
            vitsord = 3;
            System.out.println("Vitsord: 3 - good!");
        } else if (poäng >= 60 && poäng < 70) {
            vitsord = 2;
            System.out.println("Vitsord: 2 - Barely accepted.");
        } else if (poäng >= 25 && poäng < 60) {
            vitsord = 1;
            System.out.println("Vitsord: 1 - Shitty.");
        } else if (poäng >= 0 && poäng < 25) {
            vitsord = 0;
            System.out.println("Vitsord: 0 - Absolutely Terrible.");
        } else {
            System.out.println("Ogiltig poäng. poäng mellan 0 och 100.");
        }
    }
}
