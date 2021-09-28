import com.wj.stu.StuApplication;
import com.wj.stu.entity.Employee;
import com.wj.stu.mapper.EmpMapper;
import com.wj.stu.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/28 22:11
 */
@ContextConfiguration(classes = StuApplication.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpTest {

    @Autowired
    private EmpService empService;

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testInsert() {
        Employee employee = new Employee(1,"zhangsan","123@qq.com","m",23,12);
        empService.insertEmp(employee);
    }

    @Test
    public void testDelete(){
       empService.deleteEmp(1);
    }

    @Test
    public void testUpdate(){
        empMapper.updateUserById(2,"whh1","123www","n",22,1);
    }

    @Test
    public void testSelect(){
        List<Employee> employees = empMapper.selectUserById(2);
        System.out.println(employees);
    }

}
