package ${packagename};

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

	private final MyCommandExecutor commandExecutor = new MyCommandExecutor(this);
	private final MyEventListener eventListener = new MyEventListener(this);

	@Override
	public void onDisable() {
	}

	@Override
	public void onEnable() { 
		PluginManager pm = this.getServer().getPluginManager();
		getCommand("mycommand").setExecutor(commandExecutor);
	}
}

