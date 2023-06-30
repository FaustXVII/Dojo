package application.beans;

public class BeanFactory {
    private BeanFactory(){}

    public static JavaBean createBean(){
        // string ENV = ...

        if(/*if test*/true){
            return new BeanMock();
        }

        if(/*@Bean name <-> @Autowired name*/true){
            return new JavaBean();
        }

        return null;
    }
}
