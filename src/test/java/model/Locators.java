package model;

import org.openqa.selenium.By;

public class Locators {

    public static String homePageUrl = "https://desktop.any.do/";
    
    //signIn with email
    public static By continueEmailBtn = By.xpath("//button[contains(@class,'AppLoginButton AppLoginButton--email')]");
    public static By emailField = By.xpath("//input[@placeholder='your@email.com']");
    public static String emailId = "mh.hassann19@gmail.com";
//    public static By fullName = By.xpath("//input[@placeholder='Full Name']");
//    public static String fullNameText = "Mehedi Hasan";
    public static By emailBtn = By.xpath("//button[contains(@type,'submit')]");
    public static By passField = By.xpath("//input[@type='password']");
    public static String pass = "7yAgSujtVT@zC!N";
    public static By submitBtn = By.xpath("//button[normalize-space()='Sign In']");
    //public static By submitBtn = By.xpath("//button[normalize-space()='Create Account']");
    
    //signIn with google
    //public static By googleBtn = By.xpath("//button[@class='AppLoginButton AppLoginButton--google']");
    
    //signIn with facebook
//    public static By fbLoginBtn = By.xpath("//button[@class='AppLoginButton AppLoginButton--facebook']");
//    public static By emailField = By.xpath("//input[@id='email']");
//    public static By passField = By.xpath("//input[@id='pass']");
//    public static By loginBtn = By.xpath("//button[@id='loginbutton']");
//    public static By continueBtn = By.xpath("//div[contains(class,'rq0escxv l9j0dhe7')]");
//    
//    public static String email = "mh.hassann19@gmail.com";
//    public static String pass = "zxcvbnm123!@#";
    
    //my daily Task
    public static By createBtn = By.xpath("//button[@aria-label='Create a task']");
    public static By wantTo = By.xpath("//div[@class='SmartTypeNewTaskModalTextFieldWrapper__content']//div//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']");
    public static String wantToText = "My Daily Task";
    public static By addTaskBtn = By.xpath("//button[@class='ButtonsBar__button']");
    public static String myDailyTaskText = "My Daily Task";
    public static By myDailyTask = By.xpath("//div[@class='TaskItem__title TaskItem__title--out']");
    
    //my friday task
    //public static By wantTo = By.xpath("//div[@class='SmartTypeNewTaskModalTextFieldWrapper__content']//div//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']");
    public static String FridayText = "My Friday Task";
    public static By fridayInsertNote = By.xpath("//textarea[@class='DynamicTextArea__visibleTextArea fs-hide']");
    public static String fridayInsertText = "Hangout with friends";
    public static By nextWeekBtn = By.xpath("//button[normalize-space()='next week']");
    public static By myFridayTask = By.xpath("//div[contains(text(),'My Friday Task')]");
    
    //sub task
    public static By subTaskBtn = By.xpath("//div[contains(text(),'My Friday Task')]");
    public static By subTaskItemBtn = By.xpath("//div[@class='NewSubTaskItemButton__content']");
    public static By wakeUpEarly = By.xpath("//input[@value='Wake up early']");
    public static String subTaskItemText = "Wake up early";
    public static By subTaskItemBtn2 = By.xpath("//div[@class='NewSubTaskItemButton__mainContent']");
    public static By justClick = By.xpath("//h4[normalize-space()='Subtasks']");
    public static By justClick2 = By.xpath("//div[@class='AppHeader__controls']");
    
