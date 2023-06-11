import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat Datang di Game Defend FILKOM");
        System.out.print("Silahkan masukkan nama player : ");
        String name = in.next();
        System.out.println("Silahkan pilih karakter yang Anda inginkan :");
        System.out.println("1. Magician\n2. Healer\n3. Warrior");
        int userChoose = in.nextInt();

        ArrayList<Character> dataChar = new ArrayList<Character>();

        while (userChoose <= 3) {
            try {

                if (userChoose == 1) {
                    dataChar.add(new Magician(100, 60, 10) );
                } else if (userChoose == 2) {
                    dataChar.add(new Healer(70, 10, 10));
                } else if (userChoose == 3) {
                    dataChar.add(new Warrior(80, 25, 30));
                } else {
                    return;
                }
                dataChar.add(new Titan(200, 45, 0));
                System.out.println("Selamat datang, " + name);
                System.out.println("-".repeat(12) + " STATUS " + "-".repeat(12));
                statusInfo(dataChar.get(0));
                dataChar.get(0).info();
                break;
            } catch(Exception e) {
                System.out.println("Pilihan tidak sesuai");
            }
        }
        
        final String LINE = "=".repeat(12);
        int turn = 1;
        while (dataChar.get(0).getHP() != 0 && dataChar.get(1).getHP() != 0) {
            System.out.println(LINE + " TURN " + turn + " " + LINE);
            if (dataChar.get(0).attack()) {
                dataChar.get(1).receiveDamage(dataChar.get(0).getAttack());
            }

            // System.out.println("Enemy's HP : " + dataChar.get(1).getHP());
            // System.out.println(name + "'s HP : " + dataChar.get(0).getHP());

            if (dataChar.get(1).attack()) {
                dataChar.get(0).receiveDamage(dataChar.get(1).getAttack());
            } 
            
            if (dataChar.get(0).getHP() < 0) {
                dataChar.get(0).setHP(0);
            } else if (dataChar.get(1).getHP() < 0) {
                dataChar.get(1).setHP(0);
            } else if (dataChar.get(1).getHP() == 0) {
                break;
            }

            if (dataChar.get(0) instanceof Healer && turn % 2 == 0) {
                System.out.println("Hero mendapatkan Heal");
                ((Healer) dataChar.get(0)).heal();
            }

            System.out.println("Enemy's HP : " + dataChar.get(1).getHP());
            System.out.println(name + "'s HP : " + dataChar.get(0).getHP());
            turn++; 
            
        }

            System.out.println("=".repeat(32));
            if (dataChar.get(0).getHP() == 0) {
                System.out.println("Enemy menang");
            } else if (dataChar.get(1).getHP() == 0) {
                System.out.println(name + " menang");
            }

            System.out.println(LINE + " PLAYER " + LINE);
            System.out.println("-".repeat(12) + " STATUS " + "-".repeat(12));
            statusInfo(dataChar.get(0));
            dataChar.get(0).info();

            System.out.println(LINE + " PLAYER " + LINE);
            System.out.println("-".repeat(12) + " STATUS " + "-".repeat(12));
            statusInfo(dataChar.get(1));
            dataChar.get(1).info();

    }

    static void statusInfo(Character dataChar) {
            System.out.println("Role : " +  dataChar.getClass().getSimpleName());
    }

}