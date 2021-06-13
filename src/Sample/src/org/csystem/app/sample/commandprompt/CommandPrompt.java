package org.csystem.app.sample.commandprompt;

import org.csystem.util.StringUtil;

import java.util.Scanner;

public class CommandPrompt {
    public String [] commands = {"length", "reverse", "upper", "lower", "chprom", "quit"};
    public String prompt;
    public Scanner kb = new Scanner(System.in);

    public static void lengthProc(String [] cmdInfo)
    {
        if (cmdInfo.length == 1) {
            System.out.println("length command must have at least one argument");
            return;
        }

        String args = StringUtil.join(cmdInfo, 1, "");

        System.out.printf("Length without whitespaces:%d%n", args.length());
    }

    public static void reverseProc(String [] cmdInfo)
    {
        if (cmdInfo.length == 1) {
            System.out.println("reverse command must have at least one argument");
            return;
        }

        String args = StringUtil.join(cmdInfo, 1, ' ');
        System.out.printf("Reverse with a space delimiter: %s%n", StringUtil.reverse(args));
    }

    public static void upperProc(String [] cmdInfo)
    {
        if (cmdInfo.length == 1) {
            System.out.println("upper command must have at least one argument");
            return;
        }

        String args = StringUtil.join(cmdInfo, 1, ' ');
        System.out.printf("Upper with a space delimiter: %s%n", args.toUpperCase());
    }

    public static void lowerProc(String [] cmdInfo)
    {
        if (cmdInfo.length == 1) {
            System.out.println("lower command must have at least one argument");
            return;
        }

        String args = StringUtil.join(cmdInfo, 1, ' ');
        System.out.printf("Lower with a space delimiter: %s%n", args.toLowerCase());
    }

    public static void quitProc(String [] cmdInfo)
    {
        if (cmdInfo.length != 1) {
            System.out.println("quit command can not have any argument");
            return;
        }
        System.out.println("C and System Programmers Association");
        System.out.println("Thank you");
        System.exit(0);
    }

    public void changePromptProc(String [] cmdInfo)
    {
        if (cmdInfo.length == 1) {
            System.out.print("Input a text:");
            String p = kb.nextLine();

            if (!p.isBlank())
                prompt = p.trim();
            else
                System.out.println("Text must include at least one character without whitespace");
        }
        else
            prompt = StringUtil.join(cmdInfo, 1, ' ');
    }



    public void parseCommand(String [] cmdInfo)
    {
        if (cmdInfo.length == 1 && cmdInfo[0].equals(""))
            return;

        if (cmdInfo[0].length() < 3) {
            System.out.println("Any command must include at least 3(three) character");
            return;
        }

        int index = StringUtil.indexOfStartsWith(commands, cmdInfo[0]);

        if (index != -1) {
            cmdInfo[0] = commands[index];
            doWorkForCommand(cmdInfo);
        }
        else
            System.out.println("Invalid command");
    }

    public void doWorkForCommand(String [] cmdInfo)
    {
        switch (cmdInfo[0]) {
            case "length":
                lengthProc(cmdInfo);
                break;
            case "reverse":
                reverseProc(cmdInfo);
                break;
            case "upper":
                upperProc(cmdInfo);
                break;
            case "lower":
                lowerProc(cmdInfo);
                break;
            case "chprom":
                changePromptProc(cmdInfo);
                break;
            case "quit":
                quitProc(cmdInfo);
                break;
        }
    }

    public CommandPrompt(String p)
    {
        prompt = p;
    }

    public void run()
    {
        for (;;) {
            System.out.print(prompt + ">");
            String cmdText = kb.nextLine().trim();

            parseCommand(cmdText.split("[ \t]+"));
        }
    }
}
