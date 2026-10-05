import com.nokia.mid.ui.DirectGraphics;
import javax.microedition.lcdui.Graphics;

public final class c extends j {
   public int a_I = 0;
   private int r_I = 0;
   private static float l_F = 0.0F;
   private static float m_F = -400.0F;
   private static float[] b_ArrayF = new float[]{0.6F, 0.3F, 0.6F};
   private static float[] c_ArrayF = new float[]{0.1F, 0.1F, 0.1F};
   private static float[] d_ArrayF = new float[]{(float)Math.cos(0.9599311F), (float)Math.cos(0.9599311F), (float)Math.cos(0.9599311F)};
   public static final int[] a_ArrayI = new int[]{20, 20, 20};
   public static final float[] a_ArrayF = new float[]{1.0F, 1.4F, 0.5F};
   private static float[] e_ArrayF = new float[]{500.0F, 350.0F, 312.5F};
   private static float[] f_ArrayF = new float[]{280.0F, 350.0F, 150.0F};
   private static float[] g_ArrayF = new float[]{1.5F, 2.5F, 1.2F};
   private static float[] h_ArrayF = new float[]{288.0F, 255.0F, 162.5F};
   public static int[] b_ArrayI = new int[3];
   private static int s_I;
   public static int b_I;
   public static int c_I;
   private static int[] c_ArrayI = new int[]{458, 460, 454, 452, 456};
   private static short[] a_ArrayS = new short[]{
      211,
      212,
      223,
      234,
      237,
      238,
      239,
      240,
      241,
      242,
      213,
      214,
      215,
      216,
      217,
      218,
      219,
      220,
      221,
      222,
      224,
      225,
      226,
      227,
      228,
      229,
      230,
      231,
      232,
      233,
      235,
      236
   };
   public float a_F;
   public float b_F;
   public float c_F;
   public float d_F;
   public float e_F;
   public float f_F;
   public float g_F;
   public boolean a_Z = true;
   public boolean b_Z = true;
   public boolean c_Z = false;
   private int[] d_ArrayI;
   private int[] e_ArrayI;
   private int[] f_ArrayI;
   private int[] g_ArrayI;
   private int[] h_ArrayI;
   private int[] i_ArrayI;
   public float h_F;
   public float i_F;
   public float j_F;
   public float k_F;
   private float n_F;
   private int t_I;
   private final int[] j_ArrayI = new int[16];
   private final int[] k_ArrayI = new int[16];
   private final int[] l_ArrayI = new int[16];
   private final int[] m_ArrayI = new int[16];
   private final int[] n_ArrayI = new int[16];
   private final int[] o_ArrayI = new int[16];
   private final boolean[] a_ArrayZ = new boolean[16];
   private float o_F = 0.5F;
   private int u_I = 15539236;
   private int v_I = 16777215;
   private int w_I = 11473152;
   private static int[] p_ArrayI = new int[]{15592941, 25788, 15592941, 14752000, 15592941, 15261445};
   public int d_I = 0;
   private float p_F;
   private float q_F;
   private float r_F;
   public boolean d_Z = false;
   private boolean h_Z = false;
   private static int x_I;
   private static int y_I;
   private static int z_I;
   private static boolean i_Z;
   private static float s_F = 1.5258789E-5F;

   public c(boolean var1) {
      this.c_B = 4;
      this.h_Z = var1;
      if (var1) {
         this.d_ArrayI = new int[4];
         this.e_ArrayI = new int[4];
         this.f_ArrayI = new int[4];
         this.g_ArrayI = new int[4];
         this.h_ArrayI = new int[4];
         this.i_ArrayI = new int[4];
         this.method_n_V();
      }
   }

   private void method_n_V() {
      for (int var1 = 0; var1 < 4; var1++) {
         this.d_ArrayI[var1] = 0;
         this.e_ArrayI[var1] = 0;
         this.f_ArrayI[var1] = 0;
         this.g_ArrayI[var1] = 0;
      }
   }

   public final void method_b_V() {
      float var1 = 0.0F;
      if (m.d_Z && this.d_I == 0) {
         var1 = 50.0F;
      }

      if (this.d_Z) {
         if (this.a_F > -f_ArrayF[this.d_I] - var1) {
            this.d_F = this.d_F - (e_ArrayF[this.d_I] + var1);
            return;
         }
      } else if (this.a_F > -f_ArrayF[this.d_I] - var1) {
         this.d_F = this.d_F - (e_ArrayF[this.d_I] + var1) / g_ArrayF[this.d_I];
      }
   }

   public final void method_c_V() {
      float var1 = 0.0F;
      if (m.d_Z && this.d_I == 0) {
         var1 = 50.0F;
      }

      if (this.d_Z) {
         if (this.a_F < f_ArrayF[this.d_I] + var1) {
            this.d_F = this.d_F + (e_ArrayF[this.d_I] + var1);
            return;
         }
      } else if (this.a_F < f_ArrayF[this.d_I] + var1) {
         this.d_F = this.d_F + (e_ArrayF[this.d_I] + var1) / g_ArrayF[this.d_I];
      }
   }

   public final void method_a_Z_V(boolean var1) {
      if (this.r_F > d_ArrayF[this.d_I] && this.d_Z) {
         if (var1) {
            this.g_F = this.g_F + h_ArrayF[this.d_I] / 2.0F;
         } else {
            this.g_F = this.g_F + h_ArrayF[this.d_I];
         }

         this.d_Z = false;
         if (this.h_Z) {
            if (var1) {
               this.method_b_I_I_V(0, -27);
               this.method_b_I_I_V(1, -27);
               return;
            }

            this.method_b_I_I_V(0, -53);
            this.method_b_I_I_V(1, -53);
         }
      }
   }

