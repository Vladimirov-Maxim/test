package Game2;

public abstract class Entity {

    public String name;
    public int hp = 15;
    public boolean destroyed = false;

    public Entity(String name) {
        this.name = name;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }

}
