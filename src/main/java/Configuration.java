import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public PersonBean personBean() {
        return new PersonBean();
    }



}
