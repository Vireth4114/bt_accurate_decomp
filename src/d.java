public final class d {
   public int a_I = 65536;
   public int b_I;
   public int c_I;
   public int d_I;
   public int e_I = 65536;
   public int f_I;
   public static int g_I;
   public static int h_I;
   public static d a_d = new d();

   public final void method_a_I_I_V(int var1, int var2) {
      g_I = (int)((long)this.a_I * var1 + (long)this.b_I * var2 >> 16) + this.c_I;
      h_I = (int)((long)this.d_I * var1 + (long)this.e_I * var2 >> 16) + this.f_I;
   }

   public final void method_b_I_I_V(int var1, int var2) {
      g_I = (int)((long)this.a_I * var1 + (long)this.b_I * var2 >> 16);
      h_I = (int)((long)this.d_I * var1 + (long)this.e_I * var2 >> 16);
   }

   public final void method_a_d_V(d var1) {
      this.a_I = var1.a_I;
      this.b_I = var1.b_I;
      this.c_I = var1.c_I;
      this.d_I = var1.d_I;
      this.e_I = var1.e_I;
      this.f_I = var1.f_I;
   }

   public final void method_b_d_V(d var1) {
      int var2 = (int)((long)this.a_I * var1.a_I + (long)this.b_I * var1.d_I >> 16);
      int var3 = (int)((long)this.a_I * var1.b_I + (long)this.b_I * var1.e_I >> 16);
      int var4 = (int)(((long)this.a_I * var1.c_I + (long)this.b_I * var1.f_I >> 16) + this.c_I);
      int var5 = (int)((long)this.d_I * var1.a_I + (long)this.e_I * var1.d_I >> 16);
      int var6 = (int)((long)this.d_I * var1.b_I + (long)this.e_I * var1.e_I >> 16);
      int var7 = (int)(((long)this.d_I * var1.c_I + (long)this.e_I * var1.f_I >> 16) + this.f_I);
      this.a_I = var2;
      this.b_I = var3;
      this.c_I = var4;
      this.d_I = var5;
      this.e_I = var6;
      this.f_I = var7;
   }

   public static void method_a_d_d_d_V(d var0, d var1, d var2) {
      int var3 = (int)((long)var0.a_I * var1.a_I + (long)var0.b_I * var1.d_I >> 16);
      int var4 = (int)((long)var0.a_I * var1.b_I + (long)var0.b_I * var1.e_I >> 16);
      int var5 = (int)(((long)var0.a_I * var1.c_I + (long)var0.b_I * var1.f_I >> 16) + var0.c_I);
      int var6 = (int)((long)var0.d_I * var1.a_I + (long)var0.e_I * var1.d_I >> 16);
      int var7 = (int)((long)var0.d_I * var1.b_I + (long)var0.e_I * var1.e_I >> 16);
      int var8 = (int)(((long)var0.d_I * var1.c_I + (long)var0.e_I * var1.f_I >> 16) + var0.f_I);
      var2.a_I = var3;
      var2.b_I = var4;
      var2.c_I = var5;
      var2.d_I = var6;
      var2.e_I = var7;
      var2.f_I = var8;
   }

   public final void method_c_d_V(d var1) {
      long var2;
      if ((var2 = (long)this.a_I * this.e_I - (long)this.b_I * this.d_I >> 16) != 0L) {
         var1.a_I = (int)(((long)this.e_I << 16) / var2);
         var1.b_I = (int)(((long)this.d_I << 16) / var2);
         var1.d_I = (int)(((long)this.b_I << 16) / var2);
         var1.e_I = (int)(((long)this.a_I << 16) / var2);
         var1.c_I = -((int)((long)this.c_I * var1.a_I + (long)this.f_I * var1.b_I >> 16));
         var1.f_I = -((int)((long)this.c_I * var1.d_I + (long)this.f_I * var1.e_I >> 16));
      } else {
         throw new ArithmeticException("Non-invertible matrix.");
      }
   }

   public final void method_a_F_V(float var1) {
      int var2 = (int)((float)Math.cos(var1) * 65536.0F);
      int var3 = (int)((float)Math.sin(var1) * 65536.0F);
      this.a_I = var2;
      this.b_I = -var3;
      this.d_I = var3;
      this.e_I = var2;
   }

   public final String method_toString_String() {
      return new String(this.a_I + " " + this.b_I + " " + this.c_I + "\n" + this.d_I + " " + this.e_I + " " + this.f_I);
   }
}
