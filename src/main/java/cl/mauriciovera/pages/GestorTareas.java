package cl.mauriciovera.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GestorTareas {
  private WebDriver driver;
  private final WebDriverWait wait;

  // localizadores
  private By titleInput = By.cssSelector("input[placeholder='Título']");
  private By descriptionTextarea = By.cssSelector("textarea[placeholder='Descripción']");

  private By submitButton = By.cssSelector("button[type='submit']");

  private By completeButton = By.xpath("//*[@id=\"root\"]/div/ul/li/div/button[1]");

  // construct solo driver y agregar wait explicito
  public GestorTareas(WebDriver driver) {
    this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
  }

  public String getTitleInput() {
    return driver.findElement(titleInput).getAttribute("value");
  }

  public void setTitleInput(String title) {
    driver.findElement(titleInput).clear();
    driver.findElement(titleInput).sendKeys(title);
  }

  public String getDescriptionTextarea() {
    return driver.findElement(descriptionTextarea).getAttribute("value");
  }

  public void setDescriptionTextarea(String description) {
    driver.findElement(descriptionTextarea).clear();
    driver.findElement(descriptionTextarea).sendKeys(description);
  }

  public void clickSubmitButton() {
    driver.findElement(submitButton).click();
  }

  public boolean isCompleteBtnVisible() {
    WebElement completeBtn = wait.until(driver -> driver.findElement(completeButton));
    return completeBtn.isDisplayed();
  }
  
  public void clickCompleteButton() {
    WebElement completeBtn = wait.until(driver -> driver.findElement(completeButton));
    completeBtn.click();
  }
}
