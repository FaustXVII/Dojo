package application.beans;

public class SingletonBean extends JavaBean{
    private static SingletonBean bean = new SingletonBean();

    private SingletonBean(){}

    public static SingletonBean getInstance(){
        return bean;
    }

    // ^ Singleton logic

    @Override
    public void ping(){
        System.out.println("Ping form singleton");
    }

}
