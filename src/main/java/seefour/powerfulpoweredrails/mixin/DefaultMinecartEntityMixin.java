package seefour.powerfulpoweredrails.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import net.minecraft.entity.vehicle.DefaultMinecartController;
import seefour.powerfulpoweredrails.Powerfulpoweredrails;

@Mixin(DefaultMinecartController.class)
public abstract class DefaultMinecartEntityMixin {

    @ModifyConstant(
            method = "moveOnRail",
            constant = @Constant(doubleValue = 0.06) // 0.06 constant found in MC source code that we target to replace with our own value. DO NOT CHANGE
    )
    private double modifyPoweredRailAccelerationExperimental(double originalValue) {
        return Powerfulpoweredrails.ACCELERATION;
    }

}
