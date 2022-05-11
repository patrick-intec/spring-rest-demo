package be.infernalwhale.springrestdemo.controller;

import be.infernalwhale.springrestdemo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/hello")
// The "class"-mapping is additive with the method mappings... So they will be concatenated.
public class WorldController {
    // url that points to my computer and has the application path: /hello
    // I want this url to execute this method...
    // http://127.0.0.1:8080/hello
    // If the url points to a method, we call that url an "endpoint"

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/world")
    public ResponseEntity helloWorld() {
        System.out.println("Executing the helloWorld() method...");
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/mars")
    public ResponseEntity helloMars() {
//        try {
//            String returnValue = callMethodInServiceLevel();
//            return ResponseEntity.ok(returnValue);
//        } catch (SQLException exception) {
//            return ResponseEntity.internalServerError().body("Could not connect to database.");
//        }

        Employee employee = new Employee(1, "Kevin", "Debruin");

        ResponseEntity response = new ResponseEntity(employee, HttpStatus.OK);
        return response;
    }
}
