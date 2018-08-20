package com.mjr.mjrbotdiscord.MJRBot_Discord;

import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

public class EventHandler {

	@EventSubscriber
    public void onMessageReceivedEvent(MessageReceivedEvent event) {
        System.out.println("Channel " + event.getChannel() + " User " + event.getAuthor() + " Message " + event.getMessage());
        if(event.getChannel().getStringID().contains("480896546142027786"))
        	if(event.getMessage().toString().equals("test"))
        		MJRBot.sendMessage(event.getChannel(), "It works");
    }
}
