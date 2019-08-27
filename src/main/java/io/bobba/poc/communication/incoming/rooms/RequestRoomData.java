package io.bobba.poc.communication.incoming.rooms;

import io.bobba.poc.BobbaEnvironment;
import io.bobba.poc.communication.incoming.IIncomingEvent;
import io.bobba.poc.communication.protocol.ClientMessage;
import io.bobba.poc.core.gameclients.GameClient;

public class RequestRoomData implements IIncomingEvent {
    @Override
    public void handle(GameClient client, ClientMessage request) {
        BobbaEnvironment.getInstance().getGame().getRoom().getRoomUserManager().addUserToRoom(client);
    }
}
