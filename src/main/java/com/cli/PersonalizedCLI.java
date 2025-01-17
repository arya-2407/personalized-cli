package com.cli;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "impact", mixinStandardHelpOptions = true, version = "1.0",
        description = "Prints out impact.com !!!")
public class PersonalizedCLI  implements Runnable{

    @Option(names = {"-u", "--user"}, description = "User's name")
    private String userName;

    @Override
    public void run() {
        System.out.println("impact.com");
        if (userName != null && !userName.isEmpty()) {
            System.out.println("Hi " + userName);
        }
    }
}
