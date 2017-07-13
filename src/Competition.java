import java.util.Scanner;
public class Competition {
    static class Competitor{
        int number,score;
        String name;
    }
    public static void findChampions(Competitor comps[], int totalCompetitors)
    {
        for (int i = 0; i < totalCompetitors; i++) {
            for (int j = 0; j < totalCompetitors-1; j++) {
                if (comps[j].score<comps[j+1].score) {
                    int temp = comps[j].score;
                    comps[j].score = comps[j+1].score;
                    comps[j+1].score = temp;

                    String tempName = comps[j].name;
                    comps[j].name = comps[j+1].name;
                    comps[j+1].name = tempName;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner userin = new Scanner(System.in);
        Competitor [] competitors = new Competitor[9999];
        int totalCompetitors = 0;
        for (int i = 0; i < competitors.length; i++) {
            Competitor comps = new Competitor();
            System.out.print("Masukkan Nomor   : ");
            comps.number = userin.nextInt();
            System.out.print("Masukkan Nama    : ");
            comps.name = userin.next();
            System.out.print("Masukkan Nilai   : ");
            comps.score = userin.nextInt();
            System.out.println();
            competitors[i] = comps;
            totalCompetitors++;
            if (comps.number == 9999) {
                break;
            }
        }
        findChampions(competitors,totalCompetitors);
        String juara1[] = new String[10];
        String juara2[] = new String[10];
        String juara3[] = new String[10];
        int nmjuara1 = competitors[0].score;
        juara1[0] = competitors[0].name;
        int counter = 1;
        for (int l = 1; l < totalCompetitors; l++) {
            if (nmjuara1 == competitors[l].score) {
                juara1[l] = competitors[l].name;
                counter++;
            }
        }
        int counter2 = counter;
        int totjuara2 = 1;
        juara2[0] = competitors[counter2].name;
        for (int l = counter2+1; l < totalCompetitors; l++) {
            if (competitors[counter2].score == competitors[l].score) {
                juara2[totjuara2] = competitors[l].name;
                counter2++;
                totjuara2++;
            }
        }
        int totjuara3 = 1;
        if (totalCompetitors > 2) {
            int counter3 = counter2 + 1;
            juara3[0] = competitors[counter3].name;
            for (int l = counter3 + 1; l < totalCompetitors; l++) {
                if (competitors[counter3].score == competitors[l].score) {
                    juara3[totjuara3] = competitors[l].name;
                    counter3++;
                    totjuara3++;
                }
            }
        }
        System.out.println();
        System.out.println("JUARA 1");
        for (int i = 0; i < counter; i++) {
            System.out.print(juara1[i]+", ");
        }
        System.out.println();
        System.out.println("JUARA 2");
        for (int i = 0; i < totjuara2; i++) {
            System.out.print(juara2[i]+", ");
        }
        System.out.println();
        System.out.println("JUARA 3");
        for (int i = 0; i < totjuara3; i++) {
            System.out.print(juara3[i]+", ");
        }
    }
}