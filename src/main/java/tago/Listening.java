/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tago;

import com.github.nkzawa.emitter.Emitter;
import com.github.nkzawa.socketio.client.IO;
import static com.github.nkzawa.socketio.client.IO.socket;
import com.github.nkzawa.socketio.client.Socket;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Canoff
 */
public class Listening {

    private Socket socket;

    public Listening() throws URISyntaxException {
        this.socket = IO.socket("wss://realtime.tago.io/");
        socket.connect();
//        socket.emit("register", "783c0a20-5ef4-11e5-b9c0-5346110eed9a");

        socket.on("connect", new Emitter.Listener() {

            @Override
            public void call(Object... args) {
                socket.emit("register", "783c0a20-5ef4-11e5-b9c0-5346110eed9a");
                if (args.length>0) {
                }
            }
        });

        socket.on("data", new Emitter.Listener() {

            @Override
            public void call(Object... args) {
                if (args.length > 0) {
                }
            }
        });

        socket.on("disconnect", new Emitter.Listener() {

            @Override
            public void call(Object... args) {
                if (args.length > 0) {
                }
            }
        });

        socket.on("reconnect", new Emitter.Listener() {

            @Override
            public void call(Object... args) {
                socket.emit("register", "783c0a20-5ef4-11e5-b9c0-5346110eed9a");
                if (args.length > 0) {
                }
            }
        });

    }

}
