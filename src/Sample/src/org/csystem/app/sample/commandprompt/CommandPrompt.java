/*----------------------------------------------------------------------------------------------------------------------
	CommandPrompt sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.sample.commandprompt;

import org.csystem.util.StringUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandPrompt {
    private final String [] m_commands = {"length", "reverse", "upper", "lower", "chprom", "tget", "tjoin", "tclear",
            "tprint", "quit"};
    private final Scanner m_kb = new Scanner(System.in);
    private final ArrayList m_texts = new ArrayList();
    private String m_prompt;

    private static void lengthProc(String [] cmdInfo)
    {
        if (cmdInfo.length == 1) {
            System.out.println("length command must have at least one argument");
            return;
        }

        String args = StringUtil.join(cmdInfo, 1, "");

        System.out.printf("Length without whitespaces:%d%n", args.length());
    }

    private static void reverseProc(String [] cmdInfo)
    {
        if (cmdInfo.length == 1) {
            System.out.println("reverse command must have at least one argument");
            return;
        }

        String args = StringUtil.join(cmdInfo, 1, ' ');
        System.out.printf("Reverse with a space delimiter: %s%n", StringUtil.reverse(args));
    }

    private static void upperProc(String [] cmdInfo)
    {
        if (cmdInfo.length == 1) {
            System.out.println("upper command must have at least one argument");
            return;
        }

        String args = StringUtil.join(cmdInfo, 1, ' ');
        System.out.printf("Upper with a space delimiter: %s%n", args.toUpperCase());
    }

    private static void lowerProc(String [] cmdInfo)
    {
        if (cmdInfo.length == 1) {
            System.out.println("lower command must have at least one argument");
            return;
        }

        String args = StringUtil.join(cmdInfo, 1, ' ');
        System.out.printf("Lower with a space delimiter: %s%n", args.toLowerCase());
    }

    private void getTexts(String endText)
    {
        for (;;) {
            System.out.printf("You can enter [%s] for end%n", endText);
            System.out.print("Enter text:");
            String text = m_kb.nextLine();

            if (text.equals(endText))
                break;

            m_texts.add(text);
        }
    }

    private void tgetProc(String [] cmdInfo)
    {
        if (cmdInfo.length != 2) {
            System.out.println("tget command must have one argument");
            return;
        }

        getTexts(cmdInfo[1]);
    }

    private void tjoinProc(String [] cmdInfo)
    {
        if (m_texts.isEmpty())
            return;

        String delimiter = cmdInfo.length == 1 ? " " : StringUtil.join(cmdInfo, 1, ' ');
        String text = StringUtil.join(m_texts, delimiter);

        System.out.println(text);
    }

    private void tclearProc(String [] cmdInfo)
    {
        m_texts.clear();
    }

    private void tprintProc(String [] cmdInfo)
    {
        if (cmdInfo.length != 1) {
            System.out.println("tprint command can not have any argument");
            return;
        }

        for (Object obj : m_texts)
            System.out.println((String)obj);
    }

    private static void quitProc(String [] cmdInfo)
    {
        if (cmdInfo.length != 1) {
            System.out.println("quit command can not have any argument");
            return;
        }
        System.out.println("C and System Programmers Association");
        System.out.println("Thank you");
        System.exit(0);
    }

    private void changePromptProc(String [] cmdInfo)
    {
        if (cmdInfo.length == 1) {
            System.out.print("Input a text:");
            String p = m_kb.nextLine();

            if (!p.isBlank())
                m_prompt = p.trim();
            else
                System.out.println("Text must include at least one character without whitespace");
        }
        else
            m_prompt = StringUtil.join(cmdInfo, 1, ' ');
    }

    private void parseCommand(String [] cmdInfo)
    {
        if (cmdInfo.length == 1 && cmdInfo[0].equals(""))
            return;

        if (cmdInfo[0].length() < 3) {
            System.out.println("Any command must include at least 3(three) character");
            return;
        }

        int index = StringUtil.indexOfStartsWith(m_commands, cmdInfo[0]);

        if (index != -1) {
            cmdInfo[0] = m_commands[index];
            this.doWorkForCommand(cmdInfo);
        }
        else
            System.out.println("Invalid command");
    }

    private void doWorkForCommand(String [] cmdInfo)
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
                this.changePromptProc(cmdInfo);
                break;
            case "tget":
                tgetProc(cmdInfo);
                break;
            case "tjoin":
                tjoinProc(cmdInfo);
                break;
            case "tclear":
                tclearProc(cmdInfo);
                break;
            case "tprint":
                tprintProc(cmdInfo);
                break;
            case "quit":
                quitProc(cmdInfo);
                break;
        }
    }

    public CommandPrompt(String p)
    {
        m_prompt = p;
    }

    public void run()
    {
        for (;;) {
            System.out.print(m_prompt + ">");
            String cmdText = m_kb.nextLine().trim();

            this.parseCommand(cmdText.split("[ \t]+"));
        }
    }
}
