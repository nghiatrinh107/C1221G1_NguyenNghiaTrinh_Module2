package collection_review.models;

public class FresherCandidate extends Candidates {
    private int graduatedTime;
    private String rankOfGraduation;
    private String education;

    public FresherCandidate() {
    }


    public FresherCandidate(int candidateId, String firstName, String lastName, String birthDate, long phone, String eMail, CandidateType candidateType, int graduatedTime, String rankOfGraduation, String education) {
        super(candidateId, firstName, lastName, birthDate, phone, eMail, candidateType);
        this.graduatedTime = graduatedTime;
        this.rankOfGraduation = rankOfGraduation;
        this.education = education;
    }

    public int getGraduatedTime() {
        return graduatedTime;
    }

    public void setGraduatedTime(int graduatedTime) {
        this.graduatedTime = graduatedTime;
    }

    public String getRankOfGraduation() {
        return rankOfGraduation;
    }

    public void setRankOfGraduation(String rankOfGraduation) {
        this.rankOfGraduation = rankOfGraduation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "FresherCandidate{" +
                super.toString() +
                ", graduatedTime=" + graduatedTime +
                ", rankOfGraduation='" + rankOfGraduation + '\'' +
                ", education='" + education + '\'' +
                "} ";
    }
}
