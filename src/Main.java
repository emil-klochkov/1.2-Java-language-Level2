public class Main {
    public static void main(String[] args) {
        System.out.println("Data input test:");

        byte b = InputHandler.readByte("Please enter a byte:");
        System.out.println("Byte entered: " + b);

        int i = InputHandler.readInt("Please enter an integer:");
        System.out.println("Integer entered: " + i);

        float f = InputHandler.readFloat("Please enter a float:");
        System.out.println("Float entered: " + f);

        double d = InputHandler.readDouble("Please enter a double:");
        System.out.println("Double entered: " + d);

        try {
            char c = InputHandler.readChar("Please enter a character:");
            System.out.println("Character entered: " + c);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        String s = InputHandler.readString("Please enter some text:");
        System.out.println("Text entered: " + s);

        boolean response = InputHandler.readYesNo("Do you want to continue?");
        System.out.println("Response: " + (response ? "Yes" : "No"));
    }
}