package com.example.workshop.com.example.workshop.varSimulationModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class VarSimulationController {

    private ValueAtRiskCalulator _varCalculator;

    @Autowired
    public VarSimulationController(ValueAtRiskCalulator varCalculator) {
        this._varCalculator = varCalculator;
    }

    @RequestMapping("/varSimulationModels")
    public List<String> getVARSimulationModels() {
        return Arrays.asList("Monte Carlo", "Var Historical 99% confidence level", "Var Historical 95% confidence level");
    }

    @RequestMapping("/currentSimulationModel")
    public String currentSimulationModelUsed() {
        return this._varCalculator.getSimulationModel();
    }
}
