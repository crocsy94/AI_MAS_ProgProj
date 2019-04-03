package client.graph;

import java.util.Arrays;

public class Action {

    private Command command;
    private Timestamp[] timestamps;

    public Action(Command command, Timestamp[] timestamps) {
        this.command = command;
        this.timestamps = timestamps;
    }

    public Command getCommand() {
        return command;
    }

    public Timestamp[] getTimestamps() {
        return timestamps;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Action other = (Action) obj;
        return other.getCommand().equals(this.command)
                && Arrays.deepEquals(other.timestamps, this.timestamps);
    }

    @Override
    public int hashCode() {
        int timestampsHash = 0;
        for (Timestamp timestamp : this.timestamps) {
            timestampsHash += timestamp.hashCode();
        }
        return timestampsHash + this.command.hashCode();
    }
}
