package kr.hs.dgsw.java.detp1.d0511.homework;

import java.io.File;

	public class CommandExit extends AbstractCommand {
	
	public CommandExit(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		System.out.println("Terminating simple commander");
		return this.currentDirectory;
	}

	@Override
	public boolean isExitCondition() {
		return true;
	}

}