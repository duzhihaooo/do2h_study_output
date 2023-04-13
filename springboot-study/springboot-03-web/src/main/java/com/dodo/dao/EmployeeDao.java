package com.dodo.dao;

import com.dodo.pojo.Department;
import com.dodo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//员工dao
@Repository //使用该注解使其被spring托管，才能使用@Autowired注解
public class EmployeeDao {

    //模拟数据库中的数据
    //建立员工表
    private static Map<Integer, Employee> employees;

    //员工所属部门
    @Autowired
    private static DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer,Employee>();

        employees.put(1, new Employee(1,"dodo","123@qq.com",1,new Department(101,"教学部")));
        employees.put(2, new Employee(2,"wonder","add@qq.com",0,new Department(102,"行政部")));
        employees.put(3, new Employee(3,"jack","901@qq.com",1,new Department(103,"体育部")));
        employees.put(4, new Employee(4,"lucy","onion@163.com",0,new Department(104,"后勤部")));
        employees.put(5, new Employee(5,"Lee","seeeex@gmail.com",1,new Department(105,"小卖部")));
    }

    //获得所有员工信息
    public Collection<Employee> getAllEmployee(){
        return employees.values();
    }

    //主键自增
    private static Integer intId = 6;

    //增加员工
    public void save(Employee employee){
        if (employee.getId() == null){
            employee.setId(intId++);
        }

        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        //将新员工增添员工表
        employees.put(employee.getId(), employee);
    }

    //删除员工
    public void delete(Integer id){
        employees.remove(id);
    }

    //通过id查找员工
    public Employee findById(Integer id){
        return employees.get(id);
    }

}