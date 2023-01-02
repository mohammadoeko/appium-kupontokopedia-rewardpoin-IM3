package setup;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends DriverSetup {
    @Before
    public void before() throws Exception {
        startAppium();
        prepareAutomation();
    }

    @After
    public void after() throws Exception {
        getDriverInstance().quit();
        stopAppium();
    }
}