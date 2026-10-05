import com.nokia.mid.ui.DirectGraphics;
import javax.microedition.lcdui.Graphics;

public class j {
   public static final d a_d = new d();
   public final d b_d;
   public final d c_d;
   private d h_d;
   public final d d_d;
   public final d e_d;
   private j c_j;
   private j d_j;
   private j e_j;
   private j f_j;
   private short a_S;
   private short b_S;
   public int e_I;
   public int f_I;
   public int g_I;
   public int h_I;
   public int i_I;
   public int j_I;
   public int k_I;
   public int l_I;
   public byte b_B;
   public int m_I;
   public boolean e_Z = true;
   private boolean a_Z = true;
   public boolean f_Z = true;
   public boolean g_Z = true;
   protected short d_S;
   protected byte c_B = 1;
   private static short c_S;
   private static int a_I = 0;
   public static final d f_d = new d();
   private static d i_d = new d();
   public static final d g_d = new d();
   private static d j_d = new d();
   private static d k_d = new d();
   public static j a_j;
   public static int n_I;
   public static int o_I;
   public static int p_I;
   public static int q_I;
   private static int b_I;
   private static j[] a_Arrayj;
   protected static j b_j;

   public j() {
      this.d_S = c_S++;
      this.b_d = new d();
      this.c_d = new d();
      this.h_d = new d();
      this.d_d = new d();
      this.e_d = new d();
   }

   public final byte method_a_B() {
      return this.c_B;
   }

   public void method_d_V() {
      if (this.e_Z) {
         if (this.c_j != null) {
            d.method_a_d_d_d_V(this.c_j.b_d, this.c_d, this.b_d);
         } else {
            this.b_d.method_a_d_V(this.c_d);
         }

         this.b_d.method_c_d_V(this.d_d);
         this.e_Z = false;
      }
   }

   public final void method_h_V() {
      for (j var1 = this; var1 != null; var1 = var1.method_a_j_j(this)) {
         var1.e_Z = true;
         var1.f_Z = true;
         var1.g_Z = true;
      }
   }

   public final void method_i_V() {
      for (j var1 = this; var1 != null; var1 = var1.c_j) {
         var1.a_Z = true;
      }
   }

   public void method_a_j_V(j var1) {
   }

   public void method_a_Graphics_DirectGraphics_d_V(Graphics var1, DirectGraphics var2, d var3) {
   }

   public final void method_b_j_V(j var1) {
      if (var1.method_a_j_Z(this)) {
         throw new IllegalArgumentException();
      }

      if (var1 == this) {
         throw new IllegalArgumentException();
      }

      this.method_j_V();
      this.e_j = var1.d_j;
      if (this.e_j != null) {
         this.e_j.f_j = this;
      }

      this.c_j = var1;
      this.c_j.d_j = this;
   }

   public final void method_j_V() {
      if (this.c_j != null) {
         if (this.c_j.d_j == this) {
            this.c_j.d_j = this.e_j;
            if (this.e_j != null) {
               this.e_j.f_j = null;
            }
         } else {
            if (this.f_j != null) {
               this.f_j.e_j = this.e_j;
            }

            if (this.e_j != null) {
               this.e_j.f_j = this.f_j;
            }
         }

         this.c_j = null;
         this.e_j = null;
         this.f_j = null;
      }
   }

   public final void method_a_d_V(d var1) {
      if (this.f_Z) {
         this.method_k_V();
      }

      var1.method_a_d_V(this.h_d);
   }

   public final void method_k_V() {
      this.h_d.method_a_d_V(this.c_d);

      for (j var1 = this.c_j; var1 != null; var1 = var1.c_j) {
         d.method_a_d_d_d_V(var1.c_d, this.h_d, this.h_d);
      }

      this.h_d.method_c_d_V(this.e_d);
      this.f_Z = false;
   }

   public final boolean method_a_j_Z(j var1) {
      for (j var2 = this.c_j; var2 != null; var2 = var2.c_j) {
         if (var1 == var2) {
            return true;
         }
      }

      return false;
   }

