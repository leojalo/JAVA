public class Java_Uppgifter_3 {
    public static void main(String[] args) {
        
        int intValue = 100;
        double doubleValue = 99.99;
        float floatValue = 25.5f;
        char charValue = 'A';
        byte byteValue = 10;

        // värdena
        System.out.println("Originalvärden:");
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("float: " + floatValue);
        System.out.println("char: " + charValue);
        System.out.println("byte: " + byteValue);

        // resultaten
        double intToDouble = intValue;
        double floatToDouble = floatValue;
        int doubleToInt = (int) doubleValue;
        int charToInt = charValue;
        byte intToByte = (byte) intValue;

        System.out.println("\nvärdena:");
        System.out.println("int -> double: " + intToDouble);
        System.out.println("float -> double: " + floatToDouble);
        System.out.println("double -> int: " + doubleToInt);
        System.out.println("char -> int: " + charToInt);
        System.out.println("int -> byte: " + intToByte);
    }
}