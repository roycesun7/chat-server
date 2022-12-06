package org.cis120;

import java.util.Set;
import java.util.TreeSet;

public class Channel {
    private String owner;
    private Set<String> members;
    private boolean priv;
    private String name;


    public Channel(String owner) {
        this.owner = owner;
        this.priv = false;
        members = new TreeSet<>();
        members.add(owner);
    }


    public Channel(String owner, Boolean priv) {
        this.owner = owner;
        members = new TreeSet<>();
        members.add(owner);
        this.priv = priv;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwnerName(String newName) {
        this.owner = newName;
    }

    public Set <String> getMembers() {
        return members;
    }

    public boolean isPriv() {
        return this.priv;
    }

    public void addMember(String nickname) {
        members.add(nickname);

    }

    public void removeMember(String user) {
        members.remove(user);
    }

    public void changePriv(Boolean changedPriv) {
        this.priv = changedPriv;
    }


}
