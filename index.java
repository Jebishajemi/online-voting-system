import java.util.Scanner;

class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votesCandidateA = 0;
        int votesCandidateB = 0;
        int votesCandidateC = 0;
        int invalidVotes = 0;

        System.out.print("Enter the number of voters: ");
        int numberOfVoters = sc.nextInt();

        for (int i = 1; i <= numberOfVoters; i++) {
            System.out.println("\nVoter " + i + ", please vote by entering:");
            System.out.println("1 for Candidate A");
            System.out.println("2 for Candidate B");
            System.out.println("3 for Candidate C");
            System.out.print("Your vote: ");
            
            int vote = sc.nextInt();

            switch (vote) {
                case 1 -> votesCandidateA++;
                case 2 -> votesCandidateB++;
                case 3 -> votesCandidateC++;
                default -> {
                    invalidVotes++;
                    System.out.println("Invalid vote! Not counted.");
                }
            }
        }

        // Display results
        System.out.println("\nVoting Results:");
        System.out.println("Candidate A: " + votesCandidateA + " votes");
        System.out.println("Candidate B: " + votesCandidateB + " votes");
        System.out.println("Candidate C: " + votesCandidateC + " votes");
        System.out.println("Invalid votes: " + invalidVotes);
        System.out.println("Total votes: " + (votesCandidateA + votesCandidateB + votesCandidateC + invalidVotes));

        // Decide winner
        if (votesCandidateA > votesCandidateB && votesCandidateA > votesCandidateC) {
            System.out.println("🏆 Candidate A wins!");
        } else if (votesCandidateB > votesCandidateA && votesCandidateB > votesCandidateC) {
            System.out.println("🏆 Candidate B wins!");
        } else if (votesCandidateC > votesCandidateA && votesCandidateC > votesCandidateB) {
            System.out.println("🏆 Candidate C wins!");
        } else {
            System.out.println("🤝 It's a tie between candidates!");
        }

        sc.close();
    }
}

