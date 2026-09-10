public class Penguin extends Animal implements Swim,Walk{
    private boolean isSwimming ;
   private int walkSpeed;
    private int swimSpeed;

    public Penguin(){
        super("Penguin ");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingFood() {

    System.out.print("Penguin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
    System.out.print("I have eaten fish");
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed " + walkSpeed + " mph");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimSpeed + " nautical miles per hour");
    }
}
