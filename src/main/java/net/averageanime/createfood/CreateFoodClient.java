package net.averageanime.createfood;

import net.averageanime.createfood.fluid.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.util.Identifier;

public class CreateFoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CREAM_FROSTING, ModFluids.FLOWING_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cream_frosting_still"),
                new Identifier("createfood:block/cream_frosting_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BERRY_CREAM_FROSTING, ModFluids.FLOWING_BERRY_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/berry_cream_frosting_still"),
                new Identifier("createfood:block/berry_cream_frosting_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CARAMEL, ModFluids.FLOWING_CARAMEL, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/caramel_still"),
                new Identifier("createfood:block/caramel_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHOCOLATE_CREAM_FROSTING, ModFluids.FLOWING_CHOCOLATE_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chocolate_frosting_still"),
                new Identifier("createfood:block/chocolate_frosting_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHOCOLATE_MILK, ModFluids.FLOWING_CHOCOLATE_MILK, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chocolate_milk_still"),
                new Identifier("createfood:block/chocolate_milk_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_HOT_CHOCOLATE, ModFluids.FLOWING_HOT_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/hot_chocolate_still"),
                new Identifier("createfood:block/hot_chocolate_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CACAO_MASS, ModFluids.FLOWING_CACAO_MASS, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cacao_mass_still"),
                new Identifier("createfood:block/cacao_mass_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CACAO_BUTTER, ModFluids.FLOWING_CACAO_BUTTER, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cacao_butter_still"),
                new Identifier("createfood:block/cacao_butter_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_WHITE_CHOCOLATE, ModFluids.FLOWING_WHITE_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/white_chocolate_still"),
                new Identifier("createfood:block/white_chocolate_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_DARK_CHOCOLATE, ModFluids.FLOWING_DARK_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/dark_chocolate_still"),
                new Identifier("createfood:block/dark_chocolate_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_HOT_WHITE_CHOCOLATE, ModFluids.FLOWING_HOT_WHITE_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/hot_white_chocolate_still"),
                new Identifier("createfood:block/hot_white_chocolate_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_HOT_DARK_CHOCOLATE, ModFluids.FLOWING_HOT_DARK_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/hot_dark_chocolate_still"),
                new Identifier("createfood:block/hot_dark_chocolate_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GLOW_BERRY_CREAM_FROSTING, ModFluids.FLOWING_GLOW_BERRY_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/glow_berry_cream_frosting_still"),
                new Identifier("createfood:block/glow_berry_cream_frosting_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHORUS_FRUIT_CREAM_FROSTING, ModFluids.FLOWING_CHORUS_FRUIT_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chorus_fruit_cream_frosting_still"),
                new Identifier("createfood:block/chorus_fruit_cream_frosting_flow")
        ));
    }
}
