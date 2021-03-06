package dev.jokr.localnet.discovery.models;

import java.io.Serializable;

/**
 * Created by JoKr on 8/27/2016.
 */
public class DiscoveryReply implements Serializable {

    private String ip;
    private int port;

    public DiscoveryReply(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }
}
