package objectsPkj;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class UMA_ChanLine_TVAM_pObj {

	

		//Package 1: ID

		@FindBy(xpath = "package-details/package[1]/package-id")

		public WebElement Package_1_ID;

		

		//Package 1: name

		@FindBy(xpath = "package-details/package[1]/package-name")

		public WebElement Package_1_Name;

		

		//Package 1: category

		@FindBy(xpath = "package-details/package[1]/package-category")

		public WebElement Package_1_Category;

		

		//Package 1: Marketing Text

		@FindBy(xpath = "package-details/package[1]/package-marketing-text")

		public WebElement Package_1_MarketingText;

		

		//Package 1: Starting Price

		@FindBy(xpath = "package-details/package[1]/package-starting-price")

		public WebElement Package_1_StartingPrice;

		

		//Package 1: HD required

		@FindBy(xpath = "package-details/package[1]/HD-required")

		public WebElement Package_1_HDrequired;

		

		//Package 1: Product Catalog Item Identifier

		@FindBy(xpath = "package-details/package[1]/package-ProductCatalogItemIdentifier")

		public WebElement Package_1_ProductCatalogItemIdentifier;

		

		//Package 1: Product Catalog Component Code

		@FindBy(xpath = "package-details/package[1]/package-ProductCatalogComponentCode")

		public WebElement Package_1_ProductCatalogComponentCode;



		//Package 1: Product Catalog Component Attribute

		@FindBy(xpath = "package-details/package[1]/package-ProductCatalogComponentAttribute")

		public WebElement Package_1_ProductCatalogComponentAttribute;

		

		//Package 1: Technology Surcharge Indicator

		@FindBy(xpath = "package-details/package[1]/package-TechnologySurchargeIndicator")

		public WebElement Package_1_TechnologySurchargeIndicator;

		

		

		WebDriver driver;

		public UMA_ChanLine_TVAM_pObj(WebDriver driver) {

			this.driver = driver;

			PageFactory.initElements(driver, this);

		}

}

