import bean.Cat;
import bean.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    @Scope("singleton") // по умолчанию, можно опустить
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope("prototype") // каждый раз будет новый
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("Boris " + System.currentTimeMillis());
        return cat;
    }
}