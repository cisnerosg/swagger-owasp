package config;
import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("gire-demo")
                        .description("Spring Boot REST API Example")
                        .version("0.1.0-SNAPSHOT")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

}