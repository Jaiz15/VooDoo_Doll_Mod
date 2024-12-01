package jaiz.crispymod;

import jaiz.crispymod.entity.ModEntities;
import jaiz.crispymod.entity.VoodooDollEntity;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrispyMod implements ModInitializer {
	public static final String MOD_ID = "crispymod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		FabricDefaultAttributeRegistry.register(ModEntities.DOLL, VoodooDollEntity.createVoodooAttributes());

		LOGGER.info("Hello Fabric world!");
	}
}