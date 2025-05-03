package adris.altoclef.commands;

import adris.altoclef.AltoClef;
import adris.altoclef.commandsystem.ArgParser;
import adris.altoclef.commandsystem.Command;

public class PauseCommand extends Command {
    public PauseCommand() {
        super("pause", "Pauses the currently running task");
    }

    @Override
    protected void call(AltoClef mod, ArgParser parser) {
        mod.stopTasks();
        finish();
    }
}