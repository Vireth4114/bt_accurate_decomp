import com.nokia.mid.ui.DirectGraphics;
import javax.microedition.lcdui.Graphics;

public final class n extends j {
   private static boolean a_Z = false;
   private int[] a_ArrayI;
   private int[] b_ArrayI;
   private int[] c_ArrayI;
   private int[] d_ArrayI;
   private int[] e_ArrayI;
   private short[] a_ArrayS;
   private byte[] a_ArrayB;
   private byte[] b_ArrayB;
   private int d_I;
   private int r_I;
   private int s_I;
   private int t_I;
   private int u_I;
   public int a_I;
   private int v_I;
   private int w_I;
   public int b_I;
   public int c_I;
   private int[] f_ArrayI;
   private int x_I;
   private static int[] g_ArrayI = new int[2];

   public n(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, int var9, int var10) {
      if (!a_Z) {
         a_Z = true;
      }

      this.a_ArrayI = new int[var1];
      this.b_ArrayI = new int[var1];
      this.c_ArrayI = new int[var1];
      this.d_ArrayI = new int[var1];
      this.e_ArrayI = new int[var1];
      this.b_ArrayB = new byte[var1];
      if (var7 == 4) {
         this.a_ArrayS = new short[var1];
         this.a_ArrayB = new byte[var1];

         for (int var11 = 0; var11 < var1; var11++) {
            this.a_ArrayS[var11] = 0;
         }
      }

      this.v_I = var1;
      this.d_I = 0;
      this.r_I = var3;
      this.s_I = 0;
      this.t_I = 0;
      this.u_I = var6;
      this.a_I = -1;
      this.w_I = var7;
      this.c_B = 11;
      this.f_ArrayI = var8;
      this.x_I = var9;
      this.b_B = (byte)var10;
   }

   public final void method_c_j_V(j var1) {
      this.method_b_j_V(var1);
      this.c_d.a_I = 65536;
      this.c_d.b_I = 0;
      this.c_d.c_I = 0;
      this.c_d.d_I = 0;
      this.c_d.e_I = 65536;
      this.c_d.f_I = 0;
      this.b_d.method_a_d_V(this.c_d);
      this.method_a_V();
   }

   public final void method_a_I_I_I_I_I_I_I_V(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 + 1 + this.a_I > this.v_I) {
         var1 = this.v_I - this.a_I - 1;
      }

      var2 = var2;
      var3 = var3;

