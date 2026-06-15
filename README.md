# Drop Guard

Stop accidental item drops without changing inventory behavior.

Drop Guard is a tiny client-side mod that blocks the normal in-world drop action, but still lets you drop items from inventory screens while hovering a slot. If you rebound drop from `Q` to another key, the mod follows that binding automatically.

## Highlights

- Blocks accidental drops in the world
- Still allows normal inventory dropping
- Tracks your current drop keybind dynamically
- Client-only, no server install required
- Available for both NeoForge and Fabric

## Downloads

- NeoForge jar and matching sources
- Fabric jar and matching sources

## How It Works

Pressing the drop key outside a GUI is intercepted on the client and canceled before vanilla can handle it. Inside inventory screens, the event is allowed through so slot dropping works like normal.

## Notes

- Built for client use only
- No server companion required
- Uses your current drop keybind
- No custom packets or commands
