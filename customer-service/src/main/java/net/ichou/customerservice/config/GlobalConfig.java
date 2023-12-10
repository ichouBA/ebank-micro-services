package net.ichou.customerservice.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "global.params")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class GlobalConfig {
    private String p1;
    private String p2;
}
