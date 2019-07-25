import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public PersonBean personBean() {
        return new PersonBean();
    }

@Bean
    public CStartEventHandler cStartEventHandler(){
        return new CStartEventHandler();
}

@Bean
    public CStopEventHandler cStopEventHandler(){
        return new CStopEventHandler();
}

@Bean
    public CRefreshEventHandler cRefreshEventHandler(){
        return new CRefreshEventHandler();
}

}
