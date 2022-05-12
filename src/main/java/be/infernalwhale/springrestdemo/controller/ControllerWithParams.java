package be.infernalwhale.springrestdemo.controller;

import be.infernalwhale.springrestdemo.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class ControllerWithParams {
    // 1st type of parameter: Path Parameters
    // This has to do with the ReST specification...
    // Representational State Transfer

    @GetMapping("/{name}")
    public ResponseEntity getEmployee(@PathVariable String name) {
        return ResponseEntity.internalServerError()
                .body(name + " is too fat, does not fit on UTP cable...");
    }

    @GetMapping("/{firstname}/{familyname}")
    public ResponseEntity getEmployee(@PathVariable String firstname,
                                      @PathVariable String familyname) {
        return ResponseEntity.ok("Fullname: " + firstname + " " + familyname);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity getEmployeeByID(@PathVariable Long id) {
        return ResponseEntity.ok(id);
    }

    // 2nd type: RequestBody
    // only available for POST & PUT methods

    // Example body: {"taxNumber":3,"firstName":"Elvira","familyName":"Debruin"}
    @PutMapping("/id/{id}")
    public ResponseEntity updateEmployee(@PathVariable Long id,
                                         @RequestBody Employee employee) {
        System.out.println(id);
        System.out.println(employee);
        return ResponseEntity.ok(employee.toString());
    }


    // 3rd type: Request Params
}
