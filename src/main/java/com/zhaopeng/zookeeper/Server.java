package com.zhaopeng.zookeeper;

import org.apache.zookeeper.server.quorum.QuorumPeerMain;

import java.net.URL;

/**
 * Created by zhaopeng on 2018/1/14.
 */
public class Server {

    public static void main(String args[]){

        String arg[]=new String[1];
       URL url= Server.class.getClassLoader().getResource("zoo.cfg");

        String config=url.getFile();
        arg[0]=config;
        QuorumPeerMain.main(arg);

    }
}
