package models;

public class Hero {
    private String name;
    private String age;
    private String specialPower;
    private String weakness;

    private int heroId;


    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public Hero(String name, String age, String specialPower, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }
}
