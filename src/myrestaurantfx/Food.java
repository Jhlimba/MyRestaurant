package myrestaurantfx;
public class Food extends Price{
  
private String foodName;

public String getFoodName() {
return foodName;
}

public void setFoodName(String foodName) {
this.foodName = foodName;
}

public float getPrice() {
return price;
}

public void setPrice(float price) {
this.price = price;
}
   
}