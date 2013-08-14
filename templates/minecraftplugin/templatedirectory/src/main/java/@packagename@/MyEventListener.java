package ${packagename};

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class MyEventListener implements Listener {

	private MyPlugin plugin;

	public MyEventListener(MyPlugin plugin) {
		this.plugin = plugin;
	}

	// See http://jd.bukkit.org/apidocs/ for a complete list of events that can be registered.

	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event) {
		Bukkit.getServer().broadcastMessage("Player " + event.getPlayer().getName() + " placed " + event.getBlock().getType() + " at " + event.getBlock().getLocation());
	}
}
