package ClassWork;

public class InClass {
    public static void main(String[] args) {
        People poe = new People();
        poe.setHeight("143");
        System.out.println(poe.getHeight());

        poe.setBalance("14Azn");
        System.out.println(poe.getBalance());

        poe.setSurname("Guliyev");
        System.out.println(poe.getSurname());

        poe.setFavoriteColor("Dark");
        System.out.println(poe.getFavoriteColor());
    }
}

class People{
    private String height;
    private String Balance;
    private String surname;
    private String FavoriteColor;

    public String getHeight(){
        return height;
    }

    public String getBalance(){
        return Balance;
    }

    public String getSurname(){
        return surname;
    }

    public String getFavoriteColor(){
        return FavoriteColor;
    }

    public void setHeight(String height){
        this.height = height;
    }

    public void setBalance(String Balance){
        this.Balance = Balance;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setFavoriteColor(String FavoriteColor){
        this.FavoriteColor = FavoriteColor;
    }
}
