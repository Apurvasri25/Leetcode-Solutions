class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience,
                                int[] energy, int[] experience) {

        int trainingHours = 0;
        int currEnergy = initialEnergy;
        int currExp = initialExperience;

        for (int i = 0; i < energy.length; i++) {
            if (currEnergy <= energy[i]) {
                int needed = energy[i] - currEnergy + 1;
                trainingHours += needed;
                currEnergy += needed;
            }
            if (currExp <= experience[i]) {
                int needed = experience[i] - currExp + 1;
                trainingHours += needed;
                currExp += needed;
            }
            currEnergy -= energy[i];
            currExp += experience[i];
        }

        return trainingHours;
    }
}
