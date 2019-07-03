package com.demo.easy.springboot.demo;

import com.demo.easy.springboot.controller.Demo;
import com.demo.easy.springboot.pojo.ConfigPrefixIsTest;
import com.demo.easy.springboot.pojo.ConfigProperties;
import lombok.AllArgsConstructor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

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
@AllArgsConstructor
public class DemoTest {

    private MockMvc mvc;

    private final ConfigPrefixIsTest configPrefixIsTest;

    private final ConfigProperties configProperties;

    @Before
    public void setUp() throws Exception {
        mvc=MockMvcBuilders.standaloneSetup(new Demo()).build();
    }

    @Test
    public void testHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("testDemo")));
    }

    @Test
    public void testParam(){
        configPrefixIsTest.getA();
        configProperties.getName();
    }

}
