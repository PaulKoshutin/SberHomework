public class Author {
    private String name, sex, email;

    Author(String name, String sex, String email) {
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return name + " " + sex + " " + email;
    }
}
