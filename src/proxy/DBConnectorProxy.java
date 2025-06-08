package proxy;

public class DBConnectorProxy implements DBConnector {
    private DBConnectorImpl connector;
    private String host;
    private int port;
    private String database;

    public DBConnectorProxy(String host, int port, String database) {
        this.host = host;
        this.port = port;
        this.database = database;
    }

    @Override
    public void connect() {
        if(connector == null){
            String url = host + ":" + port + "/" + database;
            connector = new DBConnectorImpl(url);
        }
        connector.connect();
    }
}
