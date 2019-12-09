package wwcp.entities.locomotives.electrics;//This is a documentation class for copy pasting into an electric train class.


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import wwcp.entities.SuperStat;
import wwcp.models.bogies.flexxpower;
import wwcp.models.locomotives.F140MS2;
import wwcp.worldwidecontentpack;

import java.util.UUID;


// XXXX
// YYYY
// ZZZZ
// QQQQ

public class EntityTraxxF140MS2 extends EntityTrainCore {

    public static final Item thisItem = new ItemTransport(new EntityTraxxF140MS2(null), worldwidecontentpack.MODID,worldwidecontentpack.European);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityTraxxF140MS2(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityTraxxF140MS2(World world){
        super(world);
    }

    @Override
    public String transportName() { return SuperStat.F140MS2E().name; }

    @Override
    public String transportcountry() { return SuperStat.F140MS2E().country; }

    @Override
    public String transportYear() { return SuperStat.F140MS2E().year; }

    @Override
    public String transportFuelType() {
        return SuperStat.F140MS2E().fuel;
    }
    @Override
    public boolean isFictional() {
        return SuperStat.F140MS2E().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return SuperStat.F140MS2E().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return SuperStat.F140MS2E().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  SuperStat.F140MS2E().weightinKGs;
    }

    public boolean isReinforced() {
        return SuperStat.F140MS2E().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(SuperStat.F140MS2E().additionalTextTitle) + SuperStat.F140MS2E().additionalText,
                RailUtility.translate(SuperStat.F140MS2E().additionalTextTitle2) + SuperStat.F140MS2E().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0?SuperStat.F140MS2E().backTopSpeed:SuperStat.F140MS2E().topSpeed;}

    @Override
    //todo Needs an SBB RE 484 skin before final implementation, remove other skins
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T1.png", "textures/bogies/Flexxpower.png","Belgian Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T2.png", "textures/bogies/Flexxpower.png","NS Livery", "Used by the NS in their regular service");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T3.png", "textures/bogies/Flexxpower.png", "Polish Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T4.png", "textures/bogies/Flexxpower.png","Easter Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T5.png", "textures/bogies/Flexxpower.png","Silesian Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T6.png", "textures/bogies/Flexxpower.png", "HLE28 NMBS Cargo", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T7.png", "textures/bogies/Flexxpower.png","Valentines Day Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T8.png", "textures/bogies/Flexxpower.png","WWCP Commercial Livery", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T9.png", "textures/bogies/Flexxpower.png","StPatricks Day Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T10.png", "textures/bogies/Flexxpower.png", "Halloween Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
    }
    @Override
    public float getMaxFuel(){return 20;}

//    @Override
    public TrainsInMotion.transportTypes getType() {return TrainsInMotion.transportTypes.ELECTRIC; }

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-3.82f,1.3f, -0.25f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{9.5f,2.5f,1.5f};
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    /**
     * <h2>Hitbox offsets</h2>
     * @return defines the positions for the hitboxes in blocks. 0 being the center, negative values being towards the front. the first and last values define the positions of the couplers
     */

    @Override
    public float[][] bogieModelOffsets(){return new float[][]{{2.5f,0.05f,0},{-2.5f,0.05f,0}};
    }
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new flexxpower()}; }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{2, -2};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,-0.05F,0.F}};}

    /**
     * <h2>rider sit or stand</h2>
     * @return true if the rider(s) should be sitting, false if the rider should be standing.
     */
    @Override
    public boolean shouldRiderSit(){
        return true;
    }
    /**
     * <h2>reinforced transport</h2>
     * this returns if this specific entity is reinforced (explosion proof and damage resistant).
     * since this is a function it can b
     * te conditional as well, for instance if it has a specific skin.
     */

    /**
     * <h2>Fluid Tank Capacity</h2>
     */
    //@Override
    public int[] getTankCapacity(){return new int[]{9161, 800};}

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        switch (slot){
            case 400:{return stack!=null && stack.getItem() ==Items.redstone;}
            default:{return true;}
        }}

    /**
     * <h2>fuel management</h2>
     * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
     */

    public void manageFuel() {
        this.fuelHandler.manageElectric(this);
    }

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }

    public ModelBase[] getModel(){return new ModelBase[]{new F140MS2()};}

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("xxxxxxx.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("xxxxxxx.ogg");}
}


