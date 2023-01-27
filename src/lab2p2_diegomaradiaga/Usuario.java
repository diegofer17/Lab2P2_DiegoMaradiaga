package lab2p2_diegomaradiaga;

public class Usuario {
    private String name;
    private int age;
    private String Username;
    private String contra;

    public Usuario() {
    }

    public Usuario(String name, int age, String Username, String contra) {
        this.name = name;
        this.age = age;
        this.Username = Username;
        this.contra = contra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
}
