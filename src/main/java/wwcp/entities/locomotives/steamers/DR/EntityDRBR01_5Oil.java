package wwcp.entities.locomotives.steamers.DR;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.GermanBRBogies.BR01BackBogie;
import wwcp.models.bogies.GermanBRBogies.BR01FrontBogie;
import wwcp.models.locomotives.steamers.GermanBR.BR01.DRBR01.DR_BR01_5Oil;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityDRBR01_5Oil extends EntityTrainCore {

    public EntityDRBR01_5Oil(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityDRBR01_5Oil(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityDRBR01_5Oil(World world) {
        super(world);
    }

    @Override
    public float getPlayerScale(){return 0.65f;}

    @Override
    public String transportName() {
        return Transport.DRBR01_5Oil().name;
    }

    @Override
    public String transportcountry() {
        return Transport.DRBR01_5Oil().country;
    }

    @Override
    public String transportYear() {
        return Transport.DRBR01_5Oil().year;
    }

    @Override
    public String transportFuelType() {
        return Transport.DRBR01_5Oil().fuel;
    }

    @Override
    public boolean isFictional() {
        return Transport.DRBR01_5Oil().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return Transport.DRBR01_5Oil().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return Transport.DRBR01_5Oil().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return Transport.DRBR01_5Oil().weightinKGs;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.DRBR01_5Oil().additionalTextTitle) + Transport.DRBR01_5Oil().additionalText,
                    RailUtility.translate(Transport.DRBR01_5Oil().additionalTextTitle2) + Transport.DRBR01_5Oil().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? Transport.DRBR01_5Oil().backTopSpeed : Transport.DRBR01_5Oil().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DRBR01/DR_BR01_5_Oil_1.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "DR BR 01.5 1", "DR BR 01.5 variant 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DRBR01/DR_BR01_5_Oil_2.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "DR BR 01.5 2", "DR BR 01.5 variant 2");
    }

    public int getInventoryRows() {
        return 1;
    }

    public transportTypes getType() {
        return transportTypes.STEAM;
    }
 
    public float getMaxFuel() {
        return 1.0F;
    }

    public float[][] getRiderOffsets() {
        return new float[][]{{3.3F, 1.6F, 0.0F}};
    }

    public float[] getHitboxSize() {
        return new float[]{7.22F, 2.1F, 1.3F};
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{null, null, null, null, null, null, null, null, null};
    }

    public float getPistonOffset() {
        return 0.5F;
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.38f, 0.1f, 0}, {-2.75f, 0.1f, 0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new BR01FrontBogie(), new BR01BackBogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.20F, -2.31F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.11f, -0.1F, 0.F}};
    }

    public boolean shouldRiderSit() {
        return false;
    }

    public boolean isReinforced() {
        return Transport.DRBR01().reinforced;
    }

    public int[] getTankCapacity() {
        return new int[]{9161, 800};
    }

    public int getRFCapacity() {
        return 0;
    }

    public String[] getTankFilters(int tank) {
        switch (tank) {
            case 0:
                return new String[]{FluidRegistry.WATER.getName()};
            default:
                return new String[]{FluidRegistry.LAVA.getName()};
        }
    }

    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        switch (slot) {
            case 400:
                return TileEntityFurnace.getItemBurnTime(stack) > 0;
            case 401:
                return FluidContainerRegistry.getFluidForFilledItem(stack) != null && this.canFill((ForgeDirection) null, FluidContainerRegistry.getFluidForFilledItem(stack).getFluid());
            default:
                return true;
        }
    }

    public void manageFuel() {
        this.fuelHandler.manageSteam(this);
    }

    public Item getItem() {
        return thisItem;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new DR_BR01_5Oil()};
    }

    @SideOnly(Side.CLIENT)
    public ResourceLocation getHorn() {
        return URIRegistry.SOUND_HORN.getResource("XXXXXXXXXX.ogg");
    }

    @SideOnly(Side.CLIENT)
    public ResourceLocation getRunningSound() {
        return URIRegistry.SOUND_RUNNING.getResource("XXXXXXX.ogg");
    }
}

