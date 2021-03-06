package mffs.render;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author Calclavia
 * 
 */
@SideOnly(Side.CLIENT)
public class FxMFFS extends EntityFX
{
	protected IEffectController controller;

	public FxMFFS(World par1World, double par2, double par4, double par6, double par8, double par10, double par12)
	{
		super(par1World, par2, par4, par6, par8, par10, par12);
	}

	public FxMFFS(World par1World, double par2, double par4, double par6)
	{
		super(par1World, par2, par4, par6);
	}

	@Override
	public void onUpdate()
	{
		if (this.controller != null)
		{
			if (!this.controller.canContinueEffect())
			{
				this.setDead();
			}
		}
	}

	public FxMFFS setController(IEffectController controller)
	{
		this.controller = controller;
		return this;
	}
}
