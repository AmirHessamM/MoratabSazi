package MoratabSazi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void show(int x,int y,int arr[][]){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" [" + arr[i][j] + "] ");
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Number Of Row : ");
        int x = scanner.nextInt();
        System.out.println("Enter Number Of Column : ");
        int y = scanner1.nextInt();
        Random random;
        int random_number;
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                random = new Random();
                random_number = random.nextInt(100) + 0;
                arr[i][j] = random_number;

            }
        }
        show(x,y,arr);

        System.out.println("If You Want Sort Row Select r Else Select c : ");
        Scanner ord = new Scanner(System.in);
        String order = ord.nextLine();

        if (order.equals("r")) {
            System.out.println("Which Row? ");
            Scanner kr = new Scanner(System.in);
            int k = kr.nextInt();
            int hold;
            for ( int i = 0; i < y - 1 ; i++ )
                for ( int j = 0; j < y - 1; j++ )
                    if ( arr[k][ j ] > arr[k][ j + 1 ] ) {
                        for (int m=0; m<x; m++) {
                            hold = arr[m][j];
                            arr[m][j] = arr[m][j + 1];
                            arr[m][j + 1] = hold;
                        }
                    }
            show(x,y,arr);
            }

            else if (order.equals("c")) {
            System.out.println("Which Column? ");
            Scanner kr = new Scanner(System.in);
            int k = kr.nextInt();
            int hold;
            for ( int i = 0; i < x - 1 ; i++ )
                for ( int j = 0; j < x - 1; j++ )
                    if ( arr[j][ k ] > arr[j + 1 ][ k ] ) {
                        for (int n=0; n<y; n++) {
                            hold = arr[j][n];
                            arr[j][n] = arr[j + 1][n];
                            arr[j + 1][n] = hold;
                        }
                    }
            show(x,y,arr);
        }
    }
}
