package collection_review.services.impl;


import collection_review.models.CandidateType;
import collection_review.models.Experience;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceServicesImpl {
    private static List<Experience> experienceList = new ArrayList<>();

    static {
        experienceList.add(new Experience(1001, "Aelbrecht", "Stefan", "13-10-1993", 01234567, "Aelbrecht@gmail.com", CandidateTypeServices.getCandidateType(0), 8, "coder"));
        experienceList.add(new Experience(1002, "Aguirre", "Eva", "03-05-1997", 01233367, "AAguirre@gmail.com", CandidateTypeServices.getCandidateType(0), 2, "coder"));
        experienceList.add(new Experience(1003, "Ahlgren", "Maria", "23-01-1994", 01544567, "Ahlgrent@gmail.com", CandidateTypeServices.getCandidateType(0), 6, "coder"));
        experienceList.add(new Experience(1004, "Antošová", "Adeleva", "11-03-1991", 012234567, "Antošová@gmail.com", CandidateTypeServices.getCandidateType(0), 12, "coder"));

    }

    Scanner scanner = new Scanner(System.in);

    public ExperienceServicesImpl(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public ExperienceServicesImpl() {
    }

    public List<Experience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public void display() {
        for (int i = 0; i < experienceList.size(); i++) {
            System.out.println(i + " : " + experienceList.get(i));
        }
    }

    public void creating(Experience experience) {
        this.experienceList.add(experience);
    }

    public void updating(Experience experience) {
        int index = experienceList.indexOf(experience);
        if (index == -1) {
            System.out.println("no candidate");
        } else {
            this.experienceList.set(index, experience);
        }
    }

    public void deleting(int index) {
        if (index < 0 || index >= this.experienceList.size()) {
            System.err.println("Index not correct");
            return;
        }
        this.experienceList.remove(index);
    }

    public void searching(String name) {
        List<Experience> experienceSameName = new ArrayList<>();
        for (Experience experience : experienceList) {
            if (experience.getFirstName().toLowerCase().contains(name.toLowerCase()) || experience.getLastName().toLowerCase().contains(name.toLowerCase())) {
                experienceSameName.add(experience);
            }
        }
        displaySearchingList(experienceSameName);
    }

    void displaySearchingList(List<Experience> experienceList) {
        if (experienceList.size() == 0) {
            System.out.println("no candidate");
        }
        System.out.println("Searching: ");
        for (int i = 0; i <experienceList.size() ; i++) {
            System.out.println(experienceList.get(i));
        }
    }

    public Experience addObject() {
        System.out.println("ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("First Name");
        String firstName = scanner.nextLine();
        System.out.println("Last Name");
        String lastName = scanner.nextLine();
        System.out.println("Birth Date");
        String birthDate = scanner.nextLine();
        System.out.println("Phone");
        Long phone = Long.parseLong(scanner.nextLine());
        System.out.println("Email");
        String eMail = scanner.nextLine();
        System.out.println("Candidate type");
        CandidateTypeServices.displayCandidateType();
        System.out.println("choose 0 ,1 , 2");
        int choose = Integer.parseInt(scanner.nextLine());
        CandidateType candidateType = CandidateTypeServices.getCandidateType(choose);
        System.out.println("year of experience ");
        int expInYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Professional Skill ");
        String proSkill = scanner.nextLine();
        Experience experience = new Experience(id, firstName, lastName, birthDate, phone, eMail, candidateType, expInYear, proSkill);
        return experience;
    }
}
