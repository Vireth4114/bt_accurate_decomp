public final class b {
   public static final int a_I = o.b_I >>> 5;
   private int d_I;
   private int e_I;
   private int f_I;
   private int g_I;
   private int h_I = 0;
   private int i_I;
   public int b_I;
   public int c_I;
   private int j_I;
   String a_String;
   private String[] a_ArrayString;
   private int k_I;
   private int l_I;
   private boolean a_Z;

   public b(String var1, int var2, int var3, int var4, int var5) {
      this.e_I = var4;
      this.a_String = var1;
      this.f_I = var3;
      switch (this.e_I & 3) {
         case 1:
            this.g_I = 2;
            break;
         case 2:
            this.g_I = 3;
            break;
         default:
            this.g_I = 1;
      }

      if (var5 >= 0) {
         this.d_I = var5;
         this.l_I = o.method_a_I_I_I(var5, 0) + a_I;
         this.k_I = o.method_a_I_I_I(var5, 1);
      } else {
         this.d_I = -1;
         this.l_I = 0;
         this.k_I = 0;
      }

      this.a_Z = var2 > this.l_I && (this.e_I & 128) == 128 && (this.e_I & 48) != 32;
      boolean var6 = false;
      if ((this.e_I & 256) == 256) {
         var6 = true;
      }

      this.a_String = var1 != null ? var1 : "";
      this.a_ArrayString = o.method_a_String_I_I_Z_I_I_Z_ArrayString(this.a_String, var2, this.f_I, this.a_Z, this.l_I, this.k_I, var6);
      this.method_a_String_V(this.a_ArrayString[0]);
   }

   private void method_a_String_V(String var1) {
      int[] var2 = new int[4];
      if (var1 != null) {
         int var3 = 0;

         for (int var4 = 0; var4 < var1.length(); var4++) {
            if (var1.charAt(var4) == ' ') {
               var2[var3] = var4;
               var3++;
            }
         }

         try {
            this.j_I = Integer.valueOf(var1.substring(0, var2[0])).intValue();
         } catch (Exception var9) {
         }

         try {
            this.h_I = Integer.valueOf(var1.substring(var2[0] + 1, var2[1])).intValue();
         } catch (Exception var8) {
            this.h_I = 0;
         }

         try {
            this.i_I = Integer.valueOf(var1.substring(var2[1] + 1, var2[2])).intValue();
         } catch (Exception var7) {
            this.i_I = 0;
         }

         try {
            this.b_I = Integer.valueOf(var1.substring(var2[2] + 1, var2[3])).intValue();
         } catch (Exception var6) {
            this.b_I = 0;
         }

         try {
            this.c_I = Integer.valueOf(var1.substring(var2[3] + 1, var1.length())).intValue();
         } catch (NumberFormatException var5) {
            this.c_I = 0;
            return;
         }
      } else {
         this.j_I = 0;
         this.h_I = 0;
         this.i_I = 0;
         this.b_I = 0;
         this.c_I = 0;
      }
   }

   public final void method_a_I_I_I_I_V(int var1, int var2, int var3, int var4) {
      boolean var11 = true;
      int var5 = this.j_I;
      boolean var12 = false;
      var4 = var4;
      var3 = var3;
      var2 = var2;
      var1 = var1;
      b var13 = this;
      o.method_a_I_I_V(this.f_I, var13.g_I);
      o.method_b_I_I_V(0, var3);
      o.method_b_I_I_V(1, var4);
      if (var5 > var13.j_I) {
         var5 = var13.j_I;
      }

      byte var20;
      if ((var13.e_I & 48) == 32) {
         var3 = var13.b_I / 2;
         var20 = 17;
      } else {
         int var6;
         if ((var13.e_I & 12) == 8) {
            var6 = (var13.b_I - var13.i_I) / 2;
         } else {
            var6 = 0;
         }

         if ((var13.e_I & 48) == 0) {
            var3 = var6;
            var20 = 20;
         } else {
            var3 = var13.b_I - var6;
            var20 = 24;
         }
      }

      boolean var22 = (var13.e_I & 48) == 0;
      byte var7 = 0;
      byte var8 = 0;
      int var9 = 0;
      int var10 = 0;
      switch (var13.e_I & 12) {
         case 0:
            var8 = 20;
            var10 = 0;
            var7 = 20;
            if (var22) {
               var9 = var13.l_I;
            } else {
               var9 = 0;
            }
            break;
         case 4:
            var8 = 24;
            var10 = var13.b_I;
            var7 = 24;
            if (var22) {
               var9 = var13.b_I;
            } else {
               var9 = var13.b_I - var13.l_I;
            }
            break;
         case 8:
            var8 = 17;
            var10 = var13.b_I / 2;
            if (var22) {
               var7 = 20;
               var9 = (var13.b_I - var13.i_I) / 2 + var13.l_I;
            } else {
               var7 = 24;
               var9 = var13.b_I - (var13.b_I - var13.i_I) / 2 - var13.l_I;
            }
      }

      if (var13.d_I >= 0) {
         o.method_a_I_I_I_I_V(var1 + var3, var2, var13.d_I, var20);
      }

      if (!var13.a_Z) {
         var2 += var13.k_I;
      }

      var3 = 0 * o.method_a_I_I(var13.f_I);

      for (int var21 = 0; var21 < var5; var21++) {
         if (var13.a_ArrayString[var21 + 1] != null) {
            if (var21 < var13.h_I) {
               o.method_a_String_I_I_I_I_I_V(var13.a_ArrayString[var21 + 1], 0, var13.a_ArrayString[var21 + 1].length(), var1 + var9, var2 + var3, var7);
            } else {
               o.method_a_String_I_I_I_I_I_V(var13.a_ArrayString[var21 + 1], 0, var13.a_ArrayString[var21 + 1].length(), var1 + var10, var2 + var3, var8);
            }

            var3 += o.method_a_I_I(var13.f_I);
         }
      }
   }

   static {
      char[] var10000 = new char[]{'\n', ' ', '-'};
   }
}
