package com.opentable.kcempron.database;

import com.opentable.kcempron.model.Message;
import com.opentable.kcempron.model.Profile;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    static {
        messages.put(1L, new Message(1, "Hello World", "kcempron"));
        messages.put(2L, new Message(2, "Hello OpenTable", "kcempron"));
        profiles.put("kcempron", new Profile(1L, "kcempron", "Karl", "Cempron"));
    }

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<String, Profile> getProfiles() {
        return profiles;
    }
}
