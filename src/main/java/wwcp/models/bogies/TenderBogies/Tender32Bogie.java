//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.01.2019 - 21:17:44
// Last changed on: 28.01.2019 - 21:17:44

package wwcp.models.bogies.TenderBogies; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Tender32Bogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Tender32Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[62];

		initbodyModel_1();
		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 31
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 33
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 35
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 34
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 30
		bodyModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 28
		bodyModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 30
		bodyModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 30
		bodyModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 30
		bodyModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 30
		bodyModel[13] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 30
		bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 30
		bodyModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 43
		bodyModel[19] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 43
		bodyModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 49
		bodyModel[22] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 50
		bodyModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 50
		bodyModel[24] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 50
		bodyModel[25] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 6
		bodyModel[28] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 6
		bodyModel[32] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 6
		bodyModel[33] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 6
		bodyModel[34] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 6
		bodyModel[35] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 64
		bodyModel[36] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 65
		bodyModel[37] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 66
		bodyModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 67
		bodyModel[39] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 68
		bodyModel[40] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 69
		bodyModel[41] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 70
		bodyModel[42] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 71
		bodyModel[43] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 72
		bodyModel[44] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 73
		bodyModel[45] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 78
		bodyModel[46] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 79
		bodyModel[47] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 80
		bodyModel[48] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 81
		bodyModel[49] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 82
		bodyModel[50] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 83
		bodyModel[51] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 50
		bodyModel[52] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 43
		bodyModel[53] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 43
		bodyModel[54] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 87
		bodyModel[55] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 88
		bodyModel[56] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 89
		bodyModel[57] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 90
		bodyModel[58] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 16
		bodyModel[59] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 16
		bodyModel[60] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 61

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[0].setRotationPoint(-7F, 6F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[1].setRotationPoint(-1F, 3F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(7F, 6F, -7F);

		bodyModel[3].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[3].setRotationPoint(-6.5F, 6.5F, 5.95F);

		bodyModel[4].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[4].setRotationPoint(-6.5F, 6.5F, -5.95F);

		bodyModel[5].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[5].setRotationPoint(7.5F, 6.5F, -5.95F);

		bodyModel[6].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[6].setRotationPoint(7.5F, 6.5F, 5.95F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[7].setRotationPoint(-8F, 3F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 28
		bodyModel[8].setRotationPoint(-1F, 5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 30
		bodyModel[9].setRotationPoint(-5F, 3.5F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[10].setRotationPoint(-2F, 3.5F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[11].setRotationPoint(6F, 3F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[12].setRotationPoint(3F, 3.5F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[13].setRotationPoint(-2F, 4.5F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[14].setRotationPoint(2F, 4.5F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 1.5F, -0.25F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[15].setRotationPoint(3F, 7.5F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 30
		bodyModel[16].setRotationPoint(-5F, 7.5F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[17].setRotationPoint(-2F, 7.5F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.125F, 0F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -3F, -0.875F, -0.875F, -3F, -0.875F, -0.875F, -3F, 0.125F, 0.125F, -3F, 0.125F); // Box 43
		bodyModel[18].setRotationPoint(-4.75F, 6F, -8.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.125F, 0F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -3F, -0.875F, -0.875F, -3F, -0.875F, -0.875F, -3F, 0.125F, 0.125F, -3F, 0.125F); // Box 43
		bodyModel[19].setRotationPoint(-9.25F, 6F, -8.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 28
		bodyModel[20].setRotationPoint(-1F, 5F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[21].setRotationPoint(-1F, 5F, 1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 50
		bodyModel[22].setRotationPoint(-1F, 5F, 1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 50
		bodyModel[23].setRotationPoint(-1F, 5F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 50
		bodyModel[24].setRotationPoint(-1F, 7.5F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 30
		bodyModel[25].setRotationPoint(9F, 3.5F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 30
		bodyModel[26].setRotationPoint(9F, 7.5F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 6
		bodyModel[27].setRotationPoint(11F, 3.5F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 6
		bodyModel[28].setRotationPoint(-11F, 3.5F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(-10F, 3.5F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 1.5F, -0.25F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-10F, 7.5F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 6
		bodyModel[31].setRotationPoint(-12F, 7.5F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 6
		bodyModel[32].setRotationPoint(11F, 7.5F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 6
		bodyModel[33].setRotationPoint(11F, 4.5F, -6.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -0.25F); // Box 6
		bodyModel[34].setRotationPoint(-11F, 4.5F, -6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[35].setRotationPoint(-8F, 3F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F); // Box 65
		bodyModel[36].setRotationPoint(-5F, 3.5F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 66
		bodyModel[37].setRotationPoint(-2F, 3.5F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 67
		bodyModel[38].setRotationPoint(6F, 3F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F); // Box 68
		bodyModel[39].setRotationPoint(3F, 3.5F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 69
		bodyModel[40].setRotationPoint(-2F, 4.5F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 70
		bodyModel[41].setRotationPoint(2F, 4.5F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F); // Box 71
		bodyModel[42].setRotationPoint(3F, 7.5F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1.5F, -0.25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F); // Box 72
		bodyModel[43].setRotationPoint(-5F, 7.5F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 73
		bodyModel[44].setRotationPoint(-2F, 7.5F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F); // Box 78
		bodyModel[45].setRotationPoint(9F, 3.5F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1.5F, -0.25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F); // Box 79
		bodyModel[46].setRotationPoint(9F, 7.5F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F); // Box 80
		bodyModel[47].setRotationPoint(-10F, 3.5F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F); // Box 81
		bodyModel[48].setRotationPoint(-10F, 7.5F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 82
		bodyModel[49].setRotationPoint(11F, 4.5F, 5.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -0.25F); // Box 83
		bodyModel[50].setRotationPoint(-11F, 4.5F, 5.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 50
		bodyModel[51].setRotationPoint(-1F, 8F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.125F, 0F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -3F, -0.875F, -0.875F, -3F, -0.875F, -0.875F, -3F, 0.125F, 0.125F, -3F, 0.125F); // Box 43
		bodyModel[52].setRotationPoint(9.25F, 6F, -8.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.125F, 0F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -3F, -0.875F, -0.875F, -3F, -0.875F, -0.875F, -3F, 0.125F, 0.125F, -3F, 0.125F); // Box 43
		bodyModel[53].setRotationPoint(4.75F, 6F, -8.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, -3F, 0.125F, -0.875F, -3F, 0.125F, -0.875F, -3F, -0.875F, 0.125F, -3F, -0.875F); // Box 87
		bodyModel[54].setRotationPoint(-4.75F, 6F, 6.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, -3F, 0.125F, -0.875F, -3F, 0.125F, -0.875F, -3F, -0.875F, 0.125F, -3F, -0.875F); // Box 88
		bodyModel[55].setRotationPoint(-9.25F, 6F, 6.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, -3F, 0.125F, -0.875F, -3F, 0.125F, -0.875F, -3F, -0.875F, 0.125F, -3F, -0.875F); // Box 89
		bodyModel[56].setRotationPoint(9.25F, 6F, 6.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, -3F, 0.125F, -0.875F, -3F, 0.125F, -0.875F, -3F, -0.875F, 0.125F, -3F, -0.875F); // Box 90
		bodyModel[57].setRotationPoint(4.75F, 6F, 6.25F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[58].setRotationPoint(-9.5F, 5F, -7.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[59].setRotationPoint(4.5F, 5F, -7.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 60
		bodyModel[60].setRotationPoint(-9.5F, 5F, 6.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 61
		bodyModel[61].setRotationPoint(4.5F, 5F, 6.75F);
	}
}