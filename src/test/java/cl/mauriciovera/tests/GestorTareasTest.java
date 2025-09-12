package cl.mauriciovera.tests;

// import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cl.mauriciovera.pages.GestorTareas;
import io.github.bonigarcia.wdm.WebDriverManager;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GestorTareasTest {

  private WebDriver driver;
  private String baseUrl = "https://gestasks.vercel.app/";

  private GestorTareas gestorTareas; // pages

  @BeforeAll
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    System.setProperty("file.encoding", "UTF-8");
  }

  @BeforeEach
  public void init() {
    driver = new ChromeDriver();
    driver.get(baseUrl);
    driver.manage().window().maximize();
    gestorTareas = new GestorTareas(driver);
  }

  /* @AfterEach
  void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  } */

  @Test
  public void testCrearTarea() {
    //Given
    String title = "Tarea de prueba";
    String description = "Descripcion de la tarea";
    //When
    gestorTareas.setTitleInput(title);
    gestorTareas.setDescriptionTextarea(description);
    gestorTareas.clickSubmitButton();

    //gestorTareas.clickCompleteButton();
    //Then
    assertTrue(gestorTareas.isCompleteBtnVisible());

  }
}
