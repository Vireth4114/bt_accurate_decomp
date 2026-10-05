import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public final class q {
   private static q a_q = null;
   private static DataInputStream a_DataInputStream = null;
   private static String a_String;

   private q() {
   }

   private static String method_a_String_String_String_String(String var0, String var1, String var2) {
      int var3;
      do {
         if ((var3 = var0.indexOf(var1)) >= 0) {
            var0 = var0.substring(0, var3) + var2 + var0.substring(var3 + var1.length());
         }
      } while (var3 >= 0);

      return var0;
   }

   public static String method_a_I_String(int var0) {
      return method_a_I_ArrayString_String(var0, null);
   }

   public static synchronized String method_a_I_ArrayString_String(int var0, String[] var1) {
      if (a_String == null) {
         a_String = System.getProperty("microedition.locale");
      }

      try {
         if (a_q == null) {
            a_q = new q();
         }

         if (a_DataInputStream == null) {
            InputStream var2;
            if ((var2 = a_q.getClass().getResourceAsStream("/lang." + a_String)) == null) {
               var2 = a_q.getClass().getResourceAsStream("/lang.xx");
            }

            if (var2 == null) {
               return "X";
            }

            (a_DataInputStream = new DataInputStream(var2)).mark(512);
         }

         a_DataInputStream.skipBytes(var0 << 1);
         int var6 = a_DataInputStream.readUnsignedShort();
         a_DataInputStream.skipBytes(var6 - (var0 << 1) - 2);
         String var5 = a_DataInputStream.readUTF();
         if (!a_DataInputStream.markSupported()) {
            a_DataInputStream.close();
            a_DataInputStream = null;
         } else {
            try {
               a_DataInputStream.reset();
            } catch (IOException var3) {
               a_DataInputStream.close();
               a_DataInputStream = null;
            }
         }

         if (var1 != null) {
            if (var1.length == 1) {
               var5 = method_a_String_String_String_String(var5, "%U", var1[0]);
            } else {
               for (int var7 = 0; var7 < var1.length; var7++) {
                  var5 = method_a_String_String_String_String(var5, "%" + var7 + "U", var1[var7]);
               }
            }
         }

         return var5;
      } catch (IOException var4) {
         a_DataInputStream = null;
         return "E";
      }
   }

   private static boolean method_a_String_String_I_I_Z(String var0, String var1, int var2, int var3) {
      while (var2 != var0.length() || var3 != var1.length()) {
         if (var2 == var0.length() || var3 == var1.length()) {
            return false;
         }

         switch (var1.charAt(var3)) {
            case '*':
               if (var3 == var1.length() - 1) {
                  return true;
               }

               if (method_a_String_String_I_I_Z(var0, var1, var2, var3 + 1)) {
                  return true;
               }

               var2++;
               break;
            case '?':
               var2++;
               var3++;
               break;
            default:
               if (var0.charAt(var2) != var1.charAt(var3)) {
                  return false;
               }

               var2++;
               var3++;
         }
      }

      return true;
   }

   private static StringBuffer method_a_InputStream_StringBuffer(InputStream var0) {
      StringBuffer var1 = new StringBuffer();

      try {
         if ((char)var0.read() != ' ') {
            return var1;
         }

         int var2;
         while ((var2 = var0.read()) >= 0) {
            if ((char)var2 != '\r') {
               if ((char)var2 == '\n') {
                  var1.append((Object)method_a_InputStream_StringBuffer(var0));
                  break;
               }

               var1.append((char)var2);
            }
         }
      } catch (IOException var3) {
      }

      return var1;
   }

   static {
      String var0 = System.getProperty("microedition.platform");
      boolean var1 = false;
      StringBuffer var2 = new StringBuffer();
      if (a_q == null) {
         a_q = new q();
      }

      label78: {
         InputStream var3;
         if ((var3 = a_q.getClass().getResourceAsStream("/META-INF/MANIFEST.MF")) != null) {
            label69:
            while (true) {
               while (true) {
                  try {
                     int var4;
                     if ((var4 = var3.read()) < 0) {
                        break label78;
                     }

                     if ((char)var4 != '\r') {
                        if ((char)var4 != '\n') {
                           var2.append((char)var4);
                        } else if (!var2.toString().trim().startsWith("Nokia-Platform:")) {
                           var2.delete(0, var2.length());
                        } else {
                           var2.append((Object)method_a_InputStream_StringBuffer(var3));
                           break;
                        }
                     }
                  } catch (IOException var6) {
                  }
               }

               String var11 = var2.toString().trim().substring(15);
               Vector var7 = new Vector();
               boolean var8 = false;

               while ((var9 = var11.indexOf("@")) != -1) {
                  var7.addElement(var11.substring(0, var9));
                  var11 = var11.substring(var9 + 1, var11.length());
               }

               var7.addElement(var11);
               int var10 = 0;

               while (true) {
                  if (var10 >= var7.size()) {
                     break label69;
                  }

                  String var5 = ((String)var7.elementAt(var10)).trim();
                  if (method_a_String_String_I_I_Z(var0, var5, 0, 0)) {
                     var1 = true;
                     break label69;
                  }

                  var10++;
               }
            }
         }

         if (!var1) {
            System.exit(0);
         }
      }

      a_String = null;
   }
}
