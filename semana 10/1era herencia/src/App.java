import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<DataBase> dataBases = new ArrayList<DataBase>();
        
        dataBases.add(new MySQLDataService());
        dataBases.add(new MySQLiteDataBaseService());
        dataBases.add(new FakeDataService());

        for (DataBase dataBase : dataBases) {
            dataBase.connect();
        }
    }
}
