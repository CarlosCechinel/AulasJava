package exercicios.exercicioProp;

public class AppPet {
    public static void main(String[] args) {
        Animal a1 = new Animal("Lulu", "Pitbul", 2000, "Carlos", "123456789");

        System.out.println(a1);

        Proprietario prop = new Proprietario("Carlos", "123456789");
        Animal a2 = new Animal("Lulu", "Pitbul", 2000, prop);

        System.out.println(a2);

        Animal a3 = new Animal("Lulu", "Pitbul", 2000);

        System.out.println(a3);
    }
    
}
