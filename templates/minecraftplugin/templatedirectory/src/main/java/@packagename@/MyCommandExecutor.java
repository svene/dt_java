package ${packagename};

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MyCommandExecutor implements CommandExecutor {
	private MyPlugin plugin;

	public MyCommandExecutor(MyPlugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		plugin.getLogger().info("onCommand Reached in MyCommandExecutor");

		if (command.getName().equalsIgnoreCase("mycommand")) {
			plugin.getLogger().info("command used");
			//do something
			return true;
		}

		return false;
	}
}
