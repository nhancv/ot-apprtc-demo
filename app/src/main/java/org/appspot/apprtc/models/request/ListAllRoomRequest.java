package org.appspot.apprtc.models.request;

import com.google.gson.annotations.SerializedName;

import org.appspot.apprtc.models.IdModel;

import java.io.Serializable;

/**
 * Created by nhancao on 6/19/17.
 */

public class ListAllRoomRequest extends IdModel implements Serializable {

    @SerializedName("token")
    private String token;

    public ListAllRoomRequest(String token) {
        this.id = "roomList";
        this.token = token;
    }
}
