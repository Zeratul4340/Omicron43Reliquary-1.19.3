package net.omicron43.reliquarymod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.omicron43.reliquarymod.entity.custom.MutaliskEntity;
import omicron43.reliquarymod.Omicron43Reliquary;

public class ModEntities {
    public static final EntityType<MutaliskEntity> MUTALISK = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Omicron43Reliquary.MOD_ID, "mutalisk"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MutaliskEntity::new)
                    .dimensions(EntityDimensions.fixed(3.25F, 5F)).build());

}
