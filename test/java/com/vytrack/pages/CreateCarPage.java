package com.vytrack.pages;

import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCarPage extends BasePage{

    @FindBy(css = "[title='Create Car']")
    private WebElement createCarBtn;

    @FindBy(name = "custom_entity_type[LicensePlate]")
    private WebElement licencePlateInputBox;

    @FindBy(name = "custom_entity_type[ModelYear]")
    private WebElement modelYearInputBox;

    public void clickOnCreateCar(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(createCarBtn)).click();
        System.out.println("Clicking on 'Create car' button");

    }

    public void enterLicencePlate(String licencePlate){
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        //wait.until(ExpectedConditions.visibilityOf(licencePlateInputBox));
        //licencePlateInputBox.clear();
       // licencePlateInputBox.sendKeys(licencePlate);
        BrowserUtils.enterText(licencePlateInputBox,licencePlate);

        /**
         * sometimes, for very longs string webdriver might enter text not fully.
         */
    }

    public void enterModelYear(String modelYear){
        BrowserUtils.enterText(modelYearInputBox, modelYear);
    }
}