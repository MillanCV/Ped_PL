/* The following code was generated by JFlex 1.4.1 on 9/11/18 8:26 */

package compiler.lexical;
import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

//Produced by MV tools 2018-10-29 10:49:07
// incluir aqui, si es necesario otras importaciones


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 9/11/18 8:26 from the specification file
 * <tt>/Users/millancastro/Desktop/Ped_PLD/ArquitecturaPLI-2018-2019/doc/specs/scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner, ScannerIF {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  4,  2,  0,  4,  4,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     4,  0,  9,  1,  0,  0,  0,  0, 13, 14, 15, 16, 17,  0, 18,  0, 
     7,  3,  3,  3,  3,  3,  3,  3,  3,  3, 19, 20, 21, 22,  0,  0, 
     0, 29, 24, 35, 38, 34, 10, 28,  6, 11,  6,  6, 33, 30, 12, 27, 
    25,  6, 26,  8, 36, 23, 39,  6,  6, 40, 37, 31,  0, 32,  0,  5, 
     0, 29, 24, 35, 38, 34, 10, 28,  6, 11,  6,  6, 33, 30, 12, 27, 
    25,  6, 26,  8, 36, 23, 39,  6,  6, 40, 37,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\1\1\4\1\5"+
    "\2\4\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\2\4\1\20\1\21\5\4\1\22"+
    "\1\3\1\23\1\4\1\0\1\24\3\4\1\25\1\26"+
    "\1\27\4\4\1\30\3\4\1\31\4\4\1\32\14\4"+
    "\1\33\1\4\1\34\6\4\1\35\14\4\1\36\11\4"+
    "\1\37\12\4\1\40\1\41\4\4\1\42\1\4\1\43"+
    "\12\4\1\44\1\45\1\4\1\46\1\47\1\4\1\50"+
    "\1\51\4\4\1\52\2\4\1\53\2\4\1\54\1\4"+
    "\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\51\0\173\0\244\0\315\0\366"+
    "\0\u011f\0\u0148\0\u0171\0\51\0\51\0\51\0\51\0\51"+
    "\0\u019a\0\51\0\51\0\51\0\u01c3\0\u01ec\0\u0215\0\51"+
    "\0\51\0\u023e\0\u0267\0\u0290\0\u02b9\0\u02e2\0\244\0\51"+
    "\0\u030b\0\u0334\0\u011f\0\u011f\0\u035d\0\u0386\0\u03af\0\244"+
    "\0\51\0\51\0\u03d8\0\u0401\0\u042a\0\u0453\0\u047c\0\u04a5"+
    "\0\u04ce\0\u04f7\0\u0520\0\u0549\0\u0572\0\u059b\0\u05c4\0\u05ed"+
    "\0\u0616\0\u063f\0\u0668\0\u0691\0\u06ba\0\u06e3\0\u070c\0\u0735"+
    "\0\u075e\0\u0787\0\u07b0\0\u07d9\0\u0802\0\u082b\0\244\0\u0854"+
    "\0\u087d\0\u08a6\0\u08cf\0\u08f8\0\u0921\0\244\0\u094a\0\u0973"+
    "\0\u099c\0\u09c5\0\u09ee\0\u0a17\0\u0a40\0\u0a69\0\u0a92\0\u0abb"+
    "\0\u0ae4\0\u0b0d\0\244\0\u0b36\0\u0b5f\0\u0b88\0\u0bb1\0\u0bda"+
    "\0\u0c03\0\u0c2c\0\u0c55\0\u0c7e\0\244\0\u0ca7\0\u0cd0\0\u0cf9"+
    "\0\u0d22\0\u0d4b\0\u0d74\0\u0d9d\0\u0dc6\0\u0def\0\u0e18\0\244"+
    "\0\244\0\u0e41\0\u0e6a\0\u0e93\0\u0ebc\0\244\0\u0ee5\0\244"+
    "\0\u0f0e\0\u0f37\0\u0f60\0\u0f89\0\u0fb2\0\u0fdb\0\u1004\0\u102d"+
    "\0\u1056\0\u107f\0\244\0\244\0\u10a8\0\244\0\244\0\u10d1"+
    "\0\244\0\244\0\u10fa\0\u1123\0\u114c\0\u1175\0\244\0\u119e"+
    "\0\u11c7\0\244\0\u11f0\0\u1219\0\244\0\u1242\0\244";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\4\2\6\1\7\1\10"+
    "\1\11\1\12\1\6\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\6\1\26"+
    "\1\27\5\6\1\30\1\31\1\6\1\32\1\33\1\34"+
    "\1\6\1\35\1\36\1\37\51\0\2\3\1\0\46\3"+
    "\3\0\1\5\3\0\1\5\44\0\1\6\2\0\3\6"+
    "\1\0\3\6\12\0\10\6\2\0\10\6\10\0\1\40"+
    "\43\0\1\6\2\0\3\6\1\0\1\6\1\41\1\6"+
    "\12\0\1\42\7\6\2\0\10\6\2\43\1\0\6\43"+
    "\1\44\37\43\3\0\1\6\2\0\3\6\1\0\1\6"+
    "\1\45\1\6\12\0\1\46\5\6\1\47\1\6\2\0"+
    "\10\6\3\0\1\6\2\0\3\6\1\0\3\6\12\0"+
    "\4\6\1\50\3\6\2\0\10\6\22\0\1\51\54\0"+
    "\1\52\25\0\1\6\2\0\3\6\1\0\3\6\12\0"+
    "\4\6\1\53\3\6\2\0\10\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\3\6\1\54\2\6\1\55"+
    "\1\6\2\0\10\6\3\0\1\6\2\0\2\6\1\56"+
    "\1\0\2\6\1\57\12\0\10\6\2\0\10\6\3\0"+
    "\1\6\2\0\3\6\1\0\1\6\1\60\1\6\12\0"+
    "\4\6\1\61\3\6\2\0\10\6\3\0\1\6\2\0"+
    "\3\6\1\0\1\6\1\62\1\6\12\0\10\6\2\0"+
    "\10\6\3\0\1\6\2\0\3\6\1\0\3\6\12\0"+
    "\10\6\2\0\1\6\1\63\6\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\6\6\1\64\1\6\2\0"+
    "\1\6\1\65\6\6\3\0\1\6\2\0\3\6\1\0"+
    "\2\6\1\66\12\0\10\6\2\0\10\6\3\0\1\6"+
    "\2\0\3\6\1\0\3\6\12\0\1\6\1\67\6\6"+
    "\2\0\10\6\3\0\1\6\2\0\3\6\1\0\2\6"+
    "\1\70\12\0\10\6\2\0\10\6\3\0\1\6\2\0"+
    "\3\6\1\0\2\6\1\71\12\0\10\6\2\0\10\6"+
    "\3\0\1\6\2\0\3\6\1\0\3\6\12\0\10\6"+
    "\2\0\1\72\7\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\4\6\1\73\3\6\2\0\10\6\3\0"+
    "\1\6\2\0\3\6\1\0\3\6\12\0\4\6\1\74"+
    "\3\6\2\0\10\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\3\6\1\75\4\6\2\0\10\6\3\0"+
    "\1\6\2\0\3\6\1\0\3\6\12\0\10\6\2\0"+
    "\2\6\1\76\5\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\10\6\2\0\3\6\1\77\4\6\3\0"+
    "\1\6\2\0\3\6\1\0\3\6\12\0\10\6\2\0"+
    "\1\6\1\100\6\6\3\0\1\6\2\0\3\6\1\0"+
    "\2\6\1\101\12\0\7\6\1\102\2\0\10\6\3\0"+
    "\1\6\2\0\3\6\1\0\3\6\12\0\2\6\1\103"+
    "\5\6\2\0\10\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\10\6\2\0\6\6\1\104\1\6\3\0"+
    "\1\6\2\0\3\6\1\0\3\6\12\0\3\6\1\105"+
    "\4\6\2\0\10\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\10\6\2\0\2\6\1\106\5\6\3\0"+
    "\1\6\2\0\3\6\1\0\3\6\12\0\4\6\1\107"+
    "\3\6\2\0\10\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\2\6\1\110\5\6\2\0\10\6\2\0"+
    "\1\4\1\6\1\4\1\0\3\6\1\0\3\6\12\0"+
    "\10\6\2\0\10\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\10\6\2\0\2\6\1\111\5\6\3\0"+
    "\1\6\2\0\2\6\1\112\1\0\3\6\12\0\10\6"+
    "\2\0\10\6\3\0\1\6\2\0\3\6\1\0\3\6"+
    "\12\0\10\6\2\0\1\113\7\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\5\6\1\114\2\6\2\0"+
    "\2\6\1\115\5\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\6\6\1\116\1\6\2\0\10\6\3\0"+
    "\1\6\2\0\3\6\1\0\3\6\12\0\3\6\1\117"+
    "\4\6\2\0\10\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\4\6\1\120\3\6\2\0\1\6\1\121"+
    "\6\6\3\0\1\6\2\0\3\6\1\0\3\6\12\0"+
    "\3\6\1\122\4\6\2\0\10\6\3\0\1\6\2\0"+
    "\2\6\1\123\1\0\3\6\12\0\10\6\2\0\10\6"+
    "\3\0\1\6\2\0\3\6\1\0\1\6\1\124\1\6"+
    "\12\0\10\6\2\0\10\6\3\0\1\6\2\0\3\6"+
    "\1\0\3\6\12\0\4\6\1\125\3\6\2\0\10\6"+
    "\3\0\1\6\2\0\3\6\1\0\3\6\12\0\4\6"+
    "\1\126\3\6\2\0\10\6\3\0\1\6\2\0\3\6"+
    "\1\0\1\6\1\127\1\6\12\0\10\6\2\0\10\6"+
    "\3\0\1\6\2\0\3\6\1\0\3\6\12\0\10\6"+
    "\2\0\3\6\1\130\4\6\3\0\1\6\2\0\3\6"+
    "\1\0\3\6\12\0\3\6\1\131\4\6\2\0\10\6"+
    "\3\0\1\6\2\0\3\6\1\0\1\6\1\132\1\6"+
    "\12\0\10\6\2\0\10\6\3\0\1\6\2\0\3\6"+
    "\1\0\3\6\12\0\4\6\1\133\3\6\2\0\10\6"+
    "\3\0\1\6\2\0\3\6\1\0\3\6\12\0\10\6"+
    "\2\0\1\6\1\134\6\6\3\0\1\6\2\0\3\6"+
    "\1\0\3\6\12\0\3\6\1\135\4\6\2\0\10\6"+
    "\3\0\1\6\2\0\3\6\1\0\3\6\12\0\10\6"+
    "\2\0\1\6\1\136\6\6\3\0\1\6\2\0\3\6"+
    "\1\0\1\6\1\137\1\6\12\0\10\6\2\0\10\6"+
    "\3\0\1\6\2\0\3\6\1\0\2\6\1\140\12\0"+
    "\10\6\2\0\10\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\3\6\1\141\4\6\2\0\10\6\3\0"+
    "\1\6\2\0\3\6\1\0\3\6\12\0\10\6\2\0"+
    "\3\6\1\142\4\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\10\6\2\0\3\6\1\143\4\6\3\0"+
    "\1\6\2\0\3\6\1\0\3\6\12\0\10\6\2\0"+
    "\1\6\1\144\6\6\3\0\1\6\2\0\2\6\1\145"+
    "\1\0\3\6\12\0\10\6\2\0\10\6\3\0\1\6"+
    "\2\0\3\6\1\0\3\6\12\0\10\6\2\0\1\146"+
    "\7\6\3\0\1\6\2\0\3\6\1\0\3\6\12\0"+
    "\6\6\1\147\1\6\2\0\10\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\4\6\1\150\3\6\2\0"+
    "\10\6\3\0\1\6\2\0\3\6\1\0\3\6\12\0"+
    "\4\6\1\151\3\6\2\0\10\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\4\6\1\152\3\6\2\0"+
    "\10\6\3\0\1\6\2\0\3\6\1\0\3\6\12\0"+
    "\6\6\1\153\1\6\2\0\10\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\6\6\1\154\1\6\2\0"+
    "\10\6\3\0\1\6\2\0\3\6\1\0\3\6\12\0"+
    "\10\6\2\0\5\6\1\155\2\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\1\6\1\156\6\6\2\0"+
    "\10\6\3\0\1\6\2\0\3\6\1\0\3\6\12\0"+
    "\10\6\2\0\2\6\1\157\5\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\4\6\1\160\3\6\2\0"+
    "\10\6\3\0\1\6\2\0\3\6\1\0\3\6\12\0"+
    "\4\6\1\161\3\6\2\0\10\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\6\6\1\162\1\6\2\0"+
    "\10\6\3\0\1\6\2\0\3\6\1\0\2\6\1\163"+
    "\12\0\10\6\2\0\10\6\3\0\1\6\2\0\3\6"+
    "\1\0\3\6\12\0\10\6\2\0\6\6\1\164\1\6"+
    "\3\0\1\6\2\0\3\6\1\0\3\6\12\0\1\6"+
    "\1\165\6\6\2\0\10\6\3\0\1\6\2\0\3\6"+
    "\1\0\3\6\12\0\3\6\1\166\4\6\2\0\10\6"+
    "\3\0\1\6\2\0\3\6\1\0\3\6\12\0\5\6"+
    "\1\167\2\6\2\0\10\6\3\0\1\6\2\0\3\6"+
    "\1\0\2\6\1\170\12\0\10\6\2\0\10\6\3\0"+
    "\1\6\2\0\3\6\1\0\2\6\1\171\12\0\10\6"+
    "\2\0\10\6\3\0\1\6\2\0\3\6\1\0\3\6"+
    "\12\0\7\6\1\172\2\0\10\6\3\0\1\6\2\0"+
    "\3\6\1\0\1\6\1\173\1\6\12\0\10\6\2\0"+
    "\10\6\3\0\1\6\2\0\3\6\1\0\1\6\1\174"+
    "\1\6\12\0\10\6\2\0\10\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\10\6\2\0\1\6\1\175"+
    "\6\6\3\0\1\6\2\0\3\6\1\0\2\6\1\176"+
    "\12\0\10\6\2\0\10\6\3\0\1\6\2\0\3\6"+
    "\1\0\3\6\12\0\10\6\2\0\4\6\1\177\3\6"+
    "\3\0\1\6\2\0\3\6\1\0\3\6\12\0\10\6"+
    "\2\0\1\6\1\200\6\6\3\0\1\6\2\0\3\6"+
    "\1\0\3\6\12\0\10\6\2\0\1\201\7\6\3\0"+
    "\1\6\2\0\3\6\1\0\3\6\12\0\3\6\1\202"+
    "\4\6\2\0\10\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\4\6\1\203\3\6\2\0\10\6\3\0"+
    "\1\6\2\0\3\6\1\0\3\6\12\0\6\6\1\204"+
    "\1\6\2\0\10\6\3\0\1\6\2\0\3\6\1\0"+
    "\3\6\12\0\7\6\1\205\2\0\10\6\3\0\1\6"+
    "\2\0\3\6\1\0\3\6\12\0\3\6\1\206\4\6"+
    "\2\0\10\6\3\0\1\6\2\0\2\6\1\207\1\0"+
    "\3\6\12\0\10\6\2\0\10\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\10\6\2\0\3\6\1\210"+
    "\4\6\3\0\1\6\2\0\3\6\1\0\3\6\12\0"+
    "\4\6\1\211\3\6\2\0\10\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\3\6\1\212\4\6\2\0"+
    "\10\6\3\0\1\6\2\0\3\6\1\0\3\6\12\0"+
    "\10\6\2\0\1\6\1\213\6\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\6\6\1\214\1\6\2\0"+
    "\10\6\3\0\1\6\2\0\3\6\1\0\1\6\1\215"+
    "\1\6\12\0\10\6\2\0\10\6\3\0\1\6\2\0"+
    "\3\6\1\0\3\6\12\0\10\6\2\0\1\6\1\216"+
    "\6\6\3\0\1\6\2\0\2\6\1\217\1\0\3\6"+
    "\12\0\10\6\2\0\10\6\3\0\1\6\2\0\3\6"+
    "\1\0\3\6\12\0\7\6\1\220\2\0\10\6\3\0"+
    "\1\6\2\0\3\6\1\0\3\6\12\0\10\6\2\0"+
    "\1\6\1\221\6\6\3\0\1\6\2\0\2\6\1\222"+
    "\1\0\3\6\12\0\10\6\2\0\10\6\3\0\1\6"+
    "\2\0\3\6\1\0\3\6\12\0\6\6\1\223\1\6"+
    "\2\0\10\6\3\0\1\6\2\0\3\6\1\0\2\6"+
    "\1\224\12\0\10\6\2\0\10\6\3\0\1\6\2\0"+
    "\2\6\1\225\1\0\3\6\12\0\10\6\2\0\10\6"+
    "\3\0\1\6\2\0\3\6\1\0\3\6\12\0\10\6"+
    "\2\0\3\6\1\226\4\6\3\0\1\6\2\0\3\6"+
    "\1\0\3\6\12\0\4\6\1\227\3\6\2\0\10\6";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4715];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\7\1\5\11\1\1\3\11"+
    "\3\1\2\11\6\1\1\11\2\1\1\0\5\1\2\11"+
    "\155\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
 LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
 private int commentCount = 0;
 int linecom=0;
 int columncom=0;
 int contadorstring=0;


 //Funcion para crear tokens

 Token createToken (int x)	{
 	Token token = new Token (x);
 	 token.setLine (yyline + 1);
 	 token.setColumn (yycolumn + 1);
 	 token.setLexema (yytext ());
 	 return token;
}

 LexicalError createError(String mensaje){
	LexicalError error = new LexicalError (mensaje);
	error.setLine (yyline + 1);
	error.setColumn (yycolumn + 1);
	error.setLexema (yytext ());
	lexicalErrorManager.lexicalError (mensaje);
	 return error;
}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) throws LexicalError {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new LexicalError(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws LexicalError {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, LexicalError {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 43: 
          { return createToken (sym.CONSTANTES);
          }
        case 46: break;
        case 27: 
          { return createToken (sym.VAR);
          }
        case 47: break;
        case 37: 
          { return createToken (sym.PROGRAMA);
          }
        case 48: break;
        case 20: 
          { return createToken (sym.STRING);
          }
        case 49: break;
        case 18: 
          { return createToken (sym.Y);
          }
        case 50: break;
        case 4: 
          { return createToken (sym.IDENTIFICADOR);
          }
        case 51: break;
        case 15: 
          { return createToken (sym.ASIGNACION);
          }
        case 52: break;
        case 5: 
          { return createToken (sym.COMILLA_DOBLE);
          }
        case 53: break;
        case 26: 
          { return createToken (sym.FIN);
          }
        case 54: break;
        case 33: 
          { return createToken (sym.CIERTO);
          }
        case 55: break;
        case 14: 
          { return createToken (sym.MENOR);
          }
        case 56: break;
        case 22: 
          { return createToken (sym.RANGO);
          }
        case 57: break;
        case 1: 
          { LexicalError error = new LexicalError ();
		error.setLine (yyline + 1);
		error.setColumn (yycolumn + 1);
		error.setLexema (yytext ());
		lexicalErrorManager.lexicalError (error);
          }
        case 58: break;
        case 35: 
          { return createToken (sym.FUNCION);
          }
        case 59: break;
        case 10: 
          { return createToken (sym.COMA);
          }
        case 60: break;
        case 19: 
          { return createToken (sym.SI);
          }
        case 61: break;
        case 8: 
          { return createToken (sym.PRODUCTO);
          }
        case 62: break;
        case 6: 
          { return createToken (sym.PAR_IZDO);
          }
        case 63: break;
        case 40: 
          { return createToken (sym.COMIENZO);
          }
        case 64: break;
        case 45: 
          { return createToken (sym.PROCEDIMIENTO);
          }
        case 65: break;
        case 42: 
          { return createToken (sym.VARIABLES);
          }
        case 66: break;
        case 23: 
          { return createToken (sym.EQUIVALENTE);
          }
        case 67: break;
        case 41: 
          { return createToken (sym.DEVOLVER);
          }
        case 68: break;
        case 39: 
          { return createToken (sym.ENTONCES);
          }
        case 69: break;
        case 21: 
          { return createToken (sym.NO);
          }
        case 70: break;
        case 12: 
          { return createToken (sym.DOS_PUNTOS);
          }
        case 71: break;
        case 16: 
          { return createToken (sym.COR_IZDO);
          }
        case 72: break;
        case 31: 
          { return createToken (sym.TIPOS);
          }
        case 73: break;
        case 25: 
          { return createToken (sym.DE);
          }
        case 74: break;
        case 30: 
          { return createToken (sym.FALSO);
          }
        case 75: break;
        case 34: 
          { return createToken (sym.VECTOR);
          }
        case 76: break;
        case 7: 
          { return createToken (sym.PAR_DCHO);
          }
        case 77: break;
        case 44: 
          { return createToken (sym.SUBPROGRAMAS);
          }
        case 78: break;
        case 38: 
          { return createToken (sym.ESCRIBIR);
          }
        case 79: break;
        case 13: 
          { return createToken (sym.PUNTO_COMA);
          }
        case 80: break;
        case 32: 
          { return createToken (sym.ENTERO);
          }
        case 81: break;
        case 11: 
          { return createToken (sym.PUNTO);
          }
        case 82: break;
        case 29: 
          { return createToken (sym.PARA);
          }
        case 83: break;
        case 9: 
          { return createToken (sym.SUMA);
          }
        case 84: break;
        case 3: 
          { return createToken (sym.NUMERO);
          }
        case 85: break;
        case 17: 
          { return createToken (sym.COR_DCHO);
          }
        case 86: break;
        case 28: 
          { return createToken (sym.SINO);
          }
        case 87: break;
        case 36: 
          { return createToken (sym.BOOLEANO);
          }
        case 88: break;
        case 24: 
          { return createToken (sym.EN);
          }
        case 89: break;
        case 2: 
          { 
          }
        case 90: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
