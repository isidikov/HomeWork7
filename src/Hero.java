public abstract class Hero implements HavingSuperAbility {
    int helth;
    int damage;
    String fly;

    @Override
    public void applySuperAbility() {
        System.out.println("Magic casts superpower");
    }
}