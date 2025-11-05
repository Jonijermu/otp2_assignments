package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import model.Item;
import model.LanguageOption;
import model.ShoppingCart;

import java.util.Locale;
import java.util.ResourceBundle;

public class Controller {

    Item item;
    ShoppingCart cart = new ShoppingCart();
    LanguageOption languageOption;
    Locale locale;
    ResourceBundle rb;

    public void initialize() {
        addLanguages();
        languageComboBox.setOnAction(this::selectLanguage);
        setLanguage(Locale.US);
    }

    //region FXML-injected UI components
    @FXML
    private Button addItemButton;
    @FXML
    private Button calculateButton;
    @FXML
    private Label itemPrice;
    @FXML
    private Label itemQuantity;
    @FXML
    private ComboBox<LanguageOption> languageComboBox;
    @FXML
    private Label numberOfItems;
    @FXML
    private Label priceLabel;
    @FXML
    private Label priceSymbol;
    @FXML
    private Slider sliderNumberOfItems;
    @FXML
    private Slider sliderPrice;
    @FXML
    private Slider sliderQuantity;
    //endregion

    public void addLanguages() {
        languageComboBox.getItems().addAll(
        new LanguageOption("English (US)", Locale.US),
        new LanguageOption("Suomi (Finnish)", Locale.forLanguageTag("fi-FI")),
        new LanguageOption("Svenska (Swedish)", Locale.forLanguageTag("sv-SE")),
        new LanguageOption("日本語 (Japanese)", Locale.forLanguageTag("ja-JP"))
        );
        languageComboBox.getSelectionModel().selectFirst();
    }

    public void setLanguage(Locale locale) {
        rb = ResourceBundle.getBundle("languages", locale);
        numberOfItems.setText(rb.getString("a"));
        itemPrice.setText(rb.getString("c"));
        itemQuantity.setText(rb.getString("d"));
        addItemButton.setText(rb.getString("e"));
        calculateButton.setText(rb.getString("f"));
        priceSymbol.setText(rb.getString("g"));
    }

    @FXML
    public void selectLanguage(ActionEvent event) {
        languageOption = languageComboBox.getSelectionModel().getSelectedItem();
        locale = languageOption.getLocale();
        setLanguage(locale);
        System.out.println("Language changed to " + languageOption.getName());
    }

    @FXML
    public void addItem(ActionEvent event) {
        double itemPrice = sliderPrice.getValue();
        Double itemQuantity = sliderQuantity.getValue();
        item = new Item("prööt", itemPrice * itemQuantity);
        cart.addItem(item);
    }

    @FXML
    public void calculate(ActionEvent event) {
        double totalPrice = 0;
        for (Item i : cart.getItems()) {
            totalPrice += i.getPrice();
        }
        priceLabel.setText(String.format("%.2f", totalPrice));
    }
}
