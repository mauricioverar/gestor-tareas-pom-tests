package cl.mauriciovera.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GestorTareas {
  private WebDriver driver; // instancia
  private final WebDriverWait wait; // var

  // identificadores
  private By titleInput = By.cssSelector("input[placeholder='Título']");
  private By descriptionTextarea = By.cssSelector("textarea[placeholder='Descripción']");

  private By submitButton = By.cssSelector("button[type='submit']");

  // button[text()='Completar']
  private By completeButton = By.xpath("//button[text()='Completar'");

  // construct solo driver y agregar wait explicito
  public GestorTareas(WebDriver driver) {
    this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // wait explicito
  }

  public By getTitleInput() {
    return titleInput;
  }

  public void setTitleInput(By titleInput) {
    this.titleInput = titleInput;
  }

  public By getDescriptionTextarea() {
    return descriptionTextarea;
  }

  public void setDescriptionTextarea(By descriptionTextarea) {
    this.descriptionTextarea = descriptionTextarea;
  }

  public void clickSubmitButton() {
    driver.findElement(submitButton).click();
  }
  
  public void clickCompleteButton() {
    WebElement completeBtn = wait.until(driver -> driver.findElement(completeButton));
    completeBtn.click();
  }
}
