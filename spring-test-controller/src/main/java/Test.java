import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zero on 2016/9/26.
 */
@Controller
@EnableAutoConfiguration
public class Test {
    @RequestMapping("/")
    @ResponseBody
    public String HelloWorld(){
        return "hello world";
    }

}
