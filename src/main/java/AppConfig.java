import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope("prototype")//Scope("prototype") → Каждый раз, когда кому-то нужна ссылка на ваш компонент, Spring создает новый.
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setMessage("Cat !");
        return cat;
    }
}