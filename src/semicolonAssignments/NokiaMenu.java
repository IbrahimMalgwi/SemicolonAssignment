package semicolonAssignments;
import java.util.Scanner;

public class NokiaMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Select Your Menu Option %n 1 Phone Book %n 2 Messages %n " +
                "3 Chat %n 4 Call Register %n 5 Tones %n 6 Settings %n 7 Call Divert %n 8 Games " +
                "%n 9 Calculator %n 10 Reminders %n 11 Clock %n 12 Profile %n 13 Sim Service %n Enter Number for your menu %n ");

        int menuNumber = input.nextInt();

        switch (menuNumber) {
            case 1:
                System.out.printf("Phone Book %n 1. Search %n 2. Service Nos. %n 3. Add Name %n 4. Erase %n 5. Edit %n " +
                        "6. Assign Tone %n 7. Send Business card %n 8. Options %n 9. Speed Dail %n 10. Voice Tags");
                System.out.println();
                int phoneBookMenu = input.nextInt();
                switch (phoneBookMenu) {
                    case 1:
                        System.out.print("Search");
                        break;
                    case 2:
                        System.out.print("Service Nos");
                        break;
                    case 3:
                        System.out.print("Add Name");
                        break;
                    case 4:
                        System.out.print("Erase");
                        break;
                    case 5:
                        System.out.print("Edit");
                        break;
                    case 6:
                        System.out.print("Assign Tone");
                        break;
                    case 7:
                        System.out.print("Send Business card");
                        break;
                    case 8:
                        System.out.println("Options");
                        System.out.println("Enter 1 OR 2 for More ");
                        int optionMenu = input.nextInt();
                        switch (optionMenu){
                            case 1:
                                System.out.println("1. Type of View");
                                break;
                            case 2:
                                System.out.println("2. Memory Status");
                                break;
                            default:
                                System.out.println("Wrong Number");
                        }
                        break;
                    case 9:
                        System.out.print("Speed Dail");
                        break;
                    case 10:
                        System.out.print("Voice Tags");
                        break;
                    default:
                        System.out.print("Wrong Menu Number");
                        break;
                }
                break;
            case 2:
                System.out.printf("Messages %n 1. Write Messages %n 2. Inbox %n 3. Outbox %n 4. Picture Messages %n " +
                        "5. Templates %n 6. Smileys %n 7. Messages Settings %n 8. Info Service %n 9. Voice Mailbox Number %n " +
                        "10. Service Command Editor ");
                System.out.println();
                int messageMenu = input.nextInt();
                switch (messageMenu){
                    case 1:
                        System.out.println("Write Messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture Messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("Messages Settings");
                        System.out.printf("1. Set 1 %n2. Common %nEnter Number for more options %n");
                        int messageSettingMenu = input.nextInt();
                        switch (messageSettingMenu){
                            case 1:
                                System.out.println("Set 1");
                                System.out.printf("1. Messages Center Number %n2. Messages Sent as %n3. Message Validity %n");
                                int setOptionMenu = input.nextInt();
                                switch (setOptionMenu){
                                    case 1:
                                        System.out.println("Messages Center Number");
                                        break;
                                    case 2:
                                        System.out.println("Messages Sent as");
                                        break;
                                    case 3:
                                        System.out.println("Message Validity");
                                        break;
                                    default:
                                        System.out.println("Wrong Number");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Common");
                                System.out.printf("1. Delivery Reports %n2. Reply via Same Center %n3. Character Support %n");
                                int commonOptionMenu = input.nextInt();
                                switch (commonOptionMenu){
                                    case 1:
                                        System.out.println("Delivery Reports");
                                        break;
                                    case 2:
                                        System.out.println("Reply via Same Center");
                                        break;
                                    case 3:
                                        System.out.println("Character Support");
                                        break;
                                    default:
                                        System.out.println("Wrong Number");
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Wrong Number");
                                break;
                        }
                        break;
                    case 8:
                        System.out.println("Info Service");
                        break;
                    case 9:
                        System.out.println("Voice Mailbox Number");
                        break;
                    case 10:
                        System.out.println("Service Command Editor");
                        break;
                    default:
                        System.out.println("Wrong Number");
                        break;
                }
                break;
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                System.out.printf("Call register %n 1. Missed Calls %n 2. Received Calls %n 3. Dialled Numbers %n 4. Erase Recent Call List %n 5. Show Call Duration %n" +
                        " 6. Show Call Cost %n 7. Call Cost Settings %n 8. Prepaid Credit %n Enter Number to Select");
                System.out.println();
                int callRegisterMenu = input.nextInt();
                switch (callRegisterMenu){
                    case 1:
                        System.out.println("Missed Calls");
                        break;
                    case 2:
                        System.out.println("Received Calls");
                        break;
                    case 3:
                        System.out.println("Dialled Numbers");
                        break;
                    case 4:
                        System.out.println("Erase Recent Call List");
                        break;
                    case 5:
                        System.out.println("Show Call Duration");
                        System.out.printf(" 1. Last Call Duration %n 2. All Calls' Duration %n 3. Received Calls' Duration %n " +
                                "4. Dialled Calls' Duration %n 5. Clear Timers %n Enter Number For Option ");
                        int callDurationOptionMenu = input.nextInt();
                        switch (callDurationOptionMenu){
                            case 1:
                                System.out.println("Last Call Duration");
                                break;
                            case 2:
                                System.out.println("All Calls Duration");
                                break;
                            case 3:
                                System.out.println("Received Calls' Duration");
                                break;
                            case 4:
                                System.out.println("Dialled Calls' Duration");
                                break;
                            case 5:
                                System.out.println("Clear Timers");
                                break;
                            default:
                                System.out.println("Wrong Menu Input");
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("Show Call Cost");
                        System.out.printf(" 1. Last Call Cost %n 2. All Calls' Cost %n 3. Clear Counter %n");
                        int showCallCostOptionMenu = input.nextInt();
                        switch (showCallCostOptionMenu) {
                            case 1:
                                System.out.println("Last Call Cost");
                                break;
                            case 2:
                                System.out.println("All Call Cost");
                                break;
                            case 3:
                                System.out.println("Clear Counter");
                                break;
                            default:
                                System.out.println("Wrong Menu Number");
                                break;
                        }
                        break;
                    case 7:
                        System.out.println("Call Cost Settings");
                        System.out.printf(" 1. Call Cost Limit %n 2. Show Cost in ");
                        int showCallCostSetting = input.nextInt();
                        switch (showCallCostSetting){
                            case 1:
                                System.out.println("Call Cost Limit");
                                break;
                            case 2:
                                System.out.println("Show Cost in");
                                break;
                            default:
                                System.out.println("Wrong Menu Number");
                                break;
                        }
                        break;
                    case 8:
                        System.out.println("Prepaid Credit");
                        break;
                    default:
                        System.out.println("Wrong Menu Number");
                        break;
                }
                break;
            case 5:
                System.out.printf("Tones %n 1. Ringing Tone %n 2. Ringing Volume %n 3. Incoming Call Alert %n 4. Composer %n 5. Message Alert Tone %n 6. Keypad Tones %n " +
                        "7. Warning and Game Tones %n 8. Vibrating Alert %n 9. Screen Saver");
                System.out.println();
                int toneMenu = input.nextInt();
                switch (toneMenu){
                    case 1:
                        System.out.println("Ringing Tone");
                        break;
                    case 2:
                        System.out.println("Ringing Volume");
                        break;
                    case 3:
                        System.out.println("Incoming Call Alert");
                        break;
                    case 4:
                        System.out.println("Composer");
                        break;
                    case 5:
                        System.out.println("Message Alert Tone");
                        break;
                    case 6:
                        System.out.println("Kaypad Tones");
                        break;
                    case 7:
                        System.out.println("Warning and Game Tone");
                        break;
                    case 8:
                        System.out.println("Vibrating Alert");
                        break;
                    case 9:
                        System.out.println("Screen Saver");
                        break;
                    default:
                        System.out.println("Wrong Menu Number");
                        break;
                }
                break;
            case 6:
                System.out.printf("Settings %n 1. Call Settings %n 2. Phone Settings %n 3. Security Settings %n 4. Restore Factory Settings");
                System.out.println();
                int settingsMenu = input.nextInt();
                switch (settingsMenu){
                    case 1:
                        System.out.println("Call Settings");
                        System.out.printf("1. Automatic Redial %n 2. Speed Dialling %n 3. Call Waiting Options %n 4. Own Number Sending " +
                                "%n 5. Phone Line in Use %n 6. Automatic Answer");
                        System.out.println();
                        int callSettingOptionMenu = input.nextInt();
                        switch (callSettingOptionMenu) {
                            case 1:
                                System.out.println("Automatic Redial");
                                break;
                            case 2:
                                System.out.println("Speed Dialling");
                                break;
                            case 3:
                                System.out.println("Call Waiting Options");
                                break;
                            case 4:
                                System.out.println("Own Number Sending ");
                                break;
                            case 5:
                                System.out.println("Phone Line in use");
                                break;
                            case 6:
                                System.out.println("Automatic Answer");
                                break;
                            default:
                                System.out.println("Wrong Menu Number");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Phone Settings");
                        System.out.printf(" 1. Language %n 2. Cell Info Display %n 3. Welcome Note %n 4. Network Selection %n 5 Lights %n 6. Confirm SIM Service Actions");
                        System.out.println();
                        int phoneSettingMenu = input.nextInt();
                        switch (phoneSettingMenu) {
                            case 1:
                                System.out.println("Language");
                                break;
                            case 2:
                                System.out.println("Cell Info Display");
                                break;
                            case 3:
                                System.out.println("Welcome Note");
                                break;
                            case 4:
                                System.out.println("Network Selection");
                                break;
                            case 5:
                                System.out.println("Lights");
                                break;
                            case 6:
                                System.out.println("Confirm SIM Service Actions");
                                break;
                            default:
                                System.out.println("Wrong Menu Number");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Security Settings");
                        System.out.printf("1. PIN Code Request %n 2. Call Barring Service %n 3. Fixed Dialling %n 4. Closed User Group %n 5. Phone Security %n " +
                                "6. Change Access Codes");
                        System.out.println();
                        int securitySettingsMenu = input.nextInt();
                        switch (securitySettingsMenu) {
                            case 1:
                                System.out.println("PIN code Request");
                                break;
                            case 2:
                                System.out.println("Call Barring Service");
                                break;
                            case 3:
                                System.out.println("Fixed Dialling");
                                break;
                            case 4:
                                System.out.println("Closed User Group");
                                break;
                            case 5:
                                System.out.println("Phone Security");
                                break;
                            case 6:
                                System.out.println("Change Access Codes");
                                break;
                            default:
                                System.out.println("Wrong Menu Number");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Restore Factory Settings");
                    default:
                        System.out.println("Wrong Menu Number");
                        break;
                }
                break;

            case 7:
                System.out.println("Call diverts");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminders");
                break;
            case 11:
                System.out.printf("Clock %n 1. Alarm Clock %n 2. Clock Settings %n 3. Date Settings %n 4. Stopwatch %n 5. Countdown Timer %n " +
                        "6. Auto Update of Date and Time ");
                System.out.println();
                int clockMenuOption = input.nextInt();
                switch (clockMenuOption){
                    case 1:
                        System.out.println("Alarm Clock");
                        break;
                    case 2:
                        System.out.println("Clock Settings");
                        break;
                    case 3:
                        System.out.println("Date Settings");
                        break;
                    case 4:
                        System.out.println("Stopwatch");
                        break;
                    case 5:
                        System.out.println("Countdown Timer");
                        break;
                    case 6:
                        System.out.println("Auto Update of Date and Time");
                        break;
                    default:
                        System.out.println("Wrong Menu Number");
                        break;
                }
                break;
            case 12:
                System.out.println("Profile ");
                break;
            case 13:
                System.out.println("Sim services");
                break;
            default:
                System.out.println("Enter the correct menu number");
                break;
        }


    }
}
