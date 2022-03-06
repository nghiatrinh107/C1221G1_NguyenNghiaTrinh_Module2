package collection_review.services.impl;


import collection_review.models.CandidateType;
import collection_review.models.Experience;
import collection_review.models.FresherCandidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FresherServices {
    private static List<FresherCandidate> fresherCandidateList = new ArrayList<>();

    static {
        fresherCandidateList.add(new FresherCandidate(2001, "Barbosa", "Souza", "23-10-1996", 01244567, "Barbosa@gmail.com", CandidateTypeServices.getCandidateType(1), 2019, "Proficient","Bach Khoa"));
        fresherCandidateList.add(new FresherCandidate(2002, "Cabrera", "Cornide", "13-07-1998", 05233367, "Cabrera@gmail.com", CandidateTypeServices.getCandidateType(1), 2020, "Proficient","Kinh te"));
        fresherCandidateList.add(new FresherCandidate(2003, "Calderon", "Cuevas", "23-03-2001", 07544567, "Calderon@gmail.com", CandidateTypeServices.getCandidateType(1),2021, "Proficient","su pham"));
        fresherCandidateList.add(new FresherCandidate(2004, "Casulari", "Motta", "07-11-2003", 01234567, "Casulari@gmail.com", CandidateTypeServices.getCandidateType(1), 2021, "Proficient","codegym"));

    }

    Scanner scanner = new Scanner(System.in);

    public FresherServices() {
    }

    public static List<FresherCandidate> getFresherCandidateList() {
        return fresherCandidateList;
    }

    public static void setFresherCandidateList(List<FresherCandidate> fresherCandidateList) {
        FresherServices.fresherCandidateList = fresherCandidateList;
    }
    public void display() {
        for (int i = 0; i < fresherCandidateList.size(); i++) {
            System.out.println(i + " : " + fresherCandidateList.get(i));
        }
    }

    public void creating(FresherCandidate fresherCandidate) {
        this.fresherCandidateList.add(fresherCandidate);
    }

    public void updating(FresherCandidate fresherCandidate) {
        int index = fresherCandidateList.indexOf(fresherCandidate);
        if (index == -1) {
            System.out.println("no candidate");
        } else {
            this.fresherCandidateList.set(index, fresherCandidate);
        }
    }

    public void deleting(int index) {
        if (index < 0 || index >= this.fresherCandidateList.size()) {
            System.err.println("Index not correct");
            return;
        }
        this.fresherCandidateList.remove(index);
    }

    public void searching(String name) {
        List<FresherCandidate> fresherCandidateSameName = new ArrayList<>();
        for (FresherCandidate fresherCandidate : fresherCandidateList) {
            if (fresherCandidate.getFirstName().toLowerCase().contains(name.toLowerCase()) || fresherCandidate.getLastName().toLowerCase().contains(name.toLowerCase())) {
                fresherCandidateSameName.add(fresherCandidate);
            }
        }
        displaySearchingList(fresherCandidateSameName);
    }

    void displaySearchingList(List<FresherCandidate> fresherCandidateList) {
        if (fresherCandidateList.size() == 0) {
            System.out.println("no candidate");
        }
        System.out.println("Searching: ");
        for (FresherCandidate fresherCandidate : fresherCandidateList) {
            System.out.println(fresherCandidate);
        }
    }

    public FresherCandidate addObject() {
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
        System.out.println("Graduated time  ");
        int graduatedTime = Integer.parseInt(scanner.nextLine());
        System.out.println("Rank of Graduation: ");
        String graduationRank = scanner.nextLine();
        System.out.println("Education: ");
        String education = scanner.nextLine();
        FresherCandidate fresherCandidate = new FresherCandidate(id, firstName, lastName, birthDate, phone, eMail, candidateType, graduatedTime, graduationRank,education);
        return fresherCandidate;
    }
}
