package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RewardPoin {

    private AndroidDriver driver;

    public RewardPoin() {

    }

    public RewardPoin(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.pure.indosat.care:id/bt_allow")
    private AndroidElement btnBeriAkses;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")
    private AndroidElement iconClose;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private AndroidElement btnAllowPermission;

    @FindBy(id = "com.pure.indosat.care:id/rbLogin")
    private AndroidElement btnLogin;

    @FindBy(id = "com.pure.indosat.care:id/et_mobile")
    private AndroidElement inputNomor;

    @FindBy(id = "com.pure.indosat.care:id/btContinue")
    private AndroidElement btnLanjut;

    @FindBy(id = "com.pure.indosat.care:id/ivNotification")
    private AndroidElement clickLewati;

    @FindBy(id = "com.pure.indosat.care:id/tvLoyaltyAction")
    private AndroidElement clickTukarPoin;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.FrameLayout/android.widget.TextView")
    private AndroidElement btnPestaHadiah;

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"myIM3\"])[4]")
    private AndroidElement btnVoucherTokopedia;

    @FindBy(id = "com.pure.indosat.care:id/tvRedeemPoints")
    private AndroidElement btnTukar;

    @FindBy(id = "com.pure.indosat.care:id/tvOK")
    private AndroidElement btnKonfirmasi;

    @FindBy(id = "com.pure.indosat.care:id/tv_cancel")
    private AndroidElement btnNanti;

    @FindBy(id = "com.pure.indosat.care:id/tvToolbarTitle")
    private AndroidElement txtTukarPoin;

    public void dashboardPage(String nomorTelephone) {
        btnBeriAkses.click();
        //iconClose.click();
        delay(1);
        btnBeriAkses.click();
        btnAllowPermission.click();
        delay(1);
        iconClose.click();
        //btnLogin.click();
        //inputNomor.sendKeys(nomorTelephone);
        //delay(2);
        //btnLanjut.click();
        delay(2);
        clickLewati.click();
        delay(2);
    }

    public void reedemPoinTokopedia() {
        clickTukarPoin.click();
        delay(1);
        btnPestaHadiah.click();
        this.scrollDown();
        btnVoucherTokopedia.click();
        this.scrollDown();
        btnTukar.click();
        delay(1);
        btnKonfirmasi.click();
        btnNanti.click();
    }

    public void loopReedemPoint() {

        for (int i = 0; i<5000; i++) {
            //delay(1);
            btnVoucherTokopedia.click();
            this.scrollDown();
            btnTukar.click();
            //delay(1);
            btnKonfirmasi.click();
            delay(1);
            btnNanti.click();
        }
    }

    public String getTxtTukarPoin() {
        return txtTukarPoin.getText();
    }

    public void scrollDown() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(100000)"));
    }

    public void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
