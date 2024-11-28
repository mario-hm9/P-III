import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<DatabaseService> databaseServices = new ArrayList<>();
        
        databaseServices.add(new PostgreSQLDatabaseService());
        databaseServices.add(new MySQLDatabaseService());


        for (DatabaseService db : databaseServices) {
            db.connect();
            System.out.println("===================================");
        }

    
    }
}
