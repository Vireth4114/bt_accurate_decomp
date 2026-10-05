import com.nokia.mid.ui.DirectGraphics;
import javax.microedition.lcdui.Graphics;

public final class l extends j {
   byte a_B;
   private int c_I;
   private int d_I;
   private int r_I;
   private int s_I;
   private int t_I;
   private int u_I;
   private byte e_B;
   private boolean b_Z;
   private int v_I;
   private int w_I;
   int a_I;
   int b_I;
   private byte f_B;
   boolean a_Z;
   byte d_B;
   private static int x_I = 2000;
   private static int[] a_ArrayI = new int[]{6000, 4000, 4000, 10000};
   private static int[] b_ArrayI = new int[]{100, 50, 80, 150};
   private static int[] c_ArrayI = new int[]{50, 100, 100, 150};

   public l() {
      this.c_B = 10;
   }

   public final int method_a_ArrayB_I_I(byte[] var1, int var2) {
      var2 = super.method_a_ArrayB_I_I(var1, var2);
      this.c_I = ((var1[var2++] << 8 | var1[var2++] & 255) << 16) + this.c_d.c_I;
      this.d_I = ((var1[var2++] << 8 | var1[var2++] & 255) << 16) + this.c_d.f_I;
      this.r_I = ((var1[var2++] << 8 | var1[var2++] & 255) << 16) + this.c_d.c_I;
      this.s_I = ((var1[var2++] << 8 | var1[var2++] & 255) << 16) + this.c_d.f_I;
      this.a_B = var1[var2++];
      this.e_B = 0;
      this.v_I = 0;
      this.a_I = 0;
      this.b_Z = false;
      if (this.c_I < this.r_I) {
         this.b_Z = true;
      }

      this.d_B = 1;
      this.w_I = 2000;
      this.f_B = 1;
      this.b_I = 800;
      this.a_Z = false;
      if (this.a_B == 3) {
         this.v_I = x_I;
         this.t_I = this.c_d.c_I;
         this.u_I = this.c_d.f_I;
         this.c_I = this.t_I;
         this.d_I = this.u_I;
         this.r_I = this.t_I;
         this.s_I = this.u_I;
      }

      return var2;
   }

   public final void method_a_V() {
      this.e_I = -c_ArrayI[this.a_B] << 15;
      this.g_I = c_ArrayI[this.a_B] << 15;
      this.f_I = 0;
      this.h_I = b_ArrayI[this.a_B] << 16;
   }

   public final void method_b_V() {
      this.method_a_d_V(j.a_d);
      int var1 = j.a_d.c_I;
      int var2 = m.a_c.c_d.c_I;
      if (this.v_I <= 0 && this.d_B == 0 && this.f_B == 1) {
         this.v_I = 500;
         if (var1 < var2) {
            m.a_c.f_F += 200.0F;
            m.a_c.g_F += 400.0F;
         } else {
            m.a_c.f_F += -200.0F;
            m.a_c.g_F += 400.0F;
         }

         m.a_c.a_F = 0.0F;
         m.a_c.b_F = 0.0F;
      } else {
         if (this.d_B == 1) {
            if (var1 < var2) {
               m.a_c.f_F += 100.0F;
            } else {
               m.a_c.f_F += -100.0F;
            }

            m.a_c.a_F = 0.0F;
            m.a_c.b_F = 0.0F;
         }
      }
   }

   public final void method_c_V() {
      switch (this.a_B) {
         case 0:
            if (this.v_I <= 0) {
               this.method_a_d_V(j.a_d);
               int var1 = j.a_d.c_I;
               int var2 = m.a_c.c_d.c_I;
               if (var1 < var2) {
                  m.a_c.f_F += 500.0F;
               } else {
                  m.a_c.f_F += -500.0F;
               }

               m.a_c.a_F = 0.0F;
               m.a_c.b_F = 0.0F;
               this.v_I = 500;
               return;
            }
            break;
         case 1:
            if (m.a_c.d_I == 1) {
               this.method_f_V();
               return;
            }

            g.a_ArrayI[0] = 1;
            return;
         case 2:
            if (this.v_I <= 0 && this.d_B == 0 && this.f_B == 0) {
               this.a_I = 0;
               this.f_B = 1;
               this.b_I = 200;
               return;
            }
            break;
         case 3:
            g.a_ArrayI[0] = 1;
            this.c_d.c_I = this.t_I;
            this.c_d.f_I = this.u_I;
            this.c_I = this.t_I;
            this.d_I = this.u_I;
            this.r_I = this.t_I;
            this.s_I = this.u_I;
      }
   }

