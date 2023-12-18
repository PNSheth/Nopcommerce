package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	@FindBy(xpath="//a[@class='product-name']")
	private WebElement ProductName;
	@FindBy(xpath="//input[@name='removefromcart']")
	private WebElement ProductSelectionCheckbox;
	@FindBy(xpath="//span[text()='Price:']")
	WebElement ProductPrice;
	@FindBy(xpath="//span[text()='Qty.:']")
	WebElement ProductQuantity;
	@FindBy(xpath="//span[text()='Total:']")
	WebElement ProductPriceTotal;
	@FindBy(xpath="//input[@name='updatecart']")
	WebElement UpdateShoppingCart;
	@FindBy(xpath="//input[@name='continueshopping']")
	WebElement ContinueShopping;
	@FindBy(partialLinkText = "Shipping:")
	WebElement ShippingCharge;
	@FindBy(xpath="//span[text()='Sub-Total:']")
	WebElement Subtotal;
	@FindBy(xpath="//span[text()='Tax: ']")
	WebElement Tax;
	@FindBy(xpath="//input[@name='discountcouponcode']")
	WebElement DiscountCodeTextField;
	@FindBy()
	WebElement ApplyCoupenButton;
	WebElement GiftCardCodeTextfield;
	WebElement AddGiftCard;
	WebElement CountryNameSelection;
	WebElement StateName;
	WebElement PostalCode;
	WebElement AgreeTermsConditions;
	WebElement CheckoutButton;


public ShoppingCartPage(WebDriver driver ){
		PageFactory.initElements(driver,this);
	}

public WebElement getProductName() {
	return ProductName;
}
public void setProductName(WebElement productName) {
	ProductName = productName;
}
public WebElement getProductPrice() {
	return ProductPrice;
}
public void setProductPrice(WebElement productPrice) {
	ProductPrice = productPrice;
}
public WebElement getProductQuantity() {
	return ProductQuantity;
}
public void setProductQuantity(WebElement productQuantity) {
	ProductQuantity = productQuantity;
}
public WebElement getProductPriceTotal() {
	return ProductPriceTotal;
}
public void setProductPriceTotal(WebElement productPriceTotal) {
	ProductPriceTotal = productPriceTotal;
}
public WebElement getUpdateShoppingCart() {
	return UpdateShoppingCart;
}
public void setUpdateShoppingCart(WebElement updateShoppingCart) {
	UpdateShoppingCart = updateShoppingCart;
}
public WebElement getContinueShopping() {
	return ContinueShopping;
}
public void setContinueShopping(WebElement continueShopping) {
	ContinueShopping = continueShopping;
}
public WebElement getShippingCharge() {
	return ShippingCharge;
}
public void setShippingCharge(WebElement shippingCharge) {
	ShippingCharge = shippingCharge;
}
public WebElement getSubtotal() {
	return Subtotal;
}
public void setSubtotal(WebElement subtotal) {
	Subtotal = subtotal;
}
public WebElement getTax() {
	return Tax;
}
public void setTax(WebElement tax) {
	Tax = tax;
}
public WebElement getDiscountCodeTextField() {
	return DiscountCodeTextField;
}
public void setDiscountCodeTextField(WebElement discountCodeTextField) {
	DiscountCodeTextField = discountCodeTextField;
}
public WebElement getApplyCoupenButton() {
	return ApplyCoupenButton;
}
public void setApplyCoupenButton(WebElement applyCoupenButton) {
	ApplyCoupenButton = applyCoupenButton;
}
public WebElement getGiftCardCodeTextfield() {
	return GiftCardCodeTextfield;
}
public void setGiftCardCodeTextfield(WebElement giftCardCodeTextfield) {
	GiftCardCodeTextfield = giftCardCodeTextfield;
}
public WebElement getAddGiftCard() {
	return AddGiftCard;
}
public void setAddGiftCard(WebElement addGiftCard) {
	AddGiftCard = addGiftCard;
}
public WebElement getCountryNameSelection() {
	return CountryNameSelection;
}
public void setCountryNameSelection(WebElement countryNameSelection) {
	CountryNameSelection = countryNameSelection;
}
public WebElement getStateName() {
	return StateName;
}
public void setStateName(WebElement stateName) {
	StateName = stateName;
}
public WebElement getPostalCode() {
	return PostalCode;
}
public void setPostalCode(WebElement postalCode) {
	PostalCode = postalCode;
}
public WebElement getAgreeTermsConditions() {
	return AgreeTermsConditions;
}
public void setAgreeTermsConditions(WebElement agreeTermsConditions) {
	AgreeTermsConditions = agreeTermsConditions;
}
public WebElement getCheckoutButton() {
	return CheckoutButton;
}
public void setCheckoutButton(WebElement checkoutButton) {
	CheckoutButton = checkoutButton;
}

}
