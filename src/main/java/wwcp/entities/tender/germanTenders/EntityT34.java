//This is a documentation file for copy pasting reussable details into a tender entity class.

//This is a documentation class for copy pasting into a freight tanker entity file.
package wwcp.entities.tender.germanTenders;

import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.TenderBogies.BR01Line.*;
import wwcp.models.tenders.germanTenders.*;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;

public class EntityT34 extends GenericRailTransport {


    public EntityT34(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityT34(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityT34(World world) {
        super(world);
    }

    public String transportName() {
        return Transport.T34().name;
    }

    public String transportcountry() {
        return Transport.T34().country;
    }

    public String transportYear() {
        return Transport.T34().year;
    }

    public boolean isFictional() {
        return Transport.T34().fictional;
    }

    public float weightKg() {
        return Transport.T34().weightinKGs;
    }

    @Override
    public String transportFuelType() {
        return null;
    }


    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.T34().additionalTextTitle) + Transport.T34().additionalText,
                RailUtility.translate(Transport.T34().additionalTextTitle2) + Transport.T34().additionalText2};}
    }
    public float[][] bogieModelOffsets() {
        return new float[][]{{0.98f, 0.12F, 0.0F}, {-0.7F, 0.12F, 0.0F}};
    }

    public ModelBase[] bogieModels() {
        return new ModelBase[]{new T34Bogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{0.7F, -0.975F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    public float[][] modelOffsets() {
        return new float[][]{{-0.325f,-0.10F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/germanTenders/T34DRG.png", new String[]{"textures/bogies/germanTenderBogies/T34BogieBlack.png"},
                "DRG", "The standarized T34 tender paint while in use for the DRG");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/germanTenders/T34.png", new String[]{"textures/bogies/germanTenderBogies/T34BogieBlack.png"},
                "DB", "The standarized T34 tender paint while in use for the DB");
    }

    public boolean isReinforced() {
        return Transport.T34().reinforced;
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
        return new float[]{3.9F, 2F, 1.5F};
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

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Items.bed, 1), null, null, null, null, null, null, null, null};
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new T34()};
    }
}
