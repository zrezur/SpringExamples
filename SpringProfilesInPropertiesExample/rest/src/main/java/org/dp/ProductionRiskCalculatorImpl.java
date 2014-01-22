package org.dp;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import javax.inject.Named;
import java.math.BigDecimal;

@Profile(value = SpringProfiles.PRODUCTION)
@Named
public class ProductionRiskCalculatorImpl implements RiskCalculator {

    private static BigDecimal CS01_MULTIPLIER = BigDecimal.valueOf(0.10d);

    public ProductionRiskCalculatorImpl() {
        System.out.println("Initialization ProductionRiskCalculatorImpl");
    }

    @Override
    public BigDecimal calculateCs01(BigDecimal revenue) {
        return CS01_MULTIPLIER.multiply(revenue);
    }
}
