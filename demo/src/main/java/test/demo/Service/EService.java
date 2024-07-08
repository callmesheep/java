package test.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import test.demo.Entity.Employee;
import test.demo.Repository.ERepository;

import java.util.List;

public class EService {
    @Autowired
    private  ERepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
