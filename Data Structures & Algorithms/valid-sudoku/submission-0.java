class Solution {
   public boolean isValidSudoku(char[][] board) {
      HashMap<Integer, Set<Character>> mapCols = new HashMap<>();
      HashMap<Integer, Set<Character>> mapRows = new HashMap<>();
      HashMap<String, Set<Character>> mapSquare = new HashMap<>();
      int n = 9;

      for (int r = 0; r < n; r++) {
         for (int c = 0; c < n; c++) {
            if (board[r][c] == '.')
               continue;

            String square = Integer.toString(r / 3) + Integer.toString(c / 3);
            if (mapRows.computeIfAbsent(r, k -> new HashSet<>()).contains(board[r][c]) ||
                  mapCols.computeIfAbsent(c, k -> new HashSet<>()).contains(board[r][c]) ||
                  mapSquare.computeIfAbsent(square, k -> new HashSet<>()).contains(board[r][c]))
               return false;

            mapRows.get(r).add(board[r][c]);
            mapCols.get(c).add(board[r][c]);
            mapSquare.get(square).add(board[r][c]);
         }
      }

      return true;
   }
}