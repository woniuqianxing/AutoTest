package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

//我把类托管到spring中，你帮我组织我不管了，这些活就交给它了
@Controller
@EnableAutoConfiguration
public class SampleController {

    //根目录下访问helloword
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        //入口类
        SpringApplication.run(SampleController.class, args);
    }
}
