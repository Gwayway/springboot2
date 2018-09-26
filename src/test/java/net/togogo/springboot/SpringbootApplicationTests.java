package net.togogo.springboot;

import net.togogo.springboot.bean.person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
    private net.togogo.springboot.bean.person person;
    @Test
    public void contextLoads() {
        System.out.print("good"+person);
    }

}
