package de.chrissx.mods.combat;

import de.chrissx.mods.Mod;

public class AutoRespawn extends Mod {

	public AutoRespawn() {
		super("AutoRespawn");
	}

	@Override
	public void onTick()
	{
		if(enabled && mc.thePlayer.isDead)
		{
			mc.thePlayer.respawnPlayer();
			mc.displayGuiScreen(null);
		}
	}
}