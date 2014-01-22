package org.dp;


import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigDecimal;

@Named
public class RiskOfficer {

    private RiskCalculator calculator;

    @Inject
    public void setCalculator(RiskCalculator calculator) {
        this.calculator = calculator;
    }

    public boolean valuateDerivativeInvestment(BigDecimal value) {
        BigDecimal cs01 = calculator.calculateCs01(value);
        return cs01.compareTo(BigDecimal.TEN) > 0;
    }

}
