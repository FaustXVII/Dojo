package application.beans;

// DI
public class DependencyInjection {
    // @Autowired
    private JavaBean bean;

    public DependencyInjection(final JavaBean bean){
        this.bean = bean;
    }

    public void run(){
        bean.ping();
    }
}
