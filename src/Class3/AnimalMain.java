package Class3;

public class AnimalMain {
    public static void main(String[] args) {
        Animal d = new Animal();
        d.name="dog";
        d.sound="bark";
        d.animalSound();

        Animal c = new Animal();
        c.name="Cat";
        c.sound="meow";
        c.animalSound();

        Animal max=new Animal();
        System.out.println(max.x);


        modifier obj2 = new modifier();
        obj2.publicVariable=25;
        obj2.pVariable();
    }
}
