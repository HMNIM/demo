package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class EmployeeService {
        HashMap<String, Employee> myemp = new HashMap<String, Employee>();
        public EmployeeService()
        {
          Employee e = new Employee();
          e.setId("1");
          e.setName("Cathy");
          e.setSalary(5000);
          myemp.put("1", e);
          e = new Employee();
          e.setId("2");
          e.setName("Joan");
          e.setSalary(4000);
          myemp.put("2", e);
          e = new Employee();
          e.setId("3");
          e.setName("Karen");
          e.setSalary(7000);
          myemp.put("3", e);
        }

        public HashMap<String, Employee> getAll()
        {
            return myemp;
        }

        public Employee getEmpId(String Id)
        {
            if(myemp.containsKey(Id))
            {
                return myemp.get(Id);
            }
            else{
                return  null;
            }
        }
}