   public final j method_a_j_j(j var1) {
      if (var1 == null) {
         return null;
      }

      if (this.d_j != null) {
         return this.d_j;
      }

      if (this == var1) {
         return null;
      }

      if (this.e_j != null) {
         return this.e_j;
      }

      for (j var2 = this.c_j; var2 != null && var2 != var1; var2 = var2.c_j) {
         if (var2.e_j != null) {
            return var2.e_j;
         }
      }

      return null;
   }

   public final j method_b_j_j(j var1) {
      if (var1 == null) {
         return null;
      }

      if (this == var1) {
         return null;
      }

      if (this.e_j != null) {
         return this.e_j;
      }

      for (j var2 = this.c_j; var2 != null && var2 != var1; var2 = var2.c_j) {
         if (var2.e_j != null) {
            return var2.e_j;
         }
      }

      return null;
   }

   public final short method_a_S() {
      return this.d_S;
   }

   public final void method_a_S_V(short var1) {
      this.d_S = var1;
   }

   public final j method_a_S_j(short var1) {
      j var2 = null;
      var2 = this;

      while (var2 != null && var2.d_S != var1) {
         var2 = var2.method_a_j_j(this);
      }

      return var2;
   }

   public final j method_a_j() {
      this = this;

      while (this.c_j != null) {
         this = this.c_j;
      }

      return this;
   }

   public void method_a_V() {
      this.e_I = Integer.MAX_VALUE;
      this.f_I = Integer.MAX_VALUE;
      this.g_I = Integer.MIN_VALUE;
      this.h_I = Integer.MIN_VALUE;
   }

   public final void method_l_V() {
      if (this.a_Z) {
         this.i_I = this.e_I;
         this.j_I = this.f_I;
         this.k_I = this.g_I;
         this.l_I = this.h_I;

         for (j var1 = this.d_j; var1 != null; var1 = var1.e_j) {
            var1.method_l_V();
            var1.c_d.method_a_I_I_V(var1.i_I, var1.j_I);
            if (d.g_I < this.i_I) {
               this.i_I = d.g_I;
            }

            if (d.h_I < this.j_I) {
               this.j_I = d.h_I;
            }

            if (d.g_I > this.k_I) {
               this.k_I = d.g_I;
            }

            if (d.h_I > this.l_I) {
               this.l_I = d.h_I;
            }

            var1.c_d.method_a_I_I_V(var1.i_I, var1.l_I);
            if (d.g_I < this.i_I) {
               this.i_I = d.g_I;
            }

            if (d.h_I < this.j_I) {
               this.j_I = d.h_I;
            }

            if (d.g_I > this.k_I) {
               this.k_I = d.g_I;
            }

            if (d.h_I > this.l_I) {
               this.l_I = d.h_I;
            }

            var1.c_d.method_a_I_I_V(var1.k_I, var1.l_I);
            if (d.g_I < this.i_I) {
               this.i_I = d.g_I;
            }

            if (d.h_I < this.j_I) {
               this.j_I = d.h_I;
            }

            if (d.g_I > this.k_I) {
               this.k_I = d.g_I;
            }

            if (d.h_I > this.l_I) {
               this.l_I = d.h_I;
            }

            var1.c_d.method_a_I_I_V(var1.k_I, var1.j_I);
            if (d.g_I < this.i_I) {
               this.i_I = d.g_I;
            }

            if (d.h_I < this.j_I) {
               this.j_I = d.h_I;
            }

            if (d.g_I > this.k_I) {
               this.k_I = d.g_I;
            }

            if (d.h_I > this.l_I) {
               this.l_I = d.h_I;
            }
         }

         this.a_Z = false;
      }
   }

