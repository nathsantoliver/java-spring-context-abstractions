package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // marks the configuration class
@ComponentScan(basePackages = {"proxies", "services", "repositories"})
public class ProjectConfiguration {
}
