package Database.Model;

public class Food {

public String getIdFood() {
	return idFood;
}
public void setIdFood(String idFood) {
	this.idFood = idFood;
}
public int getCast() {
	return Cast;
}
public void setCast(int cast) {
	Cast = cast;
}
public String getDecription() {
	return Decription;
}
public void setDecription(String decription) {
	Decription = decription;
}
public int getIdKindOfFood() {
	return idKindOfFood;
}
public void setIdKindOfFood(int idKindOfFood) {
	this.idKindOfFood = idKindOfFood;
}
public int getIsAcitve() {
	return isAcitve;
}
public void setIsAcitve(int isAcitve) {
	this.isAcitve = isAcitve;
}
public String getFood_name() {
	return Food_name;
}
public void setFood_name(String food_name) {
	Food_name = food_name;
}

private String idFood;
private int Cast;
private String Decription;
private int idKindOfFood;
private int isAcitve;
private String Food_name;


public Food(String id, int cast, String decr, int idKind, String name)
{
	idFood = id;
	Cast = cast;
	Decription = decr;
	idKindOfFood = idKind;
	//isAcitve = active;
	Food_name = name;
}


}
