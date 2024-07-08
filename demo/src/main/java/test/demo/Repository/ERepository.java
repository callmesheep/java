package test.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.demo.Entity.Employee;

public interface ERepository extends JpaRepository<Employee,Long> {
}
