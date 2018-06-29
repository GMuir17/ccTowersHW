package Hotel;

public class Hotel {

    private String name;
    private int vault;

    public Hotel(String name, int vault) {
        this.name = name;
        this.vault = vault;
    }

    public String getName() {
        return this.name;
    }

    public int getVault() {
        return this.vault;
    }
}
