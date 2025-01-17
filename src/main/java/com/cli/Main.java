package com.cli;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

public class Main {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new PersonalizedCLI()).execute(args);
        System.exit(exitCode);
    }
}
