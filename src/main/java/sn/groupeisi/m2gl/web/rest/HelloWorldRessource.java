package sn.groupeisi.m2gl.web.rest;

import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldRessource {

    @GetMapping("/helloworld")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("je suis MS1-Mamoudou Diallo");
    }
}
