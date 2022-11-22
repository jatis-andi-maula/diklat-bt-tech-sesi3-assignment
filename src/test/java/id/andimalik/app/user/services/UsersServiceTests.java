package id.andimalik.app.user.services;
//package id.andimalik.app.user.services;
//
//import id.andimalik.app.user.entities.Users;
//import id.andimalik.app.user.repositories.UsersRepository;
//import id.andimalik.app.user.services.UsersService;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class UsersServiceTests {
//
//    @InjectMocks
//    UsersService usersService;
//
//    @Mock
//    UsersRepository usersRepository;
//
//    Users users = new Users("admin", "12345");
//
//    @Test
//    void testSaveUserServiceTrue(){
//        Mockito.when(usersRepository.save(users)).thenReturn(users);
//        Assertions.assertSame(usersService.saveUser(users), users);
//    }
//
//
//}
