package proxy;

public class DBConnectorImpl implements DBConnector {
    private String database;

    DBConnectorImpl(String database){
        this.database=database;
    }

    @Override
    public void connect() {
        System.out.println("Подключено к базе данных: " + database);
    }

}
