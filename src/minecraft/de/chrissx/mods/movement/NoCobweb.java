package de.chrissx.mods.movement;

import de.chrissx.mods.Mod;

public class NoCobweb extends Mod {

	public NoCobweb() {
		super("NoCobweb");
	}

	@Override
	public void onTick()
	{
		if(enabled)
			mc.thePlayer.isInWeb = false;
	}
}