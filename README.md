# Drop Guard

Stop accidental item drops without changing normal inventory handling.

Drop Guard is a lightweight client-side mod that intercepts the player’s drop key on the client and blocks the world-drop action unless you are actively interacting with an inventory screen. If you rebound the drop key to something other than `Q`, the mod follows that binding automatically because it checks the live keybind state instead of hardcoding a specific key.

## What it does

- Prevents accidental item drops while moving around in the world
- Preserves normal dropping from inventory screens when a slot is hovered
- Respects the current drop keybind from Controls
- Runs entirely on the client
- Works without any server-side companion

## Release Contents

- NeoForge jar
- Fabric jar
- Separate source trees for each loader

## Behavior

The mod only intervenes on actual drop-key presses. It ignores non-press events, ignores unrelated keys, and exits immediately if a GUI is open so vanilla inventory behavior is left untouched. That keeps the hot path small and avoids extra work during normal play.

## Technical Summary

### NeoForge

The NeoForge build mixes into the client keyboard handler and cancels the event before vanilla processes a world drop. It checks:

1. The event is a key press
2. A client player exists
3. The pressed input matches the current drop binding
4. No screen is open

If all four conditions are true, the event is canceled and no item is dropped into the world.

### Fabric

The Fabric build uses the same logic through Yarn-mapped client input hooks. It compares the incoming key input against the active `dropKey` binding and cancels only when the player is in the world, not inside a GUI.

## Notes

- No packets are sent
- No commands are added
- No inventory slots are modified
- No server installation is required
- The mod stays out of the way unless the drop key would create a world drop
