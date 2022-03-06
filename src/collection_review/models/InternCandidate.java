package collection_review.models;

public class InternCandidate extends Candidates {
    private String Majors, Semester, University;

    public InternCandidate() {
    }

    public InternCandidate(int candidateId, String firstName, String lastName, String birthDate,long phone, String eMail, CandidateType candidateType, String majors, String semester, String university) {
        super(candidateId, firstName, lastName, birthDate, phone, eMail, candidateType);
        Majors = majors;
        Semester = semester;
        University = university;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    @Override
    public String toString() {
        return "InternCandidate{" +
                super.toString() +
                ", Majors='" + Majors + '\'' +
                ", Semester='" + Semester + '\'' +
                ", University='" + University + '\'' +
                "} ";
    }
}
