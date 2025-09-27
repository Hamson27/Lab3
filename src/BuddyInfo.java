public class BuddyInfo {
    private String name;
    private String address;
    private String phone;

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public BuddyInfo() {
        this("Joe", "123 Street", "123456789");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        BuddyInfo bud = new BuddyInfo("Homer", "123 Street", "123456789");
        System.out.println("Hello " + bud.getName());
    }
}
