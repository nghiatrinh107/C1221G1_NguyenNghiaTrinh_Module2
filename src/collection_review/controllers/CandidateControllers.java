package collection_review.controllers;

import collection_review.models.InternCandidate;
import collection_review.services.impl.ExperienceServicesImpl;
import collection_review.services.impl.FresherServices;
import collection_review.services.impl.InternServices;

import java.util.Scanner;

public class CandidateControllers {
    static ExperienceServicesImpl experience = new ExperienceServicesImpl();
    static FresherServices fresher = new FresherServices();
    static InternServices intern = new InternServices();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("===========EXPERIENCE CANDIDATE============");
            experience.display();
            System.out.println("==========FRESHER CANDIDATE==============");
            fresher.display();
            System.out.println("===========INTERN CANDIDATE==============");
            intern.display();
            System.out.println("Main Menu:\n" +
                    "1. Experience\n" +
                    "2. Fresher\n" +
                    "3. Internship\n" +
                    "4. Searching\n" +
                    "0. exit\n");
            System.out.print("choose: ");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu) {
                case 1:
                    System.out.println("EXPERIENCE CANDIDATE :\n" +
                            "1. Creating\n" +
                            "2. Updating\n" +
                            "3. Deleting\n");
                    System.out.print("choose: ");
                    int chooseExperience = Integer.parseInt(scanner.nextLine());
                    switch (chooseExperience) {
                        case 1:
                            experience.creating(experience.addObject());
                            System.out.println("Do you want to continue (Y/N)? ");
                            String chooseYesOrNo = scanner.nextLine();
                            if ("y".equals(chooseYesOrNo)){
                                experience.creating(experience.addObject());
                            }else {
                                break;
                            }
                            break;
                        case 2:
                            experience.updating(experience.addObject());
                            break;
                        case 3:
                            System.out.println("index deleting");
                            int index = Integer.parseInt(scanner.nextLine());
                            experience.deleting(index);
                            break;
                        default:
                            System.out.println("choose: 1, 2, 3");
                    }
                    break;
                case 2:
                    System.out.println("FRESHER CANDIDATE :\n" +
                            "1. Creating\n" +
                            "2. Updating\n" +
                            "3. Deleting\n");
                    System.out.print("choose: ");
                    int chooseFresher = Integer.parseInt(scanner.nextLine());
                    switch (chooseFresher) {
                        case 1:
                            fresher.creating(fresher.addObject());
                            System.out.println("Do you want to continue (Y/N)? ");
                            String chooseYesOrNo = scanner.nextLine();
                            if ("y".equals(chooseYesOrNo)){
                                fresher.creating(fresher.addObject());
                            }else {
                                break;
                            }
                            break;
                        case 2:
                            fresher.updating(fresher.addObject());
                            break;
                        case 3:
                            System.out.println("index deleting");
                            int index = Integer.parseInt(scanner.nextLine());
                            fresher.deleting(index);
                            break;
                        default:
                            System.out.println("choose: 1, 2, 3");
                    }
                    break;
                case 3:
                    System.out.println("INTERN CANDIDATE :\n" +
                            "1. Creating\n" +
                            "2. Updating\n" +
                            "3. Deleting\n");
                    System.out.print("choose: ");
                    int chooseIntern = Integer.parseInt(scanner.nextLine());
                    switch (chooseIntern) {
                        case 1:
                            intern.creating(intern.addObject());
                            System.out.println("Do you want to continue (Y/N)? ");
                            String chooseYesOrNo = scanner.nextLine();
                            if ("y".equals(chooseYesOrNo)){
                                intern.creating(intern.addObject());
                            }else {
                                break;
                            }
                            break;
                        case 2:
                            intern.updating(intern.addObject());
                            break;
                        case 3:
                            System.out.println("index deleting");
                            int index = Integer.parseInt(scanner.nextLine());
                            intern.deleting(index);
                            break;
                        default:
                            System.out.println("choose: 1, 2, 3");
                    }
                    break;
                case 4:
                    System.out.println("Candidate name searching");
                    String name = scanner.nextLine();
                    System.out.println("===========EXPERIENCE CANDIDATE============");
                    experience.searching(name);
                    System.out.println("==========FRESHER CANDIDATE==============");
                    fresher.searching(name);
                    System.out.println("===========INTERN CANDIDATE==============");
                    intern.searching(name);
                    System.out.println("\n");
                    System.out.println("\n");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("choose:0, 1, 2, 3, 4");
            }
        }while (flag);
    }
}
