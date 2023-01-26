package TestAutomation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestAutomation.helpers.BasePage;
import TestAutomation.helpers.Config;
import TestAutomation.helpers.WaitHelper;

public class LCAPHomePage extends BasePage
{
	
		
	@FindBy(id  = "Screens")
	private WebElement screenButton;
	
	@FindBy(id="folderIcon_MainLayoutGroup")
	private WebElement mainLayoutArrow;
	
	@FindBy(id  = "screens_panel_container_Homepage")
	private WebElement homePageClick;
	
	
	@FindBy(id  = "editor-sidebar_elements")
	private WebElement editorSidebarElements;
	
	@FindBy(id  = "elements_panel_Base")
	private WebElement elementsPanelBase;
	
	@FindBy(id  = "Base_Container")
	private WebElement baseContainer;

	@FindBy(xpath  = "(//div[starts-with(@id,'dropzone')])[2]")
	private WebElement dropContainer;
	
	@FindBy(xpath  = "(//div[starts-with(@id,'dropzone')])[2]")
	private WebElement acceptAll;
	
	
	//Pro locators
	
	@FindBy(xpath  = "//div[@title='Explorer']")
	private WebElement projectExplorer;
	
	@FindBy(xpath  = "//*[contains(text(),'Business Logic')]")
	private WebElement businessLogic;
	
	@FindBy(xpath  = "//span[contains(text(),'Server Flows')]")
	private WebElement serverFlows;
	
	@FindBy(xpath  = "//span[contains(text(),'Global Flows')]")
	private WebElement globalFlows;
	
	@FindBy(xpath  = "//i[@class='fa-caret-square-right fa-sm far']")
	private WebElement serverFlowselect;
	
	@FindBy(xpath  = "//i[@title='Zoom In']")
	private WebElement zoomInButton;
	
	
	@FindBy(xpath  = "//div[@class='palette-icons ng-star-inserted']/following-sibling::div[2]")
	private WebElement aPI;
	
	@FindBy(xpath  = "//canvas[@class='graph-canvas clickable-area']")
	private WebElement canvas;
	
	
	@FindBy(xpath  = "//button[@data-testid='uc-deny-all-button']")
	private WebElement pyurAccept;
	
	
	
	
	
	
	Config testConfig;
	
	public LCAPHomePage(Config testConfig)
	{
		PageFactory.initElements(testConfig.driver, this);
		this.testConfig = testConfig;
	}
	
	
	
	public void clickOnHomePage()
	{
		WaitHelper.waitForElementToBeClickable(testConfig, screenButton, "waiting for Screen button");
		click(testConfig, screenButton, "Screen button is being clicked here");
		
		WaitHelper.waitForElementToBeClickable(testConfig, mainLayoutArrow, "waiting for MainLazout arrow Button to be clickable");
		click(testConfig, mainLayoutArrow, "Main Layout Arrow button is being clicked here");
		
		WaitHelper.waitForElementToBeClickable(testConfig, homePageClick, "waiting for Screen button");
		click(testConfig, homePageClick, "homePageClick button is being clicked here");
		System.out.println("Testtest");
		
	}
	
	public void dragAndDropElement() 
	{
		WaitHelper.waitForElementToBeClickable(testConfig, editorSidebarElements, "waiting for editorSidebarElements button");
		click(testConfig, editorSidebarElements, "editorSidebarElements button is being clicked here");
		
		WaitHelper.waitForElementToBeClickable(testConfig, elementsPanelBase, "waiting for elementsPanelBase button");
		click(testConfig, elementsPanelBase, "elementsPanelBase button is being clicked here");
		
		dragAndDropElementWithMouseHold(testConfig, baseContainer, dropContainer, "Drag the Base Container", "Drop the base container in target");
		
		System.out.println("Clicked on Base Elements");
	}
	
	public void tempProMethod() {
		click(testConfig, projectExplorer, "Click on explorer");
		movetoElementAndClick(testConfig, businessLogic);
		movetoElementAndClick(testConfig, serverFlows);
		movetoElementAndClick(testConfig, globalFlows);
		movetoElementAndClick(testConfig, serverFlowselect);
		movetoElementAndDoubleClick(testConfig, serverFlowselect);
		movetoElementAndClick(testConfig, zoomInButton);
		movetoElementAndClick(testConfig, zoomInButton);
		movetoElementAndClick(testConfig, zoomInButton);
		movetoElementAndClick(testConfig, zoomInButton);
		movetoElementAndClick(testConfig, zoomInButton);
		movetoElementAndClick(testConfig, zoomInButton);
		movetoElementAndClick(testConfig, zoomInButton);
		movetoElementAndClick(testConfig, zoomInButton);
		movetoElementAndClick(testConfig, zoomInButton);
		movetoElementAndClick(testConfig, zoomInButton);
		dragAndDropAnElement(testConfig, aPI, canvas);
		
		
	}
	public void temp2() {
		click(testConfig, pyurAccept, "Click on explorer");
		
	}
	
}