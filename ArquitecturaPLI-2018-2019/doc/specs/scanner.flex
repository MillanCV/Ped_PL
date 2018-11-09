package compiler.lexical;
import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

//Produced by MV tools 2018-10-29 10:49:07
// incluir aqui, si es necesario otras importaciones

%%

%public
%class Scanner
%char
%line
%column
%cup
%ignorecase


%implements ScannerIF
%scanerror LexicalError

// incluir aqui, si es necesario otras directivas
%{
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
%}  


//Declaracion de expresiones:

COMENTARIO = #(.)*
DIGITO = [0-9]
ESPACIO_BLANCO = [ \t\r\n\f]
IDENTIFICADOR = ({LETRA}|_)({LETRA}|{DIGITO})*
LETRA = [a-zA-Z]
NUMERO = 0|[1-9]({DIGITO})*
STRING = \"(.)*\"



//FIN Declaracion de expresiones:



%%

<YYINITIAL> 
{


//Declaracion de tokens:

	"("  		{return createToken (sym.PAR_IZDO);}
	")"  		{return createToken (sym.PAR_DCHO);}
	"*"  		{return createToken (sym.PRODUCTO);}
	"+"  		{return createToken (sym.SUMA);}
	","  		{return createToken (sym.COMA);}
	".."  		{return createToken (sym.RANGO);}
	":"  		{return createToken (sym.DOS_PUNTOS);}
	";"  		{return createToken (sym.PUNTO_COMA);}
	"<"  		{return createToken (sym.MENOR);}
	"="  		{return createToken (sym.ASIGNACION);}
	"=="  		{return createToken (sym.EQUIVALENTE);}
	"Subprogramas"  		{return createToken (sym.SUBPROGRAMAS);}
	"["  		{return createToken (sym.COR_IZDO);}
	"\""  		{return createToken (sym.COMILLA_DOBLE);}
	"]"  		{return createToken (sym.COR_DCHO);}
	"booleano"  		{return createToken (sym.BOOLEANO);}
	"cierto"  		{return createToken (sym.CIERTO);}
	"comienzo"  		{return createToken (sym.COMIENZO);}
	"constantes"  		{return createToken (sym.CONSTANTES);}
	"de"  		{return createToken (sym.DE);}
	"devolver"  		{return createToken (sym.DEVOLVER);}
	"en"  		{return createToken (sym.EN);}
	"entero"  		{return createToken (sym.ENTERO);}
	"entonces"  		{return createToken (sym.ENTONCES);}
	"escribir"  		{return createToken (sym.ESCRIBIR);}
	"falso"  		{return createToken (sym.FALSO);}
	"fin"  		{return createToken (sym.FIN);}
	"funcion"  		{return createToken (sym.FUNCION);}
	"no"  		{return createToken (sym.NO);}
	"para"  		{return createToken (sym.PARA);}
	"procedimiento"  		{return createToken (sym.PROCEDIMIENTO);}
	"programa"  		{return createToken (sym.PROGRAMA);}
	"si"  		{return createToken (sym.SI);}
	"sino"  		{return createToken (sym.SINO);}
	"tipos"  		{return createToken (sym.TIPOS);}
	"var"  		{return createToken (sym.VAR);}
	"variables"  		{return createToken (sym.VARIABLES);}
	"vector"  		{return createToken (sym.VECTOR);}
	"y"  		{return createToken (sym.Y);}
	"."  		{return createToken (sym.PUNTO);}
	
	
	
//FIN Declaracion de tokens:

	{NUMERO} 		{return createToken (sym.NUMERO);}
	{IDENTIFICADOR} 		{return createToken (sym.IDENTIFICADOR);}
	{STRING} 		{return createToken (sym.STRING);}


{ESPACIO_BLANCO}	{}

{COMENTARIO}	{}






//Declaracion de errores:

[^] {
		LexicalError error = new LexicalError ();
		error.setLine (yyline + 1);
		error.setColumn (yycolumn + 1);
		error.setLexema (yytext ());
		lexicalErrorManager.lexicalError (error);
	}

//FIN Declaracion de errores:




 }
