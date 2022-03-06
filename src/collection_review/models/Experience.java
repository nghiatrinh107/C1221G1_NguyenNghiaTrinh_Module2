package collection_review.models;

public class Experience extends Candidates {
    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int candidateId, String firstName, String lastName, String birthDate, long phone, String eMail, CandidateType candidateType, int expInYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDate, phone, eMail, candidateType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                super.toString()+
                ", expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                "} " ;
    }
}
