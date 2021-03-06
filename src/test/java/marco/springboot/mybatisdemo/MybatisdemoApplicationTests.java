package marco.springboot.mybatisdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MybatisdemoApplicationTests {
    @Autowired
    private MockMvc mvc;

    @Test
    public void getStudentById() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/getStudentById/5"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void selectAll() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/selectAll"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