   private void method_b_I_I_V(int var1, int var2) {
      if (var2 > 0) {
         if (var2 > 70) {
            var2 = 70;
         }
      } else if (var2 < 0 && var2 < -70) {
         var2 = -70;
      }

      this.d_ArrayI[var1] = this.d_ArrayI[var1] + var2;
   }

   public final void method_a_V() {
      this.e_I = -a_ArrayI[this.d_I] << 16;
      this.g_I = a_ArrayI[this.d_I] << 16;
      this.f_I = -a_ArrayI[this.d_I] << 16;
      this.h_I = a_ArrayI[this.d_I] << 16;
   }

   public final void method_d_V() {
      this.method_h_V();
      super.method_d_V();
      this.f_Z = true;
      if (this.a_Z) {
         this.d_F = this.d_F + 0.0F * a_ArrayF[this.d_I];
         this.e_F = this.e_F + m_F * a_ArrayF[this.d_I];
         if (this.h_Z) {
            if (!this.c_Z) {
               float var1 = this.a_F - this.h_F;
               float var2 = this.b_F - this.i_F;
               if (var1 > 0.0F) {
                  this.method_b_I_I_V(3, ((int)var1 >> 2 << 1) / 3);
               } else {
                  this.method_b_I_I_V(2, (-((int)var1) >> 2 << 1) / 3);
               }

               if (var2 > 0.0F) {
                  this.method_b_I_I_V(1, ((int)var2 >> 2 << 1) / 3);
               } else {
                  this.method_b_I_I_V(0, (-((int)var2) >> 2 << 1) / 3);
               }
            }

            this.c_Z = false;
         }

         c var6 = this;
         float var12 = o.a_I * 0.001F;
         if (var6.h_Z) {
            var6.h_F = var6.a_F;
            var6.i_F = var6.b_F;
         }

         float var3 = 1.0F / a_ArrayF[var6.d_I];
         var6.a_F = var6.a_F + var6.d_F * var3 * var12;
         var6.b_F = var6.b_F + var6.e_F * var3 * var12;
         var6.a_F = var6.a_F + var6.f_F * var3;
         var6.b_F = var6.b_F + var6.g_F * var3;
         var6.c_d.c_I = var6.c_d.c_I + (int)(var6.a_F * var12 * 65536.0F);
         var6.c_d.f_I = var6.c_d.f_I + (int)(var6.b_F * var12 * 65536.0F);
         var6.d_F = 0.0F;
         var6.e_F = 0.0F;
         var6.f_F = 0.0F;
         var6.g_F = 0.0F;
         float var4 = (var3 = var6.j_F * var6.q_F + var6.k_F * var6.r_F) * var6.q_F;
         var3 *= var6.r_F;
         if (var6.q_F * var6.j_F + var6.r_F * var6.k_F >= 0.0F) {
            var4 = var6.j_F - var4;
            var3 = var6.k_F - var3;
         } else {
            var4 = var6.j_F + var4;
            var3 = var6.k_F + var3;
         }

         var12 = (float)Math.sqrt(var4 * var4 + var3 * var3) / a_ArrayI[var6.d_I] * var12;
         if (var6.q_F * var3 - var4 * var6.r_F > 0.0F) {
            var12 = -var12;
         }

         var6.n_F += var12;
         this.p_F = this.p_F + o.a_I / 1000.0F;
         if (this.p_F > 0.25F) {
            this.d_Z = false;
         }

         this.c_F = (float)Math.sqrt(this.a_F * this.a_F + this.b_F * this.b_F);
         if (this.c_F > 999.0F) {
            float var7 = 999.0F / this.c_F;
            this.a_F *= var7;
            this.b_F *= var7;
            this.c_F = 999.0F;
         }

         if (this.h_Z) {
            for (int var8 = 0; var8 < 4; var8++) {
               this.g_ArrayI[var8] = this.g_ArrayI[var8] + this.d_ArrayI[var8];
               this.d_ArrayI[var8] = 0;
               if (this.g_ArrayI[var8] > 70) {
                  this.g_ArrayI[var8] = 70;
               } else if (this.g_ArrayI[var8] < -70) {
                  this.g_ArrayI[var8] = -70;
               }

               this.e_ArrayI[var8] = this.e_ArrayI[var8] + this.g_ArrayI[var8] * o.a_I;
               this.f_ArrayI[var8] = this.e_ArrayI[var8] * j.g_d.a_I / 65536;
               this.g_ArrayI[var8] = this.g_ArrayI[var8] + (o.a_I * 7 * -this.e_ArrayI[var8] >> 16);
               this.g_ArrayI[var8] = this.g_ArrayI[var8] - (o.a_I * 120 * this.g_ArrayI[var8] >> 16);
            }
         }

         if (this.h_Z) {
            float var9 = 40.0F;
            if (s_I > 0) {
               s_I = s_I - o.a_I;
               b_I = 3000;
               if (s_I <= 0) {
                  if (c_I >= 2 && c_I <= 8) {
                     int var14;
                     if (Math.abs(m.a_Random.nextInt() % 3) == 0) {
                        var14 = 3;
                     } else {
                        var14 = Math.abs(m.a_Random.nextInt() % 6) + 3;
                     }

                     s_I = 1500;
                     c_I = var14;
                     if (var14 == 3) {
                        s_I = 600;
                     }
                  } else {
                     s_I = 0;
                     c_I = 0;
                  }
               }
            } else if (g.a_ArrayI[0] == 0 && g.a_ArrayI[1] == 0 && Math.abs(this.a_F) < var9 && Math.abs(this.b_F) < var9 && (b_I = b_I - o.a_I) <= 0) {
               s_I = 600;
               c_I = 2;
               b_I = 3000;
            }

            if (Math.abs(this.a_F) >= var9 || Math.abs(this.b_F) >= var9) {
               if (c_I != 1) {
                  c_I = 0;
               }

               b_I = 3000;
            }
         }

         if (this.a_I != 0) {
            int var10 = this.a_I >>> 24;
            int var15;
            if ((var15 = o.a_I / 2) < 1) {
               var15 = 1;
            }

            int var11;
            if ((var11 = var10 - var15) < 0) {
               var11 = 0;
            }

            this.a_I = var11 << 24;
         }
      }
   }

