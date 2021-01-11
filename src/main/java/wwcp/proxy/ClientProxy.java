package wwcp.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import wwcp.EventManager;
import wwcp.tiles.render.RenderPlatformBlocks;


public class ClientProxy extends CommonProxy
{

    public static RenderPlatformBlocks renderer = new RenderPlatformBlocks();

    @Override
    public Object getRenderPlatform(){return renderer;}


    public static final TileEntitySpecialRenderer specialRenderer = new TileEntitySpecialRenderer() {
        @Override
        public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float p_147500_8_) {
            GL11.glPushMatrix();
            GL11.glTranslated(x,y, z);
            tileEntity.func_145828_a(null);
            GL11.glPopMatrix();
        }

        @Override
        protected void bindTexture(ResourceLocation p_147499_1_){}
    };

    public static EventManager eventManager = new EventManager();


    //Method added by Oskiek.
    @Override
    public void registerRenderers(){
        registerItemRenderers();
    }
    public void registerItemRenderers()
    {

    }
}

