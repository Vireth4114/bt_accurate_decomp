import com.nokia.mid.ui.DirectGraphics;
import javax.microedition.lcdui.Graphics;

public final class p extends j {
   public static int[] a_ArrayI;
   public static int[] b_ArrayI;
   private int[] e_ArrayI;
   private int[] f_ArrayI;
   public int[] c_ArrayI;
   public int[] d_ArrayI;
   private short[] a_ArrayS;
   public int a_I;
   private int b_I;
   private int c_I;
   public short a_S;

   public p() {
      this.c_B = 2;
   }

   public final int method_a_ArrayB_I_I(byte[] var1, int var2) {
      var2 = super.method_a_ArrayB_I_I(var1, var2);
      this.a_I = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF) + 1;
      this.b_I = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF);
      int var3 = var1[var2++] & 255;
      int var4 = var1[var2++] & 255;
      int var5 = var1[var2++] & 255;
      int var6 = var1[var2++] & 255;
      this.c_I = var3 << 24 | var4 << 16 | var5 << 8 | var6;
      this.c_ArrayI = new int[this.a_I];
      this.d_ArrayI = new int[this.a_I];
      this.e_ArrayI = new int[this.a_I];
      this.f_ArrayI = new int[this.a_I];
      this.a_ArrayS = new short[this.b_I];
      byte var27 = (byte)var1[var2++];
      short var29 = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF);
      var2 = method_a_ArrayI_I_I_ArrayB_I_I_I(this.c_ArrayI, this.a_I - 1, var29, var1, var2, var27);
      var29 = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF);
      var2 = method_a_ArrayI_I_I_ArrayB_I_I_I(this.d_ArrayI, this.a_I - 1, var29, var1, var2, var27);
      var27 = (byte)var1[var2++];
      var2 = method_a_ArrayS_I_I_I_ArrayB_I_I_I(this.a_ArrayS, this.b_I, 0, 1, var1, var2, var27);
      this.c_ArrayI[this.a_I - 1] = this.c_ArrayI[0];
      this.d_ArrayI[this.a_I - 1] = this.d_ArrayI[0];
      this.a_S = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF);
      this.method_a_V();
      return var2;
   }

   public final void method_a_V() {
      super.method_a_V();

      for (int var1 = 0; var1 < this.c_ArrayI.length; var1++) {
         if (this.c_ArrayI[var1] < this.e_I) {
            this.e_I = this.c_ArrayI[var1];
         }

         if (this.c_ArrayI[var1] > this.g_I) {
            this.g_I = this.c_ArrayI[var1];
         }
      }

      for (int var2 = 0; var2 < this.d_ArrayI.length; var2++) {
         if (this.d_ArrayI[var2] < this.f_I) {
            this.f_I = this.d_ArrayI[var2];
         }

         if (this.d_ArrayI[var2] > this.h_I) {
            this.h_I = this.d_ArrayI[var2];
         }
      }
   }

   public final void method_a_Graphics_DirectGraphics_d_V(Graphics var1, DirectGraphics var2, d var3) {
      d var4 = var3;
      p var13 = this;
      if (this.g_Z) {
         var13.method_a_d_V(j.a_d);
         int var5 = var4.c_I;
         int var6 = var4.f_I;
         var4.c_I = 0;
         var4.f_I = 0;
         d.method_a_d_d_d_V(var4, j.a_d, d.a_d);
         var4.c_I = var5;
         var4.f_I = var6;

         for (int var16 = 0; var16 < var13.a_I; var16++) {
            d.a_d.method_a_I_I_V(var13.c_ArrayI[var16], var13.d_ArrayI[var16]);
            var13.e_ArrayI[var16] = d.g_I >> 16;
            var13.f_ArrayI[var16] = d.h_I >> 16;
         }

         var13.g_Z = false;
      }

      int var14 = o.b_I - 1;
      int var17 = o.c_I - 1;
      int var18 = var3.c_I >> 16;
      int var15 = var3.f_I >> 16;
      var1.setColor(m.method_c_I_I(this.c_I));

      for (byte var19 = 0; var19 < this.b_I; var19 += 3) {
         int var7 = this.a_ArrayS[var19];
         int var8 = this.a_ArrayS[var19 + 1];
         int var9 = this.a_ArrayS[var19 + 2];
         int var10 = this.e_ArrayI[var7] + var18;
         int var11 = this.e_ArrayI[var8] + var18;
         int var12 = this.e_ArrayI[var9] + var18;
         var7 = this.f_ArrayI[var7] + var15;
         var8 = this.f_ArrayI[var8] + var15;
         var9 = this.f_ArrayI[var9] + var15;
         if ((var10 >= 0 || var11 >= 0 || var12 >= 0)
            && (var7 >= 0 || var8 >= 0 || var9 >= 0)
            && (var10 <= var14 || var11 <= var14 || var12 <= var14)
            && (var7 <= var17 || var8 <= var17 || var9 <= var17)) {
            var1.fillTriangle(var10, var7, var11, var8, var12, var9);
         }
      }
   }
}
