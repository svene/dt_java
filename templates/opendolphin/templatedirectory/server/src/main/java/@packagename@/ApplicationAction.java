package ${packagename};

import org.opendolphin.core.comm.Command;
import org.opendolphin.core.server.action.DolphinServerAction;
import org.opendolphin.core.server.comm.ActionRegistry;
import org.opendolphin.core.server.comm.CommandHandler;

import java.util.List;

public class ApplicationAction extends DolphinServerAction{
    public void registerIn(ActionRegistry actionRegistry) {
        actionRegistry.register(ApplicationConstants.COMMAND_ID, new CommandHandler<Command>() {
            public void handleCommand(Command command, List<Command> response) {
                System.out.println("Server reached.");
            }
        });

    }
}
