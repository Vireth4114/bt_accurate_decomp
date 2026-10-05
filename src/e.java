import com.nokia.mid.ui.DirectGraphics;
import javax.microedition.lcdui.Graphics;

public final class e extends j {
   short a_S;
   c a_c;
   int a_I;
   private int c_I;
   int b_I;
   float a_F;
   byte a_B;
   boolean a_Z;

   public e() {
      this.c_B = 8;
   }

   public final int method_a_ArrayB_I_I(byte[] var1, int var2) {
      var2 = super.method_a_ArrayB_I_I(var1, var2);
      this.a_S = (short)(var1[var2++] << 8 | var1[var2++] & 0xFF);
      this.a_B = var1[var2++];
      this.a_I = 0;
      this.b_I = 0;
      this.c_I = 0;
      int var3;
      if ((var3 = m.method_b_I_I(m.e_I)) == 0) {
         this.a_S = 497;
      }

      if (var3 == 1) {
         this.a_S = 509;
      }

      if (var3 == 2) {
         this.a_S = 490;
      }

      return var2;
   }

   public final void method_a_V() {
      this.e_I = -4587520;
      this.g_I = 4587520;
      this.f_I = 0;
      this.h_I = 6225920;
   }

   public final void method_d_V() {
      super.method_d_V();
      if (this.a_I < this.b_I) {
         int var1 = o.a_I;
         this.a_I += var1;
         if (this.a_I >= this.b_I - this.b_I / o.method_b_I_I(this.a_S)) {
            if (!this.a_Z) {
               this.a_Z = true;
               this.a_c.a_Z = true;
               this.a_c.b_F = this.a_F;
               this.a_c.j_F = 0.0F;
               this.a_c.k_F = 0.0F;
               this.a_c.c_Z = true;
               if (this.a_c.equals(m.a_c)) {
                  g.a_ArrayI[1] = 0;
               }
            }

            var1 = o.method_b_I_I(this.a_S);
            this.c_I = this.a_I * var1 / this.b_I;
         } else {
            var1 = o.method_b_I_I(this.a_S);
            this.c_I = this.a_I * var1 / this.b_I;
            this.method_b_V();
         }

         if (this.a_I >= this.b_I) {
            this.a_I = 0;
            this.b_I = 0;
            this.c_I = 0;
         }
      }
   }

   public final void method_b_V() {
      this.method_a_d_V(j.a_d);
      this.a_c.c_d.f_I = j.a_d.f_I - (65536 * (short)o.method_b_I_I_I(o.method_c_I_I_I(this.a_S, this.c_I), 0) / j.g_d.a_I << 16);
   }

   public final void method_a_Graphics_DirectGraphics_d_V(Graphics var1, DirectGraphics var2, d var3) {
      this.method_a_d_V(j.a_d);
      d.method_a_d_d_d_V(var3, j.a_d, d.a_d);
      int var4 = d.a_d.c_I >> 16;
      int var5 = d.a_d.f_I >> 16;
      o.method_b_I_I_I_I_V(var4, var5, this.a_S, this.c_I);
   }
}
