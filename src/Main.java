public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Calculator calculator = new Calculator();
            calculator.scanInput();
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат");
        }

    }
}
