package org.dp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = SpringProfiles.TEST)
public class TestMockConfiguration {

    @Bean
    public RiskCalculator getRiskCalculator() {
        return new StubRiskCalculatorImpl();
    }
}
