package com.CommandLinePattern;

interface Command {
	public void execute();

}

class textEditor {

	public void open() {
		System.out.println("Text editor opened");
	}

	public void close() {
		System.out.println("Text editor closed");
	}

	public void copy() {
		System.out.println("Text editor copied text");
	}

	public void paste() {
		System.out.println("Text editor paste");
	}
}

class CopyText implements Command {
	textEditor txt;

	CopyText(textEditor txt) {
		this.txt = txt;
	}

	@Override
	public void execute() {
		txt.copy();
	}
}

class PasteText implements Command {
	textEditor txt;

	PasteText(textEditor txt) {
		this.txt = txt;
	}

	@Override
	public void execute() {
		txt.paste();
	}
}

class OpenTextEditor implements Command {
	textEditor txt;

	OpenTextEditor(textEditor txt) {
		this.txt = txt;
	}

	@Override
	public void execute() {
		txt.open();
	}
}

class CloseTextEditor implements Command {
	textEditor txt;

	CloseTextEditor(textEditor txt) {
		this.txt = txt;
	}

	@Override
	public void execute() {
		txt.close();
	}
}

class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}

public class ClientClass {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		textEditor txt = new textEditor();
		int num = 4;
		if (num == 1) {
			remote.setCommand(new OpenTextEditor(txt));
		} else if (num == 2) {
			remote.setCommand(new CopyText(txt));
		} else if (num == 3) {
			remote.setCommand(new PasteText(txt));
		} else {
			remote.setCommand(new CloseTextEditor(txt));
		}

		remote.buttonWasPressed();
	}
}
