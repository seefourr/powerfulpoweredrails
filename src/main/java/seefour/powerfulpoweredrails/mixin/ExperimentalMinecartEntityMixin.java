package seefour.powerfulpoweredrails.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import net.minecraft.entity.vehicle.ExperimentalMinecartController;
import seefour.powerfulpoweredrails.Powerfulpoweredrails;

@Mixin(ExperimentalMinecartController.class)
public abstract class ExperimentalMinecartEntityMixin {

    @ModifyConstant(
            method = "accelerateFromPoweredRail",
            constant = @Constant(doubleValue = 0.06)
    )
    private double modifyPoweredRailAccelerationExperimental(double originalValue) {
        return Powerfulpoweredrails.ACCELERATION;
    }
}