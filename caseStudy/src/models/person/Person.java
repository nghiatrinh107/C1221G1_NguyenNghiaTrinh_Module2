package models.person;

public abstract class Person {
    private String fullName,email,birthday,gender,phone;
    private int identityCard,id;

    public Person() {
    }

    public Person(int id,String fullName, String birthday, String gender, int identityCard, String email, String phone ) {
        this.fullName = fullName;
        this.email = email;
        this.birthday = birthday;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phone = phone;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName +
                ", email='" + email +
                ", birthday='" + birthday +
                ", gender='" + gender +
                ", identityCard=" + identityCard +
                ", phone=" + phone +
                '}';
    }
}
