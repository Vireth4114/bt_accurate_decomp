import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class h {
   private Vector a_Vector = new Vector();
   private int b_I = -1;
   private int c_I = 0;
   public int a_I = 0;
   public int[] a_ArrayI = null;
   public int[] b_ArrayI = null;
   private b a_b = null;
   private int d_I = -1;
   private int e_I = 0;
   private int f_I = 0;
   private int g_I = 1;
   private int[] c_ArrayI = new int[3];
   private String[] a_ArrayString = new String[3];
   private int[] d_ArrayI = new int[3];
   private static final int[] e_ArrayI = new int[4];
   private static final int[] f_ArrayI = new int[]{3, 12, 48, 64, 128, 256, 1536, 2048, 4096};
   private static int[] g_ArrayI = new int[]{-1, 7304, -1, -1, 1, 1, 1, 1, 16777215, 0, 0, 6710886, 0, 0, 6710886, 11171584};
   private static final int[] h_ArrayI = new int[]{3, 12, 16, 32, 64, 128};
   private static int[] i_ArrayI = new int[]{-1, 8, 2, 2, 2, 0, 0, -1, -1, -1, 20, 12, 12, 2, 6, 1, 4456448, 6170113, 68, 10526880, 0, 10027008, 0};

   public final void method_a_f_V(f var1) {
      int var2 = this.a_Vector.size();
      var1 = var1;
      h var3 = this;
      this.a_Vector.insertElementAt(var1, var2);
      var1.a_h = var3;
      if (var3.b_I == -1 && var3.method_a_I_Z(var2)) {
         var3.method_a_I_V(var2);
      }
   }

   public final void method_a_V() {
      this.a_Vector.removeAllElements();
      this.c_I = 0;
      this.b_I = -1;
   }

   private boolean method_a_I_Z(int var1) {
      f var2 = (f)this.a_Vector.elementAt(var1);
      int var3;
      return (var3 = this.method_a_I_I(var1)) >= this.c_I && var3 + var2.method_b_I() <= this.c_I + this.method_e_I();
   }

   public final int method_a_I() {
      return this.b_I;
   }

   public final void method_a_I_V(int var1) {
      if (var1 >= this.a_Vector.size()) {
         var1 = this.a_Vector.size() - 1;
      }

      if (var1 != this.b_I) {
         if (var1 == -1 || ((f)this.a_Vector.elementAt(var1)).method_a_Z()) {
            int var2 = this.b_I;
            this.b_I = var1;
            if (var2 != -1) {
               this.a_Vector.elementAt(var2);
            }

            if (var1 != -1) {
               this.a_Vector.elementAt(var1);
            }

            if ((this = this).b_I != -1) {
               var2 = (var1 = this.method_a_I_I(this.b_I)) + ((f)this.a_Vector.elementAt(this.b_I)).method_b_I();
               int var3 = this.method_e_I();
               if (var1 < this.c_I) {
                  this.c_I = var1;
                  return;
               }

               if (var2 > this.c_I + var3) {
                  this.c_I = var2 - var3;
               }
            }
         }
      }
   }

   private f method_a_f() {
      f var1;
      return (var1 = this.b_I != -1 ? (f)this.a_Vector.elementAt(this.b_I) : null) != null && var1.a_Z ? var1 : null;
   }

   public final void method_a_String_I_I_V(String var1, int var2, int var3) {
      var2 = this.method_c_I_I(0) | 256;
      this.a_b = var1 != null && var1.length() > 0 ? new b(var1, Integer.MAX_VALUE, this.method_c_I_I(13), var2, -1) : null;
      this.d_I = -1;
      this.f_I = 0;
   }

   public final void method_a_I_String_I_I_Z_V(int var1, String var2, int var3, int var4, boolean var5) {
      this.c_ArrayI[var1] = 1114112 | (short)var4 & '\uffff';
      this.a_ArrayString[var1] = var2;
      this.d_ArrayI[var1] = 0;
   }

   public final void method_a_I_String_I_V(int var1, String var2, int var3) {
      if ((this.c_ArrayI[0] & 65536) == 65536) {
         this.a_ArrayString[0] = var2;
         this.d_ArrayI[0] = 0;
      }
   }

   public final void method_b_I_V(int var1) {
      this.c_ArrayI[var1] = 0;
      this.a_ArrayString[var1] = null;
      this.d_ArrayI[var1] = 0;
   }

   public final void method_b_V() {
      for (int var1 = 0; var1 < 3; var1++) {
         boolean var2 = (short)this.c_ArrayI[var1] == -2;
         f var3 = this.method_a_f();
         if ((this.c_ArrayI[var1] & 65536) != 0 && (this.c_ArrayI[var1] & 1048576) != 0 && (!var2 || var3 != null)) {
            o.method_a_I_String_I_V(var1 + 0, this.a_ArrayString[var1], this.d_ArrayI[var1]);
         } else {
            o.method_a_I_String_I_V(var1 + 0, null, 0);
         }
      }
   }

   private int method_a_I_I(int var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         var2 += ((f)this.a_Vector.elementAt(var3)).method_b_I() + this.method_c_I_I(19);
      }

      return var2;
   }

   private static int method_a_f_I_I(f var0, int var1) {
      int var2;
      if ((var2 = var0.method_a_I_I(6)) == 512) {
         return var1 - var0.method_a_I();
      } else {
         return var2 == 1024 ? var1 - var0.method_a_I() >> 1 : 0;
      }
   }

   private int method_c_I() {
      int var1;
      return (var1 = this.method_c_I_I(11)) > 0 ? var1 : o.method_e_I() - (o.method_a_Z() ? o.method_d_I() : 0);
   }

   public final int method_b_I() {
      return this.method_c_I() - this.method_c_I_I(15) - this.method_c_I_I(16);
   }

   private int method_d_I() {
      return this.a_Vector.size() > 0 ? this.method_a_I_I(this.a_Vector.size() - 1) + ((f)this.a_Vector.lastElement()).method_b_I() : 0;
   }

   private int method_e_I() {
      int var1 = this.method_b_I_I(5);
      return this.method_d_I() > var1 ? var1 - this.method_b_I_I(6) - this.method_b_I_I(7) : var1;
   }

   private int method_b_I_I(int var1) {
      switch (var1) {
         case 1:
            int var2 = o.c_I - (o.method_b_Z() ? o.method_c_I() : 0);
            if (this.method_c_I_I(3) == 32) {
               return Math.min(this.method_b_I_I(2) + this.method_d_I() + this.method_c_I_I(17) + this.method_c_I_I(18), var2);
            } else {
               if ((var1 = this.method_c_I_I(12)) > 0) {
                  return var1;
               }

               return var2;
            }
         case 2:
            return Math.max(this.a_b != null ? this.a_b.c_I : 0, this.d_I != -1 ? o.method_a_I_I_I(this.d_I, 1) : 0)
               + this.method_c_I_I(6)
               + this.method_c_I_I(7);
         case 3:
         default:
            return 0;
         case 4:
            return this.method_b_I_I(1) - this.method_b_I_I(2);
         case 5:
            return this.method_b_I_I(4) - this.method_c_I_I(17) - this.method_c_I_I(18);
         case 6:
            return 1 + o.method_a_I_I_I(151, 1);
         case 7:
            return 1 + o.method_a_I_I_I(150, 1);
      }
   }

   public final void method_c_I_V(int var1) {
      f var2 = this.method_a_f();
      int var3 = 0;
      switch (var1) {
         case 1:
            if ((this = this).a_Vector.size() != 0) {
               if (this.b_I == -1) {
                  var1 = -1;

                  for (int var14 = 0; var14 < this.a_Vector.size(); var14++) {
                     f var20 = (f)this.a_Vector.elementAt(var14);
                     int var24;
                     int var28 = (var24 = this.method_a_I_I(var14)) + var20.method_b_I();
                     if (var24 >= this.c_I) {
                        break;
                     }

                     if (var20.method_a_Z() && var28 > this.c_I - this.method_c_I_I(14)) {
                        var1 = var14;
                     }
                  }
               } else {
                  int var30 = this.b_I;
                  h var6 = this;
                  var3 = var30 - 1;

                  int var32;
                  while (true) {
                     if (var3 < 0) {
                        var32 = -1;
                        break;
                     }

                     if (((f)var6.a_Vector.elementAt(var3)).method_a_Z()) {
                        var32 = var3;
                        break;
                     }

                     var3--;
                  }

                  var1 = var32;
                  if (var32 != -1 && this.method_a_I_I(var1) + ((f)this.a_Vector.elementAt(var1)).method_b_I() < this.c_I - this.method_c_I_I(14)) {
                     var1 = -1;
                  }
               }

               if (var1 == -1) {
                  if (this.method_c_I_I(5) == 128 && this.c_I <= 0) {
                     h var29 = this;
                     int var31 = this.method_d_I();
                     var3 = var29.method_e_I();
                     var29.c_I = var31 - var3;
                     if (var31 < var29.method_b_I_I(5)) {
                        var29.c_I = 0;
                     }

                     int var25 = var29.a_Vector.size() - 1;

                     while (true) {
                        if (var25 <= 0) {
                           return;
                        }

                        if (!var29.method_a_I_Z(var25)) {
                           var29.method_a_I_V(-1);
                           break;
                        }

                        if (((f)var29.a_Vector.elementAt(var25)).method_a_Z()) {
                           var29.method_a_I_V(var25);
                           break;
                        }

                        var25--;
                     }
                  } else {
                     this.c_I = this.c_I - this.method_c_I_I(14);
                     if (this.c_I < 0) {
                        this.c_I = 0;
                     }

                     if (this.b_I != -1 && !this.method_a_I_Z(this.b_I)) {
                        this.method_a_I_V(-1);
                        return;
                     }
                  }
               } else {
                  this.method_a_I_V(var1);
               }
            }

            return;
         case 2:
            if ((this = this).a_Vector.size() != 0) {
               var1 = this.method_d_I();
               int var13 = this.method_e_I();
               if (this.b_I == -1) {
                  var3 = -1;

                  for (int var22 = this.a_Vector.size() - 1; var22 >= 0; var22--) {
                     f var26 = (f)this.a_Vector.elementAt(var22);
                     int var7;
                     if ((var7 = this.method_a_I_I(var22) + var26.method_b_I()) < this.c_I + var13) {
                        break;
                     }

                     if (var26.method_a_Z() && var7 <= this.c_I + var13 + this.method_c_I_I(14)) {
                        var3 = var22;
                     }
                  }
               } else {
                  int var4 = this.b_I;
                  h var16 = this;
                  int var5 = var4 + 1;

                  int var10000;
                  while (true) {
                     if (var5 >= var16.a_Vector.size()) {
                        var10000 = -1;
                        break;
                     }

                     if (((f)var16.a_Vector.elementAt(var5)).method_a_Z()) {
                        var10000 = var5;
                        break;
                     }

                     var5++;
                  }

                  var3 = var10000;
                  if (var10000 != -1 && this.method_a_I_I(var3) > this.c_I + var13 + this.method_c_I_I(14)) {
                     var3 = -1;
                  }
               }

               if (var3 == -1) {
                  if (this.method_c_I_I(5) == 128 && this.c_I >= var1 - var13) {
                     h var18 = this;
                     this.c_I = 0;
                     int var23 = 0;

                     while (true) {
                        if (var23 >= var18.a_Vector.size() - 1) {
                           return;
                        }

                        f var27 = (f)var18.a_Vector.elementAt(var23);
                        if (!var18.method_a_I_Z(var23)) {
                           var18.method_a_I_V(-1);
                           break;
                        }

                        if (var27.method_a_Z()) {
                           var18.method_a_I_V(var23);
                           break;
                        }

                        var23++;
                     }
                  } else {
                     this.c_I = this.c_I + this.method_c_I_I(14);
                     if (var1 <= var13) {
                        this.c_I = 0;
                     } else if (this.c_I > var1 - var13) {
                        this.c_I = var1 - var13;
                     }

                     if (this.b_I != -1 && !this.method_a_I_Z(this.b_I)) {
                        this.method_a_I_V(-1);
                        return;
                     }
                  }
               } else {
                  this.method_a_I_V(var3);
               }
            }

            return;
         case 5:
            var3 = (byte)1;
            break;
         case 6:
         case 24:
            var3 = (byte)2;
            break;
         case 7:
            var3 = (byte)0;
            break;
         default:
            return;
      }

      if ((this.c_ArrayI[var3] & 65536) != 0) {
         short var8;
         if ((var8 = (short)this.c_ArrayI[var3]) == -2) {
            if (var2 != null) {
               o.a_m.method_d_I_V(var2.a_I);
               return;
            }
         } else {
            o.a_m.method_d_I_V(var8);
         }
      }
   }

   public final void method_c_V() {
      if (this.a_b != null) {
         int var1 = this.d_I != -1 ? o.method_a_I_I_I(this.d_I, 0) : 0;
         int var2 = this.method_c_I() - (this.method_c_I_I(8) << 1);
         if (this.method_c_I_I(1) != 8) {
            var1 = var2 - var1;
         } else {
            var1 = var2;
         }

         if (var1 < this.a_b.b_I) {
            if (this.e_I >= 3000) {
               if (this.g_I > 0) {
                  this.f_I = (this.e_I - 3000) * 20 / 1000;
                  if (this.f_I > this.a_b.b_I - var1) {
                     this.f_I = this.a_b.b_I - var1;
                     this.e_I = 0;
                     this.g_I = -1;
                  }
               } else {
                  this.f_I = this.a_b.b_I - var1 - (this.e_I - 3000) * 20 / 1000;
                  if (this.f_I <= 0) {
                     this.f_I = 0;
                     this.e_I = 0;
                     this.g_I = 1;
                  }
               }
            }

            this.e_I = this.e_I + o.a_I;
         }
      }
   }

   public final void method_d_V() {
      Graphics var1 = o.method_a_Graphics();
      int var2 = this.method_b_I_I(2);
      h var4 = this;
      int var3 = this.method_c_I_I(4) == 64
         ? (o.b_I - var4.method_c_I() >> 1) + (o.method_b_I() == 3 ? o.method_d_I() : 0)
         : var4.method_c_I_I(9) + (o.method_b_I() == 3 ? o.method_d_I() : 0);
      var4 = this;
      int var24 = this.method_c_I_I(4) == 64
         ? o.c_I - (o.method_b_Z() ? o.method_c_I() : 0) - var4.method_b_I_I(1) >> 1
         : var4.method_c_I_I(10) + (o.method_b_I() == 1 ? o.method_c_I() : 0);
      int var5 = this.method_c_I();
      int var6 = this.method_b_I_I(1);
      if (m.method_a_h_I_I_I_I_I_Z(this, 1, var3, var24, var5, var6)) {
         var1.setColor(this.method_c_I_I(22));
         var1.fillRect(var3, var24, var5, var6);
         var1.setColor(this.method_c_I_I(23));
         var1.drawRect(var3, var24, var5 - 1, var6 - 1);
      }

      if (var2 > 0) {
         var1.setClip(var3, var24, var5, var2);
         if (m.method_a_h_I_I_I_I_I_Z(this, 2, var3, var24, var5, var2)) {
            var1.setColor(this.method_c_I_I(20));
            var1.fillRect(var3, var24, var5, var2);
         }

         var1.setClip(var3, var24, var5, var2);
         if (m.method_a_h_I_I_I_I_I_Z(this, 3, var3, var24, var5, var2)) {
            var1.setClip(var3, var24, var5, var2);
            int var7 = this.method_c_I_I(8);
            int var8 = this.d_I != -1 ? o.method_a_I_I_I(this.d_I, 0) : 0;
            int var9 = this.a_b != null ? this.a_b.b_I : 0;
            int var10 = var5 - (var7 << 1);
            int var11;
            if (this.method_c_I_I(1) != 8) {
               var11 = var10 - var8;
            } else {
               var11 = var10;
            }

            if (this.d_I != -1) {
               int var12 = var7;
               switch (this.method_c_I_I(1)) {
                  case 4:
                     var12 += var10 - var8;
                     break;
                  case 8:
                     var12 += var10 - var8 >> 1;
               }

               o.method_a_I_I_I_I_V(var3 + var12, var24 + this.method_c_I_I(6), this.d_I, 20);
            }

            if (this.a_b != null) {
               int var42 = var7;
               switch (this.method_c_I_I(1)) {
                  case 0:
                     var42 += var8;
                     break;
                  case 4:
                     var42 += Math.max(var11 - var9, 0);
                     break;
                  case 8:
                     var42 += Math.max(var10 - var9, 0) >> 1;
               }

               int var13 = 0;
               if (var5 < o.b_I) {
                  var13 = o.b_I - var5 - (o.method_a_Z() ? o.method_d_I() : 0) >> 1;
               }

               var1.setClip(var42 - 1 + var13, var24 - 1, var11 + 2, var2 + 2);
               this.a_b.method_a_I_I_I_I_V(var3 + var42 - this.f_I, var24 + this.method_c_I_I(6), this.method_c_I_I(24), this.method_c_I_I(25));
            }
         }
      }

      if (this.method_c_I_I(2) == 16) {
         int var34 = o.method_c_I();
         int var36 = o.method_d_I();
         var1.setClip(0, 0, o.b_I, o.c_I);
         var1.setColor(this.method_c_I_I(21));
         switch (o.method_b_I()) {
            case 1:
               var1.fillRect(0, 0, o.b_I, var34);
               break;
            case 2:
               var1.fillRect(0, o.c_I - var34, o.b_I, var34);
               break;
            case 3:
               var1.fillRect(0, 0, var36, o.c_I);
               break;
            case 4:
               var1.fillRect(o.b_I - var36, 0, o.b_I, o.c_I);
         }
      }

      var1.setClip(var3, var24 + var2, var5, var6 - var2);
      m.method_a_h_I_I_I_I_I_Z(this, 4, var3, var24 + var2, var5, var6 - var2);
      int var35 = var3 + this.method_c_I_I(15);
      int var37 = var24 + var2 + this.method_c_I_I(17);
      int var38 = this.method_b_I();
      int var39 = this.method_e_I();
      int var40 = this.method_d_I();
      int var43 = this.method_b_I_I(5);
      var1.setClip(var35, var37, var38, var43);
      m.method_a_h_I_I_I_I_I_Z(this, 5, var35, var37, var38, var43);
      var1.setClip(var35, var37, var38, var43);
      if (this.c_I > 0) {
         var1.setClip(var35, var37, var38, this.method_b_I_I(6));
         if (m.method_a_h_I_I_I_I_I_Z(this, 6, var35, var37, var38, this.method_b_I_I(6))) {
            o.method_a_I_I_I_V(var35 + o.method_a_I_I_I(151, 2) + (var38 - o.method_a_I_I_I(151, 0) >> 1), var37 + o.method_a_I_I_I(151, 3), 151);
         }
      }

      if (var39 < var40) {
         var37 += this.method_b_I_I(6);
      }

      if (this.c_I < var40 - var39) {
         var1.setClip(var35, var37 + var39, var38, this.method_b_I_I(7));
         if (m.method_a_h_I_I_I_I_I_Z(this, 7, var35, var37 + var39, var38, this.method_b_I_I(7))) {
            o.method_a_I_I_I_V(var35 + o.method_a_I_I_I(150, 2) + (var38 - o.method_a_I_I_I(150, 0) >> 1), var37 + var39 + 1 + o.method_a_I_I_I(150, 3), 150);
         }
      }

      var6 = this.b_I;
      if (this.b_I != -1 && ((f)this.a_Vector.elementAt(var6)).method_a_I_I(7) == 2048) {
         f var29 = (f)this.a_Vector.elementAt(var6);
         int var45 = var35 + method_a_f_I_I(var29, var38);
         var2 = var37 + this.method_a_I_I(var6) - this.c_I;
         var3 = var29.method_a_I();
         int var25 = var29.method_b_I();
         var1.setClip(var45, var2, var3, var25);
         if (m.method_a_h_I_I_I_I_I_Z(this, 9, var45, var2, var3, var25)) {
            var1.setColor(var29.method_a_I_I(21));
            var1.fillRect(var45, var2, var3, var25);
            var1.setColor(var29.method_a_I_I(22));
            var1.drawRect(var45, var2, var3 - 1, var25 - 1);
         }
      }

      for (int var41 = 0; var41 < this.a_Vector.size(); var41++) {
         f var30 = (f)this.a_Vector.elementAt(var41);
         if ((var2 = this.method_a_I_I(var41)) > this.c_I + var39) {
            break;
         }

         int var26 = var30.method_b_I();
         if (var2 + var26 >= this.c_I) {
            int var46 = var35 + method_a_f_I_I(var30, var38);
            var2 = var37 + var2 - this.c_I;
            var3 = var30.method_a_I();
            var1.setClip(var35, var37, var38, var39);
            o.method_a_I_I_I_I_ArrayI_Z(var46, var2, var3, var26, e_ArrayI);
            if (m.method_a_h_I_I_I_I_I_Z(this, 8, var46, var2, var3, var26)) {
               boolean var31 = var41 == this.b_I;
               var3 = var2;
               var2 = var46;
               f var27 = var30;
               b var44;
               if ((var44 = var30.a_b) != null) {
                  var44.method_a_I_I_I_I_V(
                     var2 + var27.method_a_I_I(13),
                     var3 + var27.method_a_I_I(11),
                     var27.method_a_I_I(var27.a_Z ? (var31 ? 18 : 15) : (var31 ? 20 : 19)),
                     var27.method_a_I_I(16)
                  );
               }
            }
         }
      }

      if (var6 != -1 && ((f)this.a_Vector.elementAt(var6)).method_a_I_I(7) == 2048) {
         f var32 = (f)this.a_Vector.elementAt(var6);
         int var47 = var35 + method_a_f_I_I(var32, var38);
         var2 = var37 + this.method_a_I_I(var6) - this.c_I;
         var3 = var32.method_a_I();
         int var28 = var32.method_b_I();
         var1.setClip(var47, var2, var3, var28);
         m.method_a_h_I_I_I_I_I_Z(this, 10, var47, var2, var3, var28);
      }
   }

   public final void method_d_I_V(int var1) {
      byte[] var3;
      if ((var3 = (byte[])o.method_a_I_Object(var1)) != null) {
         try {
            DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var3));
            this.a_ArrayI = method_a_DataInputStream_ArrayI_I_I_ArrayI(var4, f_ArrayI, 15, 22);
            this.b_ArrayI = method_a_DataInputStream_ArrayI_I_I_ArrayI(var4, h_ArrayI, 20, 26);
         } catch (Exception var2) {
         }
      }
   }

   private int method_c_I_I(int var1) {
      return method_a_I_ArrayI_I_I(var1, this.b_ArrayI, 2);
   }

   public final void method_a_I_I_V(int var1, int var2) {
      this.a_ArrayI = method_a_I_I_ArrayI_I_ArrayI(var1, var2, this.a_ArrayI, 1);
   }

   public final void method_b_I_I_V(int var1, int var2) {
      this.b_ArrayI = method_a_I_I_ArrayI_I_ArrayI(var1, var2, this.b_ArrayI, 2);
   }

   private static int[] method_a_DataInputStream_ArrayI_I_I_ArrayI(DataInputStream var0, int[] var1, int var2, int var3) {
      int var4 = var0.readInt();
      int var10 = var1.length;
      if (var4 == 0) {
         return null;
      }

      int var5 = 0;

      for (int var6 = var10; var4 >>> var6 - 1 != 0; var6++) {
         var5 = var6 - var10;
      }

      int[] var13;
      (var13 = new int[var5 + 2])[0] = var4;
      var13[1] = 0;
      if ((var4 & -1 >>> 32 - var10) != 0) {
         var13[1] = var0.readInt();
      }

      for (int var11 = 0; var11 < var5; var11++) {
         if ((var13[0] & 1 << var11 + var10) != 0) {
            var13[var11 + 2] = var0.readShort();
         }
      }

      for (int var12 = var2 + 2 - var10; var12 <= var3 + 2 - var10 && var12 < var13.length; var12++) {
         boolean var7 = false;
         int var8;
         int var9 = (var8 = 0 | (var13[var12] & 31744) << 9) | (var13[var12] & 992) << 6 | (var13[var12] & 31) << 3;
         var13[var12] = var9;
      }

      return var13;
   }

   public static int method_a_I_ArrayI_I_I(int var0, int[] var1, int var2) {
      int[] var3;
      int[] var5;
      if (var2 == 1) {
         var5 = g_ArrayI;
         var3 = f_ArrayI;
      } else {
         var5 = i_ArrayI;
         var3 = h_ArrayI;
      }

      int var4 = var3.length;
      if (!method_a_I_ArrayI_Z(var0, var1)) {
         var1 = var5;
      }

      return var0 < var4 ? var1[1] & var3[var0] : var1[var0 + 2 - var4];
   }

   public static boolean method_a_I_ArrayI_Z(int var0, int[] var1) {
      return var1 != null && (var1[0] & 1 << var0) != 0;
   }

   public static int[] method_a_I_I_ArrayI_I_ArrayI(int var0, int var1, int[] var2, int var3) {
      int[] var4;
      byte var5;
      if (var3 == 1) {
         var5 = 16;
         var4 = f_ArrayI;
      } else {
         var5 = 23;
         var4 = h_ArrayI;
      }

      if (var2 == null) {
         var2 = new int[var5];
      } else if (var2.length < var5) {
         int[] var6 = new int[var5];
         System.arraycopy(var2, 0, var6, 0, var2.length);
         var2 = var6;
      }

      var2[0] |= 1 << var0;
      if (var0 < var4.length) {
         var2[1] &= ~var4[var0];
         var2[1] |= var1 & var4[var0];
      } else {
         var2[var0 + 2 - var4.length] = var1;
      }

      return var2;
   }
}
