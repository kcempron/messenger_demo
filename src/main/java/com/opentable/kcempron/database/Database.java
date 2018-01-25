package com.opentable.kcempron.database;

import com.opentable.kcempron.model.Message;
import com.opentable.kcempron.model.Profile;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<Long, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }
    
    public static Map<Long, Profile> getProfiles() {
        return profiles;
    }
}
