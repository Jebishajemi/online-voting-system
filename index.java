import java.util.Scanner;
 class bus_reservation_system {


    public static void main(String[] args) {
        // First, we create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // We define variables to store the number of votes for each candidate
        int votesCandidateA = 0;
        int votesCandidateB = 0;
        int votesCandidateC = 0;
        int invalidVotes = 0; // To count invalid votes

        // We also need to know how many voters there are
        System.out.print("Enter the number of voters: ");
        int numberOfVoters = sc.nextInt();

        // Now, we will ask each voter to vote by entering a number for their chosen candidate
        for (int i = 1; i <= numberOfVoters; i++) {
            System.out.println("Voter " + i + ", please vote by entering:");
            System.out.println("1 for Candidate A");
            System.out.println("2 for Candidate B");
            System.out.println("3 for Candidate C");
            System.out.print("Your vote: ");

            int vote = sc.nextInt();

            // We check which candidate the vote is for and add the vote accordingly
            if (vote == 1) {
                votesCandidateA++;
            } else if (vote == 2) {
                votesCandidateB++;
            } else if (vote == 3) {
                votesCandidateC++;
            } else {
                // If the vote is not 1, 2, or 3, it is invalid
                invalidVotes++;
                System.out.println("Invalid vote! This vote will not be counted.");
            }
        }

        // After collecting all votes, we print out the results
        System.out.println("\nVoting results:");
        System.out.println("Candidate A: " + votesCandidateA + " votes");
        System.out.println("Candidate B: " + votesCandidateB + " votes");
        System.out.println("Candidate C: " + votesCandidateC + " votes");
        System.out.println("Invalid votes: " + invalidVotes);

        // Now, let's decide who won the election
        if (votesCandidateA > votesCandidateB && votesCandidateA > votesCandidateC) {
            System.out.println("Candidate A wins!");
        } else if (votesCandidateB > votesCandidateA && votesCandidateB > votesCandidateC) {
            System.out.println("Candidate B wins!");
        } else if (votesCandidateC > votesCandidateA && votesCandidateC > votesCandidateB) {
            System.out.println("Candidate C wins!");
        } else {
            // This means there is a tie or no clear winner
            System.out.println("It's a tie or no clear winner!");
        }

        // Finally, we close the scanner to avoid resource leaks
        sc.close();
    }
}


