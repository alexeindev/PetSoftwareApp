import java.util.ArrayList;

public class Register {
    private static ArrayList<Animal> register = new ArrayList<>();

    public void addAnimalToRegister(Animal newAnimal) {
        register.add(newAnimal);
    }

    public void showRegister() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║         LISTADO DE ANIMALES            ║");
        System.out.println("╚════════════════════════════════════════╝\n");

        if (register.isEmpty()) {
            System.out.println("  ℹ No hay animales registrados\n");
        } else {
            for (int i = 0; i < register.size(); i++) {
                System.out.println("┌────────────────────────────────────┐");
                System.out.printf("│  Animal No: %-22s │%n", i);
                System.out.println("└────────────────────────────────────┘");
                register.get(i).showInfo();
            }
        }
    }

    public void removeAnimalFromRegister(int animalNumber) {
        if (register.isEmpty()) {
            System.out.println("\n✗ No hay animales registrados para eliminar.");
            return;
        }
        register.remove(animalNumber);
        System.out.println("\n✓ ¡Animal eliminado del registro exitosamente!");
    }
}
