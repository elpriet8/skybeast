package skybeast.pilot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class holamundo {
    
    @GetMapping("/api/v1/holamundo")
    public ResponseEntity<String> holaMundo(){
        String res = "hola mundo";
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
