import com.nokia.mid.ui.DirectGraphics;
import javax.microedition.lcdui.Graphics;

public final class g extends j {
   public static int[] a_ArrayI;
   private byte[][] a_ArrayArrayB;
   private byte a_B = 0;
   private byte d_B;
   private byte e_B;
   private short a_S;
   private byte f_B = 0;
   private byte g_B = -1;
   private int b_I;
   private int c_I;
   private j[] a_Arrayj = new j[2];
   private j[] b_Arrayj = new j[2];
   private static j[] c_Arrayj = new j[2];
   private static g[] a_Arrayg;
   private static int d_I = 0;
   public static int a_I = 0;

   public g() {
      this.c_B = 3;
   }

   public final int method_a_ArrayB_I_I(byte[] var1, int var2) {
      var2 = super.method_a_ArrayB_I_I(var1, var2);
      this.e_I = (var1[var2++] << 8 | var1[var2++] & 255) << 16;
      this.h_I = (var1[var2++] << 8 | var1[var2++] & 255) << 16;
      this.g_I = (var1[var2++] << 8 | var1[var2++] & 255) << 16;
      this.f_I = (var1[var2++] << 8 | var1[var2++] & 255) << 16;
      this.a_B = var1[var2++];
      if (this.a_B == 2) {
         this.g_B = 0;
      }

      this.d_B = var1[var2++];
      this.e_B = var1[var2++];
      this.a_S = method_a_ArrayB_I_S(var1, var2);
      var2 += 2;
      this.f_B = var1[var2++];
      this.a_ArrayArrayB = new byte[this.f_B][];

      for (int var3 = 0; var3 < this.f_B; var3++) {
         byte var4 = var1[var2++];
         this.a_ArrayArrayB[var3] = new byte[var4];

         for (int var5 = 0; var5 < var4; var5++) {
            this.a_ArrayArrayB[var3][var5] = var1[var2++];
         }
      }

      this.m_I |= 128;
      return var2;
   }

   protected final void method_a_I_V(int var1) {
      switch (this.a_B) {
         case 0:
            if (var1 == 2) {
               this.a_B = 2;
               this.g_B = 0;
            }

            if (var1 == 1) {
               this.a_B = 1;
               return;
            }
            break;
         case 1:
            if (var1 == 0) {
               this.a_B = 0;
               this.method_b_V();
               return;
            }
            break;
         case 2:
            if (var1 == 1) {
               this.a_B = 1;
            }

            if (var1 == 3) {
               this.a_B = 3;
            }
            break;
         case 3:
            if (var1 == 2) {
               this.a_B = 2;
               return;
            }
      }
   }

   private final void method_b_V() {
      this.g_B = -1;

      for (int var1 = 0; var1 < this.a_ArrayArrayB.length; var1++) {
         byte[] var2;
         switch ((var2 = this.a_ArrayArrayB[var1])[0]) {
            case 6:
               var2[3] = var2[1];
               var2[4] = var2[2];
               break;
            case 16:
               var2[15] = var2[11];
               var2[16] = var2[12];
               var2[17] = var2[13];
               var2[18] = var2[14];
               break;
            case 17:
               var2[11] = var2[7];
               var2[12] = var2[8];
               var2[13] = var2[9];
               var2[14] = var2[10];
         }

         boolean var10000 = true;
      }
   }

   public final void method_a_Graphics_DirectGraphics_d_V(Graphics var1, DirectGraphics var2, d var3) {
   }

   public static void method_a_Arrayg_c_V(g[] var0, c var1) {
      int var2 = var1.g_I - var1.e_I;
      int var3 = var1.h_I - var1.f_I;
      var2 = var2 < var3 ? var3 >> 1 : var2 >> 1;

      for (int var14 = 0; var14 < var0.length; var14++) {
         g var4;
         if ((var4 = var0[var14]).a_B != 1) {
            var4.method_a_d_V(j.a_d);
            j.a_d.method_c_d_V(d.a_d);
            d.a_d.method_a_I_I_V(var1.b_d.c_I, var1.b_d.f_I);
            int var5 = d.g_I;
            int var6 = d.h_I;
            d.a_d.method_a_I_I_V(var1.c_d.c_I, var1.c_d.f_I);
            int var7 = d.g_I;
            int var8 = d.h_I;
            int var9 = var4.e_I - var2;
            int var10 = var4.f_I - var2;
            int var11 = var4.g_I + var2;
            int var12 = var4.h_I + var2;
            if (j.method_a_I_I_I_I_I_I_I_I_Z(var5, var6, var7, var8, var9, var10, var11, var12)
               | j.method_a_I_I_I_I_I_I_Z(var7, var8, var9, var10, var11, var12)) {
               c var16 = var1;
               var4 = var4;
               if (var4.b_I < 2) {
                  var4.a_Arrayj[var4.b_I] = var16;
                  var4.b_I++;
               }
            }
         }
      }
   }

