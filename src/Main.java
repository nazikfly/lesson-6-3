public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(100);
        boss.weapon.setWeaponName("Нож");
        boss.weapon.setWeaponType("Холодный");
        boss.printInfo();

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(150);
        skeleton.setDamage(200);
        skeleton.weapon.setWeaponName("Chappy");
        skeleton.weapon.setWeaponType("Shystryi");
        skeleton.printInformation();

        Skeleton skeleton2 = new Skeleton();
        skeleton.setHealth(200);
        skeleton.setDamage(150);
        skeleton.weapon.setWeaponName("Chappy");
        skeleton.weapon.setWeaponType("Shystryi");
        skeleton.printInformation();
    }

}