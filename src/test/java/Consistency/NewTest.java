package Consistency;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class NewTest {
    Properties prop;
    WebDriver driver;
  @Test
    public void openGoogle() throws IOException {
 prop = new Properties();
      FileInputStream fs=new FileInputStream("/Users/vishnugopal/IdeaProjects/MavenLearn/src/main/java/Properties.properties");
  prop.load(fs);
  //String brow = prop.getProperty("browser");

      String brow = System.getProperty("browser");
      System.out.println(brow);
  if(brow.equalsIgnoreCase("chrome"))
  {
      System.setProperty("webdriver.chrome.driver","/Users/vishnugopal/Downloads/chromedriver");
      driver = new ChromeDriver();
    driver.get("https://www.google.com");
  }
  else if(brow.equals("firefox"))
  {
      System.setProperty("webdriver.gecko.driver","/Users/vishnugopal/Downloads/geckodriver");
      driver = new FirefoxDriver();
      driver.get("https://www.google.com");
  }




   }


}