   private static final boolean method_a_ArrayObject_I_Object_Z(Object[] var0, int var1, Object var2) {
      for (int var3 = 0; var3 < var1; var3++) {
         if (var0[var3] == var2) {
            return true;
         }
      }

      return false;
   }

   public static void method_a_Arrayg_V(g[] var0) {
      a_Arrayg = var0;

      for (int var1 = 0; var1 < var0.length; var1++) {
         g var2;
         if ((var2 = var0[var1]).d_B == 0) {
            for (int var12 = 0; var12 < var2.b_I; var12++) {
               j var27 = var2.a_Arrayj[var12];
               if (!method_a_ArrayObject_I_Object_Z(var2.b_Arrayj, var2.c_I, var27)) {
                  c_Arrayj[var12] = var27;
               }
            }
         } else {
            for (int var3 = 0; var3 < var2.c_I; var3++) {
               j var4 = var2.b_Arrayj[var3];
               if (!method_a_ArrayObject_I_Object_Z(var2.a_Arrayj, var2.b_I, var4)) {
                  c_Arrayj[var3] = var4;
               }
            }
         }

         for (int var13 = 0; var13 < c_Arrayj.length; var13++) {
            if (c_Arrayj[var13] != null && (var2.a_S <= -1 || c_Arrayj[var13].method_a_S() == var2.a_S)) {
               var2.method_a_I_V(2);
            }
         }

         for (int var14 = 0; var14 < var2.a_Arrayj.length; var14++) {
            var2.b_Arrayj[var14] = var2.a_Arrayj[var14];
            var2.a_Arrayj[var14] = null;
            c_Arrayj[var14] = null;
         }

         var2.c_I = var2.b_I;
         var2.b_I = 0;
      }

      boolean var79;
      for (int var10 = 0; var10 < var0.length; var10++) {
         do {
            g var11;
            label316:
            if ((var11 = var0[var10]).method_a_j_Z(m.a_j) && var11.a_B == 2) {
               if (m.e_I == 13) {
                  a_I = a_I + o.a_I;
                  if (var11.d_S == 15 && a_I <= 20000) {
                     var11.a_B = 0;
                     break label316;
                  }
               }

               label308: {
                  byte[] var28 = var11.a_ArrayArrayB[var11.g_B];
                  g var15 = var11;
                  int var5;
                  switch (var5 = var28[0]) {
                     case 0:
                        short var25 = j.method_a_ArrayB_I_S(var28, 1);
                        short var26 = m.a_ArrayS[var25];
                        if (!m.method_a_I_Z(13)) {
                           m.method_a_I_V(var26);
                        }

                        var79 = true;
                        break label308;
                     case 1:
                        short var31 = j.method_a_ArrayB_I_S(var28, 1);
                        j var22;
                        if ((var22 = var15.method_a_j().method_a_S_j(var31)) != null) {
                           r var23 = (r)var22;

                           for (int var32 = 0; var32 < var23.a_ArrayS.length; var32++) {
                              short var52 = var23.a_ArrayS[var32];
                              short var61 = -1;
                              short var72 = 0;
                              switch (var52) {
                                 case 118:
                                    var61 = 485;
                                    var72 = 9999;
                                    break;
                                 case 334:
                                    var61 = 474;
                                    var72 = 750;
                                    break;
                                 case 342:
                                    var61 = 480;
                                    var72 = 9999;
                              }

                              if (var61 > -1) {
                                 var23.b_ArrayS[var32] = var61;
                                 var23.a_ArrayS[var32] = var72;
                              }
                           }
                        }

                        var79 = true;
                        break label308;
                     case 2:
                        a_Arrayg[var28[1]].method_a_I_V(1);
                        var79 = true;
                        break label308;
                     case 3:
                        a_Arrayg[var28[1]].method_a_I_V(0);
                        var79 = true;
                        break label308;
                     case 4:
                        a_Arrayg[var28[1]].method_a_I_V(2);
                        var79 = true;
                        break label308;
                     case 5:
                        a_Arrayg[var28[1]].method_a_I_V(3);
                        var79 = true;
                        break label308;
                     case 6:
                        short var49;
                        if ((var49 = j.method_a_ArrayB_I_S(var28, 3)) < 0) {
                           var28[3] = var28[1];
                           var28[4] = var28[2];
                           var79 = true;
                           break label308;
                        }

                        var49 = (short)(var49 - o.a_I);
                        var49 = var49;
                        byte var30 = 3;
                        byte[] var21 = var28;
                        var28[3] = (byte)(var49 >> 8);
                        var21[4] = (byte)var49;
                        break;
                     case 7:
                        if (var28[1] == 1) {
                           method_a_B_F_V(var28[2], method_a_ArrayB_I_F(var28, 3));
                        }

                        if (var28[1] == 2) {
                           a_ArrayI[var28[2]] = method_c_ArrayB_I_I(var28, 3);
                        }

                        var79 = true;
                        break label308;
                     case 8:
                        if (var28[1] == 1) {
                           method_a_B_F_V(var28[2], method_a_B_F(var28[2]) + method_a_ArrayB_I_F(var28, 3));
                        }

                        if (var28[1] == 2) {
                           a_ArrayI[var28[2]] = a_ArrayI[var28[2]] + method_c_ArrayB_I_I(var28, 3);
                        }

                        var79 = true;
                        break label308;
                     case 9:
                        if (var28[1] == 1) {
                           method_a_B_F_V(var28[2], method_a_B_F(var28[2]) - method_a_ArrayB_I_F(var28, 3));
                        }

                        if (var28[1] == 2) {
                           a_ArrayI[var28[2]] = a_ArrayI[var28[2]] - method_c_ArrayB_I_I(var28, 3);
                        }

                        var79 = true;
                        break label308;
                     case 10:
                        if (var28[1] == 1) {
                           method_a_B_F_V(var28[2], method_a_B_F(var28[2]) * method_a_ArrayB_I_F(var28, 3));
                        }

                        if (var28[1] == 2) {
                           a_ArrayI[var28[2]] = a_ArrayI[var28[2]] * method_c_ArrayB_I_I(var28, 3);
                        }

                        var79 = true;
                        break label308;
                     case 11:
                        if (var28[1] == 1) {
                           method_a_B_F_V(var28[2], method_a_B_F(var28[2]) / method_a_ArrayB_I_F(var28, 3));
                        }

                        if (var28[1] == 2) {
                           a_ArrayI[var28[2]] = a_ArrayI[var28[2]] / method_c_ArrayB_I_I(var28, 3);
                        }

                        var79 = true;
                        break label308;
                     case 12:
                        if (var28[1] == 2) {
                           if (a_ArrayI[var28[2]] == method_c_ArrayB_I_I(var28, 3)) {
                              var79 = true;
                              break label308;
                           }
                        } else if (var28[1] == 1 && method_a_B_F(var28[2]) == method_a_ArrayB_I_F(var28, 3)) {
                           var79 = true;
                           break label308;
                        }

                        var15.g_B = (byte)(var28[d_I] - 2);
                        var79 = true;
                        break label308;
                     case 13:
                        if (var28[1] == 2) {
                           if (a_ArrayI[var28[2]] != method_c_ArrayB_I_I(var28, 3)) {
                              var79 = true;
                              break label308;
                           }
                        } else if (var28[1] == 1 && method_a_B_F(var28[2]) != method_a_ArrayB_I_F(var28, 3)) {
                           var79 = true;
                           break label308;
                        }

                        var15.g_B = (byte)(var28[d_I] - 2);
                        var79 = true;
                        break label308;
                     case 14:
                        if (var28[1] == 2) {
                           if (a_ArrayI[var28[2]] < method_c_ArrayB_I_I(var28, 3)) {
                              var79 = true;
                              break label308;
                           }
                        } else if (var28[1] == 1 && method_a_B_F(var28[2]) < method_a_ArrayB_I_F(var28, 3)) {
                           var79 = true;
                           break label308;
                        }

                        var15.g_B = (byte)(var28[d_I] - 2);
                        var79 = true;
                        break label308;
                     case 15:
                        if (var28[1] == 2) {
                           if (a_ArrayI[var28[2]] > method_c_ArrayB_I_I(var28, 3)) {
                              var79 = true;
                              break label308;
                           }
                        } else if (var28[1] == 1 && method_a_B_F(var28[2]) > method_a_ArrayB_I_F(var28, 3)) {
                           var79 = true;
                           break label308;
                        }

                        var15.g_B = (byte)(var28[d_I] - 2);
                        var79 = true;
                        break label308;
                     case 16:
                        short var48 = j.method_a_ArrayB_I_S(var28, 1);
                        j var60;
                        if ((var60 = var15.method_a_j().method_a_S_j(var48)) == null) {
                           var79 = true;
                           break label308;
                        }

                        int var70 = j.method_b_ArrayB_I_I(var28, 15);
                        int var20 = o.a_I;
                        if (var70 - var20 <= 0) {
                           var28[15] = var28[11];
                           var28[16] = var28[12];
                           var28[17] = var28[13];
                           var28[18] = var28[14];
                           var20 = var70;
                        }

                        var60.c_d.c_I = var60.c_d.c_I + j.method_b_ArrayB_I_I(var28, 3) * var20;
                        var60.c_d.f_I = var60.c_d.f_I + j.method_b_ArrayB_I_I(var28, 7) * var20;
                        var60.method_h_V();
                        var60.method_i_V();
                        if ((var70 = var70 - var20) <= 0) {
                           var79 = true;
                           break label308;
                        }

                        method_a_ArrayB_I_I_V(var28, 15, var70);
                        break;
                     case 17:
                        int var46 = j.method_a_ArrayB_I_S(var28, 1);
                        j var59;
                        if ((var59 = var15.method_a_j().method_a_S_j((short)var46)) == null) {
                           var79 = true;
                           break label308;
                        }

                        int var68 = j.method_b_ArrayB_I_I(var28, 11);
                        int var19 = j.method_b_ArrayB_I_I(var28, 7);
                        var46 = o.a_I;
                        if (var68 == var19) {
                           method_a_ArrayB_I_I_V(var28, 15, var59.c_d.a_I);
                           method_a_ArrayB_I_I_V(var28, 19, var59.c_d.b_I);
                           method_a_ArrayB_I_I_V(var28, 23, var59.c_d.d_I);
                           method_a_ArrayB_I_I_V(var28, 27, var59.c_d.e_I);
                        }

                        if (var68 - var46 <= 0) {
                           var28[11] = var28[7];
                           var28[12] = var28[8];
                           var28[13] = var28[9];
                           var28[14] = var28[10];
                           var68 = 0;
                        }

                        float var74 = (float)((long)j.method_b_ArrayB_I_I(var28, 3) * (var19 - var68) / var19) / 65536.0F;
                        d.a_d.method_a_F_V(var74);
                        d.a_d.c_I = 0;
                        d.a_d.f_I = 0;
                        var59.c_d.a_I = j.method_b_ArrayB_I_I(var28, 15);
                        var59.c_d.b_I = j.method_b_ArrayB_I_I(var28, 19);
                        var59.c_d.d_I = j.method_b_ArrayB_I_I(var28, 23);
                        var59.c_d.e_I = j.method_b_ArrayB_I_I(var28, 27);
                        var59.c_d.method_b_d_V(d.a_d);
                        var59.method_h_V();
                        var59.method_i_V();
                        if ((var68 = var68 - var46) <= 0) {
                           var79 = true;
                           break label308;
                        }

                        method_a_ArrayB_I_I_V(var28, 11, var68);
                        break;
                     case 18:
                        int var44 = j.method_a_ArrayB_I_S(var28, 1);
                        j var58;
                        if ((var58 = var15.method_a_j().method_a_S_j((short)var44)) == null) {
                           var79 = true;
                        } else {
                           short var67;
                           if ((var67 = j.method_a_ArrayB_I_S(var28, 3)) < 0) {
                              var58.c_d.c_I = j.method_b_ArrayB_I_I(var28, 5);
                              var58.c_d.f_I = j.method_b_ArrayB_I_I(var28, 9);
                           } else {
                              j var18;
                              if ((var18 = var15.method_a_j().method_a_S_j(var67)) != null) {
                                 var18.method_a_d_V(j.a_d);
                                 var44 = j.a_d.c_I;
                                 int var73 = j.a_d.f_I;
                                 var58.c_d.c_I = 0;
                                 var58.c_d.f_I = 0;
                                 var58.f_Z = true;
                                 var58.method_a_d_V(j.a_d);
                                 j.a_d.method_c_d_V(d.a_d);
                                 d.a_d.method_a_I_I_V(var44, var73);
                                 var58.c_d.c_I = d.g_I;
                                 var58.c_d.f_I = d.h_I;
                              }
                           }

                           var58.method_h_V();
                           var58.method_i_V();
                           var58.method_a_d_V(var58.b_d);
                           var79 = true;
                        }
                        break label308;
                     case 19:
                        short var42 = j.method_a_ArrayB_I_S(var28, 1);
                        short var57 = j.method_a_ArrayB_I_S(var28, 3);
                        j var66 = var15.method_a_j();
                        j var17;
                        if ((var17 = j.b_j.method_a_S_j(var42)) == null) {
                           var79 = true;
                        } else {
                           j var43;
                           if ((var43 = var66.method_a_S_j(var57)) == null) {
                              var79 = true;
                           } else {
                              var17.method_b_j_V(var43);
                              var17.method_i_V();
                              var79 = true;
                           }
                        }
                        break label308;
                     case 20:
                        short var41 = j.method_a_ArrayB_I_S(var28, 1);
                        j var65;
                        if ((var65 = var15.method_a_j().method_a_S_j(var41)) == null) {
                           var79 = true;
                        } else {
                           var65.method_i_V();
                           var65.method_b_j_V(j.b_j);
                           var79 = true;
                        }
                        break label308;
                     case 21:
                        var15.g_B = (byte)(var28[1] - 2);
                        var79 = true;
                        break label308;
                     case 22:
                        var79 = true;
                        break label308;
                     case 23:
                        if (var15.e_B == 1) {
                           var15.a_B = 0;
                        } else {
                           var15.a_B = 1;
                        }
                        break;
                     case 24:
                        short var40 = j.method_a_ArrayB_I_S(var28, 1);
                        j var56 = var15.method_a_j().method_a_S_j(var40);
                        if (!method_a_ArrayObject_I_Object_Z(var15.b_Arrayj, var15.c_I, var56)) {
                           var79 = true;
                           break label308;
                        }
                        break;
                     case 25:
                        m.g_I = var15.b_d.c_I;
                        m.h_I = var15.b_d.f_I;
                        var79 = true;
                        break label308;
                     case 26:
                        short var39 = j.method_a_ArrayB_I_S(var28, 1);
                        j var55;
                        if ((var55 = var15.method_a_j().method_a_S_j(var39)).c_B == 4) {
                           c var64;
                           c var77 = var64 = (c)var55;
                           var77.f_F = var77.f_F + j.method_a_ArrayB_I_S(var28, 3);
                           var64.g_F = var64.g_F + j.method_a_ArrayB_I_S(var28, 5);
                        }

                        var79 = true;
                        break label308;
                     case 27:
                        short var38 = j.method_a_ArrayB_I_S(var28, 1);
                        j var54;
                        if ((var54 = var15.method_a_j().method_a_S_j(var38)).c_B == 4) {
                           c var63;
                           c var76 = var63 = (c)var54;
                           var76.d_F = var76.d_F + j.method_a_ArrayB_I_S(var28, 3);
                           var63.e_F = var63.e_F + j.method_a_ArrayB_I_S(var28, 5);
                        }

                        var79 = true;
                        break label308;
                     case 28:
                        short var37 = j.method_a_ArrayB_I_S(var28, 1);
                        j var53;
                        if ((var53 = var15.method_a_j().method_a_S_j(var37)).c_B == 4) {
                           c var62;
                           c var75 = var62 = (c)var53;
                           var75.a_F = var75.a_F + j.method_a_ArrayB_I_S(var28, 3);
                           var62.b_F = var62.b_F + j.method_a_ArrayB_I_S(var28, 5);
                        }

                        var79 = true;
                        break label308;
                     case 29:
                        var5 = j.method_a_ArrayB_I_S(var28, 1);
                        j var6;
                        if ((var6 = var15.method_a_j().method_a_S_j((short)var5)) == null) {
                           var79 = true;
                        } else {
                           int var7 = j.method_b_ArrayB_I_I(var28, 3);
                           int var16 = j.method_b_ArrayB_I_I(var28, 7);
                           if ((var7 & 1) > 0) {
                              var6.m_I &= -32;
                              var6.m_I |= var16 & 31;
                              var6.b_B = (byte)((var6.m_I & 31) - 16);
                           }

                           if ((var7 & 32) > 0) {
                              var6.m_I &= -33;
                              var6.m_I |= var16 & 32;
                           }

                           if ((var7 & 128) > 0) {
                              var6.m_I &= -129;
                              var6.m_I |= var16 & 128;
                              r var35;
                              if (var6.method_a_B() == 5 && (var35 = (r)var6).a_ArrayS[0] == 358) {
                                 var35.method_a_d_V(j.a_d);
                                 int var8 = j.a_d.c_I + var35.e_I + 3932160;
                                 int var29 = j.a_d.f_I + var35.f_I + 3932160;
                                 int var9 = j.a_d.c_I + (var35.g_I - 3932160);
                                 var5 = j.a_d.f_I + (var35.h_I - 3932160);
                                 m.h_n.method_a_I_I_I_I_I_I_I_I_I_I_I_V(24, var8, var29, var9, var5, 840, 0, 0, 360, 2040, 510);
                              }
                           }

                           if ((var7 & 256) > 0) {
                              var6.m_I &= -257;
                              var6.m_I |= var16 & 256;
                           }

                           var79 = true;
                        }
                        break label308;
                     case 30:
                        var5 = j.method_a_ArrayB_I_S(var28, 1);
                        j.a_j = var15.method_a_j().method_a_S_j((short)var5);
                        var79 = true;
                        break label308;
                     case 31:
                        m.c_Z = var28[1] == 1;
                        j.p_I = j.method_a_ArrayB_I_S(var28, 2);
                        j.q_I = j.method_a_ArrayB_I_S(var28, 4);
                        var79 = true;
                        break label308;
                     case 32:
                        m.c_Z = false;
                        j.p_I = 90;
                        j.q_I = 140;
                        var79 = true;
                        break label308;
                     default:
                        var79 = true;
                        break label308;
                  }

                  var79 = false;
               }

               if (var79) {
                  if (var11.g_B < -1) {
                     var11.g_B = -1;
                  }

                  var11.g_B++;
                  if (var11.g_B >= var11.f_B) {
                     if (var11.e_B == 1) {
                        var11.a_B = 0;
                        var11.method_b_V();
                     } else {
                        var11.a_B = 1;
                     }

                     var79 = false;
                  } else {
                     var79 = true;
                  }
                  continue;
               }
            }

            var79 = false;
         } while (var79);
      }
   }

