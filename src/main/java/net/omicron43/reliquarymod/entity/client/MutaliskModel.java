package net.omicron43.reliquarymod.entity.client;

import net.minecraft.util.Identifier;
import net.omicron43.reliquarymod.Omicron43Reliquary;
import net.omicron43.reliquarymod.entity.custom.MutaliskEntity;
import software.bernie.geckolib.model.GeoModel;

public class MutaliskModel extends GeoModel<MutaliskEntity> {
    

        @Override
        public Identifier getModelResource(MutaliskEntity object) {
            return new Identifier(Omicron43Reliquary.MOD_ID, "geo/mutalisk.geo.json");
        }

        @Override
        public Identifier getTextureResource(MutaliskEntity object) {
            return new Identifier(Omicron43Reliquary.MOD_ID, "textures/entity/mutalisk/omicron43mutalisktexture.png");
        }

        @Override
        public Identifier getAnimationResource(MutaliskEntity animatable) {
            return  new Identifier(Omicron43Reliquary.MOD_ID, "animations/mutalisk.animation.json");
        }


    }
