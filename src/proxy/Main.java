package proxy;

public class Main {
    public static void main(String[] args) {
        DBConnector connector = new DBConnectorProxy("localhost",5432,"employee");
        connector.connect();
    }
}
