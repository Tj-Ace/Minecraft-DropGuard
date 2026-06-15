package com.tj.dropguard;

import net.fabricmc.api.ClientModInitializer;

public final class DropGuardFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // The actual behavior is injected through the keyboard mixin.
    }
}
