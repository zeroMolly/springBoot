import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zero on 2016/9/26.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Main {
    public static void main(String[] strs){
        SpringApplication.run(Main.class,strs);
    }
}
