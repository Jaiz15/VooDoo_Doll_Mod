package jaiz.crispymod.entity;

import com.google.common.collect.Maps;
import jaiz.crispymod.CrispyMod;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class VoodooRenderer extends MobEntityRenderer<VoodooDollEntity, VoodooModel<VoodooDollEntity>> {

    private static final Identifier DEFAULT = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo.png");
    private static final Identifier EMCHMU = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo_em.png");
    private static final Identifier JAM = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/jam_voodoo.png");
    private static final Identifier COLL = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/coll_voodoo.png");
    private static final Identifier CRISPY = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/crispy_voodoo.png");
    private static final Identifier MINT = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/mint_voodoo.png");
    private static final Identifier BH = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo_bh.png");
    private static final Identifier CC = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo_cc.png");
    private static final Identifier CLOVER = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo_clover.png");
    private static final Identifier HEUL = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo_heul.png");
    private static final Identifier JIM = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo_jim.png");
    private static final Identifier MYCEN = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo_mycen.png");
    private static final Identifier SATE = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo_sate.png");
    private static final Identifier SINNA = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo_sinna.png");
    private static final Identifier SPPRINKLES = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo_sprinkles.png");
    private static final Identifier TORT = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo_tort.png");
    private static final Identifier JAIZ = Identifier.of(CrispyMod.MOD_ID,"textures/entity/doll/voodoo_jaiz.png");

    public VoodooRenderer(EntityRendererFactory.Context context) {
        super(context, new VoodooModel<>(context.getPart(ModModelLayers.DOLL)), 0.4f);
    }

    @Override
    public Identifier getTexture(VoodooDollEntity instance) {
        String string = Formatting.strip(instance.getName().getString());
        if ("MrTortelliniBoi".equals(string)) {
            return TORT;
        }
        if ("spprinkles".equals(string)) {
            return SPPRINKLES;
        }
        if ("Sinnabuns4".equals(string)) {
            return SINNA;
        }
        if ("satenoodle".equals(string)) {
            return SATE;
        }
        if ("Jaiz__".equals(string)) {
            return JAIZ;
        }
        if ("Jaiz".equals(string)) {
            return JAIZ;
        }
        if ("Jaiz15".equals(string)) {
            return JAIZ;
        }
        if ("JaizLIVE".equals(string)) {
            return JAIZ;
        }
        if ("emchmu".equals(string)) {
            return EMCHMU;
        }
        if ("Jampottbong".equals(string)) {
            return JAM;
        }
        if ("JustColl".equals(string)) {
            return COLL;
        }
        if ("Crispy156".equals(string)) {
            return CRISPY;
        }
        if ("garlicmint".equals(string)) {
            return MINT;
        }
        if ("Bh__".equals(string)) {
            return BH;
        }
        if ("HiImCC".equals(string)) {
            return CC;
        }
        if ("HilmCC".equals(string)) {
            return CC;
        }
        if ("misfitclovers".equals(string)) {
            return CLOVER;
        }
        if ("heulandite2".equals(string)) {
            return HEUL;
        }
        if ("itsphysicsjim".equals(string)) {
            return JIM;
        }
        if ("mycenria".equals(string)) {
            return MYCEN;
        }
        return DEFAULT;
    }

    @Override
    public void render(VoodooDollEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

}