   public final void method_a_I_I_V(int var1, int var2) {
      this.method_g_V();
      this.c_d.c_I = var1;
      this.c_d.f_I = var2;
      this.b_d.c_I = var1;
      this.b_d.f_I = var2;
      this.c_Z = true;
      if (this.h_Z) {
         this.h_F = 0.0F;
         this.i_F = 0.0F;

         for (int var3 = 0; var3 < 4; var3++) {
            this.d_ArrayI[var3] = 0;
            this.e_ArrayI[var3] = 0;
            this.f_ArrayI[var3] = 0;
            this.g_ArrayI[var3] = 0;
         }
      }

      this.f_Z = true;
   }

   public final void method_a_j_V(j var1) {
      int var2 = 1;

      while (++var2 < 10) {
         j var4 = var1;
         c var3 = this;
         this.t_I = 0;
         int var5 = a_ArrayI[var3.d_I] << 16;
         int var6 = a_ArrayI[var3.d_I] * a_ArrayI[var3.d_I] << 16;
         int var7 = var3.c_d.c_I - var3.b_d.c_I;
         int var8 = var3.c_d.f_I - var3.b_d.f_I;
         j var9 = var4;

         while (var9 != null) {
            var9.d_d.method_a_I_I_V(var3.b_d.c_I, var3.b_d.f_I);
            int var10 = d.g_I;
            int var11 = d.h_I;
            if (var9.f_Z) {
               var9.method_k_V();
            }

            var9.e_d.method_a_I_I_V(var3.c_d.c_I, var3.c_d.f_I);
            int var12 = d.g_I;
            int var13 = d.h_I;
            int var14 = var10;
            int var15 = var12;
            if (var14 > var15) {
               var14 = var12;
               var15 = var10;
            }

            int var16 = var11;
            int var17 = var13;
            if (var16 > var17) {
               var16 = var13;
               var17 = var11;
            }

            var14 -= var5;
            var16 -= var5;
            var15 += var5;
            var17 += var5;
            if (!method_b_I_I_I_I_I_I_I_I_Z(var9.i_I, var9.j_I, var9.k_I, var9.l_I, var14, var16, var15, var17)) {
               var9 = var9.method_b_j_j(var4);
            } else if ((var9.m_I & 32) > 0) {
               var9 = var9.method_a_j_j(var4);
            } else {
               switch (var9.method_a_B()) {
                  case 2:
                     p var87 = (p)var9;
                     boolean var96 = false;
                     int var101 = 0;
                     int var103 = 0;
                     int var105 = 0;
                     int var107 = 0;
                     int var24 = 0;
                     int var25 = var87.a_I - 1;
                     int var26 = 0;

                     for (; var26 < var25; var26++) {
                        int var27 = var87.c_ArrayI[var26];
                        int var28 = var87.d_ArrayI[var26];
                        int var29 = var87.c_ArrayI[var26 + 1];
                        int var30 = var87.d_ArrayI[var26 + 1];
                        int var31 = var27;
                        int var32 = var29;
                        if (var31 > var32) {
                           var31 = var29;
                           var32 = var27;
                        }

                        int var33 = var28;
                        int var34 = var30;
                        if (var33 > var34) {
                           var33 = var30;
                           var34 = var28;
                        }

                        if (method_b_I_I_I_I_I_I_I_I_Z(var31, var33, var32, var34, var14, var16, var15, var17)) {
                           if (!var96) {
                              var96 = true;
                              var101 = var12 - var10;
                              var103 = var13 - var11;
                              if ((var105 = (int)Math.sqrt((long)var101 * var101 + (long)var103 * var103)) != 0) {
                                 var107 = (int)(((long)var101 << 16) / var105);
                                 var24 = (int)(((long)var103 << 16) / var105);
                              }
                           }

                           var31 = var28 - var30;
                           var32 = -(var27 - var29);
                           int var35 = (int)Math.sqrt((long)var31 * var31 + (long)var32 * var32);
                           int var36 = (int)(((long)var31 * a_ArrayI[var3.d_I] << 16) / var35);
                           var35 = (int)(((long)var32 * a_ArrayI[var3.d_I] << 16) / var35);
                           int var37 = var27 + var36;
                           int var38 = var28 + var35;
                           var36 = var29 + var36;
                           var35 = var30 + var35;
                           if ((long)var101 * var31 + (long)var103 * var32 < 0L) {
                              if (method_a_I_I_I_I_I_I_I_I_I_Z(var10, var11, var101, var103, var37, var38, var36, var35, var6)) {
                                 var3.method_a_p_I_I_I_I_I_Z_V(var87, z_I, var7, var8, var31, var32, i_Z);
                              }

                              if (method_c_I_I_I_I_I_I_I_I_Z(var10, var11, var107, var24, var105, var27, var28, a_ArrayI[var3.d_I])) {
                                 var31 = x_I - var27;
                                 var32 = y_I - var28;
                                 var3.method_a_p_I_I_I_I_I_Z_V(var87, z_I, var7, var8, var31, var32, i_Z);
                              }

                              if (method_c_I_I_I_I_I_I_I_I_Z(var10, var11, var107, var24, var105, var29, var30, a_ArrayI[var3.d_I])) {
                                 var31 = x_I - var29;
                                 var32 = y_I - var30;
                                 var3.method_a_p_I_I_I_I_I_Z_V(var87, z_I, var7, var8, var31, var32, i_Z);
                              }
                           }
                        }
                     }

                     var9 = var9.method_a_j_j(var4);
                     break;
                  case 3:
                  case 5:
                  default:
                     var9 = var9.method_a_j_j(var4);
                     break;
                  case 4:
                     var9 = var9.method_a_j_j(var4);
                     break;
                  case 6:
                     i var86;
                     int var95 = (var86 = (i)var9).a_S << 16;
                     int var100 = var86.c_S << 16;
                     if (method_a_I_I_I_I_I_I_I_I_I_Z(var95, var100, (var86.b_S << 16) - var95, 0, var10, var11, var12, var13, 0)) {
                        var86.method_a_I_F_I_c_V(z_I, var3.b_F, a_ArrayI[var3.d_I], var3);
                     }

                     if (var13 - var5 < var86.b_I) {
                        var86.method_a_I_I_c_V(var12, var13 - var5, var3);
                     }

                     var9 = var9.method_a_j_j(var4);
                     break;
                  case 7:
                     k var85 = (k)var9;
                     if (method_a_I_I_I_I_I_I_I_I_Z(var10, var11, var12, var13, var85.a_I, var85.c_I, var85.b_I, var85.d_I)) {
                        var85.method_b_V();
                     }

                     var9 = var9.method_a_j_j(var4);
                     break;
                  case 8:
                     e var84 = (e)var9;
                     int var94 = -4587520;
                     int var99 = 6225920;
                     if (method_a_I_I_I_I_I_I_I_I_I_Z(var94, var99, 9175040, 0, var10, var11, var12, var13, 0)) {
                        c var67 = var3;
                        float var63 = var3.b_F;
                        e var59 = var84;
                        if (var63 < 0.0F) {
                           if ((var13 = -((int)var63)) < 100) {
                              var13 = 100;
                           }

                           if (var13 > 1000) {
                              var13 = 1000;
                           }

                           var59.b_I = (1100 - var13 >> 1) + 20;
                           var59.a_I = var59.b_I / o.method_b_I_I(var59.a_S);
                           var59.a_c = var67;
                           var59.a_F = -var63 * var59.a_B * 2.0F / 100.0F;
                           float var64 = 400.0F * var59.a_B * 2.0F / 100.0F;
                           if (var59.a_F > var64) {
                              var59.a_F = var64;
                           }

                           var59.a_c.a_Z = false;
                           var59.a_c.a_F = 0.0F;
                           var59.a_c.b_F = 0.0F;
                           var59.a_Z = false;
                           var59.method_b_V();
                           if (var59.a_c.equals(m.a_c)) {
                              g.a_ArrayI[1] = 2;
                           }
                        }
                     }

                     var9 = var9.method_a_j_j(var4);
                     break;
                  case 9:
                     a var83 = (a)var9;
                     j var93 = var9.method_a_j_j(var4);
                     int var98 = var12 >> 16;
                     int var21 = var13 >> 16;
                     if (var98 * var98 + var21 * var21 < 2025) {
                        a var58 = var83;
                        var83.method_a_d_V(j.a_d);
                        var11 = j.a_d.c_I;
                        var12 = j.a_d.f_I;
                        m.f_n.method_a_I_I_I_I_I_I_I_V(8, var11, var12, 540, 0, 540, 0);
                        if (var58.equals(m.a_a)) {
                           m.f_I++;
                           var58.c_d.c_I = Integer.MAX_VALUE;
                           var58.c_d.f_I = Integer.MAX_VALUE;
                           var58.b_d.method_a_d_V(var58.c_d);
                           var58.b_d.method_c_d_V(var58.d_d);
                           var58.f_Z = true;
                        } else {
                           var58.method_j_V();
                           m.f_I++;
                        }
                     }

                     var9 = var93;
                     break;
                  case 10:
                     l var18 = (l)var9;
                     j var19 = var9.method_a_j_j(var4);
                     boolean var20 = false;
                     if (var18.a_B == 0 || var18.a_B == 2 && (var18.d_B == 1 || var18.a_Z)) {
                        var20 = method_a_I_I_I_I_I_I_I_I_Z(
                           var10, var11, var12, var13, var18.e_I, var18.f_I + (var18.h_I - var18.f_I << 1) / 3, var18.g_I, var18.h_I
                        );
                     }

                     if (var20) {
                        var18.method_e_V();
                     } else {
                        if (method_a_I_I_I_I_I_I_I_I_Z(var10, var11, var12, var13, var18.e_I, var18.f_I, var18.g_I, var18.h_I)) {
                           var18.method_c_V();
                        }

                        if (var18.a_B == 2) {
                           int var22 = var18.a_I * 100 / var18.b_I;
                           int var23 = (var18.h_I - var18.f_I) * var22 / 100;
                           if (method_a_I_I_I_I_I_I_I_I_Z(var10, var11, var12, var13, var18.e_I, var18.f_I, var18.g_I, var18.f_I + var23)) {
                              var18.method_b_V();
                           }
                        }
                     }

                     var9 = var19;
               }
            }
         }

         if (var3.t_I == 0) {
            break;
         }

         var3 = this;
         long var52 = 42949672960000L;
         long var53 = Long.MAX_VALUE;
         var8 = -1;

         for (int var55 = 0; var55 < var3.t_I; var55++) {
            long var60 = var3.j_ArrayI[var55] - var3.b_d.c_I;
            long var68 = var3.k_ArrayI[var55] - var3.b_d.f_I;
            long var74 = var60 * var60 + var68 * var68;
            if (var3.a_ArrayZ[var55]) {
               var74 = -var74;
            }

            if (var74 > var52) {
               System.out.println("Sanity check failed! Found collision is too far, distance: " + Math.sqrt(var74) / 65536.0);
            } else if (var74 < var53) {
               var53 = var74;
               var8 = var55;
            }
         }

         if (var8 != -1) {
            float var61 = 1000.0F / o.a_I;
            float var65 = var3.j_ArrayI[var8] * s_F;
            float var69 = var3.k_ArrayI[var8] * s_F;
            float var71 = var3.l_ArrayI[var8] * s_F;
            float var75 = var3.m_ArrayI[var8] * s_F;
            float var78 = 1.0F / (float)Math.sqrt(var71 * var71 + var75 * var75);
            var71 *= var78;
            var75 *= var78;
            float var80 = var3.n_ArrayI[var8] * s_F;
            float var82 = var3.o_ArrayI[var8] * s_F;
            float var88;
            float var97 = (var88 = var80 * var71 + var82 * var75) * var71;
            float var102 = var88 * var75;
            if (var71 * var80 + var75 * var82 < 0.0F) {
               var97 = -var97;
               var102 = -var102;
            }

            float var104 = var80 * var61;
            float var106 = var82 * var61;
            float var108 = (var3.c_d.c_I - var3.j_ArrayI[var8]) * s_F;
            float var109 = (var3.c_d.f_I - var3.k_ArrayI[var8]) * s_F;
            float var110 = var65 + var80;
            float var111 = var69 + var82;
            float var112 = var71 * 0.01F;
            float var113 = var75 * 0.01F;
            float var114 = (var88 = var108 * var71 + var109 * var75) * var71;
            float var117 = var88 * var75;
            float var123 = var108 - var114 - var114 * c_ArrayF[var3.d_I];
            float var129 = var109 - var117 - var117 * c_ArrayF[var3.d_I];
            float var132 = var65 + var123 + var97 + var112;
            float var133 = var69 + var129 + var102 + var113;
            var114 = (var88 = var3.a_F * var71 + var3.b_F * var75) * var71;
            var117 = var88 * var75;
            var123 = var3.a_F - var114 - var114 * c_ArrayF[var3.d_I];
            var129 = var3.b_F - var117 - var117 * c_ArrayF[var3.d_I];
            var114 = (var88 = var104 * var71 + var106 * var75) * var71;
            var117 = var88 * var75;
            var3.a_F = var114 + var123;
            var3.b_F = var117 + var129;
            var123 = var3.a_F - var104;
            var129 = var3.b_F - var106;
            float var136;
            float var140 = (var136 = (float)Math.sqrt(var123 * var123 + var129 * var129)) != 0.0F ? var123 / var136 : 0.0F;
            var136 = var136 != 0.0F ? var129 / var136 : 0.0F;
            var88 = -(var71 * 0.0F + var75 * m_F);
            float var56 = b_ArrayF[var3.d_I] * a_ArrayF[var3.d_I] * var88;
            float var142 = var140 * var56;
            float var143 = var136 * var56;
            float var57 = a_ArrayF[var3.d_I] * var61;
            var140 = var123 * var57;
            var136 = var129 * var57;
            if (var140 * var140 + var136 * var136 < var142 * var142 + var143 * var143) {
               var3.d_F -= var140;
               var3.e_F -= var136;
            } else {
               var3.d_F -= var142;
               var3.e_F -= var143;
            }

            var3.j_F = var3.j_F * (1.0F - var3.o_F) + var123 * var3.o_F;
            var3.k_F = var3.k_F * (1.0F - var3.o_F) + var129 * var3.o_F;
            var3.p_F = 0.0F;
            var3.d_Z = true;
            var3.q_F = var71;
            var3.r_F = var75;
            var3.b_d.c_I = (int)(var110 * 65536.0F);
            var3.b_d.f_I = (int)(var111 * 65536.0F);
            var3.c_d.c_I = (int)(var132 * 65536.0F);
            var3.c_d.f_I = (int)(var133 * 65536.0F);
            var3.method_k_V();
            var3.b_d.method_c_d_V(var3.d_d);
            var3.t_I = 0;
         }
      }

      this.p_F = this.p_F + o.a_I / 1000.0F;
      if (this.p_F > 0.25F) {
         this.d_Z = false;
      }
   }

