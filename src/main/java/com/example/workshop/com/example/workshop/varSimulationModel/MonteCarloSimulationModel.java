package com.example.workshop.com.example.workshop.varSimulationModel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("monteCarlo")
@Component
public class MonteCarloSimulationModel implements ValueAtRiskCalulator {

    @Value("${monteCarlo.calculationMethod}")
    private String _varCalculationMethod;

    @Override
    public String getSimulationModel() {
        return this._varCalculationMethod;
    }
}
