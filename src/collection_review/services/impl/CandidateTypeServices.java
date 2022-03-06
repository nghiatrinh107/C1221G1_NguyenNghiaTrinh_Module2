package collection_review.services.impl;

import collection_review.models.CandidateType;

import java.util.ArrayList;

public class CandidateTypeServices {
    private static ArrayList<CandidateType> candidates = new ArrayList<>();
    static {
        candidates.add(new CandidateType("Experience"));
        candidates.add(new CandidateType("Fresher candidate"));
        candidates.add(new CandidateType("Intern candidate"));
    }
    public static void displayCandidateType(){
        for (int i = 0; i <candidates.size() ; i++) {
            System.out.println(i + ": for " + candidates.get(i));
        }
    }
    public static CandidateType getCandidateType(int index){
            return candidates.get(index);
    }
}
