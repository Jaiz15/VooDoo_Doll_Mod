package jaiz.crispymod.entity;


import jaiz.crispymod.CrispyMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<VoodooDollEntity> DOLL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(CrispyMod.MOD_ID, "voodoo_doll"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, VoodooDollEntity::new).dimensions(EntityDimensions.fixed(0.6f, 1.8f)).build());

}
