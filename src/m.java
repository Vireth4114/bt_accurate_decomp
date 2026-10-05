import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class m {
   public static final short[] a_ArrayS = new short[]{
      48,
      44,
      43,
      46,
      49,
      45,
      47,
      36,
      84,
      19,
      18,
      17,
      4,
      12,
      13,
      11,
      14,
      15,
      83,
      80,
      37,
      85,
      38,
      39,
      87,
      2,
      3,
      35,
      16,
      0,
      1,
      20,
      24,
      25,
      32,
      26,
      27,
      28,
      29,
      33,
      30,
      31,
      21,
      22,
      34,
      23,
      86,
      81,
      82,
      5,
      6,
      8,
      7,
      41,
      9,
      10,
      40,
      42,
      51,
      52,
      53,
      50,
      54,
      55,
      56,
      57,
      58,
      59,
      65,
      66,
      67,
      68,
      69,
      70,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      78,
      79,
      60,
      61,
      62,
      63,
      64,
      88,
      89,
      90
   };
   private static boolean e_Z = q.method_a_I_String(90).equals("1");
   private h a_h = null;
   private final h b_h = new h();
   private int i_I = 1;
   private static byte a_B;
   private static final byte[] a_ArrayB = new byte[]{10, 10, 10};
   private static final byte[] b_ArrayB = new byte[]{11, 11, 11};
   private static boolean f_Z;
   private static short[] c_ArrayS;
   public static Random a_Random;
   public static int a_I;
   private static int j_I;
   private static int k_I;
   private static int l_I;
   private static int m_I;
   private static int n_I;
   public static int b_I;
   public static int c_I;
   private static int o_I;
   private static float[] a_ArrayF;
   private static int[] c_ArrayI;
   private static int[] d_ArrayI;
   private static int p_I;
   private static short[] d_ArrayS;
   private static short[] e_ArrayS;
   private static short[] f_ArrayS;
   private static short[] g_ArrayS;
   private static short[] h_ArrayS;
   private static short[] i_ArrayS;
   private static short[] j_ArrayS;
   private static short[] k_ArrayS;
   private static short[] l_ArrayS;
   private static short[] m_ArrayS;
   private static short[] n_ArrayS;
   private static short[] o_ArrayS;
   private static short[] p_ArrayS;
   private static short[] q_ArrayS;
   private static short[] r_ArrayS;
   private static short[] s_ArrayS;
   private static short[] t_ArrayS;
   private static short[] u_ArrayS;
   private static short[] v_ArrayS;
   private static int q_I;
   private static int r_I;
   private static int s_I;
   private static int t_I;
   private static int u_I;
   private static int v_I;
   private static int w_I;
   public static final int d_I;
   private static int x_I;
   private static int y_I;
   public static short[] b_ArrayS;
   public static boolean a_Z;
   public static a a_a;
   private static String a_String;
   public static n a_n;
   public static n b_n;
   public static n c_n;
   public static n d_n;
   public static n e_n;
   public static n f_n;
   public static n g_n;
   public static n h_n;
   private static int[] e_ArrayI;
   private static int[] f_ArrayI;
   private static int[] g_ArrayI;
   private static int[] h_ArrayI;
   private static int[] i_ArrayI;
   private static int[] j_ArrayI;
   private static int[] k_ArrayI;
   private static int[] l_ArrayI;
   public static n i_n;
   private static int[] m_ArrayI;
   private static Image[] a_ArrayImage;
   private static Image[] b_ArrayImage;
   public static Image a_Image;
   public static Graphics a_Graphics;
   public static int[] a_ArrayI;
   public static Image b_Image;
   public static Graphics b_Graphics;
   public static int[] b_ArrayI;
   private static boolean g_Z;
   private static int z_I;
   private static int[] n_ArrayI;
   private static String[] a_ArrayString;
   private static boolean h_Z;
   private static boolean i_Z;
   private static int A_I;
   private int B_I = 0;
   private static boolean j_Z;
   private int C_I;
   private long a_J;
   private static final int[] o_ArrayI;
   private static final int[] p_ArrayI;
   private static final int[] q_ArrayI;
   private static final int[] r_ArrayI;
   private boolean k_Z = false;
   public static boolean b_Z;
   public static int e_I;
   private static int D_I;
   private static j[] b_Arrayj;
   public static j[] a_Arrayj;
   public static j a_j;
   private static int E_I;
   private static g[] a_Arrayg;
   public static c a_c;
   public static k a_k;
   public static boolean c_Z;
   public static int f_I;
   public static int g_I;
   public static int h_I;
   private static int F_I;
   public static boolean d_Z;
   private static int G_I;
   private static int[] s_ArrayI;
   private static int[] t_ArrayI;
   private static int[] u_ArrayI;
   private static int[] v_ArrayI;
   private static int[] w_ArrayI;
   private static short[] w_ArrayS;
   private static boolean l_Z;
   private static boolean m_Z;
   private static int H_I;
   private static int I_I;
   private boolean n_Z = false;
   private boolean o_Z = false;
   private boolean p_Z = false;
   private int J_I = -1;
   private int K_I = -1;
   private boolean q_Z = false;

   public static int method_a_I() {
      byte var0 = 0;
      if (method_a_I_Z(d_ArrayI[0]) || e_I == d_ArrayI[0] && g.a_ArrayI[2] > 0) {
         var0 = 1;
      }

      if (method_a_I_Z(d_ArrayI[1]) || e_I == d_ArrayI[1] && g.a_ArrayI[2] > 0) {
         var0 = 2;
      }

      return var0;
   }

   private static boolean method_b_I_Z(int var0) {
      return f_ArrayS[(var0 << 2) + 1] > 0;
   }

   public static boolean method_a_I_Z(int var0) {
      var0 <<= 2;
      return f_ArrayS[var0 + 1] > 0 && f_ArrayS[var0 + 1] < 9999;
   }

   private static void method_a_I_S_S_S_V(int var0, short var1, short var2, short var3) {
      var0 <<= 2;
      if (var1 > f_ArrayS[var0]) {
         f_ArrayS[var0] = var1;
      }

      if (var2 < f_ArrayS[var0 + 1]) {
         f_ArrayS[var0 + 1] = var2;
      }

      if (var3 > f_ArrayS[var0 + 2]) {
         f_ArrayS[var0 + 2] = var3;
      }

      if (var3 > f_ArrayS[var0 + 3]) {
         f_ArrayS[var0 + 3] = var3;
      }
   }

   private static void method_e_I_V(int var0) {
      if (f_ArrayS[(var0 << 2) + 1] == 0) {
         f_ArrayS[(var0 << 2) + 1] = 9999;
      }
   }

   private static void method_f_I_V(int var0) {
      var0 <<= 2;
      if (f_ArrayS[var0 + 1] == 0 || f_ArrayS[var0 + 1] == 9999) {
         f_ArrayS[var0 + 1] = 300;
      }
   }

   private static boolean method_c_I_Z(int var0) {
      for (byte var1 = 0; var1 < c_ArrayI.length; var1 += 2) {
         if (var0 == c_ArrayI[var1]) {
            return true;
         }
      }

      return false;
   }

   private static int method_c_I() {
      short var0 = 0;

      for (int var1 = 0; var1 < 15; var1++) {
         var0 += f_ArrayS[var1 << 2];
      }

      return var0;
   }

   private static boolean method_a_Z() {
      for (int var0 = 0; var0 < 15; var0++) {
         int var1 = var0 << 2;
         if (f_ArrayS[var1] < d_ArrayS[var0 * 3]) {
            return false;
         }

         if (f_ArrayS[var1 + 1] > e_ArrayS[var0 * 3]) {
            return false;
         }
      }

      return true;
   }

   private static final void method_a_V() {
      int var0 = 20520;
      int var1 = 0;
      int var2 = 0;

      while (var1 < 360) {
         int var3 = var2 / 57;
         var0 -= var3;
         var2 += var0 / 57;
         b_ArrayS[var1++] = (short)var3;
      }
   }

   private void method_g_I_V(int var1) {
      this.b_h.method_a_V();
      this.b_h.method_b_I_V(0);
      this.b_h.method_b_I_V(1);
      this.b_h.b_ArrayI = null;
      this.b_h.a_ArrayI = null;
      this.b_h.a_I = var1;
      this.b_h.method_a_I_I_V(9, -2);
      this.b_h.method_b_I_I_V(13, -2);
      switch (var1) {
         case 10:
            this.b_h.method_d_I_V(36);
            this.b_h.method_a_I_I_V(9, -3);
            this.b_h.method_b_I_I_V(13, -2);
            this.b_h.method_b_I_I_V(15, 2);
            this.b_h.method_b_I_I_V(16, 2);
            this.b_h.method_b_I_I_V(6, r_I);
            this.b_h.method_b_I_I_V(7, s_I);
            this.b_h.method_b_I_I_V(12, o.c_I - t_I);
            this.b_h.method_b_I_I_V(11, o.b_I - (u_I << 1) + 4);
            this.b_h.method_b_I_I_V(9, u_I - 2);
            this.b_h.method_a_I_I_V(3, 0);
            this.b_h.method_a_I_I_V(2, 32);
            this.b_h.method_b_I_I_V(14, o.method_a_I_I(-3) << 1);
            this.b_h.method_a_String_I_I_V(q.method_a_I_String(19), -1, 1);
            this.b_h.method_a_I_String_I_I_Z_V(1, q.method_a_I_String(43), 0, 17, true);
            boolean var8 = false;

            for (int var17 = 0; var17 < 15; var17++) {
               if (f_ArrayS[(var17 << 2) + 3] > 0) {
                  var8 = true;
               }
            }

            if (var8) {
               String[] var20 = new String[1];

               for (int var9 = 0; var9 < 15; var9++) {
                  String var4 = "0";
                  if (f_ArrayS[(var9 << 2) + 3] > 0) {
                     var4 = "" + f_ArrayS[(var9 << 2) + 3];
                  }

                  String var18;
                  if (method_c_I_Z(var9)) {
                     var20[0] = method_a_I_String(var9);
                     var18 = q.method_a_I_ArrayString_String(16, var20);
                  } else {
                     var20[0] = method_a_I_String(var9);
                     var18 = q.method_a_I_ArrayString_String(35, var20);
                  }

                  byte var5 = 89;
                  if (var9 == 0) {
                     var5 = -1;
                  }

                  this.b_h.method_a_f_V(new f(var18 + "\n" + var4, var5, this.b_h, -1));
               }
            } else {
               this.b_h.method_a_f_V(new f(q.method_a_I_String(4), -1, this.b_h, -1));
            }
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 19:
         case 21:
         case 23:
         case 26:
         case 27:
         default:
            break;
         case 17:
            this.b_h.method_d_I_V(37);
            this.b_h.method_a_I_I_V(9, -2);
            this.b_h.method_b_I_I_V(13, -2);
            this.b_h.method_a_I_I_V(5, 256);
            this.b_h.method_b_I_I_V(6, q_I);
            this.b_h.method_b_I_I_V(5, 128);
            this.b_h.method_a_I_I_V(18, 16742400);
            this.b_h.method_a_String_I_I_V("", -1, 1);
            this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(48), 0, -2, true);
            this.b_h.method_a_I_String_I_I_Z_V(1, q.method_a_I_String(44), 0, 9, false);
            if (method_b_I_Z(1)) {
               this.b_h.method_a_f_V(new f(q.method_a_I_String(17), -1, this.b_h, 18));
               this.b_h.method_a_f_V(new f(q.method_a_I_String(36), -1, this.b_h, 20));
            } else {
               this.b_h.method_a_f_V(new f(q.method_a_I_String(36), -1, this.b_h, 18));
               k_I = 0;
            }

            this.b_h.method_a_f_V(new f(q.method_a_I_String(19), -1, this.b_h, 10));
            this.b_h.method_a_f_V(new f(q.method_a_I_String(18), -1, this.b_h, 22));
            this.b_h.method_a_I_V(o_I);
            break;
         case 18:
            this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(48), 0, 7, true);
            this.b_h.method_a_I_String_I_I_Z_V(1, q.method_a_I_String(43), 0, 17, true);
            method_a_h_V(this.b_h);
            break;
         case 20:
            this.b_h.method_d_I_V(37);
            this.b_h.method_a_I_I_V(9, -3);
            this.b_h.method_b_I_I_V(13, -2);
            this.b_h.method_b_I_I_V(6, r_I);
            this.b_h.method_b_I_I_V(7, s_I);
            this.b_h.method_a_String_I_I_V(q.method_a_I_String(84), -1, 1);
            this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(49), 0, 11, false);
            this.b_h.method_a_I_String_I_I_Z_V(1, q.method_a_I_String(45), 0, 17, true);
            this.b_h.method_a_f_V(new f(q.method_a_I_String(2), -1, this.b_h, -1));
            break;
         case 22:
            this.b_h.method_d_I_V(36);
            this.b_h.method_a_I_I_V(9, -3);
            this.b_h.method_b_I_I_V(13, -2);
            this.b_h.method_b_I_I_V(15, 2);
            this.b_h.method_b_I_I_V(16, 2);
            this.b_h.method_b_I_I_V(6, r_I);
            this.b_h.method_b_I_I_V(7, s_I);
            this.b_h.method_b_I_I_V(12, o.c_I - t_I);
            this.b_h.method_b_I_I_V(11, o.b_I - (u_I << 1) + 4);
            this.b_h.method_b_I_I_V(9, u_I - 2);
            this.b_h.method_a_I_I_V(3, 0);
            this.b_h.method_a_I_I_V(2, 32);
            this.b_h.method_b_I_I_V(14, o.method_a_I_I(-3) << 1);
            this.b_h.method_a_String_I_I_V(q.method_a_I_String(18), -1, 1);
            this.b_h.method_a_I_String_I_I_Z_V(1, q.method_a_I_String(43), 0, 17, true);
            this.b_h.method_a_f_V(new f(q.method_a_I_String(12), -1, this.b_h, -1));
            this.b_h.method_a_f_V(new f(q.method_a_I_String(13), 102, this.b_h, -1));
            this.b_h.method_a_f_V(new f(q.method_a_I_String(11), -1, this.b_h, -1));
            this.b_h.method_a_f_V(new f(q.method_a_I_String(14), 371, this.b_h, -1));
            this.b_h.method_a_f_V(new f(q.method_a_I_String(15), 372, this.b_h, -1));
            break;
         case 24:
            this.b_h.method_a_String_I_I_V(q.method_a_I_String(80), -1, 1);
            this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(49), 0, 9, false);
            this.b_h.method_a_I_String_I_I_Z_V(1, q.method_a_I_String(45), 0, 17, true);
            break;
         case 25:
            this.b_h.method_d_I_V(37);
            this.b_h.method_a_I_I_V(9, -3);
            this.b_h.method_b_I_I_V(13, -2);
            this.b_h.method_a_I_I_V(5, 256);
            this.b_h.method_b_I_I_V(15, 2);
            this.b_h.method_b_I_I_V(16, 2);
            this.b_h.method_b_I_I_V(11, o.b_I - v_I + 4);
            this.b_h.method_b_I_I_V(12, o.b_I - v_I);
            this.b_h.method_b_I_I_V(4, 64);
            this.b_h.method_b_I_I_V(3, 32);
            this.b_h.method_b_I_I_V(5, 128);
            this.b_h.method_a_I_I_V(18, 16742400);
            this.b_h.method_b_I_I_V(2, 0);
            this.b_h.method_a_String_I_I_V(q.method_a_I_String(83), -1, 1);
            this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(48), 0, -2, true);
            this.b_h.method_a_I_String_I_I_Z_V(1, q.method_a_I_String(47), 0, 30, true);
            this.b_h.method_a_f_V(new f(q.method_a_I_String(38), -1, this.b_h, 8));
            this.b_h.method_a_f_V(new f(q.method_a_I_String(37), -1, this.b_h, 28));
            this.b_h.method_a_f_V(new f(q.method_a_I_String(39), -1, this.b_h, 29));
            this.b_h.method_a_I_V(o_I);
            break;
         case 28:
            this.b_h.method_d_I_V(37);
            this.b_h.method_a_I_I_V(9, -3);
            this.b_h.method_b_I_I_V(13, -2);
            this.b_h.method_a_I_I_V(5, 256);
            this.b_h.method_b_I_I_V(15, 2);
            this.b_h.method_b_I_I_V(16, 2);
            this.b_h.method_b_I_I_V(11, o.b_I - v_I + 4);
            this.b_h.method_b_I_I_V(12, o.c_I - v_I);
            this.b_h.method_b_I_I_V(4, 64);
            this.b_h.method_b_I_I_V(3, 32);
            this.b_h.method_b_I_I_V(2, 0);
            this.b_h.method_a_String_I_I_V(q.method_a_I_String(85), -1, 1);
            this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(49), 0, 37, false);
            this.b_h.method_a_I_String_I_I_Z_V(1, q.method_a_I_String(45), 0, 25, true);
            this.b_h.method_a_f_V(new f(q.method_a_I_String(3), -1, this.b_h, -1));
            break;
         case 29:
            this.b_h.method_d_I_V(37);
            this.b_h.method_a_I_I_V(9, -3);
            this.b_h.method_b_I_I_V(13, -2);
            A_I = 18;
            this.b_h.method_a_I_I_V(5, 256);
            this.b_h.method_b_I_I_V(15, 2);
            this.b_h.method_b_I_I_V(16, 2);
            this.b_h.method_b_I_I_V(11, o.b_I - v_I + 4);
            this.b_h.method_b_I_I_V(12, o.c_I - v_I);
            this.b_h.method_b_I_I_V(4, 64);
            this.b_h.method_b_I_I_V(3, 32);
            this.b_h.method_b_I_I_V(2, 0);
            this.b_h.method_a_String_I_I_V(q.method_a_I_String(87), -1, 1);
            this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(49), 0, 5, false);
            this.b_h.method_a_I_String_I_I_Z_V(1, q.method_a_I_String(45), 0, 25, true);
            this.b_h.method_a_f_V(new f(q.method_a_I_String(3), -1, this.b_h, -1));
            break;
         case 30:
            this.b_h.method_d_I_V(37);
            this.b_h.method_a_I_I_V(9, -3);
            this.b_h.method_b_I_I_V(13, -2);
            A_I = 17;
            this.b_h.method_a_I_I_V(5, 256);
            this.b_h.method_b_I_I_V(15, 2);
            this.b_h.method_b_I_I_V(16, 2);
            this.b_h.method_b_I_I_V(11, o.b_I - v_I + 4);
            this.b_h.method_b_I_I_V(12, o.c_I - v_I);
            this.b_h.method_b_I_I_V(4, 64);
            this.b_h.method_b_I_I_V(3, 32);
            this.b_h.method_b_I_I_V(2, 0);
            this.b_h.method_a_String_I_I_V(q.method_a_I_String(80), -1, 1);
            this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(49), 0, 5, false);
            this.b_h.method_a_I_String_I_I_Z_V(1, q.method_a_I_String(45), 0, 25, true);
            this.b_h.method_a_f_V(new f(q.method_a_I_String(3), -1, this.b_h, -1));
            break;
         case 31:
            this.b_h.method_d_I_V(36);
            this.b_h.method_a_I_I_V(9, -3);
            this.b_h.method_b_I_I_V(13, -2);
            this.b_h.method_b_I_I_V(6, r_I);
            this.b_h.method_b_I_I_V(7, s_I);
            this.b_h.method_b_I_I_V(15, 2);
            this.b_h.method_b_I_I_V(16, 2);
            this.b_h.method_b_I_I_V(12, o.c_I - t_I);
            this.b_h.method_b_I_I_V(11, o.b_I - (u_I << 1) + 4);
            this.b_h.method_b_I_I_V(9, u_I - 2);
            this.b_h.method_a_String_I_I_V(q.method_a_I_String(86), -1, 1);
            if (this.o_Z) {
               this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(46), 0, 33, true);
            } else if (this.n_Z) {
               this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(46), 0, 32, true);
            } else {
               this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(46), 0, 18, true);
            }

            String[] var6;
            (var6 = new String[1])[0] = "" + p_I;
            f var10 = new f(q.method_a_I_ArrayString_String(42, var6), -1, this.b_h, -1);
            this.b_h.method_a_f_V(var10);
            var6[0] = f_I + "/" + G_I;
            var10 = new f(var6[0], 102, this.b_h, -1);
            if (e_Z) {
               var10.method_a_I_I_V(2, 16);
               var10.method_a_String_I_V(var6[0], 102);
            }

            this.b_h.method_a_f_V(var10);
            var6[0] = method_b_I_String(a_I / 1000);
            var10 = new f(var6[0], 103, this.b_h, -1);
            if (e_Z) {
               var10.method_a_I_I_V(2, 16);
               var10.method_a_String_I_V(var6[0], 103);
            }

            this.b_h.method_a_f_V(var10);
            if (this.q_Z) {
               (var10 = new f(q.method_a_I_String(40), -1, this.b_h, -1)).method_a_I_I_V(1, 8);
               var10.method_a_String_I_V(q.method_a_I_String(40), -1);
               this.b_h.method_a_f_V(var10);
            }

            if (method_a_I_Z(13) && !this.n_Z && !method_c_I_Z(e_I)) {
               boolean var7 = false;
               if (this.J_I > -1) {
                  short var14 = c_ArrayS[this.J_I];
                  var7 = true;
                  f var3;
                  (var3 = new f(q.method_a_I_String(8), var14, this.b_h, -1)).method_a_I_I_V(2, 16);
                  var3.method_a_I_I_V(3, 64);
                  var3.method_a_I_I_V(1, 8);
                  var3.method_a_String_I_V(q.method_a_I_String(8), var14);
                  this.b_h.method_a_f_V(var3);
               }

               if (this.K_I > -1) {
                  short var15 = c_ArrayS[this.K_I];
                  var7 = true;
                  f var19;
                  (var19 = new f(q.method_a_I_String(7), var15, this.b_h, -1)).method_a_I_I_V(2, 16);
                  var19.method_a_I_I_V(3, 64);
                  var19.method_a_I_I_V(1, 8);
                  var19.method_a_String_I_V(q.method_a_I_String(7), var15);
                  this.b_h.method_a_f_V(var19);
               }

               if (!var7) {
                  (var10 = new f(q.method_a_I_String(41), -1, this.b_h, -1)).method_a_I_I_V(1, 8);
                  var10.method_a_String_I_V(q.method_a_I_String(41), -1);
                  this.b_h.method_a_f_V(var10);
               }
            }

            this.n_Z = false;
            this.o_Z = false;
            this.J_I = -1;
            this.K_I = -1;
            this.q_Z = false;
            method_a_h_Z_V(this.b_h, false);
            break;
         case 32:
            this.b_h.method_d_I_V(36);
            this.b_h.method_a_I_I_V(9, -3);
            this.b_h.method_b_I_I_V(13, -2);
            this.b_h.method_b_I_I_V(6, r_I);
            this.b_h.method_b_I_I_V(7, s_I);
            this.b_h.method_b_I_I_V(15, 2);
            this.b_h.method_b_I_I_V(16, 2);
            this.b_h.method_b_I_I_V(12, o.c_I - t_I);
            this.b_h.method_b_I_I_V(11, o.b_I - (u_I << 1) + 4);
            this.b_h.method_b_I_I_V(9, u_I - 2);
            this.b_h.method_a_String_I_I_V(q.method_a_I_String(81), -1, 1);
            this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(46), 0, 18, true);
            this.b_h.method_a_f_V(new f(q.method_a_I_String(5), -1, this.b_h, -1));
            break;
         case 33:
            this.b_h.method_d_I_V(36);
            this.b_h.method_a_I_I_V(9, -3);
            this.b_h.method_b_I_I_V(13, -2);
            this.b_h.method_b_I_I_V(6, r_I);
            this.b_h.method_b_I_I_V(7, s_I);
            this.b_h.method_b_I_I_V(15, 2);
            this.b_h.method_b_I_I_V(16, 2);
            this.b_h.method_b_I_I_V(12, o.c_I - t_I);
            this.b_h.method_b_I_I_V(11, o.b_I - (u_I << 1) + 4);
            this.b_h.method_b_I_I_V(9, u_I - 2);
            this.b_h.method_a_String_I_I_V(q.method_a_I_String(82), -1, 1);
            this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(46), 0, 18, true);
            this.b_h.method_a_f_V(new f(q.method_a_I_String(6), -1, this.b_h, -1));
            break;
         case 34:
            this.b_h.method_a_I_I_V(9, -1);
            this.b_h.method_b_I_I_V(13, -1);
            this.b_h.method_b_I_I_V(15, 2);
            this.b_h.method_b_I_I_V(16, 2);
            this.b_h.method_b_I_I_V(11, o.b_I - v_I + 4);
            this.b_h.method_b_I_I_V(12, o.c_I - v_I);
            this.b_h.method_b_I_I_V(4, 64);
            this.b_h.method_b_I_I_V(3, 32);
            this.b_h.method_b_I_I_V(2, 0);
            this.b_h.method_a_String_I_I_V("", -1, 1);
            this.b_h.method_a_I_String_I_I_Z_V(0, q.method_a_I_String(46), 0, 35, true);
            if (i_Z) {
               this.b_h.method_a_f_V(new f(a_String, -1, this.b_h, -1));
               i_Z = false;
            } else {
               String var2;
               if (a_ArrayString != null) {
                  var2 = q.method_a_I_ArrayString_String(n_ArrayI[0], a_ArrayString);
                  a_ArrayString = null;
               } else {
                  var2 = q.method_a_I_String(n_ArrayI[0]);
               }

               if (var2.endsWith("\n\n")) {
                  var2 = var2.substring(0, var2.length() - 2);
               } else if (var2.startsWith("\n\n")) {
                  var2 = var2.substring(2, var2.length());
               }

               a_String = var2;
               this.b_h.method_a_f_V(new f(var2, -1, this.b_h, -1));
            }
      }

      this.a_h = this.b_h;
      this.b_h.method_b_V();
      o.method_d_I_V(2);
      o.method_c_V();
   }

   private void method_b_V() {
      this.a_h = null;
      o.method_b_V();
      o.method_a_I_String_I_V(1, "", 1);
      o.method_d_I_V(2);
      o.method_c_V();
   }

   private static void method_a_h_Z_V(h var0, boolean var1) {
      boolean var2 = false;
      if (k_I != 14) {
         if (l_I < k_I) {
            var2 = true;
         }

         l_I = k_I++;
         if (m_I == 0 || var2) {
            m_I = 650;
         }

         n_I = 0;
         if (var1) {
            method_a_h_V(var0);
         }
      }
   }

   private static void method_a_h_V(h var0) {
      if (method_b_I_Z(k_I)) {
         var0.method_a_I_String_I_V(0, q.method_a_I_String(48), 0);
      } else {
         var0.method_a_I_String_I_V(0, null, 0);
      }
   }

   public static boolean method_a_h_I_I_I_I_I_Z(h var0, int var1, int var2, int var3, int var4, int var5) {
      o.method_b_Z_V(true);
      Graphics var6 = o.method_a_Graphics();
      int var7 = o.a_I * o.method_a_I();
      DirectGraphics var8 = null;
      var8 = DirectUtils.getDirectGraphics(var6);
      if ((var0.a_I == 34 || var0.a_I == 25 || var0.a_I == 28 || var0.a_I == 29 || var0.a_I == 30) && var1 == 1) {
         int[] var21 = p.a_ArrayI;
         int[] var43 = p.b_ArrayI;
         var21[0] = var2;
         var43[0] = var3;
         var21[1] = var2 + var4;
         var43[1] = var3;
         var21[2] = var2 + var4;
         var43[2] = var3 + var5;
         var21[3] = var2;
         var43[3] = var3 + var5;
         var8.fillPolygon(var21, 0, var43, 0, 4, 1426063360);
         o.method_a_I_I_I_V(var2, var3, 311);
         o.method_a_I_I_I_V(var2 + var4, var3, 312);
         o.method_a_I_I_I_V(var2, var3 + var5, 309);
         o.method_a_I_I_I_V(var2 + var4, var3 + var5, 310);
         method_a_DirectGraphics_V(var8);
         return false;
      }

      if (var0.a_I != 18) {
         if (var0.a_I != 25 && var0.a_I != 28 && var0.a_I != 29 && var0.a_I != 30 && var0.a_I != 15 && var0.a_I != 34 && var1 == 1) {
            method_a_Graphics_V(var6);
            var1 = o.b_I >> 1;
            int var42 = o.c_I >> 1;
            if (var0.a_I == 17) {
               int var15;
               var2 = (var15 = o.method_b_I_I_I(332, 0)) >> 16;
               short var25 = (short)var15;
               int var16;
               var4 = (var16 = o.method_b_I_I_I(332, 1)) >> 16;
               short var17 = (short)var16;
               var5 = var1 - 117;
               var7 = var42 - 157;
               int var47;
               var47 = (var47 = var1 + var4) - var5;
               var6.setColor(6570800);
               var6.fillRect(var1 + var2, var42 + var25, var4 - var2, var17 - var25);
               o.method_a_I_I_I_V(var1, var42, 332);
               var6.setColor(5580559);
               var6.drawRect(var5 + 2, var7 + 2, var47 - 4, 296);
               var6.drawRect(var5 + 3, var7 + 3, var47 - 6, 294);
               var6.setColor(3610889);
               var6.drawRect(var5, var7, var47, 300);
               var6.drawRect(var5 + 1, var7 + 1, var47 - 2, 298);
               o.method_a_I_I_I_I_I_V(var1 + var47 - 117 + 2, var42 - 157 - 2, 12, 24, 6);
               o.method_a_I_I_I_I_V(var1 + var47 - 117 + 2, var42 + 300 - 157 + 2, 12, 40);
               o.method_a_I_I_I_I_V(var1 - 117 - 5, var42 - 75, 15, 6);
               o.method_a_I_I_I_I_V(var1 - 117 - 5, var42 + 75, 15, 6);
            } else {
               method_a_I_I_Graphics_V(var1, var42, var6);
            }

            method_a_DirectGraphics_V(var8);
            return false;
         } else {
            if (var1 == 1) {
               method_a_DirectGraphics_V(var8);
            }

            if (var1 == 4) {
               return false;
            } else if (var1 == 2) {
               return false;
            } else if (var1 == 9) {
               return false;
            } else if (var0.a_I != 25 && var0.a_I != 28 && var0.a_I != 29 && var0.a_I != 30 && var0.a_I != 34 && var1 == 10) {
               var6.setClip(0, 0, o.b_I, o.c_I);
               var1 = b_ArrayS[(int)((System.currentTimeMillis() >> 1) % 360L)] * 5 / 360;
               o.method_a_I_I_I_I_V(var2 - 5 - 4 + var1, var3 + (var5 >> 1), 2, 10);
               o.method_a_I_I_I_I_V(var2 + var4 + 5 + 4 - var1, var3 + (var5 >> 1), 326, 6);
               return false;
            } else {
               return true;
            }
         }
      } else {
         if (var1 == 1) {
            method_a_Graphics_V(var6);
            var1 = o.b_I >> 1;
            int var9 = o.c_I >> 1;
            var2 = (short)o.method_b_I_I_I(331, 2) + var9;
            var3 = (short)o.method_b_I_I_I(331, 3) + var9;
            method_a_I_I_Graphics_V(var1, var9, var6);
            if (k_I != 0) {
               o.method_a_I_I_I_I_V(3, var9, 326, 6);
            }

            if (k_I != 14) {
               o.method_a_I_I_I_I_V(o.b_I - 3, var9, 2, 10);
            }

            var4 = 0;
            int var12 = 0;
            if (m_I < n_I) {
               if ((m_I += var7) > n_I) {
                  m_I = n_I;
               }

               var4 = k_I;
               var12 = l_I;
            } else if (m_I > n_I) {
               if ((m_I -= var7) < n_I) {
                  m_I = n_I;
               }

               var4 = l_I;
               var12 = k_I;
            }

            if (m_I > 400 && m_I < 650) {
               boolean var32 = false;
               int var14 = (m_I - 400 << 1) / 250;
               method_a_I_I_I_I_I_V(var1, var9, var4, var2, var3);
               o.method_b_I_I_I_I_V(var1, var9, 442, var14);
            } else if (m_I <= 400 && m_I > 0) {
               int var28 = 0;
               var28 = (boolean)0;
               int var35 = 0;
               int var10 = 0;
               var10 = (boolean)0;
               var28 = var1 - 119 - 239 + 22;
               var35 = var1 + 120 + -30;
               var10 = var1 - 119 + 22;
               int var11 = var35;
               int var37;
               var35 = (var37 = var35 - 25) - var28;
               var11 -= var10;
               var28 = m_I * var35 / 400 + var28;
               var35 = m_I * var11 / 400 + var10;
               var10 = var9 - 158 + -3;
               var6.setClip(0, 0, var28 + 3, o.c_I);
               method_a_I_I_I_I_I_V(var1, var9, var4, var2, var3);
               var6.setClip(var35 - 2, 0, o.b_I - var35 + 2, o.c_I);
               method_a_I_I_I_I_I_V(var1, var9, var12, var2, var3);
               var6.setClip(0, 0, o.b_I, o.c_I);
               o.method_a_I_I_I_V(var28, var10, 377);
               var6.setColor(15394508);
               int var13 = var35 - var28 - 12 - 13;
               var6.fillRect(var28 + 12, var10, var13, 295);
               var6.setColor(0);
               var6.fillRect(var28 + 12, var10, var13, 1);
               var6.fillRect(var28 + 12, var10 + 307 - 1 + -12, var13, 1);
               o.method_a_I_I_I_V(var28 + 12 + var13, var10, 378);
               o.method_a_I_I_I_V(var1, var9, 376);
            } else {
               method_a_I_I_I_I_I_V(var1, var9, k_I, var2, var3);
            }

            o.method_a_I_I_V(-3, 3);
            o.method_b_I_I_V(0, 16742400);
            o.method_b_I_I_V(1, 0);
            o.method_a_I_I_I_V(9, 9, 102);
            String var33;
            o.method_a_String_I_I_I_I_I_V(var33 = method_c_I() + "/" + 450, 0, var33.length(), 41, 10, 20);
            method_a_DirectGraphics_V(var8);
         }

         return false;
      }
   }

   private static void method_a_Graphics_V(Graphics var0) {
      var0.setColor(4135425);
      var0.fillRect(0, 0, o.b_I >> 1, o.c_I);
      var0.setColor(6170113);
      var0.fillRect(o.b_I >> 1, 0, o.b_I >> 1, o.c_I);
      o.method_a_I_I_I_V(0, 0, 4);
      o.method_a_I_I_I_V(0, 0, 74);
      o.method_a_I_I_I_V(0, 0, 75);
      o.method_a_I_I_I_V(0, o.c_I, 3);
   }

   private static int method_d_I_I(int var0) {
      byte var1 = -1;
      int var2 = var0 << 2;
      if (f_ArrayS[var2] >= d_ArrayS[var0 * 3]) {
         var1 = 2;
      } else if (f_ArrayS[var2] >= d_ArrayS[var0 * 3 + 1]) {
         var1 = 1;
      } else if (f_ArrayS[var2] >= d_ArrayS[var0 * 3 + 2]) {
         var1 = 0;
      }

      return var1;
   }

   private static int method_e_I_I(int var0) {
      byte var1 = -1;
      int var2 = var0 << 2;
      if (f_ArrayS[var2 + 1] <= e_ArrayS[var0 * 3]) {
         var1 = 2;
      } else if (f_ArrayS[var2 + 1] <= e_ArrayS[var0 * 3 + 1]) {
         var1 = 1;
      } else if (f_ArrayS[var2 + 1] <= e_ArrayS[var0 * 3 + 2]) {
         var1 = 0;
      }

      return var1;
   }

   private static void method_a_I_I_I_I_I_V(int var0, int var1, int var2, int var3, int var4) {
      int var5;
      if ((var5 = method_b_I_I(var2)) == 0) {
         o.method_a_I_I_I_V(var0, var1, 8);
      } else if (var5 == 2) {
         o.method_a_I_I_I_V(var0, var1, 380);
      }

      o.method_a_I_I_I_V(var0, var1, g_ArrayS[var2]);
      String[] var24 = new String[1];
      o.method_a_I_I_V(-3, 1);
      o.method_b_I_I_V(0, 0);
      if (!method_b_I_Z(var2)) {
         o.method_a_I_I_I_V(var0, var1, 149);
         if (method_c_I_Z(var2)) {
            int var6 = 0;

            for (byte var7 = 0; var7 < c_ArrayI.length; var7 += 2) {
               if (var2 == c_ArrayI[var7]) {
                  var6 = c_ArrayI[var7 + 1];
               }
            }

            var24[0] = "" + var6;
            String var13 = q.method_a_I_ArrayString_String(0, var24);
            int var9 = o.method_a_I_String_I_I_I(-3, var13, 0, var13.length()) + 23 + 5;
            int var8;
            var6 = (var8 = (o.b_I >> 1) - (var9 >> 1)) + var9;
            if (e_Z) {
               o.method_a_I_I_I_I_V(var6, var4, 102, 24);
               o.method_a_String_I_I_I_I_I_V(var13, 0, var13.length(), var8, var4, 20);
            } else {
               o.method_a_I_I_I_I_V(var8, var4, 102, 20);
               o.method_a_String_I_I_I_I_I_V(var13, 0, var13.length(), var8 + 23 + 5, var4, 20);
            }
         }
      } else {
         int var26 = o.method_a_I_I(-3) + 1;
         int var27 = o.method_a_I_I(-3) + 23 + 3;
         var24[0] = "9999";
         String var14 = q.method_a_I_ArrayString_String(42, var24);
         int var28 = o.method_a_I_String_I_I_I(-3, var14, 0, var14.length());
         var24[0] = Integer.toString(0);
         int var30 = var2 << 2;
         if (f_ArrayS[var30 + 2] > 0) {
            var24[0] = "" + f_ArrayS[var30 + 2];
         }

         var28 = (o.b_I >> 1) - (var28 >> 1) - 6;
         String var15 = "00/00";
         int var10 = o.method_a_I_String_I_I_I(-3, var15, 0, var15.length()) + 23 + 11;
         String var16 = q.method_a_I_ArrayString_String(42, var24);
         if (e_Z) {
            o.method_a_String_I_I_I_I_I_V(var16, 0, var16.length(), var28 + var10 + 23, var4, 24);
         } else {
            o.method_a_String_I_I_I_I_I_V(var16, 0, var16.length(), var28, var4, 20);
         }

         if (!method_c_I_Z(var2)) {
            var24[0] = "" + f_ArrayS[var30] + "/" + 30;
            String var17 = var24[0];
            if (e_Z) {
               o.method_a_I_I_I_I_V(var28 + var10, var4 + var26, 102, 20);
               o.method_a_String_I_I_I_I_I_V(var17, 0, var17.length(), var28 - 11 + var10, var4 + var26 + 11, 10);
            } else {
               o.method_a_I_I_I_I_V(var28, var4 + var26, 102, 20);
               o.method_a_String_I_I_I_I_I_V(var17, 0, var17.length(), var28 + 23 + 11, var4 + var26 + 11, 6);
            }
         }

         if (method_a_I_Z(13) && !method_c_I_Z(var2)) {
            int var11;
            if ((var11 = method_d_I_I(var2)) > -1) {
               var11 = c_ArrayS[var11];
            }

            int var12;
            if ((var12 = method_e_I_I(var2)) > -1) {
               var12 = c_ArrayS[var12];
            }

            var24[0] = method_b_I_String(f_ArrayS[var30 + 1]);
            String var18 = var24[0];
            if (e_Z) {
               o.method_a_I_I_I_I_V(var28 + var10, var4 + var27, 103, 20);
               o.method_a_String_I_I_I_I_I_V(var18, 0, var18.length(), var28 - 11 + var10, var4 + var27 + 11, 10);
            } else {
               o.method_a_I_I_I_I_V(var28, var4 + var27, 103, 20);
               o.method_a_String_I_I_I_I_I_V(var18, 0, var18.length(), var28 + 23 + 11, var4 + var27 + 11, 6);
            }

            String var19 = "00:00";
            var1 = o.method_a_I_String_I_I_I(-3, var19, 0, var19.length()) + 23 + 11;
            if (e_Z) {
               if (var11 > -1) {
                  o.method_a_I_I_I_I_V(var28, var4 + var26, var11, 24);
               }

               if (var12 > -1) {
                  o.method_a_I_I_I_I_V(var28, var4 + var27, var12, 12);
               }
            } else {
               if (var11 > -1) {
                  o.method_a_I_I_I_I_V(var28 + var1 + 11, var4 + var26, var11, 20);
               }

               if (var12 > -1) {
                  o.method_a_I_I_I_I_V(var28 + var1 + 11, var4 + var27, var12, 20);
               }
            }
         }
      }

      o.method_a_I_I_V(-2, 3);
      o.method_b_I_I_V(0, 16742400);
      o.method_b_I_I_V(1, 0);
      if (method_c_I_Z(var2)) {
         var24[0] = method_a_I_String(var2);
         String var21;
         o.method_a_String_I_I_I_I_I_V(var21 = q.method_a_I_ArrayString_String(16, var24), 0, var21.length(), var0, var3 - o.method_a_I_I(o.method_f_I()), 33);
      } else {
         var24[0] = method_a_I_String(var2);
         String var22;
         o.method_a_String_I_I_I_I_I_V(var22 = q.method_a_I_ArrayString_String(35, var24), 0, var22.length(), var0, var3 - o.method_a_I_I(o.method_f_I()), 33);
      }

      String var23;
      o.method_a_String_I_I_I_I_I_V(var23 = q.method_a_I_String(h_ArrayS[var2]), 0, var23.length(), var0, var3, 33);
   }

   private static String method_a_I_String(int var0) {
      int var1 = 0;

      for (byte var2 = 0; var2 < c_ArrayI.length && var0 >= c_ArrayI[var2]; var2 += 2) {
         var1++;
      }

      return method_c_I_Z(var0) ? "" + var1 : "" + (var0 + 1 - var1);
   }

   private static void method_a_I_I_Graphics_V(int var0, int var1, Graphics var2) {
      o.method_a_I_I_I_V(var0, var1, 331);
      int var3;
      int var4 = (var3 = o.method_b_I_I_I(331, 0)) >> 16;
      short var5 = (short)var3;
      int var6 = (var3 = o.method_b_I_I_I(331, 1)) >> 16;
      short var8 = (short)var3;
      var2.setColor(16512995);
      var2.fillRect(var0 + var6, var1 + var8, var4 - var6, var5 - var8);
      var2.setColor(0);
      var2.fillRect(var0 + var6 - 2, var1 + var8, 4, var5 - var8);
   }

   public static final void method_a_I_V(int var0) {
      if (z_I < 5) {
         n_ArrayI[z_I] = var0;
         z_I++;
      }
   }

   private void method_c_V() {
      if (!g_Z && z_I > 0) {
         this.method_g_I_V(34);
         h_Z = true;
         g_Z = true;

         for (int var1 = 0; var1 < 4; var1++) {
            n_ArrayI[var1] = n_ArrayI[var1 + 1];
         }

         z_I--;
      }
   }

   public final void method_b_I_V(int var1) {
      if (this.a_h != null) {
         h var4 = this.a_h;
         int var3 = var1;
         if (var4.a_I == 18) {
            if (f_Z) {
               if (a_ArrayB[a_B] == var3) {
                  if (++a_B == a_ArrayB.length) {
                     for (int var6 = 0; var6 < 15; var6++) {
                        method_f_I_V(var6);
                     }

                     a_B = 0;
                     method_a_h_V(var4);
                     method_d_V();
                  }
               } else if (b_ArrayB[a_B] != var3) {
                  a_B = 0;
               } else if (++a_B == b_ArrayB.length) {
                  for (int var5 = 0; var5 < 15; var5++) {
                     method_f_I_V(var5);
                     method_a_I_S_S_S_V(var5, (short)30, (short)1, (short)9999);
                  }

                  a_B = 0;
                  method_a_h_V(var4);
                  method_d_V();
               }
            }

            switch (var3) {
               case 3:
                  h var7 = var4;
                  boolean var8 = false;
                  if (k_I != 0) {
                     if (l_I > k_I) {
                        var8 = true;
                     }

                     l_I = k_I--;
                     if (m_I == 650 || var8) {
                        m_I = 0;
                     }

                     n_I = 650;
                     method_a_h_V(var7);
                  }
                  break;
               case 4:
                  method_a_h_Z_V(var4, true);
            }
         }

         boolean var10000 = false;
         this.a_h.method_c_I_V(var1);
      } else if (this.i_I == 2) {
         this.method_e_V();
      } else {
         if (this.i_I != 3 && this.i_I == 4) {
            int var2 = var1;
            if (f_Z) {
               if (a_ArrayB[a_B] == var2 && (g.a_ArrayI[1] == 0 || g.a_ArrayI[1] == 1)) {
                  if (++a_B == a_ArrayB.length) {
                     g.a_ArrayI[0] = 2;
                     a_B = 0;
                     f_I = 30;
                  }
               } else {
                  a_B = 0;
               }
            }

            switch (var2) {
               case 5:
                  b_Z = true;
                  return;
               case 20:
                  if (g.a_ArrayI[1] == 0 && g.a_ArrayI[0] != 3) {
                     a_c.method_f_V();
                  }
            }
         }
      }
   }

   public final int method_a_I_I(int var1) {
      if (this.a_h != null) {
         this.a_h.method_b_V();
         this.a_h.method_c_V();
      } else {
         if (this.i_I == 2) {
            return 0;
         }

         if (this.i_I == 4) {
            this = this;
            if (b_Z) {
               this.method_g_I_V(25);
               o.method_d_V();
               return 0;
            }

            if (i_Z) {
               this.method_g_I_V(34);
               h_Z = true;
               g_Z = true;
               return 0;
            }

            j_I = j_I + o.a_I;
            a_Z = false;
            if (g.a_ArrayI[0] == 0) {
               a_c.b_B = 0;
               if (g.a_ArrayI[1] != 3) {
                  a_I = a_I + o.a_I;
               }

               if (g.a_ArrayI[1] != 0) {
                  if (g.a_ArrayI[1] == 1) {
                     if (o.method_a_I_Z(1)) {
                        a_k.method_c_V();
                     }

                     if (o.method_a_I_Z(2)) {
                        a_k.method_e_V();
                     }

                     if (o.method_a_I_Z(15) || o.method_a_I_Z(7)) {
                        a_k.method_f_V();
                     }
                  }
               } else {
                  boolean var11 = false;
                  if (o.method_a_I_Z(3)) {
                     a_c.method_b_V();
                     var11 = true;
                  }

                  if (o.method_a_I_Z(4)) {
                     a_c.method_c_V();
                     var11 = true;
                  }

                  if (o.method_a_I_Z(15) || o.method_a_I_Z(12) || o.method_a_I_Z(1) || o.method_a_I_Z(7)) {
                     a_c.method_a_Z_V(false);
                     var11 = true;
                  }

                  if (var11) {
                     if (c.c_I != 1) {
                        c.c_I = 0;
                     }

                     c.b_I = 3000;
                  }
               }

               var1 = g.a_ArrayI[4];
               method_i_V();
               if (g.a_ArrayI[4] == 0 && var1 != 0) {
                  a_c.method_g_V();
               }

               if (a_c.c_d.f_I < a_j.j_I && g.a_ArrayI[0] == 0) {
                  g.a_ArrayI[0] = 1;
               }

               if (f_I == G_I && method_c_I_Z(e_I)) {
                  g.a_ArrayI[0] = 2;
               }

               g.a_ArrayI[4] = (int)a_c.c_F;
               g.a_ArrayI[5] = (int)a_c.a_F;
               g.a_ArrayI[6] = (int)a_c.b_F;
               g.a_ArrayI[3] = a_c.d_I;
               var1 = o.a_I;
               if (H_I > 0) {
                  H_I -= var1;
                  if ((I_I -= var1) <= 0) {
                     I_I = Math.abs(a_Random.nextInt() % 200 + 300);
                     l_Z = true;
                  }

                  if (H_I <= 0) {
                     H_I = 0;
                     I_I = 0;
                     l_Z = false;
                     m_Z = !m_Z;
                  }

                  for (int var2 = 0; var2 < u_ArrayS.length; var2++) {
                     if (o.method_a_I_Image(u_ArrayS[var2]) != null) {
                        if (m_Z && !l_Z || !m_Z && l_Z) {
                           if (b_ArrayImage[var2] != null) {
                              o.method_a_I_Image_V(u_ArrayS[var2], b_ArrayImage[var2]);
                           }
                        } else if (a_ArrayImage[var2] != null) {
                           o.method_a_I_Image_V(u_ArrayS[var2], a_ArrayImage[var2]);
                        }
                     }
                  }
               }
            } else if (g.a_ArrayI[0] == 1) {
               o.method_c_I_I_V(33, 1);
               g.a_ArrayI[0] = 3;
               b_I = 3000;
               c_I = a_c.c_d.f_I;
               if (e_I == 13) {
                  g.a_I = 0;
               }
            } else if (g.a_ArrayI[0] == 2) {
               o.method_c_I_I_V(34, 1);
               g.a_ArrayI[0] = 4;
               b_I = 3000;
               a_c.method_g_V();
               if (method_c_I_Z(e_I)) {
                  a_c.a_Z = false;
               }

               a_n.method_a_I_I_I_I_I_I_I_V(20, a_c.c_d.c_I, a_c.c_d.f_I, 740, 0, 1840, 230);
            } else if (g.a_ArrayI[0] == 3) {
               b_I = b_I - o.a_I;
               a_c.method_e_V();
               if (b_I <= 0) {
                  a_c.method_a_I_I_V(g_I, h_I);
                  c_Z = true;
                  g.a_ArrayI[0] = 0;
                  a_c.a_I = -16777216;
                  o.method_c_I_I_V(method_d_I(), -1);
               }
            } else if (g.a_ArrayI[0] == 4) {
               b_I = b_I - o.a_I;
               a_c.method_a_Z_V(true);
               method_i_V();
               if (b_I <= 0) {
                  m var14 = this;
                  int var15 = method_e_I_I(e_I);
                  int var3 = method_d_I_I(e_I);
                  short var4 = f_ArrayS[(e_I << 2) + 3];
                  boolean var5 = method_a_I_Z(13);
                  boolean var6 = method_a_Z();
                  short var7;
                  if ((var7 = (short)(a_I / 1000)) < 1) {
                     var7 = 1;
                  }

                  int var8;
                  if ((var8 = (int)(f_I * 10000 * a_ArrayF[e_I] / var7)) > 32767) {
                     var8 = 32767;
                  }

                  p_I = (short)var8;
                  method_a_I_S_S_S_V(e_I, (short)f_I, (short)var7, (short)p_I);
                  if (!method_c_I_Z(e_I)) {
                     if (method_c_I_Z(var7 = e_I + 1)) {
                        var7++;
                     }

                     if (var7 <= 14 && !method_b_I_Z(var7)) {
                        method_e_I_V(var7);
                     }
                  }

                  var7 = 0;

                  for (byte var19 = 0; var19 < c_ArrayI.length; var19 += 2) {
                     int var9;
                     if (method_c_I() >= c_ArrayI[var19 + 1] && !method_b_I_Z(var9 = c_ArrayI[var19])) {
                        method_e_I_V(var9);
                        var7 = (var19 >> 1) + 1;
                     }
                  }

                  if (!var5 && method_a_I_Z(13)) {
                     var14.n_Z = true;
                  }

                  if (!var6 && method_a_Z()) {
                     var14.o_Z = true;
                  }

                  if ((var8 = method_e_I_I(e_I)) > var15) {
                     var14.J_I = var8;
                  }

                  int var21;
                  if ((var21 = method_d_I_I(e_I)) > var3) {
                     var14.K_I = var21;
                  }

                  short var16;
                  if ((var16 = f_ArrayS[(e_I << 2) + 3]) > var4) {
                     var14.q_Z = true;
                  }

                  method_d_V();
                  if (var7 > 0) {
                     var14.p_Z = true;
                     a_ArrayString = new String[]{"" + var7};
                     method_a_I_V(1);
                  } else {
                     var14.method_j_V();
                  }
               }
            }

            this.method_c_V();
            return 0;
         }
      }

      return 0;
   }

   public final int method_a_I_I_I(int var1, int var2) {
      Graphics var20 = o.method_a_Graphics();
      if (this.i_I == 2) {
         if (this.C_I < 0) {
            Graphics var34 = var20;
            this.method_b_Graphics_V(var34);
            this.method_e_V();
         } else {
            Graphics var35 = var20;
            m var29 = this;
            var35.setColor(r_ArrayI[var29.C_I]);
            var35.fillRect(0, 0, o.b_I, o.c_I);
            var1 = p_ArrayI[var29.C_I];
            o.method_a_I_I_I_V(
               (o.b_I - o.method_a_I_I_I(var1, 0)) / 2 + o.method_a_I_I_I(var1, 2), (o.c_I - o.method_a_I_I_I(var1, 1)) / 2 + o.method_a_I_I_I(var1, 3), var1
            );
            if (System.currentTimeMillis() - this.a_J > q_ArrayI[this.C_I]) {
               this.method_e_V();
            }
         }

         return 0;
      } else {
         if (var2 == 1) {
            if (this.i_I == 4) {
               o.method_b_Z_V(true);
               Graphics var21 = o.method_a_Graphics();
               DirectGraphics var31 = null;
               var31 = DirectUtils.getDirectGraphics(var21);
               var21.setClip(0, 0, x_I, y_I);
               Graphics var3 = var21;
               int var4 = method_b_I_I(e_I);
               short[] var5 = i_ArrayS;
               short[] var6 = j_ArrayS;
               short[] var7 = k_ArrayS;
               short[] var8 = l_ArrayS;
               int var9 = 5413606;
               int var10 = 7460351;
               if (var4 == 1) {
                  var5 = m_ArrayS;
                  var6 = n_ArrayS;
                  var7 = o_ArrayS;
                  var8 = p_ArrayS;
                  var9 = 7263689;
                  var10 = 10485759;
               } else if (var4 == 2) {
                  var5 = q_ArrayS;
                  var6 = r_ArrayS;
                  var7 = s_ArrayS;
                  var8 = t_ArrayS;
                  var9 = 7737588;
                  var10 = 131610;
               }

               if (method_c_I_Z(e_I)) {
                  var9 = 11796669;
                  var10 = 16616467;
               }

               int var10006 = o.c_I / 40;
               Graphics var14 = var3;
               int var13 = var10006;
               int var12 = o.c_I;
               int var11 = o.b_I;
               boolean var37 = false;
               boolean var38 = false;
               var10 = var10;
               int var39 = var9;
               int var15 = var9 >> 16 & 0xFF;
               int var16 = var39 >> 8 & 0xFF;
               var9 = var39 & 0xFF;
               int var17 = var10 >> 16 & 0xFF;
               int var18 = var10 >> 8 & 0xFF;
               var10 &= 255;
               int var19 = 65536 / var12;
               var17 = (var17 - var15) * var19 * var13;
               var18 = (var18 - var16) * var19 * var13;
               var10 = (var10 - var9) * var19 * var13;
               var15 <<= 16;
               var16 <<= 16;
               var9 <<= 16;

               for (int var49 = 0; var49 < var12; var49 += var13) {
                  method_a_I_Graphics_V((var15 >> 16 << 16) + (var16 >> 16 << 8) + (var9 >> 16), var14);
                  var14.fillRect(0, var49 + 0, var11, var13);
                  var15 += var17;
                  var16 += var18;
                  var9 += var10;
               }

               a_Random.setSeed(e_I + 1);
               if (var4 == 2) {
                  method_a_ArrayS_I_I_I_I_I_I_I_I_Graphics_V(var8, 5, 100, 600, 100, -80, 50, 2, -1, var3);
                  method_a_ArrayS_I_I_I_I_I_I_I_I_Graphics_V(var7, 20, 100, o.method_a_I_I_I(var7[0], 0), 0, -50, 0, 3, 1380668, var3);
                  method_a_ArrayS_I_I_I_I_I_I_I_I_Graphics_V(var6, 50, 100, o.method_a_I_I_I(var6[0], 0), 0, -30, 0, 3, 131610, var3);
               } else {
                  method_a_ArrayS_I_I_I_I_I_I_I_I_Graphics_V(var7, 20, 100, 200, 140, -200, 200, 5, -1, var3);
                  method_a_ArrayS_I_I_I_I_I_I_I_I_Graphics_V(var6, 50, 100, 100, 70, -70, 300, 5, -1, var3);
                  method_a_ArrayS_I_I_I_I_I_I_I_I_Graphics_V(var5, 80, 100, 150, 100, -70, 300, 5, -1, var3);
               }

               a_Random.setSeed(System.currentTimeMillis());
               j.method_a_j_Graphics_DirectGraphics_V(a_j, var21, var31);
               var21.setClip(0, 0, o.b_I, o.c_I);
               o.method_a_I_I_V(-3, 1);
               o.method_b_I_I_V(0, 0);
               o.method_a_I_I_I_V(0, 0, 102);
               int var22 = 0;
               o.method_a_I_I_I_V(var22 = 32 + method_a_I_I_I_I_Z_I(32, 7, f_I, 4, false), 7, 101);
               var22 += 9;
               method_a_I_I_I_I_Z_I(var22, 7, G_I, 4, false);
               o.method_a_I_I_I_V(o.b_I, 0, 103);
               int var33 = (var22 = a_I / 1000) / 60;
               int var36 = var22 % 60;
               int var27;
               o.method_a_I_I_I_I_V(var27 = (var22 = o.b_I - 25 - 6 - 1) - method_a_I_I_I_I_Z_I(var22, 7, var36, 8, true), 7, 100, 24);
               var22 = var27 - 5;
               method_a_I_I_I_I_Z_I(var22, 7, var33, 8, false);
               l_Z = false;
               boolean var50 = false;
            }

            if (this.a_h != null) {
               this.a_h.method_d_V();
            }
         } else if (var2 == 2) {
            this.method_b_Graphics_V(var20);
         }

         return 0;
      }
   }

   public static void method_a_String_I_I_I_I_V(String var0, int var1, int var2, int var3, int var4) {
      if (var1 == 1) {
         o.method_a_I_I_I_I_V(var2, var3, (var4 | 16) == 16 ? 151 : 150, var4);
      } else {
         o.method_a_I_I_V(-3, 3);
         o.method_b_I_I_V(0, 16742400);
         o.method_b_I_I_V(1, 0);
         o.method_a_String_I_I_I_I_I_V(var0, 0, var0.length(), var2, var3, var4);
      }
   }

   public static int method_b_I() {
      return o.method_a_I_I(-3) + 4;
   }

   public final void method_c_I_V(int var1) {
      if (var1 == 1) {
         o.method_e_I_V(9);
         o.method_e_I_V(14);
         o.method_e_I_V(15);
         o.method_e_I_V(37);
         o.method_e_I_V(36);
         o.method_e_I_V(-1);
         o.method_e_I_V(-2);
         o.method_e_I_V(-3);
         o.method_a_I_V(0);
      }

      if (var1 == 3 && this.i_I == 4) {
         b_Z = true;
         if (g_Z) {
            i_Z = true;
            g_Z = false;
            this.method_b_V();
            return;
         }

         if (!i_Z) {
            a_String = null;
         }
      }
   }

   public final int method_b_I_I_I(int var1, int var2) {
      if (var1 != 17 && var1 != 25) {
         o_I = 0;
      }

      switch (var1) {
         case 0:
            o.method_a_I_V(2);
            return 0;
         case 1:
            if (var2 >= 0 && var2 < o_ArrayI.length) {
               if (var2 == 0) {
                  this.C_I = -1;
                  this.i_I = 2;
               }

               o.method_e_I_V(o_ArrayI[var2]);
               return var2 + 1;
            } else {
               if (var2 == o_ArrayI.length) {
                  method_f_V();
                  if (o.method_c_Z()) {
                     o.method_g_I_V(0);
                  }

                  byte[] var14 = o.method_a_String_ArrayB("game");
                  var2 = 0;
                  if (var14 != null) {
                     for (int var31 = 0; var31 < f_ArrayS.length; var31++) {
                        f_ArrayS[var31] = (short)((var14[var2++] & 255) << 8 | var14[var2++] & 0xFF);
                     }

                     if (!method_a_I_Z(13)) {
                        for (int var32 = 14; var32 >= 0; var32--) {
                           if (method_b_I_Z(var32) && !method_c_I_Z(var32)) {
                              k_I = var32;
                              break;
                           }
                        }
                     }
                  } else {
                     for (int var33 = 0; var33 < f_ArrayS.length; var33++) {
                        f_ArrayS[var33] = 0;
                     }

                     method_e_I_V(0);
                  }

                  return 0;
               }

               return 0;
            }
         case 2:
            if (var2 == 0) {
               return 1;
            } else if (var2 == 1) {
               return 2;
            } else {
               if (var2 != 2) {
                  return 0;
               }

               if (this.a_h != null && this.a_h.a_I != 14) {
                  this.method_g_I_V(19);
               } else {
                  o.method_a_Z_V(true);
                  o.method_a_I_V(1);
               }

               return 0;
            }
         case 3:
         case 4:
         case 7:
         case 8:
         case 9:
         case 10:
         case 12:
         case 13:
         case 14:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 23:
         case 24:
         case 25:
         case 26:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         default:
            return 0;
         case 5:
            if (var2 == 0) {
               o.method_d_V();
               method_f_V();
               return 1;
            } else {
               if (var2 == 1) {
                  this.i_I = 3;
                  this.method_g_I_V(A_I);
                  o.method_c_I_I_V(28, -1);
                  return 0;
               }

               return 0;
            }
         case 6:
         case 15:
            if (var2 == 0) {
               o.method_d_V();
               o.method_f_I_V(10);
               o.method_f_I_V(13);
               o.method_e_I_V(v_ArrayS[e_I]);
               o.method_e_I_V(v_ArrayS[15]);
               o.method_e_I_V(2);
               o.method_e_I_V(1);
               o.method_e_I_V(6);
               o.method_e_I_V(5);
               o.method_e_I_V(24);
               o.method_e_I_V(0);
               o.method_e_I_V(3);
               o.method_e_I_V(26);
               o.method_e_I_V(20);
               o.method_e_I_V(19);
               o.method_e_I_V(16);
               o.method_e_I_V(25);
               o.method_e_I_V(27);
               o.method_e_I_V(21);
               o.method_e_I_V(23);
               o.method_e_I_V(22);
               if ((var1 = method_b_I_I(e_I)) == 0) {
                  o.method_e_I_V(12);
                  o.method_e_I_V(17);
                  o.method_e_I_V(18);
               }

               if (var1 == 1) {
                  o.method_e_I_V(11);
                  o.method_e_I_V(17);
                  o.method_e_I_V(18);
               }

               if (var1 == 2) {
                  o.method_e_I_V(8);
                  o.method_e_I_V(4);
                  o.method_e_I_V(17);
               }

               a_Graphics = (a_Image = Image.createImage(c.b_ArrayI[0] * 3, c.b_ArrayI[0] * 3)).getGraphics();
               a_ArrayI = new int[a_Image.getWidth() * a_Image.getHeight()];
               b_Graphics = (b_Image = Image.createImage(112, 26)).getGraphics();
               b_ArrayI = new int[b_Image.getWidth() * b_Image.getHeight()];
               return 1;
            } else {
               if (var2 != 1) {
                  return 0;
               }

               if (!this.k_Z) {
                  this.k_Z = true;
                  b_Z = false;
                  o.method_b_I_V(2);
                  o.method_c_I_V(150 / o.method_a_I());
                  d_Z = method_a_Z();
                  j.p_I = 90;
                  j.q_I = 140;
                  a_I = 0;
                  j_I = 0;
                  f_I = 0;
                  p_I = 0;
                  g_Z = false;
                  a_Z = false;
                  h_Z = false;
                  j.g_d.c_I = o.b_I << 15;
                  j.g_d.f_I = o.c_I << 15;
                  byte[] var15 = (byte[])o.method_a_I_Object(v_ArrayS[15]);
                  int var3 = 8;
                  a_Arrayj = new j[j.method_a_ArrayB_I_S(var15, 8)];
                  var3 += 6;
                  var3++;
                  int var10 = var15[14];
                  short var4 = 0;
                  int var5 = 0;

                  while (var10 != 127) {
                     short var6 = j.method_a_ArrayB_I_S(var15, var3);
                     var3 += 2;
                     switch (var10) {
                        case 4:
                           p var11;
                           (var11 = new p()).method_a_S_V(var4);
                           var11.method_a_ArrayB_I_I(var15, var3);
                           if (var11.a_I > var5) {
                              var5 = var11.a_I;
                           }

                           a_Arrayj[var4++] = var11;
                        default:
                           var3 += var6;
                           var10 = var15[var3++];
                     }
                  }

                  var10 = var5;
                  byte[] var16;
                  if ((var16 = (byte[])o.method_a_I_Object(v_ArrayS[e_I])) != null) {
                     int var25 = 8;
                     b_Arrayj = new j[D_I = j.method_a_ArrayB_I_S(var16, 8)];
                     a_Arrayg = new g[E_I = j.method_a_ArrayB_I_S(var16, 12)];
                     var25 += 6;
                     var25++;
                     byte var34 = var16[14];
                     short var43 = 0;
                     int var53 = 0;

                     for (G_I = 0; var34 != 127; var34 = var16[var25++]) {
                        short var7 = j.method_a_ArrayB_I_S(var16, var25);
                        var25 += 2;
                        switch (var34) {
                           case 4:
                              p var41;
                              (var41 = new p()).method_a_S_V(var43);
                              var41.method_a_ArrayB_I_I(var16, var25);
                              if (var41.a_I > var10) {
                                 var10 = var41.a_I;
                              }

                              b_Arrayj[var43++] = var41;
                              break;
                           case 5:
                           case 7:
                           default:
                              b_Arrayj[var43] = new j();
                              b_Arrayj[var43].method_a_S_V(var43);
                              b_Arrayj[var43++].method_a_ArrayB_I_I(var16, var25);
                              break;
                           case 6:
                              g var8;
                              (var8 = new g()).method_a_S_V(var43);
                              var8.method_a_ArrayB_I_I(var16, var25);
                              b_Arrayj[var43++] = var8;
                              a_Arrayg[var53++] = var8;
                              break;
                           case 8:
                              (a_c = new c(true)).method_a_S_V(var43);
                              a_c.method_a_ArrayB_I_I(var16, var25);
                              a_c.method_a_V();
                              b_Arrayj[var43++] = a_c;
                              g_I = a_c.c_d.c_I;
                              h_I = a_c.c_d.f_I;
                              break;
                           case 9:
                              b_Arrayj[var43] = new r();
                              b_Arrayj[var43].method_a_S_V(var43);
                              b_Arrayj[var43].method_a_ArrayB_I_I(var16, var25);
                              b_Arrayj[var43++].method_a_V();
                              break;
                           case 10:
                              i var40;
                              (var40 = new i()).method_a_S_V(var43);
                              var40.method_a_ArrayB_I_I(var16, var25);
                              var40.method_a_V();
                              if (var40.a_I > var10) {
                                 var10 = var40.a_I;
                              }

                              b_Arrayj[var43++] = var40;
                              break;
                           case 11:
                              k var39;
                              (var39 = new k()).method_a_S_V(var43);
                              var39.method_a_ArrayB_I_I(var16, var25);
                              var39.method_a_V();
                              b_Arrayj[var43++] = var39;
                              break;
                           case 12:
                              e var38;
                              (var38 = new e()).method_a_S_V(var43);
                              var38.method_a_ArrayB_I_I(var16, var25);
                              var38.method_a_V();
                              b_Arrayj[var43++] = var38;
                              break;
                           case 13:
                              a var37;
                              (var37 = new a()).method_a_S_V(var43);
                              var37.method_a_ArrayB_I_I(var16, var25);
                              var37.method_a_V();
                              b_Arrayj[var43++] = var37;
                              G_I++;
                              break;
                           case 14:
                              c var36;
                              (var36 = new c(false)).method_a_S_V(var43);
                              var36.method_a_ArrayB_I_I(var16, var25);
                              var36.method_a_V();
                              b_Arrayj[var43++] = var36;
                              break;
                           case 15:
                              l var35;
                              (var35 = new l()).method_a_S_V(var43);
                              var35.method_a_ArrayB_I_I(var16, var25);
                              var35.method_a_V();
                              b_Arrayj[var43++] = var35;
                              G_I++;
                        }

                        var25 += var7;
                     }

                     j.method_a_Arrayj_V(b_Arrayj);
                     a_j = b_Arrayj[0];
                     b_Arrayj = null;
                     (a_a = new a()).method_a_S_V(var43++);
                     j var30 = a_j;
                     a var17 = a_a;
                     a_a.method_b_j_V(var30);
                     var17.c_d.a_I = 65536;
                     var17.c_d.b_I = 0;
                     var17.c_d.c_I = Integer.MAX_VALUE;
                     var17.c_d.d_I = 0;
                     var17.c_d.e_I = 65536;
                     var17.c_d.f_I = Integer.MAX_VALUE;
                     var17.b_d.method_a_d_V(var17.c_d);
                     var17.method_a_V();
                     c_n.method_a_S_V(var43++);
                     c_n.method_c_j_V(a_j);
                     b_n.method_a_S_V(var43++);
                     b_n.method_c_j_V(a_j);
                     e_n.method_a_S_V(var43++);
                     e_n.method_c_j_V(a_j);
                     f_n.method_a_S_V(var43++);
                     f_n.method_c_j_V(a_j);
                     g_n.method_a_S_V(var43++);
                     g_n.method_c_j_V(a_j);
                     a_n.method_a_S_V(var43++);
                     a_n.method_c_j_V(a_j);
                     d_n.method_a_S_V(var43++);
                     d_n.method_c_j_V(a_j);
                     h_n.method_a_S_V(var43++);
                     h_n.method_c_j_V(a_j);
                     i_n.method_a_S_V(var43);
                     i_n.method_c_j_V(a_j);
                     var2 = var10;
                     p.a_ArrayI = new int[var10];
                     p.b_ArrayI = new int[var2];
                     (g.a_ArrayI = new int[72])[1] = 0;
                     g.a_ArrayI[0] = 0;
                     g.a_ArrayI[2] = 0;
                     g.a_ArrayI[7] = 0;
                     o.method_f_I_V(v_ArrayS[e_I]);
                     o.method_f_I_V(v_ArrayS[15]);
                     j.a_j = a_c;
                     j.method_m_V();
                     F_I = j.f_d.f_I;
                     method_g_V();
                     b_n.a_I = -1;
                     c_n.a_I = -1;
                     e_n.a_I = -1;
                     f_n.a_I = -1;
                     g_n.a_I = -1;
                     a_n.a_I = -1;
                     d_n.a_I = -1;
                     h_n.a_I = -1;
                     i_n.a_I = -1;
                     a_c.a_I = -16777216;
                     boolean var54 = true;

                     for (byte var42 = 0; var42 < c_ArrayI.length; var42 += 2) {
                        int var55;
                        if (method_a_I_Z(var55 = c_ArrayI[var42])) {
                           var54 = false;
                        }
                     }

                     if (var54 && method_c_I_Z(e_I)) {
                        method_a_I_V(11);
                     }

                     c.c_I = 0;
                     c.b_I = 3000;
                  }
               }

               this.i_I = 4;
               this.method_b_V();
               if (!b_Z) {
                  o.method_c_I_I_V(method_d_I(), -1);
               }

               return 0;
            }
         case 11:
            for (int var9 = 0; var9 < f_ArrayS.length; var9++) {
               if ((var9 + 1) % 4 != 0) {
                  f_ArrayS[var9] = 0;
               }
            }

            method_e_I_V(0);
            k_I = 0;
            method_d_V();
            this.k_Z = false;
            this.method_g_I_V(18);
            return 0;
         case 21:
         case 22:
            o_I = this.b_h.method_a_I();
            this.method_g_I_V(var1);
            return 0;
         case 27:
            return 0;
         case 36:
            if (var2 == 0) {
               o.method_f_I_V(o_ArrayI[o_ArrayI.length - 1]);
               return 1;
            } else if (var2 == 1) {
               this.i_I = 3;
               o.method_c_I_I_V(28, -1);
               this.method_g_I_V(17);
               return 0;
            } else {
               return 0;
            }
      }
   }

   private static int method_d_I() {
      byte var0 = 31;
      if (method_b_I_I(e_I) == 1) {
         var0 = 30;
      }

      if (method_b_I_I(e_I) == 0) {
         var0 = 29;
      }

      if (e_I == 4 || e_I == 9 || e_I == 14) {
         var0 = 35;
      }

      if (e_I == 3 || e_I == 8 || e_I == 13) {
         var0 = 32;
      }

      return var0;
   }

   public static int method_b_I_I(int var0) {
      byte var1 = 2;
      if (var0 <= 9) {
         var1 = 1;
      }

      if (var0 <= 4) {
         var1 = 0;
      }

      return var1;
   }

   public final void method_d_I_V(int var1) {
      if (var1 != 17 && var1 != 25) {
         o_I = 0;
      }

      switch (var1) {
         case 2:
         case 5:
         case 6:
         case 11:
         case 15:
         case 21:
         case 22:
         case 27:
            o.method_a_I_V(var1);
            return;
         case 3:
         case 4:
         case 12:
         case 14:
         case 16:
         case 34:
         case 36:
         default:
            break;
         case 8:
            b_Z = false;
            this.method_b_V();
            if (!b_Z) {
               o.method_c_I_I_V(method_d_I(), -1);
            }
            break;
         case 9:
            o.method_a_V();
            return;
         case 10:
         case 20:
         case 28:
         case 29:
         case 30:
            o_I = this.b_h.method_a_I();
         case 17:
         case 18:
         case 19:
         case 23:
         case 24:
         case 25:
         case 26:
         case 31:
         case 32:
         case 33:
            this.method_g_I_V(var1);
            return;
         case 13:
            return;
         case 35:
            g_Z = false;
            this.method_b_V();
            if (this.p_Z) {
               this.p_Z = false;
               this.method_j_V();
               return;
            }
            break;
         case 37:
            method_h_V();
         case 7:
            if (method_b_I_Z(k_I)) {
               m_I = n_I;
               this.k_Z = false;
               e_I = k_I;
               o.method_a_I_V(6);
               return;
            }
      }
   }

   private static void method_d_V() {
      byte[] var0 = new byte[f_ArrayS.length << 1];

      for (int var1 = 0; var1 < f_ArrayS.length; var1++) {
         var0[var1 << 1] = (byte)(f_ArrayS[var1] >> 8);
         var0[(var1 << 1) + 1] = (byte)f_ArrayS[var1];
      }

      o.method_a_String_ArrayB_V("game", var0);
   }

   private void method_b_Graphics_V(Graphics var1) {
      if (j_Z) {
         var1.setColor(7352325);
         var1.fillRect(0, 0, o.b_I, o.c_I);
         var1.setColor(0);
         var1.fillRect((o.b_I - 60) / 2, (o.c_I - 10) / 2, 60, 10);
         var1.setColor(4660480);
         var1.fillRect((o.b_I - 60) / 2 + 1, (o.c_I - 10) / 2 + 1, 58, 8);
         var1.setColor(11460924);
         var1.fillRect((o.b_I - 60) / 2 + 1, (o.c_I - 10) / 2 + 1, 60 * this.B_I / 20 - 2, 8);
         this.B_I++;
         if (this.B_I > 20) {
            this.B_I = 0;
            return;
         }
      } else {
         var1.setColor(16777215);
         var1.fillRect(0, 0, o.b_I, o.c_I);
      }
   }

   private void method_e_V() {
      if (this.C_I + 1 < o_ArrayI.length) {
         if (!o.method_b_I_Z(o_ArrayI[this.C_I + 1])) {
            return;
         }

         j_Z = true;
         this.C_I++;
         this.a_J = System.currentTimeMillis();
         if (this.C_I - 1 > -1) {
            o.method_f_I_V(o_ArrayI[this.C_I - 1]);
            return;
         }
      } else {
         o.method_a_I_V(36);
      }
   }

   private static void method_f_V() {
      a_Image = null;
      a_Graphics = null;
      a_ArrayI = null;
      b_Image = null;
      b_Graphics = null;
      b_ArrayI = null;
      p.a_ArrayI = null;
      p.b_ArrayI = null;
      a_j = null;
      j.a_j = null;
      a_c = null;
      a_Arrayg = null;
      a_k = null;
      a_ArrayImage = null;
      b_ArrayImage = null;
      o.method_f_I_V(2);
      o.method_f_I_V(1);
      o.method_f_I_V(6);
      o.method_f_I_V(5);
      o.method_f_I_V(24);
      o.method_f_I_V(0);
      o.method_f_I_V(3);
      o.method_f_I_V(26);
      o.method_f_I_V(20);
      o.method_f_I_V(19);
      o.method_f_I_V(16);
      o.method_f_I_V(25);
      o.method_f_I_V(22);
      o.method_f_I_V(27);
      o.method_f_I_V(21);
      o.method_f_I_V(23);
      int var0;
      if ((var0 = method_b_I_I(e_I)) == 0) {
         o.method_f_I_V(12);
         o.method_f_I_V(17);
         o.method_f_I_V(18);
      }

      if (var0 == 1) {
         o.method_f_I_V(11);
         o.method_f_I_V(17);
         o.method_f_I_V(18);
      }

      if (var0 == 2) {
         o.method_f_I_V(8);
         o.method_f_I_V(4);
      }

      o.method_e_I_V(10);
      o.method_e_I_V(13);
   }

   private static void method_g_V() {
      H_I = 0;
      I_I = 0;
      l_Z = false;
      m_Z = false;

      try {
         a_ArrayImage = new Image[u_ArrayS.length];
         b_ArrayImage = new Image[u_ArrayS.length];

         for (int var1 = 0; var1 < u_ArrayS.length; var1++) {
            if (o.method_a_I_Image(u_ArrayS[var1]) != null) {
               a_ArrayImage[var1] = o.method_a_I_Image(u_ArrayS[var1]);
               b_ArrayImage[var1] = Image.createImage(a_ArrayImage[var1]);
               int[] var0 = new int[b_ArrayImage[var1].getWidth() * b_ArrayImage[var1].getHeight()];
               b_ArrayImage[var1].getRGB(var0, 0, b_ArrayImage[var1].getWidth(), 0, 0, b_ArrayImage[var1].getWidth(), b_ArrayImage[var1].getHeight());
               int[] var2 = var0;

               for (int var9 = 0; var9 < var2.length; var9++) {
                  int var6 = var2[var9] >>> 24;
                  int var3 = var2[var9] >> 16 & 0xFF;
                  int var4 = var2[var9] >> 8 & 0xFF;
                  int var5 = var2[var9] & 0xFF;
                  int var7 = var3;
                  int var8 = var4;
                  var4 = var5;
                  var3 = var8 + var4 >> 1;
                  var4 = var7 + var4 >> 1;
                  var5 = var7 + var8 >> 1;
                  var2[var9] = (var6 << 24) + (var3 << 16) + (var4 << 8) + var5;
               }

               int var12 = b_ArrayImage[var1].getWidth();
               int var14 = b_ArrayImage[var1].getHeight();
               b_ArrayImage[var1] = Image.createRGBImage(var0, var12, var14, true);
            }
         }

         Object var11 = null;
      } catch (Exception var10) {
      }
   }

   public static int method_c_I_I(int var0) {
      if (m_Z && !l_Z || !m_Z && l_Z) {
         int var1 = var0 >>> 24;
         int var2 = var0 >> 16 & 0xFF;
         int var3 = var0 >> 8 & 0xFF;
         var0 &= 255;
         int var4 = var2;
         int var5 = var3;
         var0 = var0;
         var2 = var5 + var0 >> 1;
         var3 = var4 + var0 >> 1;
         var0 = var4 + var5 >> 1;
         var0 = (var1 << 24) + (var2 << 16) + (var3 << 8) + var0;
      }

      return var0;
   }

   private static void method_a_I_Graphics_V(int var0, Graphics var1) {
      if (m_Z && !l_Z || !m_Z && l_Z) {
         int var2 = var0 >> 16 & 0xFF;
         int var3 = var0 >> 8 & 0xFF;
         var0 &= 255;
         int var4 = var2;
         int var5 = var3;
         var0 = var0;
         var2 = var5 + var0 >> 1;
         var3 = var4 + var0 >> 1;
         var0 = var4 + var5 >> 1;
         var0 = (var2 << 16) + (var3 << 8) + var0;
      }

      var1.setColor(var0);
   }

   private static void method_a_ArrayS_I_I_I_I_I_I_I_I_Graphics_V(
      short[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Graphics var9
   ) {
      s_ArrayI[0] = 0;
      var2 = 0;
      if (var6 != 0) {
         var2 = a_Random.nextInt() % var6;
      }

      t_ArrayI[0] = var5 + var2;

      for (int var10 = 1; var10 < var7 + 1; var10++) {
         var2 = 0;
         if (var4 != 0) {
            var2 = Math.abs(a_Random.nextInt() % var4);
         }

         s_ArrayI[var10] = s_ArrayI[var10 - 1] + var2 + var3;
         var2 = 0;
         if (var6 != 0) {
            var2 = a_Random.nextInt() % var6;
         }

         t_ArrayI[var10] = var5 + var2;
         u_ArrayI[var10] = Math.abs(a_Random.nextInt() % var0.length);
      }

      int var17;
      var2 = (var17 = s_ArrayI[var7]) - (((j.f_d.c_I >> 16) + 33000) * j.g_d.a_I >> 16) * var1 / 100 % var17;
      var1 = ((j.f_d.f_I - F_I >> 16) * j.g_d.a_I >> 16) * var1 / 100 + o.c_I;

      for (int var16 = 0; var16 < var7; var16++) {
         if (var16 < 2) {
            o.method_a_I_I_I_V(var2 + s_ArrayI[var16], var1 + t_ArrayI[var16], var0[u_ArrayI[var16]]);
         }

         if (var16 > 2) {
            o.method_a_I_I_I_V(var2 + s_ArrayI[var16] - (var17 << 1), var1 + t_ArrayI[var16], var0[u_ArrayI[var16]]);
         }

         o.method_a_I_I_I_V(var2 + s_ArrayI[var16] - var17, var1 + t_ArrayI[var16], var0[u_ArrayI[var16]]);
      }

      if (var8 != -1) {
         method_a_I_Graphics_V(var8, var9);
         var9.fillRect(0, var1 + t_ArrayI[0], o.b_I, o.c_I - (var1 + t_ArrayI[0]));
      }
   }

   private static void method_a_DirectGraphics_V(DirectGraphics var0) {
      int var1 = o.method_c_I();
      int var2 = o.b_I;
      int var3 = o.c_I - var1;
      int[] var4 = v_ArrayI;
      int[] var5 = w_ArrayI;
      var4[0] = 0;
      var5[0] = var3;
      var4[1] = var2 + 0;
      var5[1] = var3;
      var4[2] = var2 + 0;
      var5[2] = var3 + var1;
      var4[3] = 0;
      var5[3] = var3 + var1;
      var0.fillPolygon(var4, 0, var5, 0, 4, 1426063360);
   }

   private static int method_a_I_I_I_I_Z_I(int var0, int var1, int var2, int var3, boolean var4) {
      int var5 = 0;
      int var7 = 1;
      int var6 = var2;
      var4 = var2 < 10 && var4;
      if (var3 == 4) {
         var7 = 0;
      }

      for (int var10 = var7; var10 < 2; var10++) {
         if (var2 == 0) {
            if (var10 == 1) {
               o.method_a_I_I_I_I_V(var0, 7, w_ArrayS[0], 24);
            }

            var5 += o.method_a_I_I_I(w_ArrayS[0], 0);
         } else {
            while (var2 != 0) {
               var7 = var2 % 10;
               short var9 = w_ArrayS[var7];
               if (var10 == 1) {
                  o.method_a_I_I_I_I_V(var0 - var5, 7, var9, 24);
               }

               var2 /= 10;
               var5 += o.method_a_I_I_I(var9, 0);
            }
         }

         if (var10 == 0) {
            var0 += var5;
            var5 = 0;
            var2 = var6;
         }
      }

      if (var4) {
         o.method_a_I_I_I_I_V(var0 - var5, 7, w_ArrayS[0], 24);
         var5 += o.method_a_I_I_I(w_ArrayS[0], 0);
      }

      return var5;
   }

   private static String method_b_I_String(int var0) {
      int var2;
      int var1 = (var2 = var0) / 60;
      String var4;
      if ((var0 = var2 % 60) < 10) {
         var4 = var1 + ":" + "0" + var0;
      } else {
         var4 = var1 + ":" + var0;
      }

      return var4;
   }

   private static void method_h_V() {
      for (int var0 = 0; var0 < u_ArrayS.length; var0++) {
         if (o.method_a_I_Image(u_ArrayS[var0]) != null && a_ArrayImage[var0] != null) {
            o.method_a_I_Image_V(u_ArrayS[var0], a_ArrayImage[var0]);
         }
      }
   }

   private static void method_i_V() {
      if (h_Z) {
         g.method_a_Arrayg_V(a_Arrayg);
         h_Z = false;
      } else {
         a_j.method_l_V();

         for (j var0 = a_j; var0 != null; var0 = var0.method_a_j_j(a_j)) {
            var0.method_d_V();
         }

         g.method_a_Arrayg_c_V(a_Arrayg, a_c);
         int var1 = g.a_ArrayI[7];
         g.method_a_Arrayg_V(a_Arrayg);
         if (g.a_ArrayI[7] != var1) {
            l_Z = false;
            H_I = 2000;
            I_I = 0;
         }

         for (j var2 = a_j; var2 != null; var2 = var2.method_a_j_j(a_j)) {
            var2.method_a_j_V(a_j);
         }

         if (c_Z) {
            j.n_I = 0;
            j.o_I = 0;
            j.method_b_Z_V(true);
            c_Z = false;
         } else {
            j.method_b_Z_V(false);
         }
      }
   }

   private void method_j_V() {
      method_h_V();
      this.k_Z = false;
      o.method_a_I_V(5);
      A_I = 31;
      g.a_ArrayI[0] = 0;
   }

   static {
      String var0;
      if ((var0 = o.a_MIDlet.getAppProperty("Cheats")) != null && var0.equals("On")) {
         f_Z = true;
      } else {
         f_Z = false;
      }

      c_ArrayS = new short[]{314, 315, 389};
      a_Random = new Random(System.currentTimeMillis());
      k_I = 0;
      l_I = 0;
      m_I = 0;
      n_I = 0;
      o_I = 0;
      a_ArrayF = new float[]{0.937F, 0.969F, 0.659F, 0.937F, 1.412F, 0.969F, 2.121F, 1.298F, 1.298F, 1.011F, 1.298F, 1.921F, 1.298F, 0.712F, 1.195F};
      c_ArrayI = new int[]{4, 60, 9, 200, 14, 400};
      d_ArrayI = new int[]{3, 8};
      d_ArrayS = new short[]{
         30,
         29,
         26,
         30,
         28,
         26,
         30,
         25,
         21,
         30,
         25,
         20,
         30,
         30,
         30,
         30,
         28,
         25,
         30,
         28,
         22,
         30,
         27,
         20,
         30,
         27,
         24,
         30,
         30,
         30,
         30,
         29,
         27,
         30,
         28,
         19,
         30,
         25,
         20,
         30,
         25,
         20,
         30,
         30,
         30
      };
      e_ArrayS = new short[]{
         30,
         40,
         50,
         36,
         45,
         55,
         35,
         40,
         48,
         32,
         42,
         50,
         9999,
         9999,
         9999,
         34,
         45,
         60,
         75,
         85,
         95,
         42,
         46,
         55,
         45,
         55,
         65,
         9999,
         9999,
         9999,
         45,
         50,
         58,
         60,
         70,
         80,
         48,
         54,
         60,
         24,
         34,
         44,
         9999,
         9999,
         9999
      };
      f_ArrayS = new short[60];
      g_ArrayS = new short[]{359, 363, 364, 365, 328, 366, 367, 368, 369, 329, 370, 360, 361, 362, 330};
      h_ArrayS = new short[]{20, 24, 25, 26, 32, 27, 28, 29, 30, 33, 31, 21, 22, 23, 34};
      i_ArrayS = new short[]{388};
      j_ArrayS = new short[]{251};
      k_ArrayS = new short[]{252};
      l_ArrayS = new short[0];
      m_ArrayS = new short[]{373};
      n_ArrayS = new short[]{161};
      o_ArrayS = new short[]{159, 160};
      p_ArrayS = new short[0];
      q_ArrayS = new short[]{352};
      r_ArrayS = new short[]{113};
      s_ArrayS = new short[]{114};
      t_ArrayS = new short[]{353};
      u_ArrayS = new short[]{388, 373, 145, 313, 265, 157, 174, 55, 345, 243, 78, 317, 176, 267};
      v_ArrayS = new short[]{39, 40, 41, 42, 51, 43, 44, 45, 46, 52, 47, 48, 49, 50, 53, 54};
      w_I = 0;
      d_I = 0;
      x_I = o.b_I;
      y_I = o.c_I;
      q_I = 129;
      r_I = 40;
      s_I = 5;
      t_I = 56;
      u_I = 20;
      v_I = 40;
      b_ArrayS = new short[360];
      method_a_V();
      e_ArrayI = new int[]{536};
      f_ArrayI = new int[]{526, 516, 531, 521};
      g_ArrayI = new int[]{390, 420};
      h_ArrayI = new int[]{420, 426};
      i_ArrayI = new int[]{414, 396, 420};
      j_ArrayI = new int[]{420, 426, 402, 408};
      k_ArrayI = new int[]{420, 426};
      l_ArrayI = new int[]{390, 414, 396};
      c_n = new n(150, 0, 80, 0, 0, 0, 1, e_ArrayI, 4000, 7);
      b_n = new n(20, 0, -200, 0, 0, 0, 0, f_ArrayI, 800, 7);
      e_n = new n(10, 0, 0, 0, 0, 30, 2, g_ArrayI, 800, -1);
      f_n = new n(50, 0, 0, 0, 0, 85, 3, h_ArrayI, 540, -2);
      g_n = new n(50, 0, 0, 0, 0, 35, 4, i_ArrayI, 1840, -3);
      a_n = new n(20, 0, 0, 0, 0, 35, 4, j_ArrayI, 1840, -4);
      d_n = new n(10, 0, 0, 0, 0, 0, 6, k_ArrayI, 1000, -5);
      h_n = new n(24, 0, 0, 0, 0, 35, 4, l_ArrayI, 2040, -6);
      m_ArrayI = new int[]{437, 432};
      i_n = new n(150, 0, 0, 0, 0, 0, 7, m_ArrayI, 2000, 15);
      n_ArrayI = new int[5];
      a_ArrayString = null;
      i_Z = false;
      A_I = 17;
      j_Z = false;
      o_ArrayI = new int[]{7};
      p_ArrayI = new int[]{1};
      q_ArrayI = new int[]{3000};
      r_ArrayI = new int[]{16777215};
      c_Z = false;
      s_ArrayI = new int[10];
      t_ArrayI = new int[10];
      u_ArrayI = new int[10];
      v_ArrayI = new int[4];
      w_ArrayI = new int[4];
      w_ArrayS = new short[]{90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
   }
}
