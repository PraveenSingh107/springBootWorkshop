package com.example.workshop.com.example.workshop.varSimulationModel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("historical")
@Component
public class VarHistoricalSimulationModel implements ValueAtRiskCalulator{

    @Value("${historicalSimulation.calculationMethod}")
    private String _simulationModel;

    @Override
    public String getSimulationModel() {
        return this._simulationModel;
    }
}
