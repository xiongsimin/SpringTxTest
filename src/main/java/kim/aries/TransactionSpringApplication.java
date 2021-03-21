package kim.aries;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author aries
 * @Data 2021-03-20
 */
@SpringBootApplication
@ComponentScan(basePackages = "kim.aries.*")
@MapperScan("kim.aries.mapper")
public class TransactionSpringApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(TransactionSpringApplication.class, args);
    }
}
