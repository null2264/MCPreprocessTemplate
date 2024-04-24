package io.github.null2264.examplemod;

//#if FORGE>=1
    //#if FORGE==2
    //$$ @net.neoforged.fml.common.Mod(ExampleMod.MOD_ID)
    //#else
    //$$ @net.minecraftforge.fml.common.Mod(ExampleMod.MOD_ID)
    //#endif
//$$ public class ExampleMod
//#else
public class ExampleMod implements net.fabricmc.api.ModInitializer
//#endif
{
    public static final String MOD_ID = "examplemod";

    //#if FABRIC>=1
    @Override
    public void onInitialize() {}
    //#endif
}
