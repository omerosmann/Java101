import java.util.Scanner;

public class Player {
    private int damage;
    private int healthy;
    private int orjinalHealth;
    private int money;
    private String name;
    private String charName;

    private Scanner scanner = new Scanner(System.in);
    private Invertory invertory;

    public Player(String name) {
        this.name = name;
        this.invertory = new Invertory();
    }

    public void selectChar(){
        GameChar[] charList = {new Samurai(),new Archer(),new Knight()};
        System.out.println("Karakterler");
        System.out.println("------------------------------------");
        for(GameChar gameChar : charList){
            System.out.println("ID : " + gameChar.getId() +
                    "\tKarakterler : " + gameChar.getName() +
                    "\t Hasar : " + gameChar.getDamage() +
                    "\t Sağlık : " + gameChar.getHealthy() +
                    "\t Para : " + gameChar.getMoney());

        }
        System.out.println("--------------------------------------");
        System.out.print("Lütfen bir karakter seçiniz : ");
        int selectChar = scanner.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Karakter : " + this.getCharName() +
                ", Hasar : " + this.getDamage() +
                ", Sağlık : " + this.getHealthy() +
                ", Para : " + this.getMoney() );
    }



    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealthy(gameChar.getHealthy());
        this.setOrjinalHealth(gameChar.getHealthy());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public void printInfo(){
        System.out.println("Silahınız : " + this.getInvertory().getWeapon().getName() +
                ", Zırhınız : " + this.getInvertory().getArmor().getName() +
                ", Savunma : " + this.getInvertory().getArmor().getBlock() +
                ", Hasarınız : " + this.getTotalDamage() +
                ", Sağlığınız : " + this.getHealthy() +
                ", Paranız : " + this.getMoney() );
    }

    public int getTotalDamage(){
        return damage + this.getInvertory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        if(healthy < 0){
            healthy = 0;
        }
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Invertory getInvertory() {
        return invertory;
    }

    public void setInvertory(Invertory invertory) {
        this.invertory = invertory;
    }

    public Weapon getWeapon(){
        return this.getInvertory().getWeapon();
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }
}