   public int method_a_ArrayB_I_I(byte[] var1, int var2) {
      this.a_S = method_a_ArrayB_I_S(var1, var2);
      var2 += 2;
      this.b_S = method_a_ArrayB_I_S(var1, var2);
      var2 += 2;
      byte var3 = var1[var2];
      var2++;
      if ((var3 & 7) == 7) {
         this.c_d.a_I = method_b_ArrayB_I_I(var1, var2);
         var2 += 4;
         this.c_d.b_I = method_b_ArrayB_I_I(var1, var2);
         var2 += 4;
         this.c_d.c_I = method_b_ArrayB_I_I(var1, var2);
         var2 += 4;
         this.c_d.d_I = method_b_ArrayB_I_I(var1, var2);
         var2 += 4;
         this.c_d.e_I = method_b_ArrayB_I_I(var1, var2);
         var2 += 4;
         this.c_d.f_I = method_b_ArrayB_I_I(var1, var2);
         var2 += 4;
      } else {
         if ((var3 & 1) > 0) {
            this.c_d.c_I = method_a_ArrayB_I_S(var1, var2) << 16;
            var2 += 2;
            this.c_d.f_I = method_a_ArrayB_I_S(var1, var2) << 16;
            var2 += 2;
         }

         if ((var3 & 2) > 0) {
            this.c_d.method_a_F_V(method_b_ArrayB_I_I(var1, var2) / 65536.0F);
            var2 += 4;
         }

         if ((var3 & 4) > 0) {
            this.c_d.a_I = method_b_ArrayB_I_I(var1, var2);
            var2 += 4;
            this.c_d.e_I = method_b_ArrayB_I_I(var1, var2);
            var2 += 4;
         }
      }

      this.m_I = method_b_ArrayB_I_I(var1, var2);
      this.b_B = (byte)((this.m_I & 31) - 16);
      this.b_d.a_I = this.c_d.a_I;
      this.b_d.b_I = this.c_d.b_I;
      this.b_d.c_I = this.c_d.c_I;
      this.b_d.d_I = this.c_d.d_I;
      this.b_d.e_I = this.c_d.e_I;
      this.b_d.f_I = this.c_d.f_I;
      return var2 + 4;
   }

   public static void method_a_Arrayj_V(j[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         j var2;
         if ((var2 = var0[var1]).a_S > -1) {
            j var3 = var0[var2.a_S];
            var2.c_j = var3;
            if (var3.d_j == null) {
               var3.d_j = var2;
            }
         }

         if (var2.b_S > -1) {
            j var5 = var0[var2.b_S];
            var2.f_j = var5;
            var5.e_j = var2;
         }
      }

      for (int var4 = 0; var4 < var0.length; var4++) {
         var0[var4].e_Z = true;
         var0[var4].a_Z = true;
         var0[var4].f_Z = true;
         var0[var4].method_k_V();
         var0[var4].method_a_d_V(a_d);
         var0[var4].b_d.method_a_d_V(a_d);
         var0[var4].b_d.method_c_d_V(var0[var4].d_d);
      }
   }

   public static final short method_a_ArrayB_I_S(byte[] var0, int var1) {
      int var2 = 0;
      return (short)((var2 = 0 | var0[var1]) << 8 | var0[var1 + 1] & 0xFF);
   }

   public static final int method_b_ArrayB_I_I(byte[] var0, int var1) {
      long var2 = 0L;
      return (int)((((var2 = 0L | var0[var1]) << 8 | var0[var1 + 1] & 0xFF) << 8 | var0[var1 + 2] & 0xFF) << 8 | var0[var1 + 3] & 0xFF);
   }

   public static int method_a_ArrayI_I_I_ArrayB_I_I_I(int[] var0, int var1, int var2, byte[] var3, int var4, int var5) {
      int var6 = 0;
      int var7 = 0;
      var5 = var5;
      int var8 = 0;
      int var9 = 1 << var5 - 1;
      int var10 = (1 << var5) - 1;

      while (var8 < var1) {
         var6 |= var3[var4++] << var7;
         var7 += 8;

         for (var6 &= (1 << var7) - 1; var7 >= var5; var6 >>>= var5) {
            int var11;
            if (((var11 = var6 & var10) & var9) > 0) {
               var11 |= ~var10;
            }

            if (var8 < var1) {
               var0[var8++] = var11 + var2 << 16;
            }

            var7 -= var5;
         }
      }

      return var4;
   }

