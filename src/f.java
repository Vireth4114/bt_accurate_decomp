public final class f {
   public h a_h = null;
   public boolean a_Z = true;
   public int a_I = -1;
   public b a_b;
   private int[] a_ArrayI;
   public String a_String = null;

   public f() {
   }

   public f(String var1, int var2, h var3, int var4) {
      this.a_h = var3;
      this.a_I = var4;
      this.method_a_String_I_V(var1, var2);
   }

   public final int method_a_I() {
      if (this.method_a_I_I(5) == 256) {
         b var1 = this.a_b;
         if (this.a_b != null) {
            if (var1.a_String != null && var1.a_String.length() >= 1) {
               return var1.b_I + this.method_a_I_I(13) + this.method_a_I_I(14);
            }

            return var1.b_I - b.a_I + this.method_a_I_I(13) + this.method_a_I_I(14);
         }

         if (this.a_h != null) {
            return this.a_h.method_b_I();
         }
      } else {
         if (this.method_a_I_I(8) != 4096) {
            return this.method_a_I_I(10);
         }

         if (this.a_h != null) {
            return this.a_h.method_b_I();
         }
      }

      return 0;
   }

   public final int method_b_I() {
      b var1 = this.a_b;
      return (this.a_b != null ? var1.c_I : 0) + this.method_a_I_I(11) + this.method_a_I_I(12);
   }

   public final boolean method_a_Z() {
      return this.a_I != -1;
   }

   public final void method_a_I_I_V(int var1, int var2) {
      this.a_ArrayI = h.method_a_I_I_ArrayI_I_ArrayI(var1, var2, this.a_ArrayI, 1);
   }

   public final int method_a_I_I(int var1) {
      return !h.method_a_I_ArrayI_Z(var1, this.a_ArrayI) && this.a_h != null
         ? h.method_a_I_ArrayI_I_I(var1, this.a_h.a_ArrayI, 1)
         : h.method_a_I_ArrayI_I_I(var1, this.a_ArrayI, 1);
   }

   public final void method_a_String_I_V(String var1, int var2) {
      if (var1 == null) {
         var1 = "";
      }

      b var3 = this.a_b;
      this.a_b = null;
      int var4 = this.method_a_I();
      this.a_b = var3;
      var4 -= this.method_a_I_I(13) + this.method_a_I_I(14);
      int var6 = 0;

      for (int var5 = 0; var5 < 9; var5++) {
         var6 |= this.method_a_I_I(var5);
      }

      this.a_b = new b(var1, var4, this.method_a_I_I(9), var6, var2);
   }
}
