public class MySQLiteDataBaseService extends DataBase{
    
    @Override
    public void connect() {
        super.connect();
        System.out.println("Conectando con MySQLite");
    }

    public MySQLiteDataBaseService() {
    }
}
