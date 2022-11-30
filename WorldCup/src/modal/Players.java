package modal;

public class Players {
    String Name;
    int age;
    int rating;

    int Id;

    public Players(String name, int age, int rating, int id) {
        Name = name;
        this.age = age;
        this.rating = rating;
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
