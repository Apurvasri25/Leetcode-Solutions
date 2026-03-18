class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int winner = 0;
        // Map: Player ID -> (Ball Color -> Count)
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>(); 
        HashSet<Integer> playerWinner = new HashSet<>();

        for(int i = 0; i < pick.length; i++){
            int player = pick[i][0];
            int color = pick[i][1];

            // If player has already won, no need to check further
            if(playerWinner.contains(player)) continue;

            HashMap<Integer, Integer> ballDetails = map.getOrDefault(player, new HashMap<>());
            ballDetails.put(color, ballDetails.getOrDefault(color, 0) + 1);
            map.put(player, ballDetails);

            // Winning condition: count of balls of same color > player index
            if(ballDetails.get(color) > player){
                winner++;
                playerWinner.add(player);
            }
        }
        return winner;
    }
}