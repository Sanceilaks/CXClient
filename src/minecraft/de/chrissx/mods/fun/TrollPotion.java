package de.chrissx.mods.fun;

import de.chrissx.mods.Semimod;
import de.chrissx.util.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagList;

public class TrollPotion extends Semimod {

	@Override
	public void toggle() {
		if(!mc.playerController.isInCreativeMode()) {
			Util.sendMessage("\u00a74You have to be in gm 1 in order to execute this!");
			return;
		}
		NBTTagList l = Util.newEffects();
		for(int i = 0; i < 23; i++)
			l = Util.addEffect(l, i, Integer.MAX_VALUE, Integer.MAX_VALUE);
		Util.cheatItem(Util.getCustomPotion(l, "Troller Potion of Trolling"), 36);
	}

	public TrollPotion() {
		super("TrollPotion");
	}
}