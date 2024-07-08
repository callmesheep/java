package test.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.demo.Entity.Employee;
import test.demo.Service.EService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EController {
    @Autowired
    private EService eService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return eService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> findAllEmployees() {
        return eService.findAllEmployees();
    }

}
