package com.mahesh.practice.cucumber.stepdefs;

import com.mahesh.practice.HelloMicroServicesApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HelloMicroServicesApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
