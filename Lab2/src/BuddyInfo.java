public class BuddyInfo {
    private String name;
    private String nickname;
    private int age;
    private String profession;

    public BuddyInfo(String name, String nickname, int age, String profession) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        BuddyInfo rhea = new BuddyInfo("Rhea", "Chubz", 22, "Admin");

        System.out.println("Hello " + rhea.getName());
    }
}
