import com.nokia.mid.ui.DirectGraphics;
import javax.microedition.lcdui.Graphics;

public final class r extends j {
   private short[] c_ArrayS;
   private short[] d_ArrayS;
   short[] a_ArrayS;
   short[] b_ArrayS;

   public r() {
      this.c_B = 5;
   }

   public final int method_a_ArrayB_I_I(byte[] var1, int var2) {
      var2 = super.method_a_ArrayB_I_I(var1, var2);
      int var3 = var1[var2++] & 255;
      this.c_ArrayS = new short[var3];
      this.d_ArrayS = new short[var3];
      this.a_ArrayS = new short[var3];
      this.b_ArrayS = new short[var3];
      if (var3 > 0) {
         int var4 = var1[var2++] & 255;
         short var5 = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF);
         short var6 = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF);
         if (var4 > 0) {
            var2 = method_a_ArrayS_I_I_I_ArrayB_I_I_I(this.c_ArrayS, var3, var5, 1, var1, var2, var4);
            var2 = method_a_ArrayS_I_I_I_ArrayB_I_I_I(this.d_ArrayS, var3, var6, 1, var1, var2, var4);
         } else {
            for (int var15 = 0; var15 < var3; var15++) {
               this.c_ArrayS[var15] = (short)var5;
               this.d_ArrayS[var15] = (short)var6;
            }
         }

         var2 = method_a_ArrayS_I_I_I_ArrayB_I_I_I(this.a_ArrayS, var3, 0, 1, var1, var2, 16);

         for (int var16 = 0; var16 < var3; var16++) {
            this.b_ArrayS[var16] = -1;
         }
      }

      return var2;
   }

   private static int method_a_I_I(int var0) {
      switch (var0) {
         case 474:
            return 150;
         case 480:
            return 150;
         case 485:
            return 150;
         default:
            return 0;
      }
   }

   public final void method_a_V() {
      super.method_a_V();

      for (int var1 = 0; var1 < this.a_ArrayS.length; var1++) {
         int var2 = (o.method_a_I_I_I(this.a_ArrayS[var1], 0) << 16) / j.g_d.a_I;
         int var3 = (o.method_a_I_I_I(this.a_ArrayS[var1], 1) << 16) / j.g_d.a_I;
         int var4 = (o.method_a_I_I_I(this.a_ArrayS[var1], 2) << 16) / j.g_d.a_I;
         int var5 = (o.method_a_I_I_I(this.a_ArrayS[var1], 3) << 16) / j.g_d.a_I;
         int var8;
         var2 = (var8 = this.c_ArrayS[var1] - var4) + var2;
         int var9;
         var3 = (var9 = this.d_ArrayS[var1] - (var3 - var5)) + var3;
         if (var8 < this.e_I) {
            this.e_I = var8;
         }

         if (var2 > this.g_I) {
            this.g_I = var2;
         }

         if (var9 < this.f_I) {
            this.f_I = var9;
         }

         if (var3 > this.h_I) {
            this.h_I = var3;
         }
      }

      this.e_I <<= 16;
      this.g_I <<= 16;
      this.f_I <<= 16;
      this.h_I <<= 16;
   }

   public final void method_d_V() {
      super.method_d_V();

      for (int var1 = 0; var1 < this.a_ArrayS.length; var1++) {
         if (this.b_ArrayS[var1] > -1) {
            int var2 = o.a_I;
            if (this.a_ArrayS[var1] != 9999) {
               this.a_ArrayS[var1] = (short)(this.a_ArrayS[var1] - var2);
            }

            if (this.a_ArrayS[var1] <= 0) {
               if (this.b_ArrayS[var1] != 474) {
                  this.method_j_V();
                  return;
               }

               if (this.a_ArrayS[var1] < -1500) {
                  this.method_j_V();
                  return;
               }
            }
         }
      }
   }

   public final void method_a_Graphics_DirectGraphics_d_V(Graphics var1, DirectGraphics var2, d var3) {
      this.method_a_d_V(j.a_d);
      d.method_a_d_d_d_V(var3, j.a_d, d.a_d);

      for (int var14 = 0; var14 < this.a_ArrayS.length; var14++) {
         d.a_d.method_a_I_I_V(this.c_ArrayS[var14] << 16, this.d_ArrayS[var14] << 16);
         int var15 = d.g_I >> 16;
         int var4 = d.h_I >> 16;
         if (this.b_ArrayS[var14] <= -1) {
            o.method_a_I_I_I_V(var15, var4, this.a_ArrayS[var14]);
         } else {
            int var5 = 0;
            int var6 = 0;
            if (this.a_ArrayS[var14] != 9999) {
               var6 = this.a_ArrayS[var14];
            } else {
               var6 = m.a_I;
            }

            if (this.a_ArrayS[var14] <= 0 && this.b_ArrayS[var14] == 474) {
               var6 = 1;
               var5 = (Math.abs(this.a_ArrayS[var14]) * 255 / 1500 & 0xFF) << 24;
            }

            int var7 = d.g_I >> 16;
            int var8 = d.h_I >> 16;
            Graphics var9 = o.method_a_Graphics();
            if (var5 != 0) {
               m.b_Graphics.setColor(255);
               m.b_Graphics.fillRect(0, 0, m.b_Image.getWidth(), m.b_Image.getHeight());
               var15 = m.b_Image.getWidth() >> 1;
               var4 = m.b_Image.getHeight();
               var1 = m.b_Graphics;
               o.method_a_Graphics_V(m.b_Graphics);
            }

            int var12 = o.method_b_I_I(this.b_ArrayS[var14]);
            int var10 = 0;
            if (this.a_ArrayS[var14] != 9999) {
               short var21;
               short var10000;
               switch (var21 = this.b_ArrayS[var14]) {
                  case 474:
                     var10000 = 750;
                     break;
                  case 480:
                  case 485:
                     var10000 = 9999;
                     break;
                  default:
                     var10000 = 0;
               }

               var10 = (var10000 - var6) / method_a_I_I(this.b_ArrayS[var14]) % var12;
            } else {
               var10 = var6 / method_a_I_I(this.b_ArrayS[var14]) % var12;
            }

            if (var10 > var12 - 1) {
               var10 = var12 - 1;
            }

            o.method_b_I_I_I_I_V(var15, var4, this.b_ArrayS[var14], var10);
            if (var5 != 0) {
               o.method_a_Graphics_V(var9);
               m.b_Image.getRGB(m.b_ArrayI, 0, m.b_Image.getWidth(), 0, 0, m.b_Image.getWidth(), m.b_Image.getHeight());
               int var13 = 0;

               for (int var16 = 0; var16 < m.b_Image.getHeight(); var16++) {
                  for (int var18 = 0; var18 < m.b_Image.getWidth(); var18++) {
                     if (m.b_ArrayI[var13] == -16776961) {
                        m.b_ArrayI[var13] = 0;
                     } else {
                        m.b_ArrayI[var13] = m.b_ArrayI[var13] - var5;
                     }

                     var13++;
                  }
               }

               int var17 = var7 - (m.b_Image.getWidth() >> 1);
               var4 = var8 - m.b_Image.getHeight();
               o.method_a_Graphics().drawRGB(m.b_ArrayI, 0, m.b_Image.getWidth(), var17, var4, m.b_Image.getWidth(), m.b_Image.getHeight(), true);
            }
         }
      }
   }
}
