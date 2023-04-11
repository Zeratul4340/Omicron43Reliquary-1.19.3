package net.omicron43.reliquarymod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.omicron43.reliquarymod.entity.ModEntities;
import net.omicron43.reliquarymod.entity.client.MutaliskRenderer;

public class Omicron43ReliquaryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.MUTALISK, MutaliskRenderer::new);

    }
}
