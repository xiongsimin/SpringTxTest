import kim.aries.TransactionSpringApplication;
import kim.aries.modal.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author aries
 * @Data 2021-03-20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TransactionSpringApplication.class)
public class TestUser {
    @Value("${server.port}")
    private int port;
    private URL base;

    @Autowired
    private RestTemplate restTemplate;

    @Before
    public void setUp() throws MalformedURLException {
        String url = String.format("http://localhost:%d/", port);
        base = new URL(url);
    }

    @Test
    public void testInsertUser() {
        ResponseEntity<User> result = restTemplate.postForEntity(base + "/tx/user", null, User.class);
        System.out.println(result.getBody());
    }

    @Test
    public void testInsertUser1() {
        ResponseEntity<User> result = restTemplate.postForEntity(base + "/tx/user1", null, User.class);
        System.out.println(result.getBody());
    }


}
