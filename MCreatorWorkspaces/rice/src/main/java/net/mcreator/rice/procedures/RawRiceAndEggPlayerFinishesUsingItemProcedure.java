package net.mcreator.rice.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.rice.RiceMod;

import java.util.Map;

public class RawRiceAndEggPlayerFinishesUsingItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RiceMod.LOGGER.warn("Failed to load dependency entity for procedure RawRiceAndEggPlayerFinishesUsingItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() <= 0.7) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity)
						.addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) (60 + 100 * Math.random()), (int) 1, (false), (false)));
		}
	}
}
