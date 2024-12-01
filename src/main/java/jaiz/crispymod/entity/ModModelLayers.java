package jaiz.crispymod.entity;

import jaiz.crispymod.CrispyMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {

    public static final EntityModelLayer DOLL =
            new EntityModelLayer(Identifier.of(CrispyMod.MOD_ID, "voodoo_doll"), "main");

}
