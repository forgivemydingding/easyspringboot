package com.demo.easy.springboot.demo;

import com.demo.easy.springboot.controller.Demo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author by liu.hongda
 * @Description TODO
 * @Date 2019/7/1 17:13
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class DemoTest {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc=MockMvcBuilders.standaloneSetup(new Demo()).build();
    }

    @Test
    public void testHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Spring Boot Hello World!")));
    }

}
