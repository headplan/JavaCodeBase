package org.example.codebase.basicgrammar;

import java.util.Scanner;

public class ProcessControlSwitch {
    public static void main(String[] args) {
        int option = 1;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
        SwitchCase();
        SwitchString();
        Switch12();
        Switch12Var();
        Switch12Yield();
        SwitchGame();
    }

    private static void SwitchCase() {
        int option = 2;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
            case 3:
                System.out.println("Selected 2, 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
    }

    private static void SwitchString() {
        String fruit = "apple";
        switch (fruit) {
            case "apple":
                System.out.println("Selected apple");
                break;
            case "pear":
                System.out.println("Selected pear");
                break;
            case "mango":
                System.out.println("Selected mango");
                break;
            default:
                System.out.println("No fruit selected");
                break;
        }
    }

    private static void Switch12() {
        String fruit = "mongo";
        switch (fruit) {
            case "apple" -> System.out.println("Selected apple");
            case "pear" -> System.out.println("Selected pear");
            case "mongo" -> {
                System.out.println("Selected mongo");
                System.out.println("Good choice!");
            }
            default -> System.out.println("No fruit selected");
        }
    }

    private static void Switch12Var() {
        String fruit = "apple";
        int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mongo" -> 2;
            default -> 0;
        }; // ????????????????????????;??????
        System.out.println("opt = " + opt);
    }

    private static void Switch12Yield() {
        String fruit = "orange";
        int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mongo" -> 2;
            default -> {
                int code = fruit.hashCode();
                yield code; // switch???????????????
            }
        };
        System.out.println("opt = " + opt);
    }

    private static void SwitchGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1:??????\n2:???\n3:??????");
        System.out.println("??????:");
        int player = scanner.nextInt();
        int npc = (int) (Math.random() * 3 + 1);
        System.out.println(player);
        System.out.println(npc);
        int winner = player - npc;
        System.out.println(winner);
        switch (winner) {
            case 1,-2 -> System.out.println("????????????");
            case 0 -> System.out.println("??????");
            default -> System.out.println("NPC??????");
        }
    }
}
