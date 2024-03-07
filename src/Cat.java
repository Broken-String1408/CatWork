public class Cat {
    private String name;
    private int appetite;

    private boolean isSated;

    public boolean isSated() {
        return isSated;
    }

    public void setSated(boolean sated) {
        isSated = sated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isSated = false;
    }
    public void eat() { }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isSated=" + isSated +
                '}';
    }
}
