package myrestaurantfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
  
  
// Linking textfields, buttons and textarea with frontend
  
@FXML
private Label label;
  
@FXML
TextField foodTF,drinksTF;
  
@FXML
Button orderFoodBtn,orderDrinksBtn;
  
@FXML
TextArea orderTextArea;
  
  
  
@Override
public void initialize(URL url, ResourceBundle rb) {

}
  
  
@FXML
public void orderFood(ActionEvent ev)
{
Food food=new Food();
String foodName=foodTF.getText();
food.setFoodName(foodName);
ordersPlaced(food);
System.out.print("orderFood");
  
}

@FXML
public void orderDrinks(ActionEvent ev)
{
Drinks drinks=new Drinks();
String drinksName=drinksTF.getText();
drinks.setDrinksName(drinksName);
ordersPlaced(drinks);
System.out.print("orderDrink");
}


public void ordersPlaced(Object item)
{
String items="";

if(item instanceof Food food)
{
items=  food.getFoodName();
}
else if(item instanceof Drinks drinks)
{
items=drinks.getDrinksName();

}

orderTextArea.setText(orderTextArea.getText()+"\n"+"Your order of "+ items +" is placed"+ "\n");


}
  
  
}