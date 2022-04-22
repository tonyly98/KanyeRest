package KanyeRest.demo.jda;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import KanyeRest.demo.rest.*;
import net.dv8tion.jda.api.events.message.*;



public class Commands extends ListenerAdapter {
	public String prefix = "!";
	
	@Override
    public void onMessageReceived(MessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split(" ");
		
		if (args[0].equalsIgnoreCase(prefix + "quote")) {
			event.getMessage().reply(Consumer.getQuote()).queue();
		}
	}
}
