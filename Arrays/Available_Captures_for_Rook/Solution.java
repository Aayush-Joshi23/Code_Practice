class Solution {
    public int numRookCaptures(char[][] board) {
        
        int m =0, n = 0;
        for(int i =0; i<8; i++)
        {
            for(int j = 0; j<8; j++)
            {
                if(board[i][j] == 'R')
                {
                    m = i; 
                    n = j;
                    break;
                }
            }
            if(board[m][n]=='R')
            {
                break;
            }
        }
        
        int tot = 0;
        
        for(int i =m; i<8;i++) // Down - Towards South
        {
            if( board[i][n] =='p')
            {
                tot += 1;
                break;
            }
            else if( board[i][n] =='B' )
            {
                break;
            }
        }
        
        
        for(int i =n; i<8;i++) // Right - Towards East
        {
            if( board[m][i] =='p')
            {
                tot += 1;
                break;
            }
            else if( board[m][i] =='B' )
            {
                break;
            }
        }
        
        
        for(int i =m; i>=0;i--) // Up - Towards North
        {
            if( board[i][n] =='p')
            {
                tot += 1;
                break;
            }
            else if( board[i][n] =='B' )
            {
                break;
            }
        }
        
        
        for(int i =n; i>=0;i--)  // Left - Toward West
        {
            if( board[m][i] =='p')
            {
                tot += 1;
                break;
            }
            else if( board[m][i] =='B' )
            {
                break;
            }
        }
        
        return tot;
        
        
    }
}