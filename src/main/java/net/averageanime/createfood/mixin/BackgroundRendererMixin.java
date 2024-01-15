package net.averageanime.createfood.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.averageanime.createfood.fluid.ModFluids;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.client.render.Camera;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.FluidState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Environment(EnvType.CLIENT)
@Mixin(BackgroundRenderer.class)
public abstract class BackgroundRendererMixin {
    @Shadow
    private static float red;

    @Shadow
    private static float green;

    @Shadow
    private static float blue;

    @ModifyArgs(method = "render", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;clearColor(FFFF)V", remap = false))
    private static void $modifyFogColors(Args args, Camera camera, float partialTicks, ClientWorld level, int renderDistanceChunks, float bossColorModifier) {
        FluidState state = level.getFluidState(camera.getBlockPos());
        if (ModFluids.isRedGelatinMix(state)) {
            red = (float) 226 / 255;
            green = (float) 85 / 255;
            blue = (float) 85 / 255;
        }
        if (ModFluids.isGelatinMix(state)) {
            red = (float) 90 / 255;
            green = (float) 85 / 255;
            blue = (float) 80 / 255;
        }
        if (ModFluids.isCreamFrosting(state)) {
            red = (float) 87 / 255;
            green = (float) 85 / 255;
            blue = (float) 74 / 255;
        }
        if (ModFluids.isCaramel(state)) {
            red = (float) 96 / 255;
            green = (float) 56 / 255;
            blue = (float) 36 / 255;
        }
        if (ModFluids.isBerryCreamFrosting(state)) {
            red = (float) 85 / 255;
            green = (float) 32 / 255;
            blue = (float) 32 / 255;
        }
        if (ModFluids.isChocolateCreamFrosting(state)) {
            red = (float) 96 / 255;
            green = (float) 56 / 255;
            blue = (float) 36 / 255;
        }
        if (ModFluids.isChocolateMilk(state)) {
            red = (float) 96 / 255;
            green = (float) 56 / 255;
            blue = (float) 36 / 255;
        }
        if (ModFluids.isHotChocolate(state)) {
            red = (float) 96 / 255;
            green = (float) 56 / 255;
            blue = (float) 36 / 255;
        }
        if (ModFluids.isHotWhiteChocolate(state)) {
            red = (float) 79 / 255;
            green = (float) 67 / 255;
            blue = (float) 56 / 255;
        }
        if (ModFluids.isHotDarkChocolate(state)) {
            red = (float) 29 / 255;
            green = (float) 12 / 255;
            blue = (float) 9 / 255;
        }
        if (ModFluids.isWhiteChocolate(state)) {
            red = (float) 79 / 255;
            green = (float) 67 / 255;
            blue = (float) 56 / 255;
        }
        if (ModFluids.isDarkChocolate(state)) {
            red = (float) 29 / 255;
            green = (float) 12 / 255;
            blue = (float) 9 / 255;
        }
        if (ModFluids.isCacaoButter(state)) {
            red = (float) 76 / 255;
            green = (float) 67 / 255;
            blue = (float) 50 / 255;
        }
        if (ModFluids.isCacaoMass(state)) {
            red = (float) 49 / 255;
            green = (float) 33 / 255;
            blue = (float) 18 / 255;
        }
        if (ModFluids.isGlowBerryCreamFrosting(state)) {
            red = (float) 69 / 255;
            green = (float) 47 / 255;
            blue = (float) 14 / 255;
        }
        if (ModFluids.isChorusFruitCreamFrosting(state)) {
            red = (float) 42 / 255;
            green = (float) 16 / 255;
            blue = (float) 60 / 255;
        }
    }


    @Inject(method = "applyFog", at = @At("HEAD"), cancellable = true)
    private static void $applyFog(Camera camera, FogType fogType, float viewDistance, boolean thickFog, float tickDelta, CallbackInfo ci) {
        assert MinecraftClient.getInstance().world != null;
        FluidState state = MinecraftClient.getInstance().world.getFluidState(camera.getBlockPos());
        if (ModFluids.isRedGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isBerryCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isGlowBerryCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChorusFruitCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChocolateCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChocolateMilk(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isWhiteChocolate(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isDarkChocolate(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCacaoButter(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCacaoMass(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCaramel(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
    }
}