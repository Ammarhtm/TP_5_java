package TP5;

class User {
    String nom;
}

class Repository<T> {

    void save(T obj) {
        System.out.println("Objet sauvegardé");
    }
}

class UserRepository extends Repository<User> {

}

public class Exe10Partie3 {

    public static void main(String[] args) {

        User u = new User();

        UserRepository ur = new UserRepository();

        ur.save(u);
    }
}