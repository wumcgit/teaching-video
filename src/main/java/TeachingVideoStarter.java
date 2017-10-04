import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TeachingVideoStarter
 *
 * @author MaoChang Wu
 * @date 2017/10/04 11:33
 */
@EnableDiscoveryClient
@SpringBootApplication
public class TeachingVideoStarter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TeachingVideoStarter.class, args);
    }
}