   public static int method_a_ArrayS_I_I_I_ArrayB_I_I_I(short[] var0, int var1, int var2, int var3, byte[] var4, int var5, int var6) {
      var3 = 0;
      int var7 = 0;
      var6 = var6;
      int var8 = 0;
      int var9 = 1 << var6 - 1;
      int var10 = (1 << var6) - 1;

      while (var8 < var1) {
         var3 |= var4[var5++] << var7;
         var7 += 8;

         for (var3 &= (1 << var7) - 1; var7 >= var6; var3 >>>= var6) {
            int var11;
            if (((var11 = var3 & var10) & var9) > 0) {
               var11 |= ~var10;
            }

            if (var8 < var1) {
               var0[var8++] = (short)(var11 + var2);
            }

            var7 -= var6;
         }
      }

      return var5;
   }

   public static final boolean method_a_I_I_I_I_I_I_I_I_Z(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      long var8 = var6 - var4;
      long var10 = var7 - var5;
      long var12 = var2 - var0;
      long var14 = var3 - var1;
      long var16 = var0 + var2 - var4 - var6;
      long var18 = var1 + var3 - var5 - var7;
      long var20 = var12 > 0L ? var12 : -var12;
      if ((var16 > 0L ? var16 : -var16) > var8 + var20) {
         return false;
      }

      long var22 = var14 > 0L ? var14 : -var14;
      long var24;
      return (var18 > 0L ? var18 : -var18) > var10 + var22
         ? false
         : ((var24 = var16 * var14 - var18 * var12) > 0L ? var24 : -var24) <= var8 * var22 + var10 * var20;
   }

   public static final boolean method_b_I_I_I_I_I_I_I_I_Z(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return var2 < var4 || var0 > var6 ? false : var3 >= var5 && var1 <= var7;
   }

   public static boolean method_a_I_I_I_I_I_I_Z(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var0 < var2 || var0 > var4 ? false : var1 >= var3 && var1 <= var5;
   }

   public static void method_m_V() {
      n_I = 0;
      o_I = 0;
      method_b_Z_V(true);
   }

   public static void method_b_Z_V(boolean var0) {
      int var1 = o.a_I;
      int var2 = 0;
      int var3 = 0;
      a_j.method_a_d_V(a_d);
      if (var1 != 0) {
         var2 = (a_d.c_I - a_j.b_d.c_I) / var1;
         var3 = (a_d.f_I - a_j.b_d.f_I) / var1;
      }

      var2 <<= 7;
      var3 = -var3 << 7;
      int var4 = a_d.c_I;
      int var5 = a_d.f_I;
      int var6 = -o.c_I / 5 << 16;
      g_d.method_c_d_V(d.a_d);
      d.a_d.method_b_I_I_V(0, var6);
      var6 = d.g_I;
      int var7 = d.h_I;
      d.a_d.method_b_I_I_V(var2, var3);
      var2 = var4 + var6 + var2 + d.g_I;
      var3 = var5 + var7 + var3 + d.h_I;
      if (var0) {
         f_d.c_I = var2;
         f_d.f_I = var3;
      } else {
         var0 = var2 - f_d.c_I;
         var2 = var3 - f_d.f_I;
         if (Math.abs(var0) < 327680) {
            var0 = 0;
         }

         if (Math.abs(var2) < 327680) {
            var2 = 0;
         }

         for (a_I += var1; a_I >= 15; a_I -= 15) {
            f_d.c_I = f_d.c_I + n_I * 15;
            f_d.f_I = f_d.f_I + o_I * 15;
            n_I = n_I + (15 * p_I * (var0 >> 6) >> 14);
            o_I = o_I + (15 * p_I * (var2 >> 6) >> 14);
            n_I = n_I - (15 * q_I * n_I >> 14);
            o_I = o_I - (15 * q_I * o_I >> 14);
         }
      }
   }

