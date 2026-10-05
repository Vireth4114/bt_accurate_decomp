import com.nokia.mid.ui.DirectGraphics;
import javax.microedition.lcdui.Graphics;

public final class i extends j {
   private int c_I;
   int a_I = 0;
   short a_S;
   private short e_S;
   short b_S;
   short c_S;
   private short f_S;
   private byte[] a_ArrayB;
   private int[] a_ArrayI;
   private int[] b_ArrayI;
   private byte[] b_ArrayB;
   private byte[] c_ArrayB;
   private int[] c_ArrayI;
   private int[] d_ArrayI;
   private byte a_B;
   private byte d_B;
   private byte e_B;
   private byte f_B;
   private int d_I;
   private int r_I;
   private int s_I = 0;
   private int t_I;
   private int u_I;
   int b_I;
   private byte g_B;

   public i() {
      this.c_B = 6;
   }

   public final int method_a_ArrayB_I_I(byte[] var1, int var2) {
      var2 = super.method_a_ArrayB_I_I(var1, var2);
      this.a_S = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF);
      this.e_S = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF);
      this.b_S = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF);
      this.c_S = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF);
      this.a_B = var1[var2++];
      this.d_B = var1[var2++];
      this.e_B = var1[var2++];
      this.f_B = var1[var2++];
      int var48 = ++var2;
      var2++;
      int var8;
      this.d_I = 1140850688 | (var1[var48] & 255) << 16 | (var1[var2++] & 255) << 8 | (var8 = var1[var2++] & 255);
      if (var8 == 16) {
         this.g_B = 1;
      } else {
         this.g_B = 0;
      }

      if (this.d_I != 1140850688) {
         this.d_I = 1141969390;
      }

      this.f_S = (short)(this.b_S - this.a_S);
      if (this.d_I != 1140850688 && this.g_B == 0) {
         int var9 = this.f_S * 50 / 100;
         this.a_ArrayB = new byte[var9];
         this.r_I = var9 << 12;
         this.u_I = 0;
         this.a_I = var9 + 2;

         for (int var3 = 0; var3 < var9; var3++) {
            this.a_ArrayB[var3] = 0;
         }

         for (int var28 = 0; var28 < this.c_I; var28++) {
            this.a_ArrayI[var28] = 0;
         }

         int var10 = var9 / 20;
         this.c_I = (var10 << 1) + 2;
         this.a_ArrayI = new int[this.c_I];
         this.b_ArrayI = new int[this.c_I];
         this.b_ArrayB = new byte[this.c_I];
         this.c_ArrayB = new byte[this.c_I];
         this.c_ArrayI = new int[this.c_I];
         this.d_ArrayI = new int[this.c_I];

         for (int var29 = 2; var29 <= var10 - 2; var29++) {
            int var4 = (this.a_ArrayB.length - 1 << 12) * var29 / var10;
            int var5 = (Math.abs(m.a_Random.nextInt() % 2) + 24 << 12 << 1) / 9;
            int var6 = (Math.abs(m.a_Random.nextInt() % 2) + 10 << 12) / 3;
            int var7 = var5 * 3;
            this.method_a_I_I_I_I_I_I_V(var5, var7, -1, var6, var4, 1);
            var5 = (Math.abs(m.a_Random.nextInt() % 2) + 24 << 12 << 1) / 9;
            var6 = (Math.abs(m.a_Random.nextInt() % 2) + 10 << 12) / 3;
            var7 = var5 * 3;
            this.method_a_I_I_I_I_I_I_V(var5, var7, 1, var6, var4, 1);
         }
      }

      return var2;
   }

   public final void method_a_V() {
      this.e_I = this.a_S << 16;
      this.g_I = this.b_S << 16;
      this.f_I = (this.e_S << 16) - 1966080;
      this.h_I = (this.c_S << 16) + 1966080;
      this.b_I = this.c_S << 16;
   }

   public final void method_a_I_F_I_c_V(int var1, float var2, int var3, c var4) {
      if (this.d_I != 1140850688) {
         this.t_I = 0;
         float var5 = 230.0F;
         if (var2 > var5) {
            var2 = var5;
         } else if (var2 < -var5) {
            var2 = -var5;
         }

         int var10 = (int)Math.abs(var2);
         if (this.g_B == 0) {
            var1 = (int)((long)(this.a_ArrayB.length - 1 << 12) * var1 / 65536L);
            int var6;
            int var7 = (var6 = (var10 * 100 << 12) / 1500) << 1;
            this.method_a_I_I_I_I_I_I_V(var6, var7, -1, 20480, var1 - (var3 << 2), 0);
            this.method_a_I_I_I_I_I_I_V(var6, var7, 1, 20480, var1 + (var3 << 2), 0);
         }

         var4.j_F /= 3.0F;
         var4.k_F /= 3.0F;
         if (this.g_B == 0) {
            this.method_a_d_V(j.a_d);
            int var11 = j.a_d.f_I + (this.c_S << 16);
            var1 = var10 * 500 / 230;
            int var12 = var10 * 6 / 230;
            int var13 = var10 * 800 / 230;
            m.b_n.method_a_I_I_I_I_I_I_I_I_I_V(var12, m.a_c.c_d.c_I, var11, var1, var1 >> 2, 325, 30, var13, var13 / 6);
            m.b_n.method_a_I_I_I_I_I_I_I_I_I_V(var12, m.a_c.c_d.c_I, var11, var1, var1 >> 2, 35, 30, var13, var13 / 6);
         }
      }
   }

   public final void method_a_I_I_c_V(int var1, int var2, c var3) {
      this.t_I = this.t_I + o.a_I;
      if (!m.a_Z) {
         float var5 = (float)(var1 - this.e_I) / (this.g_I - this.e_I);
         float var9 = (float)(var2 - this.f_I) / (this.h_I - this.f_I);
         if (this.f_B < this.d_B) {
            int var4 = this.d_B - this.f_B;
            var1 = this.f_B + (int)(var5 * var4);
         } else {
            int var13 = this.f_B - this.d_B;
            var1 = this.d_B + (int)((1.0F - var5) * var13);
         }

         if (this.e_B < this.a_B) {
            int var14 = this.a_B - this.e_B;
            var2 = this.e_B + (int)(var9 * var14);
         } else {
            int var15 = this.e_B - this.a_B;
            var2 = this.a_B + (int)((1.0F - var9) * var15);
         }

         var3.d_F += var1 << 5;
         var3.e_F += var2 << 5;
         if (var3.j_F > 0.0F) {
            var3.j_F = var3.j_F - o.a_I * var3.j_F / 400;
            if (var3.j_F < 0.0F) {
               var3.j_F = 0.0F;
            }
         } else if (var3.j_F < 0.0F) {
            var3.j_F = var3.j_F - o.a_I * var3.j_F / 400;
            if (var3.j_F > 0.0F) {
               var3.j_F = 0.0F;
            }
         }

         if (var3.k_F > 0.0F) {
            var3.k_F = var3.k_F - o.a_I * var3.k_F / 400;
            if (var3.k_F < 0.0F) {
               var3.k_F = 0.0F;
            }
         } else if (var3.k_F < 0.0F) {
            var3.k_F = var3.k_F - o.a_I * var3.k_F / 400;
            if (var3.k_F > 0.0F) {
               var3.k_F = 0.0F;
            }
         }

         if (this.d_I != 1140850688) {
            float var7 = 1.0F / c.a_ArrayF[m.a_c.d_I];
            float var11 = o.a_I * 0.0014F;
            if (m.a_c.a_F > 0.0F) {
               m.a_c.a_F = m.a_c.a_F - m.a_c.a_F * var7 * var11;
               if (m.a_c.a_F < 0.0F) {
                  m.a_c.a_F = 0.0F;
               }
            } else {
               m.a_c.a_F = m.a_c.a_F - m.a_c.a_F * var7 * var11;
               if (m.a_c.a_F > 0.0F) {
                  m.a_c.a_F = 0.0F;
               }
            }

            if (m.a_c.b_F > 0.0F) {
               m.a_c.b_F = m.a_c.b_F - m.a_c.b_F * var7 * var11;
               if (m.a_c.b_F < 0.0F) {
                  m.a_c.b_F = 0.0F;
               }
            } else {
               m.a_c.b_F = m.a_c.b_F - m.a_c.b_F * var7 * var11;
               if (m.a_c.b_F > 0.0F) {
                  m.a_c.b_F = 0.0F;
               }
            }
         }

         if (this.t_I > 150 && this.d_I != 1140850688) {
            this.method_a_d_V(j.a_d);
            var1 = j.a_d.f_I + (this.c_S << 16);
            m.c_n.b_I = var1;
            m.c_n.c_I = 60000;
            var2 = g.a_ArrayI[4] / 60;
            m.c_n.method_b_I_I_I_I_I_I_I_I_I_I_V(var2, m.a_c.c_d.c_I, m.a_c.c_d.f_I, c.a_ArrayI[0] << 15, 0, 0, 0, 0, 4000, 666);
            this.t_I = 0;
         }

         if (this.d_I != 1140850688) {
            m.a_c.b_B = 8;
         }

         m.a_Z = true;
      }
   }

   private void method_a_I_I_I_I_I_I_V(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = 0; var7 < this.c_I; var7++) {
         if (this.a_ArrayI[var7] == 0) {
            this.a_ArrayI[var7] = var1 * 50 / 100;
            this.b_ArrayI[var7] = var2 * 50 / 100;
            this.b_ArrayB[var7] = (byte)var3;
            this.c_ArrayB[var7] = (byte)var6;
            this.c_ArrayI[var7] = var4 * 50 / 100;
            this.d_ArrayI[var7] = var5;
            return;
         }
      }
   }

   public final void method_a_Graphics_DirectGraphics_d_V(Graphics var1, DirectGraphics var2, d var3) {
      int var13 = o.a_I * o.method_a_I();
      if (this.d_I != 1140850688) {
         if (!m.b_Z) {
            this.u_I += var13;
            if (this.u_I > 150) {
               this.method_a_d_V(j.a_d);
               int var4 = j.a_d.c_I + (this.a_S << 16);
               int var5 = j.a_d.c_I + (this.b_S << 16);
               int var6 = j.a_d.f_I + (this.e_S << 16);
               int var7 = j.a_d.f_I + (this.c_S << 16);
               m.c_n.b_I = var7;
               m.c_n.c_I = 60000;
               m.c_n.method_a_I_I_I_I_I_I_I_I_I_I_I_V(1, var4, var6, var5, var6, 0, 0, 0, 0, 4000, 666);
               this.u_I = 0;
            }
         }

         if (!m.b_Z && this.g_B == 0) {
            this.s_I += var13;

            for (int var19 = 0; var19 < this.a_ArrayB.length; var19++) {
               this.a_ArrayB[var19] = 0;
            }

            for (int var20 = 0; var20 < this.c_I; var20++) {
               if (this.a_ArrayI[var20] != 0) {
                  if (this.c_ArrayB[var20] != 1) {
                     this.a_ArrayI[var20] = this.a_ArrayI[var20] - (var13 * 28 >> 3);
                     this.b_ArrayI[var20] = this.b_ArrayI[var20] - (var13 * 12 >> 3);
                     this.c_ArrayI[var20] = this.c_ArrayI[var20] - (var13 * 4 >> 3);
                  }

                  this.d_ArrayI[var20] = this.d_ArrayI[var20] + (this.b_ArrayB[var20] * this.c_ArrayI[var20] * var13 >> 6);
                  if (this.b_ArrayI[var20] <= 0 || this.c_ArrayI[var20] <= 0) {
                     this.a_ArrayI[var20] = 0;
                  }

                  if (this.a_ArrayI[var20] <= 0) {
                     this.a_ArrayI[var20] = 0;
                  } else if (this.d_ArrayI[var20] < 0 || this.d_ArrayI[var20] >> 12 >= this.r_I >> 12) {
                     this.b_ArrayB[var20] = (byte)(-this.b_ArrayB[var20]);
                     if (this.d_ArrayI[var20] < 0) {
                        this.d_ArrayI[var20] = 0;
                     } else if (this.d_ArrayI[var20] >> 12 >= this.r_I >> 12) {
                        this.d_ArrayI[var20] = (this.r_I >> 12) - 1 << 12;
                     }

                     if (this.c_ArrayB[var20] != 1) {
                        this.a_ArrayI[var20] = this.a_ArrayI[var20] - (28 * (var13 << 1) >> 3);
                        this.b_ArrayI[var20] = this.b_ArrayI[var20] - (12 * (var13 << 1) >> 3);
                        this.c_ArrayI[var20] = this.c_ArrayI[var20] - (4 * (var13 << 1) >> 3);
                     }
                  }

                  int var24;
                  if (this.a_ArrayI[var20] > 0 && (var24 = this.d_ArrayI[var20] >> 12) >= 0 && var24 < this.a_ArrayB.length) {
                     this.a_ArrayB[var24] = (byte)(this.a_ArrayB[var24] + (this.a_ArrayI[var20] >> 12));
                     boolean var27 = false;
                     int var30;
                     if ((var30 = this.b_ArrayI[var20] >> 12) == 0) {
                        var30 = 1;
                     }

                     int var8 = 180 / var30;

                     for (int var9 = 1; var9 < var30; var9++) {
                        int var10 = this.a_ArrayI[var20] * (m.b_ArrayS[90 + var8 * var9] + 360 >> 1) / 360 >> 12;
                        if (var24 - var9 >= 0) {
                           this.a_ArrayB[var24 - var9] = (byte)(this.a_ArrayB[var24 - var9] + var10);
                        }

                        if (var24 + var9 < this.a_ArrayB.length) {
                           this.a_ArrayB[var24 + var9] = (byte)(this.a_ArrayB[var24 + var9] + var10);
                        }
                     }
                  }
               }
            }

            for (int var21 = 0; var21 < this.a_ArrayB.length; var21++) {
               if (var21 > 0
                  && this.a_ArrayB[var21 - 1] < this.a_ArrayB[var21]
                  && var21 < this.a_ArrayB.length - 1
                  && this.a_ArrayB[var21 + 1] < this.a_ArrayB[var21]) {
                  this.a_ArrayB[var21]--;
               }
            }
         }

         this.method_a_d_V(j.a_d);
         d.method_a_d_d_d_V(var3, j.a_d, d.a_d);
         d.a_d.method_a_I_I_V(this.a_S << 16, this.c_S << 16);
         int var22 = d.g_I >> 16;
         int var25 = d.h_I >> 16;
         d.a_d.method_a_I_I_V(this.b_S << 16, this.e_S << 16);
         int var28 = d.g_I >> 16;
         int var31 = d.h_I >> 16;
         int var34 = var28 - var22;
         if (this.g_B != 0) {
            int var40 = m.method_c_I_I(this.d_I);
            int[] var44 = p.a_ArrayI;
            int[] var15 = p.b_ArrayI;
            var44[0] = var22;
            var15[0] = var25;
            var44[1] = var28;
            var15[1] = var25;
            var44[2] = var28;
            var15[2] = var31;
            var44[3] = var22;
            var15[3] = var31;
            var2.fillPolygon(var44, 0, var15, 0, 4, var40);
            return;
         }

         int var39 = (var34 << 8 << 10) / this.a_ArrayB.length >> 8;
         int[] var43 = p.a_ArrayI;
         int[] var14 = p.b_ArrayI;
         var43[0] = var28;
         var14[0] = var31;
         var43[1] = var22;
         var14[1] = var31;
         int var17 = 2;

         for (int var11 = 2; var11 < this.a_ArrayB.length + 2; var11++) {
            if (var11 > 2) {
               byte var35 = this.a_ArrayB[var11 - 2];
               int var12 = 0;

               for (int var32 = var11 + 1; var32 < this.a_ArrayB.length + 2 && this.a_ArrayB[var32 - 2] == var35; var32++) {
                  var12++;
               }

               var11 += var12;
            }

            if (var11 == this.a_ArrayB.length + 1) {
               var43[var17] = var28;
               var14[var17] = var25;
            } else {
               var43[var17] = ((var11 - 2) * var39 >> 10) + var22;
               var14[var17] = (-this.a_ArrayB[var11 - 2] * var39 >> 10) + var25;
            }

            var17++;
         }

         int var46 = m.method_c_I_I(this.d_I);
         var2.fillPolygon(var43, 0, var14, 0, var17, var46);
      } else if (!m.b_Z) {
         this.u_I += var13;
         if (this.u_I > 150) {
            this.method_a_d_V(j.a_d);
            int var23 = j.a_d.c_I + (this.a_S << 16);
            int var26 = j.a_d.c_I + (this.b_S << 16);
            int var29 = j.a_d.f_I + (this.e_S << 16);
            int var33 = j.a_d.f_I + (this.c_S << 16);
            int var36 = 0;
            short var41 = 0;
            int var45 = var23;
            int var16 = var26;
            int var18 = var29;
            int var47 = var33;
            var36 = Math.abs(this.f_B);
            if (Math.abs(this.d_B) > var36) {
               var36 = Math.abs(this.d_B);
            }

            int var48 = Math.abs(this.a_B);
            if (Math.abs(this.e_B) > var48) {
               var48 = Math.abs(this.e_B);
            }

            if (this.f_B + this.d_B > 0) {
               var36 <<= 7;
               var41 = 90;
               var16 = var23;
            } else if (this.f_B + this.d_B < 0) {
               var36 <<= 7;
               var41 = 270;
               var45 = var26;
            } else if (this.a_B + this.e_B > 0) {
               var36 = var48 << 7;
               var41 = 0;
               var47 = var29;
            } else {
               var36 = var48 << 7;
               var41 = 180;
               var18 = var33;
            }

            m.i_n.method_a_I_I_I_I_I_I_I_I_I_I_I_V(1, var45, var18, var16, var47, var36, var36 / 8, var41, 0, 2000, 333);
            this.u_I = 0;
         }
      }
   }
}
