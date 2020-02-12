package ru.Eltex;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders;
import org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import ru.Eltex.controller.MainController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@WithUserDetails(value = "testuser1")
@TestPropertySource("/test.properties")
@Sql(value = {"/create-user-before.sql", "/reservations-list-before.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
@Sql(value = {"/reservations-list-after.sql", "/create-user-after.sql"}, executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
public class MainTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private MainController controller;

    @Test
    public void contextLoadsPage() throws Exception {
        this.mockMvc.perform(get("/main"))
                .andDo(print())
                .andExpect(SecurityMockMvcResultMatchers.authenticated())
                .andExpect(xpath("//div[@id='navbarSupportedContent']/div").string("testuser1"));

    }

    @Test
    public void reservationListTest() throws Exception {
        this.mockMvc.perform(get("/main"))
                .andDo(print())
                .andExpect(SecurityMockMvcResultMatchers.authenticated())
                .andExpect(xpath("//div[@id='reservations']/div").nodeCount(5));
    }

    @Test
    public void filterDMessageTest1() throws Exception {
        this.mockMvc.perform(get("/main").param("filterD", "22.01.20"))
                .andDo(print())
                .andExpect(SecurityMockMvcResultMatchers.authenticated())
                .andExpect(xpath("//*[@id='reservations']/div").nodeCount(3))
                .andExpect(xpath("//*[@id='reservations']/div[@data-id='1']").exists())
                .andExpect(xpath("//*[@id='reservations']/div[@data-id='2']").exists())
                .andExpect(xpath("//*[@id='reservations']/div[@data-id='3']").exists());
    }
    @Test
    public void filterDMessageTest2() throws Exception {
        this.mockMvc.perform(get("/main").param("filterD", "22.01.21"))
                .andDo(print())
                .andExpect(SecurityMockMvcResultMatchers.authenticated())
                .andExpect(xpath("//*[@id='reservations']/div").nodeCount(0));
    }
    @Test
    public void filterDMessageTest3() throws Exception {
        this.mockMvc.perform(get("/main").param("filterD", ""))
                .andDo(print())
                .andExpect(SecurityMockMvcResultMatchers.authenticated())
                .andExpect(xpath("//*[@id='reservations']/div").nodeCount(5));
    }
    @Test
    public void filterMessageTest1() throws Exception {
        this.mockMvc.perform(get("/main").param("filter", ""))
                .andDo(print())
                .andExpect(SecurityMockMvcResultMatchers.authenticated())
                .andExpect(xpath("//*[@id='reservations']/div").nodeCount(5));
    }
    @Test
    public void filterMessageTest2() throws Exception {
        this.mockMvc.perform(get("/main").param("filter", "2"))
                .andDo(print())
                .andExpect(SecurityMockMvcResultMatchers.authenticated())
                .andExpect(xpath("//*[@id='reservations']/div").nodeCount(2))
                .andExpect(xpath("//*[@id='reservations']/div[@data-id='1']").exists())
                .andExpect(xpath("//*[@id='reservations']/div[@data-id='4']").exists());
    }
    @Test
    public void filterMessageTest3() throws Exception {
        this.mockMvc.perform(get("/main").param("filter", "20"))
                .andDo(print())
                .andExpect(SecurityMockMvcResultMatchers.authenticated())
                .andExpect(xpath("//*[@id='reservations']/div").nodeCount(0));
    }


}
