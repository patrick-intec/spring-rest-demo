package be.infernalwhale.springrestdemo.controller;

import be.infernalwhale.springrestdemo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
// The "class"-mapping is additive with the method mappings... So they will be concatenated.
public class WorldController {
    // url that points to my computer and has the application path: /hello
    // I want this url to execute this method...
    // http://127.0.0.1:8080/hello
    // If the url points to a method, we call that url an "endpoint"

//    @RequestMapping(value = "/hello")
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
        Employee boss = new Employee(2, "The", "Boss");
        employee.setBoss(boss);

        ResponseEntity response = new ResponseEntity(employee, HttpStatus.OK);
        return response;
    }

//    @RequestMapping(value = "/mars", method = RequestMethod.POST)
    @PostMapping("/mars")
    public ResponseEntity postExample() {
        return ResponseEntity.ok("Hello From the PostMethod....");
    }

    @PutMapping("/mars")
    public ResponseEntity putExample() {
        return ResponseEntity.internalServerError().body("Hi from the put");
    }

    @GetMapping("/all")
    public ResponseEntity getAllEmployees() {
        return ResponseEntity.ok(List.of(new Employee(1, "firstname", "familyname"), new Employee(2, "firstname", "familyname"), new Employee(3, "firstname", "familyname")));
    }
}
