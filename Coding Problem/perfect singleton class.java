public class Single{
    private static volatile Single instance;
    
    private Single(){
        if(instance == null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }
    
    public static Single getInstance(){
        if(instance == null){
            synchronized(Single.class){
                if(instance == null){
                    instance = new Single();
                }
            }
        }
        return instance;
    }
    protected Single readResolve() {
        return getInstance();
    }
}