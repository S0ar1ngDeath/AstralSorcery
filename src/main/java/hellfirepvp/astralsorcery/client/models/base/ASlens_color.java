package hellfirepvp.astralsorcery.client.models.base;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * astralsorcery_lens_coloured - wiiv
 * Created using Tabula 4.1.1
 */
public class ASlens_color extends ModelBase {
    public ModelRenderer glass;
    public ModelRenderer detail1;
    public ModelRenderer detail1_1;
    public ModelRenderer fitting2;
    public ModelRenderer fitting1;

    public ASlens_color() {
        this.textureWidth = 32;
        this.textureHeight = 16;
        this.glass = new ModelRenderer(this, 0, 0);
        this.glass.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.glass.addBox(-5.0F, -5.0F, -1.51F, 10, 10, 1, 0.0F);
        this.fitting1 = new ModelRenderer(this, 22, 0);
        this.fitting1.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.fitting1.addBox(-5.0F, -7.0F, -1.5F, 2, 1, 2, 0.0F);
        this.detail1_1 = new ModelRenderer(this, 22, 3);
        this.detail1_1.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.detail1_1.addBox(3.0F, -6.0F, -1.5F, 2, 1, 1, 0.0F);
        this.fitting2 = new ModelRenderer(this, 22, 0);
        this.fitting2.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.fitting2.addBox(3.0F, -7.0F, -1.5F, 2, 1, 2, 0.0F);
        this.detail1 = new ModelRenderer(this, 22, 3);
        this.detail1.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.detail1.addBox(-5.0F, -6.0F, -1.5F, 2, 1, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.glass.render(f5);
        this.fitting1.render(f5);
        this.detail1_1.render(f5);
        this.fitting2.render(f5);
        this.detail1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}