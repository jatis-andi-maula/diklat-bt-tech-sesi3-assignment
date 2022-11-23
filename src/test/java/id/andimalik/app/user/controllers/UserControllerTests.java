package id.andimalik.app.user.controllers;
//package id.andimalik.app.user.controllers;
//
//import id.andimalik.app.user.entities.Users;
//import org.junit.jupiter.api.Test;
//import org.springframework.http.MediaType;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//public class UsersControllerTests extends BaseControllerTests{
//
//    Users users = new Users("admin", "12345");
//
//    @Test
//    void testSaveUserTrue() throws Exception {
//        mockMvc.perform(post("/users")
//                        .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(users))
//        ).andExpect(status().isCreated())
//                .andDo(print());
//    }
//
//}
