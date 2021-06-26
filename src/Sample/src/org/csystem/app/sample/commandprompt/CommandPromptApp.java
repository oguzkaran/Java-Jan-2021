package org.csystem.app.sample.commandprompt;

public class CommandPromptApp {
    private CommandPromptApp()
    {
    }

    public static void run()
    {
        CommandPrompt commandPrompt = new CommandPrompt("CSD");

        commandPrompt.run();
    }
}