      for (int var10 = 0; var10 < var1; var10++) {
         int var8 = (var5 = var10 * 360 / var1) + 90 >= 360 ? var5 + 90 - 360 : var5 + 90;
         int var9 = var4;
         this.a_I++;
         this.a_ArrayI[this.a_I] = var7 != 0 ? var6 + m.a_Random.nextInt() % var7 : var6;
         this.b_ArrayI[this.a_I] = var2;
         this.c_ArrayI[this.a_I] = var3;
         this.d_ArrayI[this.a_I] = var9 * m.b_ArrayS[var5];
         this.e_ArrayI[this.a_I] = var9 * m.b_ArrayS[var8];
         if (this.w_I == 3) {
            this.b_ArrayB[this.a_I] = (byte)(var10 % this.f_ArrayI.length);
         } else if (this.w_I == 4 && this.equals(m.a_n)) {
            byte var14;
            if ((var14 = (byte)Math.abs(m.a_Random.nextInt() % this.f_ArrayI.length)) > 1) {
               var14 = (byte)Math.abs(m.a_Random.nextInt() % this.f_ArrayI.length);
            }

            this.b_ArrayB[this.a_I] = var14;
         } else {
            this.b_ArrayB[this.a_I] = (byte)Math.abs(m.a_Random.nextInt() % this.f_ArrayI.length);
         }
      }
   }

   public final void method_a_I_I_I_I_I_I_I_I_I_V(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var1 + 1 + this.a_I > this.v_I) {
         var1 = this.v_I - this.a_I - 1;
      }

      var2 = var2;
      var3 = var3;

      for (int var13 = 0; var13 < var1; var13++) {
         int var10;
         int var16;
         int var17;
         int var11 = (var17 = (var16 = (var10 = var6 + m.a_Random.nextInt() % (var7 / 2 + 1)) - (var10 >= 360 ? 360 : 0)) + (var16 < 0 ? 360 : 0)) + 90 >= 360
            ? var17 - 270
            : var17 + 90;
         int var12 = var5 != 0 ? var4 + m.a_Random.nextInt() % var5 : var4;
         this.a_I++;
         this.a_ArrayI[this.a_I] = var9 != 0 ? var8 + m.a_Random.nextInt() % var9 : var8;
         this.b_ArrayI[this.a_I] = var2;
         this.c_ArrayI[this.a_I] = var3;
         this.d_ArrayI[this.a_I] = var12 * m.b_ArrayS[var17];
         this.e_ArrayI[this.a_I] = var12 * m.b_ArrayS[var11];
         if (this.w_I == 0) {
            if (var17 >= 35 && var17 <= 90) {
               this.b_ArrayB[this.a_I] = 2;
            } else if (var17 < 35) {
               this.b_ArrayB[this.a_I] = 3;
            } else if (var17 > 325) {
               this.b_ArrayB[this.a_I] = 1;
            } else {
               this.b_ArrayB[this.a_I] = 0;
            }
         } else if (this.w_I == 7) {
            if (var6 != 0 && var6 != 180) {
               this.b_ArrayB[this.a_I] = 1;
            } else {
               this.b_ArrayB[this.a_I] = 0;
            }
         } else {
            this.b_ArrayB[this.a_I] = (byte)Math.abs(m.a_Random.nextInt() % this.f_ArrayI.length);
         }
      }
   }

   public final void method_a_I_I_I_I_I_I_I_I_I_I_V(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (11 + this.a_I > this.v_I) {
         var1 = this.v_I - this.a_I - 1;
      }

      var2 = var2;
      var3 = var3;

      for (int var16 = 0; var16 < var1; var16++) {
         var4 = 800 + m.a_Random.nextInt() % 200;
         this.a_I++;
         this.a_ArrayI[this.a_I] = 800 + m.a_Random.nextInt() % 200;
         this.b_ArrayI[this.a_I] = var2;
         this.c_ArrayI[this.a_I] = var3;
         var5 = var6 + (m.a_Random.nextInt() % 30 << 10);
         var8 = var7 + (m.a_Random.nextInt() % 30 << 10);
         this.d_ArrayI[this.a_I] = var4 * var5 >> 8;
         this.e_ArrayI[this.a_I] = var4 * var8 >> 8;
         this.b_ArrayB[this.a_I] = (byte)Math.abs(m.a_Random.nextInt() % this.f_ArrayI.length);
      }
   }

   public final void method_b_I_I_I_I_I_I_I_I_I_I_V(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      for (int var15 = 0; var15 < var1; var15++) {
         do {
            var5 = m.a_Random.nextInt() % (var4 * 2 + 1);
            var6 = m.a_Random.nextInt() % (var4 * 2 + 1);
         } while (var5 * var5 + var6 * var6 > var4 * var4);

         var5 = var2 + var5;
         var6 = var3 + var6;
         this.method_a_I_I_I_I_I_I_I_I_I_V(1, var5, var6, 0, 0, 0, 0, var9, var10);
      }
   }

   public final void method_a_I_I_I_I_I_I_I_I_I_I_I_V(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11
   ) {
      for (int var14 = 0; var14 < var1; var14++) {
         int var12 = var2 + Math.abs(m.a_Random.nextInt() % (var4 - var2 + 1));
         int var13 = var3 + Math.abs(m.a_Random.nextInt() % (var5 - var3 + 1));
         this.method_a_I_I_I_I_I_I_I_I_I_V(1, var12, var13, var6, var7, var8, var9, var10, var11);
      }
   }

   public final void method_a_Graphics_DirectGraphics_d_V(Graphics var1, DirectGraphics var2, d var3) {
      int var7 = o.a_I * o.method_a_I();

      for (int var4 = 0; var4 < this.a_I + 1; var4++) {
         boolean var8 = false;
         this.a_ArrayI[var4] = this.a_ArrayI[var4] - var7;
         if (this.a_ArrayI[var4] > 0) {
            if (this.u_I != 0) {
               this.d_ArrayI[var4] = this.d_ArrayI[var4] - (this.d_ArrayI[var4] * this.u_I * var7 >> 14);
               this.e_ArrayI[var4] = this.e_ArrayI[var4] - (this.e_ArrayI[var4] * this.u_I * var7 >> 14);
            }

            this.d_ArrayI[var4] = this.d_ArrayI[var4] + this.d_I * var7;
            this.e_ArrayI[var4] = this.e_ArrayI[var4] + this.r_I * var7;
            if (this.w_I == 1 && this.e_ArrayI[var4] > this.c_I) {
               this.e_ArrayI[var4] = this.c_I;
            } else if (this.w_I == 4) {
               this.a_ArrayS[var4] = (short)(this.a_ArrayS[var4] - var7);
               if (this.a_ArrayS[var4] <= 0) {
                  this.a_ArrayS[var4] = (short)(Math.abs(m.a_Random.nextInt() % 200) + 300);
                  this.a_ArrayB[var4] = (byte)(Math.abs(m.a_Random.nextInt()) & 3);
               }

               int var5 = var7 / 2;
               if (this.a_ArrayB[var4] == 1) {
                  method_a_I_I_I_V(var5, this.d_ArrayI[var4], this.e_ArrayI[var4]);
                  this.d_ArrayI[var4] = g_ArrayI[0];
                  this.e_ArrayI[var4] = g_ArrayI[1];
               } else if (this.a_ArrayB[var4] == 2) {
                  method_a_I_I_I_V(359 - var5, this.d_ArrayI[var4], this.e_ArrayI[var4]);
                  this.d_ArrayI[var4] = g_ArrayI[0];
                  this.e_ArrayI[var4] = g_ArrayI[1];
               }
            } else if (this.w_I == 5) {
               int var11;
               method_a_I_I_I_V(var11 = var7 / 5, this.d_ArrayI[var4], this.e_ArrayI[var4]);
               this.d_ArrayI[var4] = g_ArrayI[0];
               this.e_ArrayI[var4] = g_ArrayI[1];
            }

            this.b_ArrayI[var4] = this.b_ArrayI[var4] + ((this.d_ArrayI[var4] + this.s_I) * var7 >> 4);
            this.c_ArrayI[var4] = this.c_ArrayI[var4] + ((this.e_ArrayI[var4] + this.t_I) * var7 >> 4);
         } else {
            var8 = true;
         }

         if (this.w_I == 1 && this.c_ArrayI[var4] >= this.b_I) {
            var8 = true;
         }

         if (var8) {
            if (var4 == this.a_I) {
               this.a_I--;
            } else {
               this.a_ArrayI[var4] = this.a_ArrayI[this.a_I];
               this.b_ArrayI[var4] = this.b_ArrayI[this.a_I];
               this.c_ArrayI[var4] = this.c_ArrayI[this.a_I];
               this.d_ArrayI[var4] = this.d_ArrayI[this.a_I];
               this.e_ArrayI[var4] = this.e_ArrayI[this.a_I];
               this.a_I--;
               var4--;
            }
         } else {
            int var12 = o.method_b_I_I(this.f_ArrayI[this.b_ArrayB[var4]]);
            int var9;
            if ((var9 = this.a_ArrayI[var4] * var12 / this.x_I) > var12 - 1) {
               var9 = var12 - 1;
            }

            int var10 = var12 - 1 - var9;
            var3.method_a_I_I_V(this.b_ArrayI[var4], this.c_ArrayI[var4]);
            var12 = d.g_I >> 16;
            int var6 = d.h_I >> 16;
            o.method_b_I_I_I_I_V(var12, var6, this.f_ArrayI[this.b_ArrayB[var4]], var10);
         }
      }
   }

   private static void method_a_I_I_I_V(int var0, int var1, int var2) {
      short var3 = m.b_ArrayS[var0 % 360];
      short var4 = m.b_ArrayS[(var0 + 90) % 360];
      g_ArrayI[0] = (var1 * var4 - var2 * var3) / 360;
      g_ArrayI[1] = (var1 * var3 + var2 * var4) / 360;
   }
}
