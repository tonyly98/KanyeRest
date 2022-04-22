package KanyeRest.demo.jda;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import KanyeRest.demo.jda.Commands;

public class KanyeRest {
	public JDABuilder jda;
	
	public KanyeRest() throws LoginException {
		jda = JDABuilder.createDefault("Hidden key :) use your own");
	}
	
	public void setActivity(String act) {
		jda.setActivity(Activity.watching(act));
	}
	
	public void online() throws LoginException {
		jda.setStatus(OnlineStatus.ONLINE);
		jda.addEventListeners(new Commands());
		jda.build();
	}
}
