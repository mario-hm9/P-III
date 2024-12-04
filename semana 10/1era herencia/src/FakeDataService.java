public class FakeDataService extends DataBase{
    
    @Override
    public void connect() {
        super.connect();
        System.out.println("Conectando con FakeDataService");
    }

    public FakeDataService() {
    }
}
