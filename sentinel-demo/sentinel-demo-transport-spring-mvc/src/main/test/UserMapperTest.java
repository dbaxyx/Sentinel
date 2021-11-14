import com.alibaba.csp.sentinel.demo.transport.springmvc.TransportSpringMvcDemoApplication;
import com.alibaba.dao.entity.Users;
import com.alibaba.fastjson.JSON;
import com.alibaba.sentinel.mapper.UsersMapper;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TransportSpringMvcDemoApplication.class)
@EnableAutoConfiguration
@Slf4j
public class UserMapperTest {

    @Resource
    private UsersMapper usersMapper;
    
    @Test
    public void testQueryUser() {
        Users user = usersMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }

}
