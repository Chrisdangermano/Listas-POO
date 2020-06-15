/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatec.app.info;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author chris
 */
public class Chat  implements Serializable{
 
    private String name;
    private String text;
    private String nameReserved;
    private Set<String> setOnline = new HashSet<>(0);
    private Action action;

    public String getName() {
        return name;
    }

    public Set<String> getSetOnline() {
        return setOnline;
    }

    public void setSetOnline(Set<String> setOnline) {
        this.setOnline = setOnline;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNameReserved() {
        return nameReserved;
    }

    public void setNameReserved(String nameReserved) {
        this.nameReserved = nameReserved;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
    
    public enum Action{
        CONNECT, DISCONNECT, SEND_ONE, SEND_ALL, USERS_ONLINE;
    }   
}
