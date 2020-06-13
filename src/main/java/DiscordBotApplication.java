

import jdk.nashorn.internal.runtime.logging.Logger;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.demogorgon.events.IntroductoryEvent;

import javax.security.auth.login.LoginException;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@Logger
public class DiscordBotApplication {

    public static void main(String[] args) {
        try{
            JDA jda = JDABuilder.createDefault("").build();
            jda.addEventListener(new IntroductoryEvent());

        }catch (LoginException loginException){
            log.println("Cannot login to JDA. Token Expired.");
        }
    }
}
