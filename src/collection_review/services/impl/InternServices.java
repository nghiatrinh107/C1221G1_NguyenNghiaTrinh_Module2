package collection_review.services.impl;



import collection_review.models.CandidateType;
import collection_review.models.InternCandidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternServices {
    private static List<InternCandidate> internCandidateList = new ArrayList<>();

    static {
        internCandidateList.add(new InternCandidate(2001, "Maria", "Madeleine", "23-10-1996", 01244567, "Barbosa@gmail.com", CandidateTypeServices.getCandidateType(1), "engineer", "Senior student","Bach Khoa"));
        internCandidateList.add(new InternCandidate(2002, "Csokán", "Babett", "13-07-1998", 05233367, "Cabrera@gmail.com", CandidateTypeServices.getCandidateType(1), "engineer", "Senior student","Kinh te"));
        internCandidateList.add(new InternCandidate(2003, "Joana", "Filipa", "23-03-2001", 07544567, "Calderon@gmail.com", CandidateTypeServices.getCandidateType(1),"engineer", "Senior student","su pham"));
        internCandidateList.add(new InternCandidate(2004, "Patricia", "Carine", "07-11-2003", 01234567, "Casulari@gmail.com", CandidateTypeServices.getCandidateType(1), "engineer", "Senior student","codegym"));

    }

    Scanner scanner = new Scanner(System.in);

    public InternServices() {
    }

    public static List<InternCandidate> getInternCandidateList() {
        return internCandidateList;
    }

    public static void setInternCandidateList(List<InternCandidate> internCandidateList) {
        InternServices.internCandidateList = internCandidateList;
    }

    public void display() {
        for (int i = 0; i < internCandidateList.size(); i++) {
            System.out.println(i + " : " + internCandidateList.get(i));
        }
    }

    public void creating(InternCandidate internCandidate) {
        this.internCandidateList.add(internCandidate);
    }

    public void updating(InternCandidate internCandidate) {
        int index = internCandidateList.indexOf(internCandidate);
        if (index == -1) {
            System.out.println("no candidate");
        } else {
            this.internCandidateList.set(index, internCandidate);
        }
    }

    public void deleting(int index) {
        if (index < 0 || index >= this.internCandidateList.size()) {
            System.err.println("Index not correct");
            return;
        }
        this.internCandidateList.remove(index);
    }

    public void searching(String name) {
        List<InternCandidate> internCandidateSameName = new ArrayList<>();
        for (InternCandidate internCandidate : internCandidateList) {
            if (internCandidate.getFirstName().toLowerCase().contains(name.toLowerCase()) || internCandidate.getLastName().toLowerCase().contains(name.toLowerCase())) {
                internCandidateSameName.add(internCandidate);
            }
        }
        displaySearchingList(internCandidateSameName);
    }

    void displaySearchingList(List<InternCandidate> internCandidateList) {
        if (internCandidateList.size() == 0) {
            System.out.println("no candidate");
        }
        System.out.println("Searching: ");
        for (InternCandidate internCandidate : internCandidateList) {
            System.out.println(internCandidate);
        }
    }

    public InternCandidate addObject() {
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
        System.out.println("Majors ");
        String majors = scanner.nextLine();
        System.out.println("Semester: ");
        String semester = scanner.nextLine();
        System.out.println(" University : ");
        String  university  = scanner.nextLine();
        InternCandidate internCandidate = new InternCandidate(id, firstName, lastName, birthDate, phone, eMail, candidateType, majors, semester,university);
        return internCandidate;
    }
}
