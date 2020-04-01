package spring.vault.config.example;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("springvault.test")
public class Credential {

    private String username;
    private String password;
}