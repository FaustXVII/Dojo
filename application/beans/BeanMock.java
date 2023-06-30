package application.beans;

public class BeanMock extends JavaBean{
    private int timesCalled = 0;

    @Override
    public void ping(){
        timesCalled ++;
        System.out.println("Mock!");
    }

    public int getTimesCalled() {
        return timesCalled;
    }
}