   private void method_f_V() {
      this.method_a_d_V(j.a_d);
      int var1 = j.a_d.c_I;
      int var2 = j.a_d.f_I;
      m.g_n.method_a_I_I_I_I_I_I_I_V(10, var1, var2 + (b_ArrayI[this.a_B] << 15), 370, 0, 920, 230);
      this.method_j_V();
      m.a_a.c_d.c_I = var1;
      m.a_a.c_d.f_I = var2 + 1966080;
      m.a_a.b_d.method_a_d_V(this.c_d);
      m.a_a.method_k_V();
      m.a_a.b_d.method_c_d_V(m.a_a.d_d);
   }

   public final void method_e_V() {
      switch (this.a_B) {
         case 0:
            method_g_V();
            this.method_f_V();
            return;
         case 1:
         case 3:
            return;
         case 2:
            method_g_V();
            this.method_f_V();
      }
   }

   private static void method_g_V() {
      if (m.a_c.b_F < 0.0F) {
         m.a_c.b_F = -m.a_c.b_F * 0.5F;
         m.a_c.a_F *= 0.7F;
      } else {
         m.a_c.a_F = -m.a_c.a_F * 0.5F;
         m.a_c.b_F *= 0.7F;
      }
   }

   public final void method_d_V() {
      this.method_h_V();
      super.method_d_V();
      int var1 = o.a_I;
      int var2 = this.c_d.c_I;
      int var3 = this.c_d.f_I;
      if (this.v_I > 0) {
         this.v_I -= var1;
         if (this.v_I <= 0) {
            this.v_I = 0;
            if (this.a_B == 3) {
               this.v_I = x_I;
               this.r_I = this.c_I;
               this.s_I = this.d_I;
               int var6 = this.r_I - var2;
               int var7 = this.s_I - var3;
               float var8 = var6 >> 16;
               float var9 = var7 >> 16;
               int var26 = (int)(Math.sqrt(var8 * var8 + var9 * var9) * 65536.0);
               int var32;
               if ((var32 = (x_I << 1) * a_ArrayI[this.a_B]) > var26) {
                  double var12 = (double)var32 / var26;
                  this.r_I += (int)(var6 * (var12 - 1.0));
                  this.s_I += (int)(var7 * (var12 - 1.0));
               }

               this.c_I = m.a_c.c_d.c_I;
               this.d_I = m.a_c.c_d.f_I;
            }
         }
      }

      if (this.a_B == 3) {
         int var22 = this.r_I;
         int var24 = this.s_I;
         int var4 = var22 - var2;
         int var5 = var24 - var3;
         float var27 = var4 >> 16;
         float var33 = var5 >> 16;
         int var28;
         if ((var28 = (int)(Math.sqrt(var27 * var27 + var33 * var33) * 65536.0)) != 0) {
            int var34;
            double var38 = (double)(var34 = var1 * a_ArrayI[this.a_B]) / var28;
            var2 += (int)(var4 * var38);
            var3 += (int)(var5 * var38);
         }
      } else {
         if (this.a_B == 2) {
            if (this.w_I > 0) {
               this.w_I -= var1;
               if (this.w_I <= 0) {
                  if (this.d_B == 0) {
                     this.d_B = 1;
                     this.w_I = 2000;
                     this.f_B = 1;
                     this.b_I = 800;
                  } else {
                     this.d_B = 0;
                     this.w_I = 5000;
                     this.f_B = 2;
                     this.b_I = 800;
                     this.a_Z = true;
                  }
               }
            }

            if (this.f_B == 1) {
               this.a_I += var1;
               if (this.a_I >= this.b_I) {
                  if (this.d_B == 0) {
                     this.f_B = 2;
                     this.b_I = 200;
                  }

                  this.a_I = this.b_I;
               }
            } else if (this.f_B == 2) {
               this.a_I -= var1;
               if (this.a_I <= 0) {
                  this.f_B = 0;
                  this.a_I = 0;
                  this.a_Z = false;
               }
            }
         }

         int var23;
         int var25;
         int var29;
         if (this.e_B == 0) {
            var23 = this.c_I;
            var25 = this.d_I;
            var29 = this.r_I;
         } else {
            var23 = this.r_I;
            var25 = this.s_I;
            var29 = this.c_I;
         }

         if (this.a_B == 0 && Math.abs(var2 - var23) > 4587520 && Math.abs(var2 - var29) > 4587520) {
            this.method_a_d_V(j.a_d);
            int var35 = j.a_d.c_I;
            var29 = m.a_c.c_d.c_I;
            if (Math.abs(m.a_c.c_d.c_I - var35) < 7864320 && (var35 < var29 && var23 < var2 || var35 > var29 && var23 > var2)) {
               if (this.e_B == 0) {
                  var23 = this.r_I;
                  var25 = this.s_I;
                  this.e_B = 1;
               } else {
                  var23 = this.c_I;
                  var25 = this.d_I;
                  this.e_B = 0;
               }
            }
         }

         int var18 = var23 - var2;
         int var20 = var25 - var3;
         float var36 = var18 >> 16;
         float var31 = var20 >> 16;
         int var37 = (int)(Math.sqrt(var36 * var36 + var31 * var31) * 65536.0);
         boolean var39 = false;
         boolean var13 = false;
         if (var37 != 0) {
            int var17;
            double var15 = (double)(var17 = var1 * a_ArrayI[this.a_B]) / var37;
            var18 = (int)(var18 * var15);
            var20 = (int)(var20 * var15);
            var2 += var18;
            var3 += var20;
            if (var18 >= 0 && var2 >= var23 || var18 <= 0 && var2 <= var23) {
               var2 = var23;
               var39 = true;
            }

            if (var20 >= 0 && var3 >= var25 || var20 <= 0 && var3 <= var25) {
               var3 = var25;
               var13 = true;
            }
         }

         if (var39 && var13 || var37 == 0) {
            var2 = var23;
            var3 = var25;
            if (this.e_B == 0) {
               this.e_B = 1;
            } else {
               this.e_B = 0;
            }
         }
      }

      if (this.a_B != 2 || this.a_B == 2 && this.d_B == 0 && this.f_B == 0) {
         this.b_Z = true;
         if (this.c_d.c_I < var2) {
            this.b_Z = false;
         }

         this.c_d.c_I = var2;
         this.c_d.f_I = var3;
         this.e_Z = true;
         this.f_Z = true;
      }
   }

