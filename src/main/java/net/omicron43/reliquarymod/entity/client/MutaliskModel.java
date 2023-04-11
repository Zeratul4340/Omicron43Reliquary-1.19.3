package net.omicron43.reliquarymod.entity.client;

import net.omicron43.reliquarymod.Omicron43Reliquary;
import net.omicron43.reliquarymod.entity.custom.MutaliskEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;


public class MutaliskModel extends GeoModel<MutaliskEntity> {
    

        @Override
        public Identifier getModelResource(MutaliskEntity animatable) {
            return new Identifier(Omicron43Reliquary.MOD_ID, "geo/mutalisk.geo.json");
        }

        @Override
        public Identifier getTextureResource(MutaliskEntity animatable) {
            return new Identifier(Omicron43Reliquary.MOD_ID, "textures/entity/mutalisk/omicron43mutalisktexture.png");
        }

        @Override
        public Identifier getAnimationResource(MutaliskEntity animatable) {
            return  new Identifier(Omicron43Reliquary.MOD_ID, "animations/mutalisk.animation.json");
        }

        @Override
        public void setCustomAnimations(MutaliskEntity animatable, long instanceId, AnimationState<MutaliskEntity> animationState) {
            CoreGeoBone head = getAnimationProcessor().getBone("head");

            if (head != null) {
                EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
                head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
                head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
            }
        }
    }
