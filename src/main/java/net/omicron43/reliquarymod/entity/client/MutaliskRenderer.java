package net.omicron43.reliquarymod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.omicron43.reliquarymod.Omicron43Reliquary;
import net.omicron43.reliquarymod.entity.custom.MutaliskEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MutaliskRenderer extends GeoEntityRenderer<MutaliskEntity> {
    public MutaliskRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new MutaliskModel());
    }

    @Override
    public Identifier getTextureLocation(MutaliskEntity animatable) {
        return new Identifier(Omicron43Reliquary.MOD_ID, "textures/entity/mutalisk/omicron43mutalisktexture.png");
    }

    @Override
    public void render(MutaliskEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()){
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