   public final void method_a_Graphics_DirectGraphics_d_V(Graphics var1, DirectGraphics var2, d var3) {
      this.method_a_d_V(j.a_d);
      d.method_a_d_d_d_V(var3, j.a_d, d.a_d);
      int var11 = d.a_d.c_I >> 16;
      int var12 = d.a_d.f_I >> 16;
      switch (this.a_B) {
         case 0:
            int var10 = m.a_I / 50 % 6;
            o.method_b_I_I_I_I_V(var11, var12, 467, var10);
            return;
         case 1:
            if (this.b_Z) {
               o.method_a_I_I_I_V(var11, var12, -41);
               return;
            }

            o.method_a_I_I_I_V(var11, var12, -42);
            return;
         case 2:
            if (this.f_B != 0) {
               int var4 = var1.getClipX();
               int var5 = var1.getClipY();
               int var6 = var1.getClipWidth();
               int var7 = var1.getClipHeight();
               int var8;
               if ((var8 = var12 - var5) > var7) {
                  var8 = var7;
               }

               var1.setClip(var4, var5, var6, var8);
               var8 = this.a_I * 61 / this.b_I;
               if (this.b_Z) {
                  o.method_a_I_I_I_V(var11, var12 + 61 - var8, 189);
               } else {
                  o.method_a_I_I_I_V(var11, var12 + 61 - var8, 194);
               }

               var1.setClip(var4, var5, var6, var7);
            }

            int var9;
            if (this.f_B == 0) {
               var9 = m.a_I / 150 % 4;
            } else {
               var9 = 0;
            }

            o.method_b_I_I_I_I_V(var11, var12, 504, var9);
            return;
         case 3:
            o.method_a_I_I_I_V(var11, var12, -28);
      }
   }
}
