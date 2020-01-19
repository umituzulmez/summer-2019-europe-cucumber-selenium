package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("this is coming from BEFORE");
    }

    @After
    public void tearDown(){

        Driver.closeDriver();
    }

    @After("@store_manager")
    public void tearDownStoreManager(){
        System.out.println("this is coming from AFTER STORE MANAGER");
    }

    @Before("@db")
    public void setUpDataBase(){
        System.out.println("CONNECTION DATABASE");
    }

    @After("@db")
    public void tearDownDataBase(){
        System.out.println("CLOSING DATABASE CONNECTION");
    }

}
