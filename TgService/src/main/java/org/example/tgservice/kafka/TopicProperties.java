package org.example.tgservice.kafka;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "kafka")
@Getter
@Setter
public class TopicProperties {

    @NonNull
    private String bdTopic;
    @NonNull
    private String serviceTopic;

}
