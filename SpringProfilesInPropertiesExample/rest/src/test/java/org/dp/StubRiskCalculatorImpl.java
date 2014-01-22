package org.dp;

import java.math.BigDecimal;

public class StubRiskCalculatorImpl implements RiskCalculator {

    private static final BigDecimal RESULT = new BigDecimal(0.5d);

    @Override
    public BigDecimal calculateCs01(BigDecimal revenue) {
        return RESULT;
    }
}
