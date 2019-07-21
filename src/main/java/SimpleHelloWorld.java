import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleHelloWorld {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.setMessage("first object");
        obj.getMessage();

        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
        obj2.getMessage();

        SimpleIntClass obj3 = (SimpleIntClass) context.getBean("simpleInt");
        obj3.add();

        SingletonExample obj4 = (SingletonExample) context.getBean("singletonExample");
        obj4.setSingletonInteger1(5);
        obj4.setSingletonInteger2(10);

        obj4.information1();
        obj4.information2();

        SingletonExample obj5 = (SingletonExample) context.getBean("singletonExample");
        obj5.information1();
        obj5.information2();

    }
}