package org.dp;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.math.BigDecimal;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestContextConfiguration.class)
public class RiskOfficerIntegrationTest extends TestCase {

    @Inject
    private RiskOfficer objectUnderTest;

    @Test
    public void shouldRejectRiskyInvestment(){
        BigDecimal value = BigDecimal.valueOf(100000);
        boolean result = objectUnderTest.valuateDerivativeInvestment(value);
        assertFalse(result);
    }
}
