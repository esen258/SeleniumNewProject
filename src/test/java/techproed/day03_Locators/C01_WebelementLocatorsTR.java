package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebelementLocatorsTR {
    public static void main(String[] args) {
        //before we do our standard browser settings as you see
        //firstly we write our System Class to reach useful class fields and methods and we get setProperty methods
        //to set our driver to the chrome
        // then we maximize our browsers windows size
        //after that we use implicitlyWait methods to the fifteen seconds to wait
        //this method can wait mostly 15 seconds. if our web elements are ready so implicitlyWait method stop waiting
        //and our codes will work

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidelim
        //we go amazon page with our driver object,  we use driver objects get methods
        driver.get("https://www.amazon.com");

        //Arama kutusunu locate edelim
        //(We take searchBox locate address from our Web Sites Html Codes)
       WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        //Arama kutusuna iphone yazdıralım ve aratalım
        //(and we write "iphone" word on the searchBox)
        //(for this process we should use "sendKeys" methods to send requested words)
        //what was the our requested word; i hear your answer as you speak, iphone word
        //and we use Keys. objects Enter methods
        //to press Enter. after that our codes will write n enter
        searchBox.sendKeys("iphone", Keys.ENTER);
        /*

       //second way of this question answer; again we use our driver object
       //and get findElement method to the driver object
       //in the braces we use BY.ID method and we  write our locate address between the Quotation marks:
       //and the next processs, we put dat and get sendKeys method
       //and we send our word and press enter button

       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);





       ( if you use one of the locate address more than one,     you have to assign it to the Webelement variable
        so you can use different methods from the Webelement object)

        Webelement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); şeklinde kullanabiliriz


        1-Locate işlemi bittikten sonra eğer webelemente bir metin göndereceksek sendKeys() methodu kullanırız
        if we send some text to the our locate address we use sendKeys() method..

        2-webelemente tıklayacaksak click() methodu kullanırız
        if we click one of the webelement we use click() method

        3-webelementin üzerindeki yazıyı almak istiyorsak getText() methodunu kullanırız
        if we get text of the webelements we use getText() method

        4-sendKeys() methodundan sonra(yani webElemente metin gönderdikten sonra) Keys.ENTER ile yada
        submit() methodu ile manuel olarak enter yaptığımız gibi otomasyonda da yapabiliriz.
        we can use send keys method to press ENTER button for example TAB button and a lot of Keyboards button
         */

        //and we close our browser via driver objects close method
        //Sayfayı kapatalım
        driver.close();



    }
}