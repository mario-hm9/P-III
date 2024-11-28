public class PostgreSQLDatabaseService extends DatabaseService{
    
    @Override
    public void connect() {
        super.connect();
        System.out.println("I'm a PostgreSQL database...");
    }
    
}
