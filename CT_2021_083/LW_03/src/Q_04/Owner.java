package Q_04;

public class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    @Override
    public String toString() {
        return "Owner: " + ownerName + ", Phone: " + phoneNo;
    }
}

