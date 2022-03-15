package collection_review.models;


import java.util.Objects;

public abstract class Candidates {
    private int candidateId;
    private String firstName, lastName, birthDate;
    private long phone;
    private String eMail;
    private CandidateType candidateType;


    public Candidates() {
    }

    public Candidates(int candidateId, String firstName, String lastName, String birthDate, long phone, String eMail, CandidateType candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.eMail = eMail;
        this.candidateType = candidateType;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public CandidateType getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(CandidateType candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return "Candidates{" +
                "candidateId=" + candidateId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone=" + phone +
                ", eMail='" + eMail + '\'' +
                ", candidateType=" + candidateType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidates that = (Candidates) o;
        return candidateId == that.candidateId;
    }


}
