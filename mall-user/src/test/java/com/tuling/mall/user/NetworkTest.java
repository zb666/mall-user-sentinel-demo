package com.tuling.mall.user;

import org.junit.jupiter.api.Test;


import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * @author Fox
 */
public class NetworkTest {
    
    @Test
    public void test(){
        // 获得本机的所有网卡接口
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while(networkInterfaces.hasMoreElements()){
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                
                // 获取与该网卡绑定的ip地址
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()){
                    InetAddress inetAddress = inetAddresses.nextElement();
                    //获取IPV4地址
                    if(inetAddress instanceof Inet4Address){
                        System.out.println("networkInterface: "+networkInterface.getName());
                        System.out.println("HostName："+inetAddress.getHostName());
                        System.out.println("HostAddress: "+inetAddress.getHostAddress());
                        System.out.println("==============");
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        
    
    }
    
}
