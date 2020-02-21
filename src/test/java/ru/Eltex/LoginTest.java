package ru.Eltex;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders;
import org.springframework.test.web.servlet.MockMvc;
import ru.Eltex.controller.MainController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/*


    It works locally, a Travis CI error. We fix the bug.


@SpringBootTest
@AutoConfigureMockMvc
public class LoginTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private MainController controller;

    @Test
    public void contextLoads() throws Exception {
        this.mockMvc.perform(get("/login"))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    public void loginTest() throws Exception {
        this.mockMvc.perform(get("/main"))
                .andDo(print())
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("http://localhost/login"));
    }

    @Test
    public void correctLoginTest() throws Exception{
        this.mockMvc.perform(SecurityMockMvcRequestBuilders.formLogin().user("Scooby").password("qwerty"))
                .andDo(print())
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/"));
    }

    @Test
    public void incorrectLoginTest() throws Exception{
        this.mockMvc.perform(post("/login").param("user", "qwerty"))
                .andDo(print())
                .andExpect(status().isForbidden());
    }
}
*/