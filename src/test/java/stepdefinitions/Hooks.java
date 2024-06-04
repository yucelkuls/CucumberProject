package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import javax.swing.*;

public class Hooks {//Bu class tekrarli kullanilacak before ve after methodlari icindir.

    @Before//Her senaryo oncesi calisir.  >>import io.cucumber.java.Before;
    public void setUp(Scenario scenario){
        System.out.println("Scenario Name: "+scenario.getName());
        System.out.println("Scenario ID: "+scenario.getId());
    }

    @After//Her senaryo sonrasi calisir.
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){//Scenario failed olursa bu kod blogu calisir.
            System.out.println("Senaryo başarısız oldu");
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Başarısız Senaryo Ekran Görüntüsü");
            Driver.closeDriver();
        }

    }

    @Before("@Smoke")//Her @Smoke senaryo oncesi calisir.
    public void smokeSetUp(Scenario scenario){
        System.out.println("*********Smoke Test Scenariosu**********");

    }

}
