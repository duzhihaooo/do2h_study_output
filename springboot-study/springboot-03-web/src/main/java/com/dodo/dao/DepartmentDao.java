package com.dodo.dao;

import com.dodo.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//部门dao
@Repository //被springIoc容器托管 后续可以直接使用@Autowired进行自动注入
public class DepartmentDao {

    //模拟数据库中的数据
    //建立一个所有部门表
    private static Map<Integer, Department> departments;

    static {
        departments = new HashMap<Integer,Department>();    //创建一个部门表

        departments.put(101, new Department(101,"教学部"));
        departments.put(102, new Department(102,"行政部"));
        departments.put(103, new Department(103,"体育部"));
        departments.put(104, new Department(104,"后勤部"));
        departments.put(105, new Department(105,"小卖部"));
    }

    //获得所有部门信息
    public Collection<Department> getAllDepartments(){
        return departments.values();
    }

    //通过id得到部门
    public Department getDepartmentById(Integer id){
        return departments.get(id);
     }



}