   private void method_a_p_I_I_I_I_I_Z_V(p var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (var2 > 0) {
         this.j_ArrayI[this.t_I] = this.b_d.c_I + (int)((long)var3 * var2 >> 16);
         this.k_ArrayI[this.t_I] = this.b_d.f_I + (int)((long)var4 * var2 >> 16);
         this.a_ArrayZ[this.t_I] = var7;
         var1.b_d.method_b_I_I_V(var5, var6);
         var3 = d.g_I;
         var4 = d.h_I;
         var1.method_a_d_V(j.a_d);
         j.a_d.method_b_I_I_V(var5, var6);
         var5 = d.g_I;
         var6 = d.h_I;
         this.l_ArrayI[this.t_I] = (int)((long)var3 * (65536 - var2) + (long)var5 * var2 >> 16);
         this.m_ArrayI[this.t_I] = (int)((long)var4 * (65536 - var2) + (long)var6 * var2 >> 16);
      } else {
         if (var2 < 0) {
            throw new IllegalStateException("t < 0, t: " + var2);
         }

         var1.b_d.method_a_I_I_V(x_I, y_I);
         this.j_ArrayI[this.t_I] = d.g_I;
         this.k_ArrayI[this.t_I] = d.h_I;
         this.a_ArrayZ[this.t_I] = var7;
         var1.b_d.method_a_I_I_V(var5, var6);
         this.l_ArrayI[this.t_I] = d.g_I;
         this.m_ArrayI[this.t_I] = d.h_I;
      }

      float var9 = o.a_I / 1000.0F;
      var1.b_d.method_a_I_I_V(x_I, y_I);
      var4 = d.g_I;
      var5 = d.h_I;
      var1.method_a_d_V(j.a_d);
      j.a_d.method_a_I_I_V(x_I, y_I);
      var6 = (int)(var9 * 65536.0F);
      this.n_ArrayI[this.t_I] = d.g_I - var4 + var6 * 0;
      this.o_ArrayI[this.t_I] = d.h_I - var5 + var6 * 0;
      this.t_I++;
      if (var1.a_S > -1) {
         ((g)this.method_a_j().method_a_S_j(var1.a_S)).method_a_I_V(2);
      }
   }