   private static final int method_c_ArrayB_I_I(byte[] var0, int var1) {
      byte var4 = var0[3];
      int var2 = 0;
      d_I = 4;
      switch (var4) {
         case 2:
            d_I++;
            byte var3 = var0[4];
            var2 = a_ArrayI[var3];
            break;
         case 32:
            d_I += 4;
            var2 = j.method_b_ArrayB_I_I(var0, 4);
      }

      return var2;
   }

   private static float method_a_B_F(byte var0) {
      return Float.intBitsToFloat(a_ArrayI[var0]);
   }

   private static final void method_a_B_F_V(byte var0, float var1) {
      a_ArrayI[var0] = Float.floatToIntBits(var1);
   }

   private static final float method_a_ArrayB_I_F(byte[] var0, int var1) {
      byte var10 = var0[3];
      float var2 = 0.0F;
      d_I = 4;
      switch (var10) {
         case 1:
            d_I++;
            var2 = method_a_B_F(var0[4]);
            break;
         case 2:
            d_I++;
            byte var9 = var0[4];
            var2 = a_ArrayI[var9];
            break;
         case 16:
            d_I += 4;
            var10 = 4;
            var0 = var0;
            long var6 = 0L;
            var2 = Float.intBitsToFloat(
               (int)((((var6 = 0L | var0[var10]) << 8 | var0[var10 + 1] & 0xFF) << 8 | var0[var10 + 2] & 0xFF) << 8 | var0[var10 + 3] & 0xFF)
            );
            break;
         case 32:
            d_I += 4;
            var2 = j.method_b_ArrayB_I_I(var0, 4);
      }

      return var2;
   }

   private static void method_a_ArrayB_I_I_V(byte[] var0, int var1, int var2) {
      var0[var1] = (byte)(var2 >>> 24);
      var0[var1 + 1] = (byte)(var2 >> 16);
      var0[var1 + 2] = (byte)(var2 >> 8);
      var0[var1 + 3] = (byte)var2;
   }
}
