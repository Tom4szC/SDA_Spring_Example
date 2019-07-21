public class SimpleIntClass {
    private Integer integer1;
    private Integer integer2;

    public Integer getInteger1() {
        return integer1;
    }

    public void setInteger1(Integer integer1) {
        this.integer1 = integer1;
    }

    public Integer getInteger2() {
        return integer2;
    }

    public void setInteger2(Integer integer2) {
        this.integer2 = integer2;
    }

    public void add(){
        System.out.println("Sum of two numbers is: " + (integer1 + integer2));
    }

}