   private static boolean method_c_I_I_I_I_I_I_I_I_Z(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      long var8 = var0 - var5;
      long var10 = var1 - var6;
      long var12;
      if ((var12 = var8 * var2 + var10 * var3 >> 16) >= 0L) {
         return false;
      }

      long var14;
      if ((var14 = (var8 * var8 + var10 * var10 >> 16) - (var7 * var7 << 16)) <= 0L) {
         z_I = 0;
         int var22 = (int)Math.sqrt(var8 * var8 + var10 * var10);
         int var17 = 0;
         int var23 = 0;
         if (var22 != 0) {
            var17 = (int)((var8 * var7 << 16) / var22);
            var23 = (int)((var10 * var7 << 16) / var22);
         }

         x_I = var5 + var17;
         y_I = var6 + var23;
         i_Z = true;
         return true;
      } else {
         long var16;
         if ((var16 = (var12 * var12 >> 16) - var14) < 0L) {
            return false;
         } else {
            long var18;
            long var20;
            if ((var18 = -var12 - (int)Math.sqrt(var20 = var16 << 16)) <= var4) {
               z_I = (int)((var18 << 16) / var4);
               x_I = (int)(var0 + (var18 * var2 >> 16));
               y_I = (int)(var1 + (var18 * var3 >> 16));
               i_Z = false;
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private static boolean method_a_I_I_I_I_I_I_I_I_I_Z(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      long var9 = (long)var4 * var3 >> 16;
      long var11 = (long)var5 * var2 >> 16;
      long var13 = (long)var6 * var3 >> 16;
      long var15 = (long)var7 * var2 >> 16;
      long var17;
      if ((var17 = var9 - var11 - var13 + var15) == 0L) {
         return false;
      }

      long var19;
      if ((var19 = (var9 - var11 + ((long)var2 * var1 >> 16) - ((long)var3 * var0 >> 16) << 16) / var17) >= 0L && var19 <= 65536L) {
         long var21;
         if ((var21 = ((long)var4 * (var7 - var1) + (long)var5 * (var0 - var6) + (long)var6 * var1 - (long)var7 * var0) / var17) >= 0L && var21 <= 65536L) {
            z_I = (int)var21;
            x_I = (int)(var0 + (var21 * var2 >> 16));
            y_I = (int)(var1 + (var21 * var3 >> 16));
            i_Z = false;
            return true;
         }

         if (var21 < 0L) {
            long var23 = var6 - var4;
            long var25 = var7 - var5;
            long var27 = var0 - var4;
            long var29 = var1 - var5;
            long var31;
            if ((var31 = var27 * var23 + var29 * var25 >> 16) <= 0L) {
               return false;
            }

            long var33 = var23 * var23 + var25 * var25 >> 16;
            if (var31 >= var33) {
               return false;
            }

            var31 = (var31 << 16) / var33;
            long var35 = var4 + (var31 * var23 >> 16);
            long var37 = var5 + (var31 * var25 >> 16);
            long var39 = var35 - var0;
            long var41 = var37 - var1;
            if (var39 * var39 + var41 * var41 >> 16 > var8) {
               return false;
            }

            z_I = 0;
            x_I = (int)var35;
            y_I = (int)var37;
            i_Z = true;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final void method_e_V() {
      this.method_h_V();
      super.method_d_V();
      this.method_n_V();
      int var1;
      if ((var1 = 3000 - m.b_I) <= 1000) {
         this.c_d.f_I = m.c_I + (m.b_ArrayS[var1 / 5 % 360] << 14);
      } else {
         this.c_d.f_I = m.c_I + (m.b_ArrayS[200] << 14) - (var1 - 1000) * 22500;
      }
   }

   public final void method_a_Graphics_DirectGraphics_d_V(Graphics var1, DirectGraphics var2, d var3) {
      if (this.b_Z) {
         this.method_a_d_V(j.a_d);
         d.method_a_d_d_d_V(var3, j.a_d, d.a_d);
         d.a_d.method_a_I_I_V(this.c_d.c_I, this.c_d.f_I);
         int var19 = d.a_d.c_I >> 16;
         int var20 = d.a_d.f_I >> 16;
         d.a_d.method_a_I_I_V(-(a_ArrayI[this.d_I] << 16), a_ArrayI[this.d_I] << 16);
         int var4 = d.g_I >> 16;
         int var5 = d.h_I >> 16;
         int var6 = var19 - var4;
         int var7 = var20 - var5;
         int var8 = var6 >> 2;
         int var9 = var19 - var8;
         int var10 = var20 - var8;
         if (!this.h_Z) {
            var1.setColor(this.u_I);
            var1.fillArc(var4, var5, var6 << 1, var7 << 1, 0, 360);
         } else {
            if (this.d_I == 0) {
               var6 = var19;
               var7 = var20;
               Graphics var21 = o.method_a_Graphics();
               if (this.a_I != 0) {
                  m.a_Graphics.setColor(255);
                  m.a_Graphics.fillRect(0, 0, m.a_Image.getWidth(), m.a_Image.getHeight());
                  var19 = m.a_Image.getWidth() >> 1;
                  var20 = m.a_Image.getHeight() >> 1;
                  var1 = m.a_Graphics;
                  o.method_a_Graphics_V(m.a_Graphics);
               }

               for (int var23 = 0; var23 < 4; var23++) {
                  this.h_ArrayI[var23] = 0;

                  for (int var36 = 0; var36 < 4; var36++) {
                     if (var23 != var36) {
                        this.h_ArrayI[var23] = this.h_ArrayI[var23] - (this.f_ArrayI[var36] >> 1);
                     }
                  }
               }

               for (int var24 = 0; var24 < 4; var24++) {
                  this.i_ArrayI[var24] = 999;
               }

               this.method_a_I_I_I_I_I_Graphics_Z_Z_V(var19, var20, b_ArrayI[this.d_I] + 2, b_ArrayI[this.d_I] + 2, -16777216, var1, false, false);
               this.method_a_I_I_I_I_I_Graphics_Z_Z_V(var19, var20, b_ArrayI[this.d_I], b_ArrayI[this.d_I], this.u_I, var1, true, false);
               var5 = b_ArrayI[this.d_I] * 90 / 100;
               this.method_a_I_I_I_I_I_Graphics_Z_Z_V(var19, var20 + 2, var5, b_ArrayI[this.d_I], this.w_I, var1, false, false);
               this.method_a_I_I_I_I_I_Graphics_Z_Z_V(var19 + 1, var20 - 1, var5, b_ArrayI[this.d_I], this.u_I, var1, false, true);
               d.a_d.method_a_F_V(5.3F);
               var5 = (var8 = this.i_ArrayI[1]) >> 1;
               var8 = this.i_ArrayI[1] - var5 + 1;
               var9 = var19 + (d.a_d.a_I * var8 >> 16);
               var8 = var20 + (d.a_d.d_I * var8 >> 16);

               for (int var43 = 0; var43 < 12; var43++) {
                  int var11 = 31 + Math.abs(var43 % 2);
                  float var12 = this.n_F + var43 * 0.8F;
                  int var13 = 100 - (var43 << 2);
                  int var16 = var11;
                  float var15 = var12;
                  int var14 = var13;
                  var13 = var20;
                  int var50 = var19;
                  c var46 = this;
                  d.a_d.method_a_F_V(var15);

                  for (int var54 = 0; var54 < 4; var54++) {
                     int var17 = var46.i_ArrayI[var54] >> 1 >> 1;
                     var17 = var14 * (var46.i_ArrayI[var54] - var17) / 100;
                     int var18 = var50 + (d.a_d.a_I * var17 >> 16);
                     var17 = var13 + (d.a_d.d_I * var17 >> 16);
                     if (var54 == 0) {
                        if (var18 >= var50 && var17 <= var13) {
                           o.method_a_I_I_I_V(var18, var17 + (var46.f_ArrayI[1] + var46.h_ArrayI[1] >> 10), var16);
                           break;
                        }
                     } else if (var54 == 1) {
                        if (var18 <= var50 && var17 <= var13) {
                           o.method_a_I_I_I_V(var18, var17 + (var46.f_ArrayI[1] + var46.h_ArrayI[1] >> 10), var16);
                           break;
                        }
                     } else if (var54 == 2) {
                        if (var18 <= var50 && var17 >= var13) {
                           o.method_a_I_I_I_V(var18, var17 + (var46.f_ArrayI[1] + var46.h_ArrayI[1] >> 10), var16);
                           break;
                        }
                     } else if (var18 >= var50 && var17 >= var13) {
                        o.method_a_I_I_I_V(var18, var17 + (var46.f_ArrayI[1] + var46.h_ArrayI[1] >> 10), var16);
                        break;
                     }
                  }
               }

               o.method_a_I_I_I_V(var19, var20, 17);
               this.method_a_I_I_I_I_I_Graphics_Z_Z_V(var9, var8, var5 >> 1, b_ArrayI[this.d_I], this.v_I, var1, false, false);
               o.method_a_I_I_I_V(var19, var20, 28);
               if (this.a_I != 0) {
                  o.method_a_Graphics_V(var21);
                  m.a_Image.getRGB(m.a_ArrayI, 0, m.a_Image.getWidth(), 0, 0, m.a_Image.getWidth(), m.a_Image.getHeight());
                  var10 = 0;

                  for (int var47 = 0; var47 < m.a_Image.getHeight(); var47++) {
                     for (int var51 = 0; var51 < m.a_Image.getWidth(); var51++) {
                        if (m.a_ArrayI[var10] == -16776961) {
                           m.a_ArrayI[var10] = 0;
                        } else {
                           m.a_ArrayI[var10] = m.a_ArrayI[var10] - this.a_I;
                        }

                        var10++;
                     }
                  }

                  int var48 = var6 - (m.a_Image.getWidth() >> 1);
                  int var52 = var7 - (m.a_Image.getHeight() >> 1);
                  o.method_a_Graphics().drawRGB(m.a_ArrayI, 0, m.a_Image.getWidth(), var48, var52, m.a_Image.getWidth(), m.a_Image.getHeight(), true);
               }

               if (m.d_Z && !m.b_Z) {
                  var10 = o.a_I * o.method_a_I();
                  this.r_I += var10;
                  if (this.r_I > 150) {
                     int var49 = g.a_ArrayI[4] / 120;
                     m.d_n.method_b_I_I_I_I_I_I_I_I_I_I_V(var49, m.a_c.c_d.c_I, m.a_c.c_d.f_I, a_ArrayI[0] << 15, 0, 0, 0, 0, 1000, 166);
                     this.r_I = 0;
                  }
               }
            } else if (this.d_I == 1) {
               float var29 = 11.25F;
               var7 = (int)Math.toDegrees(this.n_F);

               while (var7 < 0) {
                  var7 += 360;
               }

               while (var7 > 359) {
                  var7 -= 360;
               }

               var4 = 31 - (int)(var7 / var29);
               o.method_a_I_I_I_V(var19, var20, a_ArrayS[var4]);
            } else if (this.d_I == 2) {
               var6 = b_ArrayI[this.d_I] << 1;
               var1.setColor(0);
               var1.fillArc(var4 - 2, var5 - 2, var6 + 4, var6 + 4, 0, 360);

               for (int var34 = 0; var34 < 6; var34++) {
                  var1.setColor(p_ArrayI[var34]);
                  var1.fillArc(var4, var5, var6, var6, var34 * 60 - (int)Math.toDegrees(this.n_F), 60);
               }

               var1.setColor(p_ArrayI[0]);
               var1.fillArc(var9, var10, var8 << 1, var8 << 1, 0, 360);
               o.method_a_I_I_I_V(var19, var20, 5);
            }

            if (c_I == 1 || g.a_ArrayI[0] == 3) {
               o.method_a_I_I_I_V(var19, var20, 20);
               return;
            }

            if (c_I == 2 || c_I == 3) {
               short var31 = 462;
               byte var35 = 2;
               if (c_I == 3) {
                  var31 = 447;
                  var35 = 4;
               }

               byte var27 = var35;
               if ((var8 = s_I * var27 / 600) > var27 - 1) {
                  var8 = var27 - 1;
               }

               var8 = var27 - 1 - var8;
               o.method_b_I_I_I_I_V(var19, var20, var31, var8);
               return;
            }

            if (c_I >= 4 && c_I <= 8) {
               o.method_b_I_I_I_I_V(var19, var20, c_ArrayI[c_I - 4], 0);
               return;
            }

            if (g.a_ArrayI[0] == 4) {
               o.method_b_I_I_I_I_V(var19, var20, 465, 0);
               return;
            }
         }
      }
   }

   public final void method_f_V() {
      this.d_I++;
      if (this.d_I > 2) {
         this.d_I = 0;
      }

      int var1 = m.method_a_I();
      if (this.d_I > var1) {
         this.d_I = 0;
      }

      this.method_a_V();
   }

   public final void method_g_V() {
      this.a_F = 0.0F;
      this.b_F = 0.0F;
      this.f_F = 0.0F;
      this.g_F = 0.0F;
      this.d_F = 0.0F;
      this.e_F = 0.0F;
      this.j_F = 0.0F;
      this.k_F = 0.0F;
   }

   private void method_a_I_I_I_I_I_Graphics_Z_Z_V(int var1, int var2, int var3, int var4, int var5, Graphics var6, boolean var7, boolean var8) {
      var6.setColor(var5);
      var5 = 2;

      for (int var9 = 0; var9 < 4; var9++) {
         int var10 = var3 - var3 * (this.f_ArrayI[var5] + this.h_ArrayI[var5] >> 10) / var4;
         int var11 = var3 - var3 * (this.f_ArrayI[var9 >> 1] + this.h_ArrayI[var9 >> 1] >> 10) / var4;
         if (var8) {
            var10++;
         }

         if (var7) {
            this.i_ArrayI[var9] = var10;
            if (var11 < var10) {
               this.i_ArrayI[var9] = var11;
            }
         }

         int var12 = var1 - var10;
         int var13 = var2 - var11;
         var6.fillArc(var12, var13 + (this.f_ArrayI[1] + this.h_ArrayI[1] >> 10), var10 << 1, var11 << 1, var9 * 90, 90);
         if (var9 == 0) {
            var5++;
         }

         if (var9 == 2) {
            var5--;
         }
      }
   }

   static {
      b_ArrayI[0] = a_ArrayI[0] * j.g_d.a_I / 65536 + 1;
      b_ArrayI[1] = a_ArrayI[1] * j.g_d.a_I / 65536 + 1;
      b_ArrayI[2] = a_ArrayI[2] * j.g_d.a_I / 65536 + 1;
   }
}
