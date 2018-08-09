import java.io.PrintStream;

/**...*/
public class FirstGradleClass {
    public static void main(String[] args) {
        print(System.out);
    }

    public static void print(PrintStream out) {
        out.println("Hejsan världen!");
        out.flush();
    }
}