    //List
    public static By listIcon = By.xpath("//div[@class='AppSidebarEditButtonsBox']//button[2]");
    public static By nameList = By.xpath("//div[@class='AppSidebarModalTextFieldEditContent__tfContainer']");
    public static By listBtn = By.xpath("//button[@data-qa='APPROVE']");
    public static String listText = "My Shopping List";
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public static String fbLoginPageTitle = "Log in to Facebook | Facebook";
//
//    //homePageTests
//    public static By deals = By.linkText("Deals");
//    public static By customerServiceId = By.id("gh-title");
//    public static String dealsText = "Deals";
//    public static String customerServicesText = "Customer Service";
//    public static By sellingPath = By.xpath("/html/body/div[2]/div[1]/div/div[1]/h1");
//    public static String sellText = "Selling";
//    public static By electronicsPath = By.xpath("/html/body/div[5]/div[2]/h1/span");
//    public static String electronicsText = "Electronics";
//    public static By fashionPath= By.xpath("/html/body/div[5]/div[2]/nav/ol/li[2]/span");
//    public static String fashionText = "Fashion That’s Made for You";
//    public static By healthAndBeautyPath = By.xpath("/html/body/div[5]/div[2]/h1/span");
//    public static String healthAndBeautyText = "Health & Beauty";
//    public static By homeAndGardenPath = By.xpath("/html/body/div[5]/div[2]/nav/ol/li[2]/span");
//    public static String homeAndGardenText = "Home & Garden";
//    public static By sportsPath = By.xpath("/html/body/div[5]/div[2]/nav/ol/li[2]/span");
//    public static String sportsText = "Sporting Goods";
//    public static By collectiblesAndArtPagePath = By.xpath("/html/body/div[5]/div[2]/nav/ol/li[2]/span");
//    public static String collectiblesAndArtPageText = "Collectibles";
//    public static By industrialEquipmentPagePath = By.xpath("/html/body/div[5]/div[2]/nav/ol/li[2]/span");
//    public static String industrialEquipmentPageText = "Business & Industrial";
//    //public static By motorsPagePath = By.xpath("/html/body/div[5]/div[2]/nav/ol/li[2]/span");
//    public static String motorsPageUrl = "https://www.ebay.com/sch/6028/i.html?_from=R40&_nkw=Auto+Parts+Accessories&_blrs=recall_filtering";
//
//    public static By dailyDeals = By.linkText("Daily Deals");
//    public static By helpAndContact = By.linkText("Help & Contact");
//    public static By sell = By.linkText("Sell");
//    public static By electronics = By.linkText("Electronics");
//    public static By fashion = By.linkText("Fashion");
//    public static By healthAndBeauty = By.linkText("Health & Beauty");
//    public static By homeAndGarden = By.linkText("Home & Garden");
//    public static By sports = By.linkText("Sports");
//    public static By collectiblesAndArtPage = By.linkText("Collectibles and Art");
//    public static By industrialEquipmentPage = By.linkText("Industrial equipment");
//    public static By motorsPage = By.linkText("Motors");
//
//    //popular categories
//    public static By sneakers = By.xpath("//*[@id='destinations_list1']/ul/li[1]");
//    public static By koreanBeauty = By.xpath("//*[@id='destinations_list1']/ul/li[2]");
//    public static By wristWatches = By.xpath("//*[@id='destinations_list1']/ul/li[3]");
//    public static By fishing = By.xpath("//*[@id='destinations_list1']/ul/li[4]");
//    public static By collectibles = By.xpath("//*[@id='destinations_list1']/ul/li[5]");
//    public static By smartPhones = By.xpath("//*[@id='destinations_list1']/ul/li[6]");
//    public static By popularSell = By.xpath("//*[@id='destinations_list1']/ul/li[7]");
//
//    public static String sneakersUrl = "https://www.ebay.com/b/Retail-Campaign/bn_7116433159";
//    public static String koreanBeautyUrl = "https://www.ebay.com/b/Korean-Health-and-Beauty/bn_7116437158";
//    public static String wristWatchesUrl = "https://www.ebay.com/b/Wristwatches/31387/bn_2408451";
//    public static String fishingUrl = "https://www.ebay.com/b/Fishing-Equipment-Supplies/1492/bn_1851047";
//    public static String collectiblesUrl = "https://www.ebay.com/b/Collectibles-Art/bn_7000259855";
//    public static String smartPhonesUrl = "https://www.ebay.com/b/Cell-Phones-Smart-Watches-Accessories/15032/bn_1865441";
//    public static String popularSellUrl = "https://export.ebay.com/ru/";
//
//    //Registration
//    public static By registration = By.linkText("Registration");
//    public static By firstSignUpBtn = By.xpath("//*[@id='article_content']/div[2]/div/div/div/div/p[2]/a");
//    public static By secondSignUpBtn = By.xpath("//*[@id='article_content']/div[2]/div[2]/div/div/div/a");
//    public static By signUpPage = By.xpath("//*[@id='mainContent']/div[3]/h1");
//    public static String signUpPageText = "Create an account";
//
//    //Buy
//    public static By moneyBackGuarantee = By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[3]/a");
//    public static By biddingAndBuyingHelp = By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[4]/a");
//    public static By stores = By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[5]/a");
//    public static String moneyBackGuaranteeUrl = "https://pages.ebay.com/ebay-money-back-guarantee/";
//    public static String biddingAndBuyingHelpUrl = "https://www.ebay.com/help/buying";
//    public static String storesUrl = "https://www.ebay.com/b/Stores-HUB/bn_7004224522";
//
//    public static By signIn = By.linkText("Sign in");
//    //public static By fbId = By.id("signin_fb_btn");
//    public static By fbXPath = By.xpath("//*[@id='signin_fb_btn']");
//    public static By googleId = By.id("signin_ggl_btn");




}
