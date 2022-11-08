package co.edu.uniquindio.comparendo.bean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class RootController {

    @GetMapping
    public void getTest(){

    }

}
