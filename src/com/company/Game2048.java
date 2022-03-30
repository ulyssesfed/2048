package com.company;

public class Game2048 {
    private int[][] board;

    public void start() {
        board = new int[4][4];
        board[0][0] = 2;
        board[0][1] = 2;
        board[0][2] = 2;
        board[0][3] = 2;
        board[1][0] = 2;
        board[1][1] = 2;
        board[1][2] = 2;
        board[1][3] = 2;
        board[2][0] = 2;
        board[2][1] = 2;
        board[2][2] = 2;
        board[2][3] = 2;
        board[3][0] = 2;
        board[3][1] = 2;
        board[3][2] = 2;
        board[3][3] = 2;
        printBoard();

    }

    public void moveUp() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] == 0) {
                    continue;
                }
                for (int k = i - 1; k >= 0; k--) {
                    if (board[k][j] == 0) {
                        continue;
                    } else if (board[i][j] == board[k][j]) {
                        board[i][j] = board[i][j] + board[k][j];
                        board[k][j] = 0;
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public void moveDown() {
        for (int i = 3; i >= 0; i--) {
            for (int j = 3; j >= 0; j--) {
                if (board[i][j] == 0) {
                    continue;
                }
                for (int k = i + 1; k < 4; k++) {
                    if (board[k][j] == 0) {
                        continue;
                    } else if (board[i][j] == board[k][j]) {
                        board[i][j] = board[i][j] + board[k][j];
                        board[k][j] = 0;
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public void moveLeft() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] == 0) {
                    continue;
                }
                for (int k = j - 1; k >= 0; k--) {
                    if (board[i][k] == 0) {
                        continue;
                    } else if (board[i][j] == board[i][k]) {
                        board[i][j] = board[i][j] + board[i][k];
                    }

                }
            }
        }
    }

    public void moveRight() {
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >= 0; j--) {
                if (board[i][j] == 0) {
                    continue;
                }
                for (int k = j + 1; k < 4; k++) {
                    if (board[i][k] == 0) {
                        continue;
                    } else if (board[i][j] == board[i][k]) {
                        board[i][j] = board[i][j] + board[i][k];
                        board[i][k] = 0;
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}