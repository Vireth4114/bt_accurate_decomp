import com.nokia.mid.ui.DirectGraphics;
import javax.microedition.lcdui.Graphics;

public final class k extends j {
   private short a_S;
   private byte a_B;
   private int r_I;
   private boolean a_Z;
   private int s_I;
   int a_I;
   int b_I;
   int c_I;
   int d_I;
   private static int[] a_ArrayI;
   private static int t_I = (a_ArrayI = new int[]{500, 100, 300})[0] + a_ArrayI[1] + a_ArrayI[2];
   private static int u_I = a_ArrayI[2];

   public k() {
      this.c_B = 7;
   }

   public final int method_a_ArrayB_I_I(byte[] var1, int var2) {
      var2 = super.method_a_ArrayB_I_I(var1, var2);
      this.a_S = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF);
      this.a_B = var1[var2++];
      this.r_I = 0;
      this.a_Z = false;
      this.s_I = 0;
      if (this.c_d.a_I >= 0) {
         this.a_Z = true;
      }

      return var2;
   }

   public final void method_a_V() {
      this.e_I = -7864320;
      this.g_I = 7864320;
      this.f_I = -7864320;
      this.h_I = 7864320;
      this.a_I = -2621440;
      this.b_I = 2621440;
      this.c_I = -2621440;
      this.d_I = 2621440;
   }

   public final void method_b_V() {
      if (this.r_I == 0 && g.a_ArrayI[1] == 0) {
         g.a_ArrayI[1] = 1;
         m.a_k = this;
         c var1 = (c)this.method_a_j().method_a_S_j(this.a_S);
         this.method_a_d_V(j.a_d);
         var1.method_a_I_I_V(j.a_d.c_I, j.a_d.f_I + 2293760);
         var1.a_Z = false;
         var1.b_Z = false;
      }
   }

   public final void method_c_V() {
      if (this.s_I == 0) {
         float var1 = o.a_I * 0.001F;
         var1 = 3.0F * var1;
         d.a_d.method_a_F_V(var1);
         d.a_d.c_I = 0;
         d.a_d.f_I = 0;
         this.c_d.method_b_d_V(d.a_d);
         if (this.a_Z && this.c_d.a_I < 0) {
            this.c_d.a_I = 0;
            this.c_d.d_I = 65536;
            this.c_d.b_I = -65536;
            this.c_d.e_I = 0;
         }

         if (!this.a_Z && this.c_d.a_I > 0) {
            this.c_d.a_I = 0;
            this.c_d.d_I = 65536;
            this.c_d.b_I = 65536;
            this.c_d.e_I = 0;
         }

         this.method_h_V();
      }
   }

   public final void method_e_V() {
      if (this.s_I == 0) {
         float var1 = o.a_I * 0.001F;
         var1 = -3.0F * var1;
         d.a_d.method_a_F_V(var1);
         d.a_d.c_I = 0;
         d.a_d.f_I = 0;
         this.c_d.method_b_d_V(d.a_d);
         if (this.a_Z && this.c_d.b_I > 0) {
            this.c_d.a_I = 65536;
            this.c_d.d_I = 0;
            this.c_d.b_I = 0;
            this.c_d.e_I = 65536;
         }

         if (!this.a_Z && this.c_d.b_I < 0) {
            this.c_d.a_I = -65536;
            this.c_d.d_I = 0;
            this.c_d.b_I = 0;
            this.c_d.e_I = 65536;
         }

         this.method_h_V();
      }
   }

   public final void method_f_V() {
      if (this.s_I == 0) {
         this.s_I = t_I;
      }
   }

   public final void method_d_V() {
      super.method_d_V();
      this.r_I = this.r_I - o.a_I;
      if (this.r_I < 0) {
         this.r_I = 0;
      }

      if (this.s_I > 0) {
         this.s_I = this.s_I - o.a_I;
         if (this.s_I <= u_I && g.a_ArrayI[1] == 1) {
            c var1;
            (var1 = (c)this.method_a_j().method_a_S_j(this.a_S)).h_F = 0.0F;
            var1.i_F = 0.0F;
            var1.a_F = this.a_B * this.c_d.a_I >> 12;
            var1.b_F = this.a_B * this.c_d.d_I >> 12;
            var1.d_Z = false;
            var1.c_Z = true;
            var1.a_Z = true;
            var1.b_Z = true;
            var1.j_F = 0.0F;
            var1.k_F = 0.0F;
            g.a_ArrayI[1] = 0;
            this.r_I = 500;
            this.method_a_d_V(j.a_d);
            j.a_d.method_a_I_I_V(7864320, 0);
            int var2 = d.g_I;
            int var3 = d.h_I;
            var1.c_d.c_I = var2;
            var1.c_d.f_I = var3;
            m.e_n.method_a_I_I_I_I_I_I_I_I_I_I_V(10, var2, var3, 800, 200, this.c_d.a_I, this.c_d.d_I, 30, 800, 200);
         }

         if (this.s_I <= 0) {
            this.s_I = 0;

            for (int var5 = 0; var5 < 3; var5++) {
               p var6 = (p)m.a_Arrayj[var5 + 9];
               p var7 = (p)m.a_Arrayj[var5];

               for (int var4 = 0; var4 < var6.c_ArrayI.length; var4++) {
                  var6.c_ArrayI[var4] = var7.c_ArrayI[var4];
                  var6.d_ArrayI[var4] = var7.d_ArrayI[var4];
               }
            }
         }
      }
   }

   public final void method_a_Graphics_DirectGraphics_d_V(Graphics var1, DirectGraphics var2, d var3) {
      if (this.s_I > 0) {
         int var4 = t_I - this.s_I;
         int var5 = 0;
         int var6 = 0;

         for (int var7 = 0; var7 < 3 && var4 >= var5 + a_ArrayI[var7]; var7++) {
            var5 += a_ArrayI[var7];
            var6++;
         }

         int var19 = var6;
         int var12;
         float var13 = (float)(var12 = var4 - var5) / a_ArrayI[var19];
         float var15 = 1.0F - var13;

         for (int var17 = 0; var17 < 3; var17++) {
            p var8 = (p)m.a_Arrayj[var19 * 3 + var17];
            p var10 = (p)m.a_Arrayj[var17 + 9];
            p var9;
            if (var19 == 2) {
               var9 = (p)m.a_Arrayj[var17];
            } else {
               var9 = (p)m.a_Arrayj[(var19 + 1) * 3 + var17];
            }

            for (int var11 = 0; var11 < var10.c_ArrayI.length; var11++) {
               var10.c_ArrayI[var11] = (int)(var8.c_ArrayI[var11] * var15 + var9.c_ArrayI[var11] * var13);
               var10.d_ArrayI[var11] = (int)(var8.d_ArrayI[var11] * var15 + var9.d_ArrayI[var11] * var13);
            }
         }
      }

      this.method_a_d_V(j.a_d);
      d.method_a_d_d_d_V(var3, j.a_d, d.a_d);
      int var14 = d.a_d.c_I >> 16;
      int var16 = d.a_d.f_I >> 16;

      for (int var18 = 0; var18 < 3; var18++) {
         j var20;
         (var20 = m.a_Arrayj[var18 + 9]).c_d.c_I = this.c_d.c_I;
         var20.c_d.f_I = this.c_d.f_I;
         var20.c_d.a_I = this.c_d.a_I;
         var20.c_d.d_I = this.c_d.d_I;
         var20.c_d.b_I = this.c_d.b_I;
         var20.c_d.e_I = this.c_d.e_I;
         var20.method_h_V();
         var20.method_a_Graphics_DirectGraphics_d_V(var1, var2, var3);
      }

      o.method_a_I_I_I_V(var14, var16, 48);
   }
}
