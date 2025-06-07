package singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class TestClass {}
        TestClass testObj = new TestClass();

        Logger logger = Logger.getInstance();
        Logger  logger1= Logger.getInstance();
        System.out.println(logger1.equals(logger));
        logger.classLogg(testObj, "Some info");
    }
}