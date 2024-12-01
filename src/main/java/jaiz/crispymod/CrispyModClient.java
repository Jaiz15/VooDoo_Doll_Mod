package jaiz.crispymod;

import jaiz.crispymod.entity.ModEntities;
import jaiz.crispymod.entity.ModModelLayers;
import jaiz.crispymod.entity.VoodooModel;
import jaiz.crispymod.entity.VoodooRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrispyModClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		EntityRendererRegistry.register(ModEntities.DOLL, VoodooRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.DOLL, VoodooModel::getTexturedModelData);

	}
}