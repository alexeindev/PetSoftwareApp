import java.util.Scanner;

public class Cat extends Animal {
    private static Scanner scanner = new Scanner(System.in);
    private String breed;
    private String furColor;
    private String energyLevel;
    private boolean affectionate;
    private boolean litterBoxTrained;
    private boolean outdoor;

    public Cat(String name, String age, String gender, boolean isAdopted) {
        super(name, age, gender, isAdopted);
        this.breed = breed;
        this.furColor = furColor;
        this.energyLevel = energyLevel;
        this.affectionate = affectionate;
        this.litterBoxTrained = litterBoxTrained;
        this.outdoor = outdoor;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(String energyLevel) {
        this.energyLevel = energyLevel;
    }

    public boolean isAffectionate() {
        return affectionate;
    }

    public void setAffectionate(boolean affectionate) {
        this.affectionate = affectionate;
    }

    public boolean isLitterBoxTrained() {
        return litterBoxTrained;
    }

    public void setLitterBoxTrained(boolean litterBoxTrained) {
        this.litterBoxTrained = litterBoxTrained;
    }

    public boolean isOutdoor() {
        return outdoor;
    }

    public void setOutdoor(boolean outdoor) {
        this.outdoor = outdoor;
    }

    public static Cat addToRegister() {
        System.out.println("\n=== REGISTRO DE GATO ===\n");

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

        System.out.print("Color del pelaje: ");
        String furColor = scanner.nextLine().trim();

        System.out.print("Nivel de energía (Bajo/Medio/Alto): ");
        String energyLevel = scanner.nextLine().trim();

        System.out.print("¿Es cariñoso? (si/no): ");
        boolean affectionate = scanner.nextLine().trim().equalsIgnoreCase("si");

        System.out.print("¿Usa la caja de arena? (si/no): ");
        boolean litterBoxTrained = scanner.nextLine().trim().equalsIgnoreCase("si");

        System.out.print("¿Sale al exterior? (si/no): ");
        boolean outdoor = scanner.nextLine().trim().equalsIgnoreCase("si");

        Cat newCat = new Cat(name, age, gender, isAdopted);
        newCat.setBreed(breed);
        newCat.setFurColor(furColor);
        newCat.setEnergyLevel(energyLevel);
        newCat.setAffectionate(affectionate);
        newCat.setLitterBoxTrained(litterBoxTrained);
        newCat.setOutdoor(outdoor);

        System.out.println("\n✓ ¡Gato registrado exitosamente!");

        return newCat;
    }

    @Override
    public void showInfo() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║         INFORMACIÓN DEL GATO           ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.printf("║ %-38s ║%n", "Nombre: " + getName());
        System.out.printf("║ %-38s ║%n", "Edad: " + getAge());
        System.out.printf("║ %-38s ║%n", "Género: " + getGender());
        System.out.printf("║ %-38s ║%n", "Adoptado: " + (isAdopted() ? "Sí" : "No"));
        System.out.printf("║ %-38s ║%n", "Raza: " + getBreed());
        System.out.printf("║ %-38s ║%n", "Color del pelaje: " + getFurColor());
        System.out.printf("║ %-38s ║%n", "Nivel de energía: " + getEnergyLevel());
        System.out.printf("║ %-38s ║%n", "Cariñoso: " + (isAffectionate() ? "Sí" : "No"));
        System.out.printf("║ %-38s ║%n", "Usa caja de arena: " + (isLitterBoxTrained() ? "Sí" : "No"));
        System.out.printf("║ %-38s ║%n", "Sale al exterior: " + (isOutdoor() ? "Sí" : "No"));
        System.out.println("╚════════════════════════════════════════╝");
    }

    public static void main(String[] args) {
        Cat myCat = Cat.addToRegister();
        myCat.showInfo();
    }
}