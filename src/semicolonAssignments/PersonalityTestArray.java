package semicolonAssignments;

import java.util.*;

public class PersonalityTestArray {
    public static void main(String[] args) {
        questionnaire();
        questionnaireResult();
    }

    private static final int[][] personality = new int[4][2];


    private static void questionnaire() {
        Scanner input = new Scanner(System.in);
        String answer;

        personality[0][0] = 0;
        personality[0][1] = 0;
        personality[1][0] = 0;
        personality[1][1] = 0;
        personality[2][0] = 0;
        personality[2][1] = 0;
        personality[3][0] = 0;
        personality[3][1] = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Select A or B");
            switch (i) {
                case 1:
                    System.out.print("\nQuestion 1. \n A. Expend engery, enjoy groups \t B. Conserve energy, enjoy one-on-on");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[0][0]++;
                    } else
                        personality[0][1]++;
                    break;
                case 2:
                    System.out.println("Question 2. \n A. Interpret Literally \t B. Look for meaning and possibilities ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[1][0]++;
                    } else
                        personality[1][1]++;
                    break;
                case 3:
                    System.out.println("Question 3. \n A. Logical, thinking, questioning \t B. Empathetic, feeling, accommodating");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[2][0]++;
                    } else
                        personality[2][1]++;
                    break;
                case 4:
                    System.out.println("Question 4 \n A. Organized, Orderly \t B. Flexible, Adaptable");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[3][0]++;
                    } else
                        personality[3][1]++;
                    break;
                case 5:
                    System.out.println("Question 5. \n A. More outgoing, think our loud \t B. More Reserved, think to yourself");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[0][0]++;
                    } else
                        personality[0][1]++;
                    break;
                case 6:
                    System.out.println("Question 6. \n A. Practical, realistic, experiential \t B. Imaginative, innovative, theoretical");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[1][0]++;
                    } else
                        personality[1][1]++;
                    break;
                case 7:
                    System.out.println(" Question 7. \n A.Candid, straight, forward, frank \t  B. Tactful, kind, encouraging");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[2][0]++;
                    } else
                        personality[2][1]++;
                    break;
                case 8:
                    System.out.println("Question 8. \n A. Plan, Schedule \t  B. unplanned, spontaneous ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[3][0]++;
                    } else
                        personality[3][1]++;
                    break;
                case 9:
                    System.out.println("Question 9.\n A. Seek many tasks, public activities, interaction with others \n B. Seek private, solitary activities with quiet to concentrate");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[0][0]++;
                    } else
                        personality[0][1]++;
                case 10:
                    System.out.println(" Question 10. \n A. Standard, Usual, Conventional \t B. Different, Novel, Unique");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[1][0]++;
                    } else
                        personality[1][1]++;
                    break;
                case 11:
                    System.out.println("Question 11. \nA. Firm, tend to criticize, hold the line \t B.Gentle, tend to appreciate, conciliate");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[2][0]++;
                    } else
                        personality[2][1]++;
                    break;
                case 12:
                    System.out.println("Question 12 \n A. Regulated, structured \t B. Easygoing, live and let live");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[3][0]++;
                    } else
                        personality[3][1]++;
                    break;
                case 13:
                    System.out.println("Question 13. \n A. External, communicative, express yourself \t B. Internal, reticent, keep to yourself");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[0][0]++;
                    } else
                        personality[0][1]++;
                    break;
                case 14:
                    System.out.println("Question 14 \n A. Focus on here-and-now \t B. Look to the future, global perspective, big picture");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A"))
                        personality[1][1]++;
                    else
                        personality[1][1]++;
                    break;
                case 15:
                    System.out.println(" Question 15.\n A. Tough-minded, just \t B. Tender-hearted and merciful");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[2][0]++;
                    } else
                        personality[2][1]++;
                    break;
                case 16:
                    System.out.println("Question 16.\n A. Preparation, plan ahead \t B. Go with the flow, adapt as you go ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[3][0]++;
                    } else
                        personality[3][1]++;
                    break;
                case 17:
                    System.out.println("Question 17 \n A. Active, initiate \t B. Reflective, deliberate");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[0][0]++;
                    } else
                        personality[0][1]++;
                    break;
                case 18:
                    System.out.println("Question 18.\n A. Facts, things, what is \t B. Ideas, dreams, what could be philosophical");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[1][1]++;
                    } else
                        personality[1][1]++;
                    break;
                case 19:
                    System.out.println("Question 19 \nA. Matter of fact, issue-oriented \t B. Sensitive, people-oriented, compassionate");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[2][0]++;
                    } else
                        personality[2][1]++;
                    break;
                case 20:
                    System.out.println("Question 20 \n A. Control, governB. Latitude, freedom");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("a")) {
                        personality[3][0]++;
                    } else
                        personality[3][1]++;
                    break;
            }
        }
    }
        private static void questionnaireResult() {
        if (personality[0][0] > personality[0][1]){
            System.out.print("E");
        } else {
            System.out.print("I");
        }
        if (personality[1][0] > personality[1][1]){
            System.out.print("S");
        } else {
            System.out.print("N");
        }
        if (personality[2][0] > personality[2][1]){
            System.out.print("T");
        } else {
            System.out.print("F");
        }
        if (personality[3][0] > personality[3][1]){
            System.out.print("J");
        } else {
            System.out.print("P");
        }
        }
}





