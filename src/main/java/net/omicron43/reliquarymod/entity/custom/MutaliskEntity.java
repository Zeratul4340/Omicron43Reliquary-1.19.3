package net.omicron43.reliquarymod.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class MutaliskEntity extends PathAwareEntity /* implements IAnimatable */ {
    //try implementing Minecraft flutterable or see whatever the ghast or phantom does idk

    private int warmup;

    private int ticksLeft = 120;

    private static TrackedData<Integer> SPAWN_TIMER = null;
   /* private static final TrackedData<Integer> ANIMATION;
    private final AnimationBuilder DEATH_ANIMATION = new AnimationBuilder().addAnimation("animation.mutalisk.death", ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME);
    private final AnimationBuilder SPAWN_ANIMATION = new AnimationBuilder().addAnimation("animation.mutalisk.spawn", ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME);
    private final AnimationBuilder ATTACK_ANIMATION = new AnimationBuilder().addAnimation("animation.mutalisk.attack", ILoopType.EDefaultLoopTypes.LOOP);
    */

    //   private AnimationFactory factory = GeckoLibUtil.createFactory(this);
    //well anyhow there's a load of methods ill just let you fill this in or ill come back later im zzzzzzz sleepy
    protected MutaliskEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
    //this constructer needs a bit more too

}
