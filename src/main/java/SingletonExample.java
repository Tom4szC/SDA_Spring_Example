public class SingletonExample {
    Integer singletonInteger1;
    Integer singletonInteger2;
    String message;


    public Integer getSingletonInteger1() {
        return singletonInteger1;
    }

    public void setSingletonInteger1(Integer singletonInteger1) {
        this.singletonInteger1 = singletonInteger1;
    }

    public Integer getSingletonInteger2() {
        return singletonInteger2;
    }

    public void setSingletonInteger2(Integer singletonInteger2) {
        this.singletonInteger2 = singletonInteger2;
    }

    public void information1(){
        System.out.println(singletonInteger1);
    }

    public void information2(){
        System.out.println(singletonInteger2);
    }
    
    public void init(){
        System.out.println("Bean init...");
    }
    
    public void destroy(){
        System.out.println("Bean destroy...");
    }

    public void setMessage(String message) {
    }

    public void printMessage(){
        System.out.println(message);
    }
}
