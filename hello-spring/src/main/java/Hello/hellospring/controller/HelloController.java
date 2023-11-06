package Hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello"; //여기서 resources / templates의 <>.html 을 찾는다 여기선 hello.html을 찾는
    }
    @GetMapping("Hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello-template";
    }
    @GetMapping("hello-string")
    @ResponseBody() //HTml Body 이 데이터를 직접 넣어주겠다 ->이 문자가 그대로 들어간다
    public String hellostring(@RequestParam("name") String name){
        return "hello "+ name;
    }
    @GetMapping("hello-api")
    @ResponseBody //기본이 반환하는게 json이다
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
