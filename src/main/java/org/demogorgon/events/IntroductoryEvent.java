package org.demogorgon.events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class IntroductoryEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent guildMessageReceivedEvent){
        String messageReceived = guildMessageReceivedEvent.getMessage().getContentRaw();
        if(messageReceived.equalsIgnoreCase("Hi") || messageReceived.contains("How")){
            guildMessageReceivedEvent.getChannel().sendMessage("Hi! I am doing great.").queue();
        }
    }
}
