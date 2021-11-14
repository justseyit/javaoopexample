public class SingletonEager {

    //Uygulama başlar başlamaz sınıftan yeni bir nesne oluşturulur.
    private static SingletonEager instance = new SingletonEager();
    
    private SingletonEager() {}
    
    public static SingletonEager getInstance() {
        return instance;
    }
}
