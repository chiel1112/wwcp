//This is a documentation file for copy pasting reussable details into a tender entity class.

//This is a documentation class for copy pasting into a freight tanker entity file.
package wwcp.entities.tender;

import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.RollingstockBase;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.RailUtility;
import ebf.timsquared.TiMSquared;
import ebf.timsquared.models.bogies.CMDBogie;
import ebf.timsquared.models.rollingstock.ModelGATX1300GallonTanker;
import fexcraft.tmt.slim.ModelBase;
import java.util.List;
import java.util.UUID;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wwcp.entities.SuperStat;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.Tender32Bogie;
import wwcp.models.tenders.Tender32;
import wwcp.worldwidecontentpack;

public class EntityT32 extends GenericRailTransport {


    public EntityT32(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityT32(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityT32(World world) {
        super(world);
    }

    public String transportName() {
        return SuperStat.T32Tender().name;
    }

    public String transportcountry() {
        return SuperStat.T32Tender().country;
    }

    public String transportYear() {
        return SuperStat.T32Tender().year;
    }

    public boolean isFictional() {
        return SuperStat.T32Tender().fictional;
    }

    @Override
    public String transportFuelType() {
        return null;
    }


    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(SuperStat.T32Tender().additionalTextTitle) + SuperStat.T32Tender().additionalText,
                RailUtility.translate(SuperStat.T32Tender().additionalTextTitle2) + SuperStat.T32Tender().additionalText2};}
    }
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.01f, 0.12F, 0.0F}, {-0.66F, 0.12F, 0.0F}};
    }

    public ModelBase[] bogieModels() {
        return new ModelBase[]{new Tender32Bogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{5.0F, -5.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    public float[][] modelOffsets() {
        return new float[][]{{-0.395f,-0.12F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/T32Tender/T32DB.png", new String[]{"textures/bogies/T32Bogie/T32BogieBlack.png"},
                "DB Livery", "The standarized T32 tender paint while in use for the DB");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/T32Tender/T32DR.png", new String[]{"textures/bogies/T32Bogie/T32BogieBlack.png"},
                "DRG Livery", "The standarized T32 tender paint while in use for the DRG");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/T32Tender/T32DR.png", new String[]{"textures/bogies/T32Bogie/T32BogieWhite.png"},
                "DRG Livery white wheels", "The standarized T32 tender paint with white wheels while in use for the DRG");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/T32Tender/T32DB.png", new String[]{"textures/bogies/T32Bogie/T32BogieWhite.png"},
                "DB Livery white wheels", "The standarized T32 tender paint with white wheels while in use for the DB");
    }

    public boolean isReinforced() {
        return SuperStat.T32Tender().reinforced;
    }

    public int getInventoryRows() {
        return 1;
    }

    public List<transportTypes> getTypes() {
        return transportTypes.TENDER.singleton();
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{4.025F, 2F, 1.5F};
    }

    public Item getItem() {
        return thisItem;
    }

    public int[] getTankCapacity() {
        return new int[]{13400};
    }

    public void manageFuel() {
        FuelHandler.manageTanker(this);
    }

    public float weightKg() {
        return 29900.0F;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Items.bed, 1), null, null, null, null, null, null, null, null};
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new Tender32()};
    }
}
