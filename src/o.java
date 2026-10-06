import com.nokia.mid.ui.DeviceControl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class o extends GameCanvas implements Runnable, CommandListener {
   private static o a_o = null;
   private static boolean a_Z = false;
   private static boolean b_Z = true;
   private static boolean c_Z = false;
   private static int d_I = 500;
   private static Object a_Object = new Object();
   private static Object b_Object = new Object();
   public static m a_m;
   private static int[] a_ArrayI;
   private static int e_I;
   private static int[] b_ArrayI;
   private static int f_I;
   private static boolean d_Z = false;
   private static boolean e_Z = false;
   private static boolean f_Z = false;
   private static boolean g_Z = false;
   private static int g_I = -1;
   private static int h_I = -1;
   private static long a_J;
   private static boolean h_Z = false;
   private static int i_I = 500;
   private static long b_J;
   public static int a_I;
   private static int j_I = 1;
   private static int k_I = 0;
   private static String[] a_ArrayString;
   private static String[] b_ArrayString;
   private static int[] c_ArrayI;
   private static char[] a_ArrayC = new char[]{'\n', ' ', '-'};
   public static int b_I = 240;
   public static int c_I = 320;
   private static Graphics a_Graphics = null;
   private static Graphics b_Graphics = null;
   private static Font[] a_ArrayFont = new Font[]{Font.getFont(64, 2, 0), Font.getFont(64, 1, 0), Font.getFont(64, 0, 0)};
   private static int[] d_ArrayI = new int[2];
   private static int l_I = 0;
   private static int m_I;
   private static int n_I = -1;
   private static Vector a_Vector;
   private static Vector b_Vector;
   private static o[] a_Arrayo;
   private static Object[] a_ArrayObject;
   private static boolean[] a_ArrayZ;
   private static String[] c_ArrayString;
   private static int[] e_ArrayI;
   private static short[][] a_ArrayArrayS;
   private static short[][] b_ArrayArrayS;
   private static short[] a_ArrayS;
   private static Image[] a_ArrayImage;
   private static byte[] a_ArrayB;
   private static final short[] b_ArrayS = new short[6];
   private static int o_I = -1;
   private static String[] d_ArrayString;
   private static int p_I;
   private static int q_I = 0;
   private static boolean i_Z = false;
   private static boolean j_Z = false;
   private static Player a_Player = null;
   private static Player b_Player = null;
   private static int r_I = 60;
   private static int s_I = -1;
   public static MIDlet a_MIDlet;
   private static int t_I = 1;
   private static int u_I = 0;
   private static int v_I = 0;
   private static int w_I = 0;
   private static int[] f_ArrayI;
   private static int x_I;
   private static boolean k_Z;
   private static long c_J = 0L;
   private static int y_I = 0;
   private static int z_I = 0;
   private static long d_J = 0L;
   private static boolean l_Z = false;
   private static int A_I;
   private static char a_C;
   private static char[][] a_ArrayArrayC = new char[][]{
      {' ', '0'},
      {'.', ',', '?', '!', '\'', '-', '(', ')', '@', '/', ':', '_', '1'},
      {'a', 'b', 'c', 'ä', 'å', '2'},
      {'d', 'e', 'f', '3'},
      {'g', 'h', 'i', '4'},
      {'j', 'k', 'l', '5'},
      {'m', 'n', 'o', 'ö', '6'},
      {'p', 'q', 'r', 's', '7'},
      {'t', 'u', 'v', '8'},
      {'w', 'x', 'y', 'z', '9'},
      new char[0],
      new char[0]
   };
   private static char[][] b_ArrayArrayC = null;
   private static boolean m_Z = false;

   public o() {
      super(false);
   }

   private static void method_i_I_V(int var0) {
      if (e_I != 20) {
         a_ArrayI[e_I] = var0;
         e_I++;
      }
   }

   public static void method_a_I_V(int var0) {
      if (f_I == 40) {
         throw new RuntimeException();
      }

      b_ArrayI[f_I] = var0;
      f_I++;
   }

   public static void method_a_V() {
      g_Z = true;
   }

   public static void method_b_I_V(int var0) {
      j_I = 2;
   }

   public static int method_a_I() {
      return j_I;
   }

   public static void method_c_I_V(int var0) {
      i_I = var0;
   }

   public static void method_a_I_String_I_V(int var0, String var1, int var2) {
      a_ArrayString[var0] = var1;
      c_ArrayI[var0] = var2;
   }

   public static void method_b_V() {
      for (int var0 = 0; var0 < 3; var0++) {
         method_a_I_String_I_V(var0, null, -1);
      }
   }

   public static int method_b_I() {
      if ((method_c_I_I(0) & 114) == (method_c_I_I(1) & 114)) {
         return (method_c_I_I(0) & 32) == 32 ? 2 : 1;
      } else if ((method_c_I_I(0) & 13) == (method_c_I_I(1) & 13)) {
         return (method_c_I_I(0) & 4) == 4 ? 3 : 4;
      } else {
         return 0;
      }
   }

   public static int method_c_I() {
      return method_b_I() != 0 ? m.method_b_I() : 0;
   }

   public static int method_d_I() {
      return method_b_I() != 0 ? -1 : 0;
   }

   private static int method_c_I_I(int var0) {
      switch (var0) {
         case 0:
            return 33;
         case 1:
            return 40;
         case 2:
            return 36;
         default:
            return -1;
      }
   }

   public static boolean method_a_Z() {
      return method_b_I() == 3 || method_b_I() == 4;
   }

   public static boolean method_b_Z() {
      return method_b_I() == 1 || method_b_I() == 2;
   }

   public static String[] method_a_String_I_I_Z_I_I_Z_ArrayString(String var0, int var1, int var2, boolean var3, int var4, int var5, boolean var6) {
      String[] var7 = new String[5];
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = var4;
      var8 = 0;
      var9 = var0.length();
      int var13 = 0;

      while (var13 < var9) {
         boolean var14;
         int var15;
         if (var14 = var3 && method_a_I_I(var2) * var10 < var5) {
            var15 = var1 - var4;
            var11++;
         } else {
            var15 = var1;
         }

         int var16 = 0;
         int var17 = var13;
         int var18 = var9;

         while (var13 < var9) {
            int var19 = var9;

            for (int var20 = var13; var20 < var9; var20++) {
               int var21 = 0;

               while (var21 < a_ArrayC.length && var0.charAt(var20) != a_ArrayC[var21]) {
                  var21++;
               }

               if (var21 < a_ArrayC.length) {
                  var19 = var20;
                  if (var0.charAt(var19) == '-') {
                     var19++;
                  }
                  break;
               }
            }

            if (method_a_I_String_I_I_I(var2, var0, var17, var19 - var17) >= var15) {
               if (var16 != 0) {
                  break;
               }

               int var33 = var17;

               while (method_a_I_String_I_I_I(var2, var0, var17, var33 - var17 + 1) < var15) {
                  var33++;
               }

               var18 = var33;
               var13 = var33;
               break;
            }

            var18 = var19;
            var13 = var19;
            var16++;
            if (var18 < var9 && var0.charAt(var18) == '\n') {
               break;
            }

            while (var13 < var9) {
               int var32 = 0;

               while (var32 < a_ArrayC.length && var0.charAt(var13) != a_ArrayC[var32]) {
                  var32++;
               }

               if (var32 >= a_ArrayC.length || var0.charAt(var13) == '-' || var0.charAt(var13) == '\n') {
                  break;
               }

               var13++;
            }
         }

         int var31 = method_a_I_String_I_I_I(var2, var0, var17, var18 - var17);
         if (var14) {
            var12 = Math.max(var12, var31 + var4);
            var8 = Math.max(var8, var31 + var4);
         } else {
            var8 = Math.max(var8, var31);
         }

         int var10001 = var10 + 1;
         String var29 = var0.substring(var17, var18);
         int notVar14 = var10001;
         var7 = var7;
         if (var7.length <= notVar14) {
            String[] var30 = new String[var7.length + 5];
            System.arraycopy(var7, 0, var30, 0, var7.length);
            var7 = var30;
         }

         var7[notVar14] = var29;
         var7 = var7;
         var10++;
         if (var13 < var9 && var0.charAt(var13) == '\n') {
            var13++;
         }

         try {
            Thread.sleep(1L);
         } catch (InterruptedException var22) {
         }
      }

      if (var6) {
         var8 = var8;
      } else {
         var8 = var1;
      }

      if (var3) {
         var9 = Math.max(var10 * method_a_I_I(var2), var5);
      } else {
         var9 = var10 * method_a_I_I(var2) + var5;
      }

      var7[0] = "" + var10 + " " + var11 + " " + var12 + " " + var8 + " " + var9;
      return var7;
   }

   public static int method_e_I() {
      return b_I;
   }

   public static boolean method_a_I_Z(int var0) {
      return (w_I & 1 << var0) != 0;
   }

   public static void method_d_I_V(int var0) {
      u_I = 0;
      t_I = 2;
   }

   public static void method_c_V() {
      u_I = 0;
      w_I = 0;
      v_I = 0;
      x_I = 0;
      k_Z = true;
   }

   public static void method_a_String_ArrayB_V(String var0, byte[] var1) {
      RecordStore var2 = null;

      try {
         if ((var2 = RecordStore.openRecordStore(var0, true)).getNumRecords() < 1) {
            var2.addRecord(null, 0, 0);
         }

         byte[] var14;
         (var14 = new byte[var1.length + 2])[0] = 1;
         var14[1] = 2;
         System.arraycopy(var1, 0, var14, 2, var1.length);
         var2.setRecord(1, var14, 0, var14.length);
         return;
      } catch (RecordStoreException var11) {
         return;
      } catch (Exception var12) {
      } finally {
         try {
            if (var2 != null) {
               var2.closeRecordStore();
            }
         } catch (Exception var10) {
         }
      }
   }

   public static byte[] method_a_String_ArrayB(String var0) {
      RecordStore var1 = null;

      try {
         if ((var1 = RecordStore.openRecordStore(var0, false)) == null || var1.getNumRecords() < 1) {
            Object var17 = null;
            return null;
         }

         byte[] var16;
         if ((var16 = var1.getRecord(1)) != null && var16.length >= 2 && var16[0] == 1 && var16[1] == 2) {
            byte[] var18 = new byte[var16.length - 2];
            System.arraycopy(var16, 2, var18, 0, var18.length);
            return var18;
         }

         Object var2 = null;
      } catch (RecordStoreException var13) {
         return null;
      } catch (Exception var14) {
         return null;
      } finally {
         try {
            if (var1 != null) {
               var1.closeRecordStore();
            }
         } catch (Exception var12) {
         }
      }

      return null;
   }

   public static Graphics method_a_Graphics() {
      return b_Graphics;
   }

   public static void method_a_Graphics_V(Graphics var0) {
      b_Graphics = var0 != null ? var0 : a_Graphics;
   }

   public static boolean method_a_I_I_I_I_ArrayI_Z(int var0, int var1, int var2, int var3, int[] var4) {
      int var5 = b_Graphics.getClipX();
      int var6 = b_Graphics.getClipY();
      int var7 = b_Graphics.getClipWidth();
      int var8 = b_Graphics.getClipHeight();
      var4[0] = var5;
      var4[1] = var6;
      var4[2] = var7;
      var4[3] = var8;
      if (var0 < var5) {
         var2 -= var5 - var0;
         var0 = var5;
      }

      if (var1 < var6) {
         var3 -= var6 - var1;
         var1 = var6;
      }

      if (var0 + var2 > var5 + var7) {
         var2 = var5 + var7 - var0;
      }

      if (var1 + var3 > var6 + var8) {
         var3 = var6 + var8 - var1;
      }

      if (var2 > 0 && var3 > 0) {
         b_Graphics.setClip(var0, var1, var2, var3);
         return true;
      } else {
         return false;
      }
   }

   public static int method_a_I_String_I_I_I(int var0, String var1, int var2, int var3) {
      byte var4;
      if (var0 == -1) {
         var4 = 0;
      } else if (var0 == -2) {
         var4 = 1;
      } else {
         if (var0 != -3) {
            return -1;
         }

         var4 = 2;
      }

      return a_ArrayFont[var4].substringWidth(var1, var2, var3);
   }

   public static int method_a_I_I(int var0) {
      byte var1;
      if (var0 == -1) {
         var1 = 0;
      } else if (var0 == -2) {
         var1 = 1;
      } else {
         if (var0 != -3) {
            return -1;
         }

         var1 = 2;
      }

      return a_ArrayFont[var1].getHeight();
   }

   public static void method_a_I_I_V(int var0, int var1) {
      n_I = var0;
      m_I = var1;
      d_ArrayI[0] = 0;
   }

   public static int method_f_I() {
      return n_I;
   }

   public static void method_b_I_I_V(int var0, int var1) {
      d_ArrayI[var0] = var1;
   }

   public static void method_a_String_I_I_I_I_I_V(String var0, int var1, int var2, int var3, int var4, int var5) {
      byte var6;
      if (n_I == -1) {
         var6 = 0;
      } else if (n_I == -2) {
         var6 = 1;
      } else {
         if (n_I != -3) {
            return;
         }

         var6 = 2;
      }

      if ((var5 & 2) == 2) {
         var5 = var5 & -3 | 16;
         var4 -= method_a_I_I(n_I) / 2;
      }

      b_Graphics.setFont(a_ArrayFont[var6]);
      if (m_I != 1) {
         b_Graphics.setColor(d_ArrayI[1]);
         switch (m_I) {
            case 2:
               b_Graphics.drawSubstring(var0, 0, var2, var3 + 1, var4 + 1, var5);
               break;
            case 3:
               var6 = 0;

               while (var6 < 4) {
                  b_Graphics.drawSubstring(var0, 0, var2, var3 + (var6 & 1) * (var6 - 2), var4 + (++var6 & 1) * (var6 - 2), var5);
               }
         }
      }

      b_Graphics.setColor(d_ArrayI[0]);
      b_Graphics.drawSubstring(var0, 0, var2, var3, var4, var5);
   }

   public static void method_e_I_V(int var0) {
      if (var0 >= 0) {
         Integer var1 = new Integer(var0);
         if (!a_Vector.contains(var1)) {
            a_Vector.addElement(var1);
         }

         b_Vector.removeElement(var1);
      }
   }

   public static void method_f_I_V(int var0) {
      if (var0 >= 0) {
         Integer var1 = new Integer(var0);
         if (!b_Vector.contains(var1)) {
            b_Vector.addElement(var1);
         }

         a_Vector.removeElement(var1);
      }
   }

   public static Object method_a_I_Object(int var0) {
      if (var0 < 0) {
         return null;
      } else {
         return a_ArrayObject != null ? a_ArrayObject[var0] : null;
      }
   }

   public static boolean method_b_I_Z(int var0) {
      return var0 < 0 ? false : a_ArrayZ != null && a_ArrayZ[var0];
   }

   private static void method_a_DataInputStream_I_V(DataInputStream var0, int var1) throws IOException {
      int var2 = 0;

      while (var2 < var1) {
         var2 = var0.skipBytes(var1 - var2);
      }
   }

   private static byte[] method_a_InputStream_I_ArrayB(InputStream var0, int var1) throws IOException {
      if (var1 != -1) {
         byte[] var5 = new byte[var1];
         int var6 = 0;

         while (var6 < var5.length) {
            var6 += var0.read(var5, var6, var5.length - var6);
         }

         return var5;
      } else {
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         byte[] var2 = new byte[1024];

         int var3;
         while ((var3 = var0.read(var2)) >= 0) {
            var4.write(var2, 0, var3);
         }

         return var4.toByteArray();
      }
   }

   private static void method_e_V() {
      if (c_ArrayString == null) {
         short[] var0 = null;
         short[] var1 = null;

         try {
            DataInputStream var2;
            short var3;
            c_ArrayString = new String[var3 = (var2 = new DataInputStream(a_MIDlet.getClass().getResourceAsStream("/a"))).readShort()];
            e_ArrayI = new int[var3 << 1];

            for (int var4 = 0; var4 < var3; var4++) {
               c_ArrayString[var4] = var2.readUTF();
               e_ArrayI[var4 << 1] = var2.readInt();
               e_ArrayI[(var4 << 1) + 1] = var2.readInt();
            }

            a_ArrayArrayS = new short[var3 = var2.readShort()][];
            a_ArrayObject = new Object[var3];
            a_ArrayZ = new boolean[var3];

            for (int var14 = 0; var14 < var3; var14++) {
               short var5 = var2.readByte();
               byte var6 = var2.readByte();
               a_ArrayArrayS[var14] = new short[var6 + 2];
               a_ArrayArrayS[var14][0] = var5;
               a_ArrayArrayS[var14][1] = var2.readShort();

               for (int var8 = 0; var8 < var6; var8++) {
                  a_ArrayArrayS[var14][var8 + 2] = var2.readShort();
               }
            }

            var0 = new short[var3 = var2.readShort()];
            var1 = new short[var3];

            for (int var15 = 0; var15 < var3; var15++) {
               var0[var15] = var2.readShort();
               var1[var15] = var2.readShort();
            }

            var2.close();

            for (int var16 = 0; var16 < var1.length; var16++) {
               short var17;
               if ((var2 = method_a_I_DataInputStream(var17 = var1[var16])) != null) {
                  int var18 = 0;

                  while (var18 < a_Arrayo.length && !a_Arrayo[var18].method_a_DataInputStream_I_Z(var2, var0[var16])) {
                     var18++;
                  }

                  var2.close();
               }
            }

            a_Arrayo[0].method_a_DataInputStream_I_Z(null, -1);
         } catch (IOException var7) {
         }
      }
   }

   private static void method_f_V() {
      Vector var0 = new Vector();

      for (int var1 = 0; var1 < a_Vector.size(); var1++) {
         int var2 = ((Integer)a_Vector.elementAt(var1)).intValue();
         if (!a_ArrayZ[var2]) {
            int var3 = 0;

            for (int var4 = -1; var4 < a_ArrayArrayS[var2].length - 2; var4++) {
               short var5 = var4 == -1 ? a_ArrayArrayS[var2][1] : a_ArrayArrayS[var2][var4 + 2];
               int var6 = var0.size();

               for (int var7 = var3; var7 < var0.size(); var7++) {
                  int[] var8 = (int[])var0.elementAt(var7);
                  boolean var9 = c_ArrayString[var5].equals(c_ArrayString[var8[2]]);
                  boolean var10 = var7 == var0.size() - 1 || !c_ArrayString[var5].equals(c_ArrayString[((int[])var0.elementAt(var7 + 1))[2]]);
                  if (var9 && e_ArrayI[var5 << 1] < e_ArrayI[var8[2] << 1]) {
                     var6 = var7;
                     break;
                  }

                  if (var9 && var10) {
                     var6 = var7 + 1;
                     break;
                  }
               }

               if (var4 == -1) {
                  var3 = var6 + 1;
               }

               int[] var30;
               (var30 = new int[3])[0] = var2;
               var30[1] = var4;
               var30[2] = var5;
               var0.insertElementAt(var30, var6);
            }
         }
      }

      try {
         DataInputStream var22 = null;
         String var24 = null;
         int var26 = 0;
         for (int var27 = 0; var27 < var0.size(); var27++) {
            int[] var28;
            int var31 = (var28 = (int[])var0.elementAt(var27))[0];
            int var19 = var28[2];
            String var32 = c_ArrayString[var19];
            int var33 = e_ArrayI[var19 << 1];
            int var34 = e_ArrayI[(var19 << 1) + 1];
            if (var22 != null && var32.equals(var24) && var26 <= var33) {
               method_a_DataInputStream_I_V(var22, var33 - var26);
            } else {
               if (var22 != null) {
                  var22.close();
                  var22 = null;
               }

               if (var33 != -1 && var34 != 0) {
                  var22 = method_a_I_DataInputStream(var19);
               }
            }

            boolean var20 = false;
            if (var28[1] == -1) {
               if (var33 == -1) {
                  var22 = new DataInputStream(a_MIDlet.getClass().getResourceAsStream("/" + var32));
               }

               for (int var35 = 0; var35 < a_Arrayo.length; var35++) {
                  Object notVar28;
                  if ((notVar28 = a_Arrayo[var35].method_a_DataInputStream_I_I_I_Object(var34 != 0 ? var22 : null, var34, a_ArrayArrayS[var31][0], var31))
                     != null) {
                     a_ArrayObject[var31] = notVar28;
                     var20 = true;
                     break;
                  }
               }
            } else if (var34 != 0) {
               for (int var11 = 0; var11 < a_Arrayo.length; var11++) {
                  o var10000 = a_Arrayo[var11];
                  String var10002 = var34 == -1 ? var32 : null;
                  short var10004 = a_ArrayArrayS[var31][0];
                  int var17 = var28[1];
                  int var16 = var31;
                  short var15 = var10004;
                  int var14 = var34;
                  String var13 = var10002;
                  DataInputStream var12 = var22;
                  boolean var37;
                  switch (var15) {
                     case 2:
                        int imgNo = method_a_ArrayB_I_S((byte[])method_a_I_Object(var16), 0) + var17;
                        if (var12 != null) {
                           byte[] var36 = method_a_InputStream_I_ArrayB(var12, var14);
                           a_ArrayImage[imgNo] = Image.createImage(var36, 0, var36.length);
                        } else {
                           a_ArrayImage[imgNo] = Image.createImage("/" + var13);
                        }

                        var37 = true;
                        break;
                     case 3:
                     case 8:
                        if (var12 != null) {
                           method_a_ArrayB_I_String_V(method_a_InputStream_I_ArrayB(var12, var14), var16, null);
                        } else {
                           method_a_ArrayB_I_String_V(null, var16, "/" + var13);
                        }

                        var37 = true;
                        break;
                     case 4:
                     case 5:
                     case 6:
                     case 7:
                     default:
                        var37 = false;
                  }

                  var20 = var37;
                  if (var37) {
                     break;
                  }
               }
            }

            if (!var20 && var33 != -1) {
               method_a_DataInputStream_I_V(var22, var34);
            }

            if (var22 != null) {
               var24 = var32;
               var26 = var33 + var34;
            }
         }

         if (var22 != null) {
            var22.close();
         }
      } catch (Exception var18) {
      }

      for (int var23 = 0; var23 < a_Vector.size(); var23++) {
         int var25 = ((Integer)a_Vector.elementAt(var23)).intValue();
         a_ArrayZ[var25] = true;
      }

      a_Vector.removeAllElements();
   }

   private static void method_g_V() {
      for (int var0 = 0; var0 < b_Vector.size(); var0++) {
         int var1 = ((Integer)b_Vector.elementAt(var0)).intValue();
         if (a_ArrayZ[var1]) {
            short var2 = a_ArrayArrayS[var1][0];

            for (int var3 = 0; var3 < a_Arrayo.length; var3++) {
               o var10000 = a_Arrayo[var3];
               int var6 = var1;
               short var5 = var2;
               boolean var17;
               switch (var5) {
                  case 2:
                     byte[] var9 = (byte[])a_ArrayObject[var6];

                     for (int var11 = 0; var11 < a_ArrayS.length; var11 += 2) {
                        if (a_ArrayS[var11] == var6) {
                           a_ArrayS[var11] = -1;
                           a_ArrayS[var11 + 1] = -1;
                        }
                     }

                     var5 = method_a_ArrayB_I_S(var9, 0);
                     short var14 = method_a_ArrayB_I_S(var9, 2);

                     for (int var7 = 0; var7 < a_ArrayB.length; var7 += 7) {
                        byte var8;
                        if ((var8 = a_ArrayB[var7 + 6]) >= var5 && var8 < var14) {
                           for (int var16 = 0; var16 < 7; var16++) {
                              a_ArrayB[var7 + var16] = -1;
                           }
                        }
                     }

                     var5 = method_a_ArrayB_I_S(var9, 2);

                     for (int var15 = method_a_ArrayB_I_S(var9, 0); var15 < var5; var15++) {
                        a_ArrayImage[var15] = null;
                     }

                     var17 = true;
                     break;
                  case 3:
                     var17 = true;
                     break;
                  case 4:
                     short[] var4;
                     for (int var10 = (var4 = (short[])a_ArrayObject[var6])[0]; var10 < var4[1] + var4[0]; var10++) {
                        d_ArrayString[var10] = null;
                     }

                     var17 = true;
                     break;
                  case 5:
                  case 6:
                  case 7:
                  default:
                     var17 = false;
               }

               if (var17) {
                  break;
               }
            }

            a_ArrayObject[var1] = null;
            a_ArrayZ[var1] = false;
         }
      }

      b_Vector.removeAllElements();
   }

   private static short method_a_ArrayB_I_S(byte[] var0, int var1) {
      return (short)(var0[var1] << 8 | var0[var1 + 1] & 0xFF);
   }

   private static DataInputStream method_a_I_DataInputStream(int var0) throws IOException {
      if (e_ArrayI[(var0 << 1) + 1] != 0) {
         DataInputStream var1 = new DataInputStream(a_MIDlet.getClass().getResourceAsStream("/" + c_ArrayString[var0]));
         if (e_ArrayI[var0 << 1] != -1) {
            method_a_DataInputStream_I_V(var1, e_ArrayI[var0 << 1]);
         }

         return var1;
      } else {
         return null;
      }
   }

   public final boolean method_a_DataInputStream_I_Z(DataInputStream var1, int var2) throws IOException {
      switch (var2) {
         case -1:
            a_ArrayS = new short[428];
            a_ArrayB = new byte[2282];
            a_ArrayImage = new Image[46];

            for (int var6 = 0; var6 < a_ArrayS.length; var6++) {
               a_ArrayS[var6] = -1;
            }

            for (int var7 = 0; var7 < a_ArrayB.length; var7++) {
               a_ArrayB[var7] = -1;
            }
         case 0:
         case 1:
         case 2:
         case 3:
         case 5:
         default:
            break;
         case 4:
            p_I = var1.readByte();
            d_ArrayString = new String[var1.readShort()];
            break;
         case 6:
            short var5;
            b_ArrayArrayS = new short[var5 = var1.readShort()][];

            for (int var8 = 0; var8 < var5; var8++) {
               short var3 = var1.readShort();
               b_ArrayArrayS[var8] = new short[var3];

               for (int var4 = 0; var4 < var3; var4++) {
                  b_ArrayArrayS[var8][var4] = var1.readShort();
               }
            }

            return true;
         case 7:
            return true;
      }

      return false;
   }

   public final Object method_a_DataInputStream_I_I_I_Object(DataInputStream var1, int var2, int var3, int var4) throws IOException {
      switch (var3) {
         case 2:
            byte var10 = var1.readByte();
            short var14 = var1.readShort();
            short var17 = var1.readShort();
            short var19 = var1.readShort();
            short var21 = var1.readShort();

            for (int var7 = 0; var7 < var17; var7++) {
               short var8 = var1.readShort();
               a_ArrayS[var8 - 326 << 1] = (short)var4;
               a_ArrayS[(var8 - 326 << 1) + 1] = (short)(var1.readShort() + 4);
            }

            ByteArrayOutputStream var22 = new ByteArrayOutputStream(var19 + 4);
            DataOutputStream var23;
            (var23 = new DataOutputStream(var22)).writeShort(var14);
            var23.writeShort(var14 + var10);

            for (int var11 = 0; var11 < var19; var11++) {
               var23.writeByte(var1.readByte());
            }

            int var12 = 0;

            for (int var15 = 0; var15 < var21 << 3; var15++) {
               if ((var15 & 7) == 0) {
                  var12 = 7 * var1.readShort();
               } else {
                  a_ArrayB[var12 + (var15 & 7) - 1] = var1.readByte();
               }
            }

            return var22.toByteArray();
         case 3:
            return new Object();
         case 4:
            short var13 = var1.readShort();
            short var9 = var1.readShort();
            var3 = -999999;
            var4 = -999999;
            int var5 = 0;

            for (int var6 = 0; var6 < p_I + 1; var6++) {
               if (var6 == 0) {
                  var3 = var1.readInt();
               } else {
                  var5 = var1.readInt();
                  if (var6 == 1) {
                     var4 = var5 - var3;
                  }
               }
            }

            method_a_DataInputStream_I_V(var1, var3);

            for (int var20 = 0; var20 < var13; var20++) {
               if (d_ArrayString[var9 + var20] == null) {
                  d_ArrayString[var9 + var20] = var1.readUTF();
               } else {
                  var1.readUTF();
               }
            }

            method_a_DataInputStream_I_V(var1, var5 - (var3 + var4));
            return new short[]{(short)var9, (short)var13};
         case 5:
         case 6:
         case 7:
         default:
            return method_a_InputStream_I_ArrayB(var1, var2);
      }
   }

   public static void method_g_I_V(int var0) {
      short[] var2 = b_ArrayArrayS[0];

      for (int var1 = 0; var1 < var2.length; var1++) {
         method_e_I_V(var2[var1]);
      }
   }

   public static Image method_a_I_Image(int var0) {
      int var1;
      return (var1 = method_d_I_I(var0)) >= 0 ? a_ArrayImage[var1] : null;
   }

   public static void method_a_I_Image_V(int var0, Image var1) {
      if ((var0 = method_d_I_I(var0)) >= 0) {
         a_ArrayImage[var0] = var1;
      }
   }

   private static int method_d_I_I(int var0) {
      if (var0 == -1) {
         return -1;
      }

      if (var0 < -1) {
         return -1;
      }

      byte[] var4 = null;
      int var1;
      byte var2;
      int var9;
      if (var0 < 326) {
         var1 = -99;
         var2 = 0;
         var9 = 0;
         if (a_ArrayB[var0 * 7 + 6] == -1) {
            return -1;
         }
      } else {
         int var5;
         if ((var5 = (var0 - 326 << 1) + 1) >= a_ArrayS.length) {
            return -1;
         }

         var9 = a_ArrayS[var5];
         short var7;
         if ((var7 = a_ArrayS[var0 - 326 << 1]) < 0) {
            return -1;
         }

         var4 = (byte[])a_ArrayObject[var7];
         if (var9 == -1 || var4 == null) {
            return -1;
         }

         var1 = (var2 = var4[var9++]) & 3;
         var2 = (byte)((var2 & 4) != 0 ? 2 : 1);
      }

      short var11 = -1;
      if (var1 == 0 || var1 == -99) {
         if (var1 == 0) {
            if (var2 == 2) {
               var9 += 12;
            } else {
               var9 += 6;
            }

            var11 = (short)(var4[var9] << 8 | var4[var9 + 1] & 0xFF);
         } else {
            var0 *= 7;
            var11 = a_ArrayB[var0 + 6];
         }
      }

      return var11;
   }

   public static void method_a_I_I_I_V(int var0, int var1, int var2) {
      byte[] var6 = null;
      int var3;
      int var4;
      int var18;
      if (var2 < 326) {
         var3 = -99;
         var4 = 0;
         var18 = 0;
      } else {
         var18 = a_ArrayS[(var2 - 326 << 1) + 1];
         byte var7;
         var3 = (var7 = (var6 = (byte[])a_ArrayObject[a_ArrayS[var2 - 326 << 1]])[var18++]) & 3;
         var4 = (var7 & 4) != 0 ? 2 : 1;
      }

      if (var3 != 0 && var3 != -99) {
         if (var3 == 1) {
            var18 += var4 << 2;
            short var24 = (short)(var6[var18] << 8 | var6[var18 + 1] & 0xFF);
            var18 += 2;
            if (var4 == 2) {
               for (int var16 = 0; var16 < var24; var16++) {
                  method_a_I_I_I_V(
                     var0 + (short)(var6[var18] << 8 | var6[var18 + 1] & 0xFF),
                     var1 + (short)(var6[var18 + 2] << 8 | var6[var18 + 3] & 0xFF),
                     (short)(var6[var18 + 4] << 8 | var6[var18 + 5] & 0xFF)
                  );
                  var18 += 6;
               }

               return;
            }

            for (int var15 = 0; var15 < var24; var15++) {
               method_a_I_I_I_V(var0 + var6[var18++], var1 + var6[var18++], var6[var18++]);
            }
         }
      } else {
         Image var23;
         if (var3 == 0) {
            if (var4 == 2) {
               for (int var10 = 0; var10 < 6; var10++) {
                  b_ArrayS[var10] = (short)(var6[var18] << 8 | var6[var18 + 1] & 0xFF);
                  var18 += 2;
               }
            } else {
               for (int var11 = 0; var11 < 6; var11++) {
                  b_ArrayS[var11] = var6[var18++];
               }
            }

            var23 = a_ArrayImage[(short)(var6[var18] << 8 | var6[var18 + 1] & 0xFF)];
         } else {
            var2 *= 7;
            b_ArrayS[0] = (short)(a_ArrayB[var2] & 0xFF);
            b_ArrayS[1] = (short)(a_ArrayB[var2 + 1] & 0xFF);
            b_ArrayS[2] = a_ArrayB[var2 + 2];
            b_ArrayS[3] = a_ArrayB[var2 + 3];
            b_ArrayS[4] = (short)(a_ArrayB[var2 + 4] & 0xFF);
            b_ArrayS[5] = (short)(a_ArrayB[var2 + 5] & 0xFF);
            var23 = a_ArrayImage[a_ArrayB[var2 + 6]];
         }

         var0 -= b_ArrayS[2];
         var1 -= b_ArrayS[3];
         short var13 = 0;
         b_Graphics.getClipX();
         b_Graphics.getClipY();
         b_Graphics.getClipWidth();
         b_Graphics.getClipHeight();
         var13 = b_ArrayS[0];
         short var17 = b_ArrayS[1];
         if (var13 <= 0 || var17 <= 0) {
            return;
         }

         if (o_I == -1) {
            b_Graphics.drawRegion(var23, b_ArrayS[4], b_ArrayS[5], var13, var17, 0, var0, var1, 20);
            return;
         }

         b_Graphics.drawRegion(var23, b_ArrayS[4], b_ArrayS[5], var13, var17, o_I, var0, var1, 20);
         o_I = -1;
      }
   }

   public static void method_a_I_I_I_I_V(int var0, int var1, int var2, int var3) {
      var0 += method_a_I_I_I(var2, 2);
      var1 += method_a_I_I_I(var2, 3);
      if ((var3 & 1) == 1) {
         var0 -= method_a_I_I_I(var2, 0) / 2;
      }

      if ((var3 & 8) == 8) {
         var0 -= method_a_I_I_I(var2, 0);
      }

      if ((var3 & 2) == 2) {
         var1 -= method_a_I_I_I(var2, 1) / 2;
      }

      if ((var3 & 32) == 32) {
         var1 -= method_a_I_I_I(var2, 1);
      }

      method_a_I_I_I_V(var0, var1, var2);
   }

   public static void method_a_I_I_I_I_I_V(int var0, int var1, int var2, int var3, int var4) {
      o_I = 6;
      method_a_I_I_I_I_V(var0, var1, 12, 24);
   }

   public static int method_a_I_I_I(int var0, int var1) {
      if (var0 < 326) {
         return var1 != 2 && var1 != 3 ? a_ArrayB[var0 * 7 + var1] & 0xFF : a_ArrayB[var0 * 7 + var1];
      } else {
         int var2 = a_ArrayS[(var0 - 326 << 1) + 1];
         byte[] var4;
         if ((((var4 = (byte[])a_ArrayObject[a_ArrayS[var0 - 326 << 1]])[var2++] & 4) != 0 ? 2 : 1) == 2) {
            var2 += var1 << 1;
            return (short)(var4[var2] << 8 | var4[var2 + 1] & 0xFF);
         } else {
            return var4[var2 + var1];
         }
      }
   }

   public static int method_b_I_I_I(int var0, int var1) {
      int var2 = a_ArrayS[(var0 - 326 << 1) + 1];
      byte var3;
      byte[] var5;
      int var4 = (var3 = (var5 = (byte[])a_ArrayObject[a_ArrayS[var0 - 326 << 1]])[var2++]) & 3;
      var3 = (byte)((var3 & 4) != 0 ? 2 : 1);
      if (var4 == 1) {
         var2 += var3 << 2;
         short var12 = method_a_ArrayB_I_S(var5, var2);
         var2 += 2;
         int var9;
         var2 = (var9 = var2 + var3 * 3 * var12) + (var3 << 1) * var1;
         return var3 == 1
            ? var5[var2] << 16 & -65536 | var5[var2 + 1] & 65535
            : method_a_ArrayB_I_S(var5, var2) << 16 & -65536 | method_a_ArrayB_I_S(var5, var2 + 2) & 65535;
      } else {
         return 0;
      }
   }

   public static void method_b_I_I_I_I_V(int var0, int var1, int var2, int var3) {
      method_a_I_I_I_V(var0, var1, method_c_I_I_I(var2, var3));
   }

   public static int method_c_I_I_I(int var0, int var1) {
      int var2 = a_ArrayS[(var0 - 326 << 1) + 1];
      byte[] var3 = (byte[])a_ArrayObject[a_ArrayS[var0 - 326 << 1]];
      var2 += 3;
      var2 += var1 * 2;
      return var3[var2] << 8 | var3[var2 + 1] & 0xFF;
   }

   public static int method_b_I_I(int var0) {
      int var1 = a_ArrayS[(var0 - 326 << 1) + 1];
      byte[] var2 = (byte[])a_ArrayObject[a_ArrayS[var0 - 326 << 1]];
      return method_a_ArrayB_I_S(var2, ++var1);
   }

   public static void method_a_Z_V(boolean var0) {
      i_Z = true;
   }

   public static boolean method_c_Z() {
      return i_Z;
   }

   private static void method_a_ArrayB_I_String_V(byte[] var0, int var1, String var2) {
      if (var0 == null) {
         InputStream var6 = a_MIDlet.getClass().getResourceAsStream(var2);

         try {
            var0 = method_a_InputStream_I_ArrayB(var6, -1);
         } catch (Exception var3) {
         }
      }

      byte[] var5 = var0;
      int var4 = var1;
      if (var1 >= 0) {
         a_ArrayObject[var4] = var5;
         a_ArrayZ[var4] = var5 != null;
      }
   }

   public static void method_c_I_I_V(int var0, int var1) {
      synchronized (b_Object) {
         if (e_Z) {
            if (var1 == -1) {
               g_I = var0;
            } else {
               g_I = -1;
            }
         } else {
            g_I = -1;
            byte[] var3;
            if ((var3 = (byte[])method_a_I_Object(var0)) != null) {
               method_d_V();
               if (i_Z) {
                  try {
                     if (var1 == -1) {
                        var1 = -1;
                        s_I = var0;
                     }

                     (a_Player = Manager.createPlayer(new ByteArrayInputStream(var3), "audio/midi")).prefetch();
                     VolumeControl var6;
                     if ((var6 = (VolumeControl)a_Player.getControl("VolumeControl")) != null) {
                        var6.setLevel(r_I);
                     }

                     a_Player.setLoopCount(var1);
                     a_Player.start();
                  } catch (Exception var4) {
                  }
               }
            }
         }
      }
   }

   public static void method_d_V() {
      synchronized (b_Object) {
         g_I = -1;
         if (i_Z && a_Player != null) {
            try {
               if (a_Player.getState() != 0) {
                  a_Player.stop();
                  a_Player.deallocate();
                  a_Player.close();
               }
            } catch (Exception var2) {
            }

            s_I = -1;
            a_Player = null;
         }
      }
   }

   public static void method_b_Z_V(boolean var0) {
      DeviceControl.setLights(0, 100);
   }

   public static void method_h_I_V(int var0) {
      synchronized (b_Object) {
         u_I = 0;
         w_I = 0;
         v_I = 0;
         if (var0 == 1) {
            a_o = new o();
            new Thread(a_o).start();
         } else if (a_o != null) {
            if (var0 != 2 && var0 != 4) {
               if ((var0 == 3 || var0 == 5) && d_Z) {
                  d_Z = false;
                  b_Object.notifyAll();
               }
            } else if (!d_Z) {
               d_Z = true;
               e_Z = true;
               var0 = s_I;
               g_I = s_I;
               h_I = var0;
            }
         }
      }
   }

   public final void run() {
      try {
         if (a_Z) {
            synchronized (a_Object) {
               try {
                  a_Object.wait(500L);

                  while (f_Z) {
                     method_j_V();
                     this.method_j_I_V(2);
                     a_Object.wait(d_I);
                  }
               } catch (InterruptedException var10) {
               }
            }
         } else {
            a_Z = true;
            a_ArrayI = new int[20];
            e_I = 0;
            b_ArrayI = new int[40];
            f_I = 0;
            f_ArrayI = new int[20];
            x_I = 0;
            a_ArrayString = new String[3];
            b_ArrayString = new String[3];
            c_ArrayI = new int[3];
            Display.getDisplay(a_MIDlet).setCurrent(this);
            super.setFullScreenMode(true);
            method_j_V();
            a_Vector = new Vector();
            b_Vector = new Vector();
            (a_Arrayo = new o[1])[0] = a_o;
            a_m = new m();
            method_i_I_V(1);
            method_h_V();

            while (!g_Z) {
               try {
                  while (true) {
                     a_J = System.currentTimeMillis();
                     if (!b_Z) {
                        e_Z = true;
                     }

                     method_j_V();
                     if (e_I > 0) {
                        synchronized (a_ArrayI) {
                           for (int var2 = 0; var2 < e_I; var2++) {
                              a_m.method_c_I_V(a_ArrayI[var2]);
                              a_ArrayI[var2] = 0;
                           }

                           e_I = 0;
                        }

                        synchronized (b_Object) {
                           if (g_I != -1) {
                              if (h_I != g_I) {
                                 method_c_I_I_V(g_I, -1);
                              }

                              g_I = -1;
                           }
                        }
                     }

                     if (method_d_Z()) {
                        for (int var16 = 0; var16 < a_ArrayString.length; var16++) {
                           b_ArrayString[var16] = null;
                        }

                        this.method_i_V();
                        a_J = System.currentTimeMillis();
                     }

                     if (e_Z) {
                        method_l_V();
                     } else {
                        for (int var17 = 0; var17 < a_ArrayString.length; var17++) {
                           if (b_ArrayString[var17] != a_ArrayString[var17]) {
                              if (b_ArrayString[var17] != null && b_ArrayString[var17].equals(a_ArrayString[var17])) {
                                 a_ArrayString[var17] = b_ArrayString[var17];
                              } else {
                                 b_ArrayString[var17] = a_ArrayString[var17];
                              }
                           }
                        }

                        this.method_j_I_V(1);
                        if (e_Z) {
                           method_l_V();
                        } else {
                           method_k_V();
                           if (g_Z) {
                              break;
                           }

                           if (l_Z) {
                              int var18 = A_I;
                              if (A_I >= 10 && var18 <= 19 && System.currentTimeMillis() - d_J > 500L) {
                                 method_k_I_V(var18);
                              }
                           }

                           if (e_Z) {
                              method_l_V();
                           } else {
                              Thread.sleep(1L);
                           }
                        }
                     }
                  }
               } catch (Throwable var13) {
               }
            }

            a_m = null;
            method_d_V();

            for (int var19 = 0; var19 < a_ArrayObject.length; var19++) {
               b_Vector.addElement(new Integer(var19));
            }

            method_g_V();
            a_MIDlet.notifyDestroyed();
         }
      } catch (Throwable var14) {
      }
   }

   private static void method_h_V() {
      b_J = 0L;
      a_I = 0;
      method_c_V();
   }

   private static boolean method_d_Z() {
      return a_Vector.size() > 0 || b_Vector.size() > 0 || f_I > 0;
   }

   private void method_i_V() {
      f_Z = true;
      new Thread(a_o).start();
      method_e_V();
      int var3 = 0;
      int var1 = 0;

      while (var3 < f_I || !a_Vector.isEmpty() || !b_Vector.isEmpty()) {
         if (!b_Vector.isEmpty()) {
            method_g_V();
            System.gc();
         }

         if (!a_Vector.isEmpty()) {
            method_f_V();
            System.gc();
         }

         if (var3 < f_I && (var1 = a_m.method_b_I_I_I(b_ArrayI[var3], var1)) == 0) {
            var3++;
         }
      }

      synchronized (a_Object) {
         f_Z = false;
         a_Object.notify();
      }

      f_I = 0;
      method_h_V();
   }

   private static void method_j_V() {
      int var0 = a_o.getWidth();
      int var1 = a_o.getHeight();
      if (b_I != var0 || c_I != var1) {
         b_I = var0;
         c_I = var1;
         if (a_m != null) {
            method_i_I_V(2);
         }
      }
   }

   private void method_j_I_V(int var1) {
      k_I = var1;
      Graphics var3 = a_o.getGraphics();
      this.method_b_Graphics_V(var3);
      a_o.flushGraphics();
      k_I = 0;
   }

   private static void method_k_V() {
      long var0 = System.currentTimeMillis();
      if (b_J != 0L) {
         if ((a_I = (a_I = (int)(var0 - b_J)) / j_I) > i_I) {
            a_I = i_I;
         }
      } else {
         a_I = 0;
      }

      b_J = var0;
      k_Z = false;

      for (int var2 = 0; var2 < j_I; var2++) {
         for (int var1 = 0; var1 < x_I; var1++) {
            a_m.method_b_I_V(f_ArrayI[var1]);
            f_ArrayI[var1] = -1;
         }

         x_I = 0;
         w_I = u_I | v_I;
         v_I = 0;
         int var3 = a_m.method_a_I_I(0);

         while (var3 != 0) {
            var3 = a_m.method_a_I_I(var3);
         }

         if (method_d_Z()) {
            break;
         }
      }
   }

   private static void method_l_V() {
      synchronized (b_Object) {
         if (!method_d_Z()) {
            e_Z = false;
            method_i_I_V(3);
         }

         if (d_Z) {
            try {
               b_Object.wait();
            } catch (InterruptedException var2) {
            }
         }
      }

      method_h_V();
   }

   private void method_b_Graphics_V(Graphics var1) {
      if (k_I != 0) {
         try {
            Graphics var6 = var1;
            a_Graphics = var1;
            b_Graphics = var6;
            var6.setClip(0, 0, b_I, c_I);
            if (a_m == null) {
               var6.setColor(0);
               var6.fillRect(0, 0, b_I, c_I);
            } else {
               if (!b_Z) {
                  return;
               }

               int var8 = a_m.method_a_I_I_I(0, k_I);

               while (var8 != 0) {
                  var8 = a_m.method_a_I_I_I(var8, k_I);
               }
            }

            var6.setClip(0, 0, b_I, c_I);

            for (int var7 = 0; var7 < 3; var7++) {
               String var9;
               if ((var9 = b_ArrayString[var7]) != null) {
                  int var2 = method_c_I_I(var7);
                  int var3 = 0;
                  int var4 = 0;
                  if ((var2 & 4) == 4) {
                     var3 = 2;
                  }

                  if ((var2 & 8) == 8) {
                     var3 = b_I - 2;
                  }

                  if ((var2 & 1) == 1) {
                     var3 = b_I >> 1;
                  }

                  if ((var2 & 16) == 16) {
                     var4 = 2;
                  }

                  if ((var2 & 32) == 32) {
                     var4 = c_I - 2;
                  }

                  if ((var2 & 2) == 2) {
                     var4 = c_I >> 1;
                  }

                  m.method_a_String_I_I_I_I_V(var9, c_ArrayI[var7], var3, var4, var2);
               }
            }
         } catch (Throwable var5) {
         }
      }
   }

   private static int method_e_I_I(int var0) {
      if (var0 == -7) {
         return 5;
      }

      if (var0 == -6) {
         return 6;
      }

      if (var0 == -5) {
         return 7;
      }

      switch (var0) {
         case 35:
            return 21;
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         default:
            try {
               var0 = a_o.getGameAction(var0);
            } catch (IllegalArgumentException var1) {
               return -1;
            }

            switch (var0) {
               case 1:
                  return 1;
               case 2:
                  return 3;
               case 3:
               case 4:
               default:
                  return -1;
               case 5:
                  return 4;
               case 6:
                  return 2;
            }
         case 42:
            return 20;
         case 48:
            return 10;
         case 49:
            return 11;
         case 50:
            return 12;
         case 51:
            return 13;
         case 52:
            return 14;
         case 53:
            return 15;
         case 54:
            return 16;
         case 55:
            return 17;
         case 56:
            return 18;
         case 57:
            return 19;
      }
   }

   private static void method_d_I_I_V(int var0, int var1) {
      if (!k_Z) {
         if (b_Z) {
            try {
               if ((var1 & 8) == 8) {
                  var0 = method_e_I_I(var0);
               }

               if (t_I == 2) {
                  if (var0 == 15) {
                     var0 = 7;
                  } else if (var0 == 12) {
                     var0 = 1;
                  } else if (var0 == 14) {
                     var0 = 3;
                  } else if (var0 == 18) {
                     var0 = 2;
                  } else if (var0 == 16) {
                     var0 = 4;
                  }
               }

               if (t_I == 3 && (var0 >= 10 && var0 <= 21 || var0 == 21)) {
                  if ((var1 & 1) == 1) {
                     if ((var0 = var0) == 21) {
                        return;
                     }

                     long var4;
                     if ((var4 = System.currentTimeMillis()) - c_J < 700L && var0 == y_I) {
                        z_I++;
                     } else {
                        z_I = 0;
                     }

                     var1 = var0 - 10;
                     if (a_ArrayArrayC[var1].length != 0 && var1 >= 0) {
                        c_J = var4;
                        y_I = var0;
                        char var3 = a_ArrayArrayC[var1][z_I % a_ArrayArrayC[var1].length];
                        char var11 = var3;
                        var0 = var0;
                        if ((var0 != A_I || var11 != a_C) && !l_Z) {
                           A_I = var0;
                           a_C = var11;
                           d_J = System.currentTimeMillis();
                           l_Z = true;
                        }

                        return;
                     }
                  } else if ((var1 & 2) == 2) {
                     if ((var0 = var0) >= 10 && var0 <= 19 && System.currentTimeMillis() - c_J > 1200L) {
                        z_I = 0;
                        c_J = 0L;
                     }

                     method_k_I_V(var0);
                  }
               } else {
                  if ((var1 & 1) == 1) {
                     if (x_I < 20) {
                        f_ArrayI[x_I] = var0;
                        x_I++;
                     }

                     if (var0 != -1) {
                        u_I |= 1 << var0;
                        v_I |= 1 << var0;
                        return;
                     }
                  } else if ((var1 & 2) == 2 && var0 != -1) {
                     u_I &= ~(1 << var0);
                  }
               }
            } catch (Throwable var6) {
            }
         }
      }
   }

   private static void method_k_I_V(int var0) {
      if (var0 == A_I && l_Z) {
         l_Z = false;
         A_I = 999;
         a_C = ' ';
      }
   }

   protected final void keyPressed(int var1) {
      method_d_I_I_V(var1, 9);
   }

   protected final void keyReleased(int var1) {
      method_d_I_I_V(var1, 10);
   }

   protected final void showNotify() {
      method_h_I_V(5);
   }

   protected final void hideNotify() {
      method_h_I_V(4);
   }

   public final void paint(Graphics var1) {
      this.method_b_Graphics_V(var1);
   }

   public final void commandAction(Command var1, Displayable var2) {
   }
}
