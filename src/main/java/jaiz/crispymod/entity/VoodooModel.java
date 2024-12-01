
package jaiz.crispymod.entity;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
   
public class VoodooModel<T extends VoodooDollEntity> extends SinglePartEntityModel<T> {
	private final ModelPart doll;

	public VoodooModel(ModelPart root) {
		this.doll = root.getChild("doll");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData doll = modelPartData.addChild("doll", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 1.0F));

		ModelPartData head = doll.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(32, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, -24.0F, -1.0F));

		ModelPartData body = doll.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-8.0F, -12.0F, 0.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 32).cuboid(-8.0F, -12.0F, 0.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(4.0F, -12.0F, -3.0F));

		ModelPartData right_arm = doll.addChild("right_arm", ModelPartBuilder.create().uv(40, 16).cuboid(-3.0F, -1.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(40, 32).cuboid(-3.0F, -1.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(-4.0F, -23.0F, -1.0F));

		ModelPartData left_arm = doll.addChild("left_arm", ModelPartBuilder.create().uv(32, 48).cuboid(0.0F, -1.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(48, 48).cuboid(0.0F, -1.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(4.0F, -23.0F, -1.0F));

		ModelPartData right_leg = doll.addChild("right_leg", ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(-2.0F, -12.0F, -1.0F));

		ModelPartData left_leg = doll.addChild("left_leg", ModelPartBuilder.create().uv(16, 48).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 48).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(2.0F, -12.0F, -1.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void setAngles(VoodooDollEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.animateMovement(VoodooAnimation.VOODOO_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
	}

	@Override
	public ModelPart getPart() {
		return doll;
	}
}