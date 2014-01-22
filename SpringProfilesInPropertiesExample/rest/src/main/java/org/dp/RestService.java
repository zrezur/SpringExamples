package org.dp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.math.BigDecimal;

@Controller
@RequestMapping("/service")
public class RestService {

    private RiskOfficer riskOfficer;

    @Inject
    public void setRiskOfficer(RiskOfficer riskOfficer) {
        this.riskOfficer = riskOfficer;
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public @ResponseBody
    String handleRequest() {

        return "RiskOfiicer said "+riskOfficer.valuateDerivativeInvestment(BigDecimal.valueOf(100000)) ;
    }

}
