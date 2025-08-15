package IntegracionBackFront.backfront.Config.Cloudinary;

import com.cloudinary.Cloudinary;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    private String cloudName;
    private String apiKey;
    private String apiSecret;

    @Bean
    public Cloudinary cloudinary(){
        Dotenv
    }
}
