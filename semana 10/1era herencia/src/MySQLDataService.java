public class MySQLDataService extends DataBase{

    @Override
    public void connect() {
        super.connect();
        System.out.println("Conectando con MySQL");
    }

    public MySQLDataService() {
    }
    
}
