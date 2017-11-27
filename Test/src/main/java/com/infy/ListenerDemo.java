/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infy;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author Divya_Tantri
 */
public class ListenerDemo implements HttpSessionListener{
    public static int user=0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        user++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        user--;
    }

}
