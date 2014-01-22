package org.dp;


import java.math.BigDecimal;

/**
 * External system responsible for calculating every kind of Risk (cs01, cva, var).
 */
public interface RiskCalculator {

    public BigDecimal calculateCs01(BigDecimal revenue);
}