   public static void method_a_j_Graphics_DirectGraphics_V(j var0, Graphics var1, DirectGraphics var2) {
      f_d.method_c_d_V(i_d);
      d.method_a_d_d_d_V(g_d, i_d, j_d);
      j_d.c_I >>= 16;
      j_d.c_I <<= 16;
      j_d.f_I >>= 16;
      j_d.f_I <<= 16;
      j_d.method_c_d_V(k_d);
      var0 = var0;
      k_d.method_a_I_I_V(0, 0);
      int var3 = d.g_I;
      int var4 = d.h_I;
      k_d.method_a_I_I_V(o.b_I << 16, o.c_I << 16);
      int var5 = d.g_I;
      int var6 = d.h_I;
      if (var3 > var5) {
         var5 = var3;
         var3 = d.g_I;
      }

      if (var4 > var6) {
         var6 = var4;
         var4 = d.h_I;
      }

      b_I = 0;
      j var7 = var0;

      while (var7 != null) {
         var7.method_a_d_V(a_d);
         a_d.method_a_I_I_V(var7.i_I, var7.j_I);
         int var8 = d.g_I;
         int var9 = d.h_I;
         int var10 = d.g_I;
         int var11 = d.h_I;
         a_d.method_a_I_I_V(var7.i_I, var7.l_I);
         if (d.g_I < var8) {
            var8 = d.g_I;
         }

         if (d.h_I < var9) {
            var9 = d.h_I;
         }

         if (d.g_I > var10) {
            var10 = d.g_I;
         }

         if (d.h_I > var11) {
            var11 = d.h_I;
         }

         a_d.method_a_I_I_V(var7.k_I, var7.l_I);
         if (d.g_I < var8) {
            var8 = d.g_I;
         }

         if (d.h_I < var9) {
            var9 = d.h_I;
         }

         if (d.g_I > var10) {
            var10 = d.g_I;
         }

         if (d.h_I > var11) {
            var11 = d.h_I;
         }

         a_d.method_a_I_I_V(var7.k_I, var7.j_I);
         if (d.g_I < var8) {
            var8 = d.g_I;
         }

         if (d.h_I < var9) {
            var9 = d.h_I;
         }

         if (d.g_I > var10) {
            var10 = d.g_I;
         }

         if (d.h_I > var11) {
            var11 = d.h_I;
         }

         boolean var12;
         if (!(var12 = var7.c_B == 11) && !method_b_I_I_I_I_I_I_I_I_Z(var8, var9, var10, var11, var3, var4, var5, var6)) {
            var7 = var7.method_b_j_j(var0);
         } else if ((var7.m_I & 128) > 0) {
            var7 = var7.method_a_j_j(var0);
         } else {
            a_Arrayj[b_I] = var7;
            b_I++;
            var7 = var7.method_a_j_j(var0);
         }
      }

      var3 = b_I;
      j[] var14 = a_Arrayj;
      if (a_Arrayj != null && var3 > 1) {
         if (var3 == 2) {
            if (var14[0].b_B < var14[1].b_B) {
               j var18 = var14[0];
               var14[0] = var14[1];
               var14[1] = var18;
            }
         } else {
            method_a_Arrayj_I_I_V(var14, 0, var3 - 1);
         }
      }

      for (int var15 = 0; var15 < b_I; var15++) {
         a_Arrayj[var15].method_a_Graphics_DirectGraphics_d_V(var1, var2, j_d);
      }

      b_I = 0;

      for (int var16 = 0; var16 < a_Arrayj.length; var16++) {
         a_Arrayj[var16] = null;
      }
   }

   private static final void method_a_Arrayj_I_I_V(j[] var0, int var1, int var2) {
      if (var1 < var2) {
         int var5 = var2;
         int var4 = var1;
         j[] var3 = var0;
         j var6 = var0[var5];
         int var7 = var4 - 1;

         for (int var10 = var4; var10 < var5; var10++) {
            if (var6.b_B < var3[var10].b_B) {
               j var8 = var3[++var7];
               var3[var7] = var3[var10];
               var3[var10] = var8;
            }
         }

         var3[var5] = var3[var7 + 1];
         var3[var7 + 1] = var6;
         int var9 = var7 + 1;
         method_a_Arrayj_I_I_V(var0, var1, var9 - 1);
         method_a_Arrayj_I_I_V(var0, var9 + 1, var2);
      }
   }

   static {
      g_d.a_I = 43266;
      g_d.e_I = -43266;
      if (o.b_I < 200) {
         g_d.a_I = 22306;
         g_d.e_I = -22306;
      }

      b_I = 0;
      a_Arrayj = new j[60];
      b_j = new j();
   }
}
