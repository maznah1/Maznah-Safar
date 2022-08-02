package Packagee;

public class LEP4 {
    public static void main(String[] args) {

        String users[] = new String[10];
        users[0] = "Saleh";
        users[1] = "Ali";
        users[2] = "Khalid";
        users[3] = "Ahmad";
        users[4] = "Mzan";
        users[5] = "sara";
        users[6] = "Noof";
        users[7] = "Nuf";
        users[8] = "safar";
        users[9] = "Alii";

        for (int i = 0; i < 9; i++) {
            if (users[i].charAt(0) == 'A') {
                continue;
            }
            System.out.println("This is continue " + users [i] );
        }

    }


    }

