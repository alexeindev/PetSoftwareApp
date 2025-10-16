public abstract class Animal {
    private String name;
    private String age;
    private String gender;
    private boolean isAdopted;

    public Animal(String name, String age, String gender, boolean isAdopted) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isAdopted = isAdopted;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean adopted) {
        isAdopted = adopted;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void showInfo() {
    }
}
