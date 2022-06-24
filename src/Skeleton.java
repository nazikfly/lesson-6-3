public class Skeleton extends Boss {
    private  int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    public void printInformation() {
        System.out.println(getHealth() + "\n" + getDamage() + "\n" + weapon.getWeaponName() + "\n" + weapon.getWeaponType());
    }
}
