public class Singleton {

    private static Singleton _instance;
    private static final Object _lockThis = new Object();

    private Singleton() { }

    public static Singleton getInstance() {
        synchronized (_lockThis) {
            if (_instance == null) _instance = new Singleton();
        }

        return _instance;
    }
}