public class Main {
    
    public static void main(String[] args) {
        // --- TEST DATA ---
        String[] fragments = {"G", "A", "T", "C", "C", "T", "A"};
        
        String[] patients = {
            "GATC-Normal", 
            "GATC-Normal", 
            "GATC-MUTATION", 
            "GATC-Normal"
        };
        
        String targetMutation = "GATC-MUTATION";

        // Calling your methods
        String completeSequence = buildSequence(fragments);
        int mutationIndex = findMutation(patients, targetMutation);

        // --- OUTPUT ---
        System.out.println("Reconstructed Sequence: " + completeSequence);
        System.out.println("Mutation found at index: " + mutationIndex);
    }

    // --- YOUR MISSION ---
    
    // TODO: Create a method named 'buildSequence'
    // Parameter: String[] frags
    // Return Type: String
    // Logic: Use a StringBuilder and a loop to combine all elements in the array into one String.
    public static String buildSequence(String[] frags) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < frags.length; i++) {
            sb.append(frags[i]);
        }
        return sb.toString();
    }



    // TODO: Create a method named 'findMutation'
    // Parameters: String[] samples, String target
    // Return Type: int
    // Logic: Use a loop to search the array for the target. Return the index if found. 
    // Remember to use .equals() for Strings! If not found, return -1.
    public static int findMutation(String[] samples, String target) {
        for (int i = 0; i < samples.length; i++) {
            if (samples[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
