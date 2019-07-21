public class BeanTemplateExample {
    private String message1;
    private String message2;
    private String message3;

    public BeanTemplateExample(){

    }

    public BeanTemplateExample(String message1, String message2, String message3) {
        this.message1 = message1;
        this.message2 = message2;
        this.message3 = message3;
    }

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public String getMessage3() {
        return message3;
    }

    public void setMessage3(String message3) {
        this.message3 = message3;
    }
    public void printMessage1(){
        System.out.println(message1);
    }
    public void printMessage2(){
        System.out.println(message2);
    }
    public void printMessage3(){
        System.out.println(message3);
    }
}
