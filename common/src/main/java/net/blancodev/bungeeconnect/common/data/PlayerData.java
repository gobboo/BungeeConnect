package net.blancodev.bungeeconnect.common.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class PlayerData {

    private final String server;

    private final UUID uuid;
    private final String username;
    private final String displayName;

    private final String ip;

}
