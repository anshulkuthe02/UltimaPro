#include<iostream> 
using namespace std; 
void drawBoard(char board[3][3]) 
{ 
    cout<< "-------------\n"; 
     for(int i=0;i<3;i++) { 
        cout<< "| "; 
        for(int j=0;j<3;j++) { 
            cout<<board[i][j]<<" | "; 
        } 
        cout<<"\n-------------\n"; 
    } 
} 
bool checkWin(char board[3][3],char player) 
{ 
    for(int i=0;i<3;i++) { 
        if(board[i][0]==player && board[i][1]==player 
            && board[i][2]==player) //row
            return true; 
        if(board[0][i]==player && board[1][i]==player 
            && board[2][i]==player) //column
            return true; 
    } 
    if(board[0][0]==player && board[1][1]==player 
        && board[2][2]==player) //top left to right bottom diagonal.
        return true; 
    if(board[0][2]==player && board[1][1]==player 
      && board[2][0]==player) //top right to left bottom diagonal.
        return true; 
    return false; 
} 
int main() 
{ 
    char board[3][3] = { {' ',' ',' '}, 
                         {' ',' ',' '}, 
                         {' ',' ',' '} }; 
    char player='X'; 
    int row,col,turn;  
    cout<<"Welcome to Tic-Tac-Toe Game.\nPlayer 'X' will operate first\n"; 
    for (turn=0;turn<9;turn++) { 
        drawBoard(board); 
        while(true) { 
            cout <<"Player "<<player
                 <<"\nEnter Row(0-2) : "; 
            cin>>row; 
            cout<<"Enter Column(0-2) : ";
            cin>>col;
            if (board[row][col] != ' '||row<0||row>2 
                ||col<0||col>2) { 
                cout<<"Invalid move.Try again.\n"; 
        } 
            else { 
                break; 
            } 
        }       
        board[row][col]=player; 
        if (checkWin(board,player)) { 
            drawBoard(board); 
            cout<<"Yeah! Player "<<player<<" wins!\n"; 
            break; 
    }      
        player=(player=='X')?'O':'X'; 
    } 
    drawBoard(board); 
    if(turn==9 && !checkWin(board,'X') 
        && !checkWin(board,'O')) { 
        cout<<"It's a draw! Please restart the game.\n"; 
    } 
    return 0; 
}