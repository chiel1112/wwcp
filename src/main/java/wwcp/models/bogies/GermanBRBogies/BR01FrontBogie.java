//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BR01FrontBogie
// Model Creator: 
// Created on: -
// Last changed on: -

package wwcp.models.bogies.GermanBRBogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BR01FrontBogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public BR01FrontBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box15
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box16
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box6
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box7
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box8
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box127
		bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box127
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box28

		bodyModel[0].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[0].setRotationPoint(8.5F, 6F, 6.01F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Import Box16
		bodyModel[1].setRotationPoint(-7.5F, 4.5F, -6F);

		bodyModel[2].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		bodyModel[2].setRotationPoint(-6.5F, 6F, 6.01F);

		bodyModel[3].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[3].setRotationPoint(8.5F, 6F, -6.01F);

		bodyModel[4].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[4].setRotationPoint(-6.5F, 6F, -6.01F);

		bodyModel[5].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Import Box127
		bodyModel[5].setRotationPoint(8.5F, 6F, -6F);
		bodyModel[5].rotateAngleZ = 1.57079633F;

		bodyModel[6].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Import Box127
		bodyModel[6].setRotationPoint(-6.5F, 6F, -6F);
		bodyModel[6].rotateAngleZ = 1.57079633F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[7].setRotationPoint(-0.5F, 3F, -1F);
	}
}