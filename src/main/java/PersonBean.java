import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonBean {
    private String name;

    public PersonBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);

        PersonBean personBean = ctx.getBean(PersonBean.class);
        personBean.setName("Any random name");
        System.out.println(personBean.getName());
    }
}
