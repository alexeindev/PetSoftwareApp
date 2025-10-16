import java.util.Scanner;

public class Dog extends Animal{
    private static Scanner scanner = new Scanner(System.in);
    private String breed;
    private String size;
    private boolean trained;
    private String energyLevel;
    private boolean goodWithOtherDogs;
    private String barkingLevel;

    public Dog(String name, String age, String gender, boolean isAdopted) {
        super(name, age, gender, isAdopted);
        this.breed = breed;
        this.size = size;
        this.trained = trained;
        this.energyLevel = energyLevel;
        this.goodWithOtherDogs = goodWithOtherDogs;
        this.barkingLevel = barkingLevel;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public String getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(String energyLevel) {
        this.energyLevel = energyLevel;
    }

    public boolean isGoodWithOtherDogs() {
        return goodWithOtherDogs;
    }

    public void setGoodWithOtherDogs(boolean goodWithOtherDogs) {
        this.goodWithOtherDogs = goodWithOtherDogs;
    }

    public String getBarkingLevel() {
        return barkingLevel;
    }

    public static Dog addToRegister() {
        System.out.println("\n=== REGISTRO DE PERRO ===\n");

        System.out.print("Nombre: ");
        String name = scanner.nextLine().trim();

        System.out.print("Edad: ");
        String age = scanner.nextLine().trim();

        System.out.print("Género (Macho/Hembra): ");
        String gender = scanner.nextLine().trim();

        System.out.print("¿Está adoptado? (si/no): ");
        boolean isAdopted = scanner.nextLine().trim().equalsIgnoreCase("si");

        System.out.print("Raza: ");
        String breed = scanner.nextLine().trim();

        System.out.print("Tamaño (Pequeño/Mediano/Grande): ");
        String size = scanner.nextLine().trim();

        System.out.print("¿Está adiestrado? (si/no): ");
        boolean trained = scanner.nextLine().trim().equalsIgnoreCase("si");

        System.out.print("Nivel de energía (Bajo/Medio/Alto): ");
        String energyLevel = scanner.nextLine().trim();

        System.out.print("¿Es bueno con otros perros? (si/no): ");
        boolean goodWithOtherDogs = scanner.nextLine().trim().equalsIgnoreCase("si");


        Dog newDog = new Dog(name, age, gender, isAdopted);
        newDog.setBreed(breed);
        newDog.setSize(size);
        newDog.setTrained(trained);
        newDog.setEnergyLevel(energyLevel);
        newDog.setGoodWithOtherDogs(goodWithOtherDogs);

        System.out.println("\n✓ ¡Perro registrado exitosamente!");

        return newDog;
    }

    @Override
    public  void showInfo() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║         INFORMACIÓN DEL PERRO          ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.printf("║ %-38s ║%n", "Nombre: " + getName());
        System.out.printf("║ %-38s ║%n", "Edad: " + getAge());
        System.out.printf("║ %-38s ║%n", "Género: " + getGender());
        System.out.printf("║ %-38s ║%n", "Adoptado: " + (isAdopted() ? "Sí" : "No"));
        System.out.printf("║ %-38s ║%n", "Raza: " + getBreed());
        System.out.printf("║ %-38s ║%n", "Tamaño: " + getSize());
        System.out.printf("║ %-38s ║%n", "Adiestrado: " + (isTrained() ? "Sí" : "No"));
        System.out.printf("║ %-38s ║%n", "Nivel de energía: " + getEnergyLevel());
        System.out.printf("║ %-38s ║%n", "Bueno con otros perros: " + (isGoodWithOtherDogs() ? "Sí" : "No"));
        System.out.printf("║ %-38s ║%n", "Nivel de ladrido: " + getBarkingLevel());
        System.out.println("╚════════════════════════════════════════╝");
    }

    public static void main(String[] args) {
        Dog hi = Dog.addToRegister();
        hi.showInfo();
    }
}
