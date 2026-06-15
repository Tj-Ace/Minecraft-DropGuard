package com.tj.dropguard;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = DropGuardMod.MOD_ID, dist = Dist.CLIENT)
public final class DropGuardMod {
    public static final String MOD_ID = "drop_guard";

    public DropGuardMod() {
        // Client-only mod. The input lock itself lives in the mixin.
    }
}
