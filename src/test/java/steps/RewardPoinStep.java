package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.RewardPoin;
import setup.DriverPool;

public class RewardPoinStep {

    RewardPoin rewardPoin = new RewardPoin(DriverPool.getDriverInstance());

    @When("^TCC.001.RewardPoin.User login masuk dashboard$")
    public void tcc_001_reward_poin_user_login_masuk_dashboard() throws Throwable {
        rewardPoin.dashboardPage("85733643057");
    }

    @And("^TCC.001.RewardPoin.User reedem poin tokopedia$")
    public void tcc_001_reward_poin_user_reedem_poin_tokopedia() throws Throwable {
        rewardPoin.reedemPoinTokopedia();
        rewardPoin.loopReedemPoint();
    }

    @Then("^TCC.001.RewardPoin.User menampilkan tukar poin$")
    public void tcc_001_reward_poin_user_menampilkan_tukar_poin() throws Throwable {
        Assert.assertEquals(rewardPoin.getTxtTukarPoin(),"Tukar poin");
    }
}
