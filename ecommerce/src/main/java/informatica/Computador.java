package informatica;

public class Computador {
    private Periferico item;

    public void setItem(Periferico item) {
        this.item = item;
    }

    public String getItem() {
        if (this.item == null) {
            throw new NullPointerException("Computador sem acessorio extra");
        }
        return this.item.getPeriferico();
    }
}
