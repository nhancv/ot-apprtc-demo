package org.appspot.apprtc.models.request;

import com.google.gson.annotations.SerializedName;

import org.appspot.apprtc.models.IdModel;
import org.appspot.apprtc.models.RoomModel;

import java.io.Serializable;

/**
 * Created by nhancao on 6/19/17.
 */

public class RegisterRoomRequest extends IdModel implements Serializable {

    @SerializedName("room")
    private RoomModel room;
    @SerializedName("token")
    private String token;

    public RegisterRoomRequest(String roomName) {
        this.id = "register";
        this.room = new RoomModel(null, roomName);
    }

    public RegisterRoomRequest(String roomName, String token) {
        this(roomName);
        this.token = token;
    }

}
