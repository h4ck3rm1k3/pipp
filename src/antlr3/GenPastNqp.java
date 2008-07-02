// $ANTLR 3.0.1 src/antlr3/GenPastNqp.g 2008-07-02 16:59:35

  import java.util.regex.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GenPastNqp extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "NOQUOTE_STRING", "STMTS", "SCALAR", "ARRAY", "FUNCTION", "PREFIX", "SEA", "CODE_START", "CODE_END", "WS", "DOUBLEQUOTE_STRING", "SINGLEQUOTE_STRING", "ECHO", "VAR_DUMP", "PAREN_OPEN", "PAREN_CLOSE", "IDENT", "VAR_NAME", "DIGITS", "INTEGER", "NUMBER", "MINUS", "PLUS", "MUL_OP", "BITWISE_OP", "ASSIGN_OP", "REL_OP", "IF", "ELSE", "';'", "'{'", "'}'", "'['", "']'"
    };
    public static final int FUNCTION=9;
    public static final int INTEGER=24;
    public static final int PREFIX=10;
    public static final int CODE_START=12;
    public static final int PAREN_CLOSE=20;
    public static final int BITWISE_OP=29;
    public static final int DIGITS=23;
    public static final int ELSE=33;
    public static final int NUMBER=25;
    public static final int STMTS=6;
    public static final int MINUS=26;
    public static final int EOF=-1;
    public static final int VAR_NAME=22;
    public static final int IF=32;
    public static final int ASSIGN_OP=30;
    public static final int CODE_END=13;
    public static final int ECHO=17;
    public static final int WS=14;
    public static final int REL_OP=31;
    public static final int NOQUOTE_STRING=5;
    public static final int DOUBLEQUOTE_STRING=15;
    public static final int SCALAR=7;
    public static final int VAR_DUMP=18;
    public static final int SINGLEQUOTE_STRING=16;
    public static final int IDENT=21;
    public static final int PROGRAM=4;
    public static final int PLUS=27;
    public static final int PAREN_OPEN=19;
    public static final int SEA=11;
    public static final int ARRAY=8;
    public static final int MUL_OP=28;

        public GenPastNqp(TreeNodeStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "src/antlr3/GenPastNqp.g"; }



    // $ANTLR start gen_past_nqp
    // src/antlr3/GenPastNqp.g:21:1: gen_past_nqp : ^( PROGRAM ( node )* ) ;
    public final void gen_past_nqp() throws RecognitionException {
        try {
            // src/antlr3/GenPastNqp.g:22:3: ( ^( PROGRAM ( node )* ) )
            // src/antlr3/GenPastNqp.g:22:5: ^( PROGRAM ( node )* )
            {

                  System.out.println( 
                      "\n"
                    + "# Do not edit this file.\n"
                    + "# This file has been generated by GenPastNqp.g.\n"
                    + "\n"
                    + "sub php_entry ()\n"
                    + "{\n"
                    + "    PAST::Block.new(\n"
                  );
                
            match(input,PROGRAM,FOLLOW_PROGRAM_in_gen_past_nqp68); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // src/antlr3/GenPastNqp.g:33:16: ( node )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=NOQUOTE_STRING && LA1_0<=ARRAY)||LA1_0==PREFIX||(LA1_0>=DOUBLEQUOTE_STRING && LA1_0<=VAR_DUMP)||(LA1_0>=INTEGER && LA1_0<=IF)) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // src/antlr3/GenPastNqp.g:33:16: node
                	    {
                	    pushFollow(FOLLOW_node_in_gen_past_nqp70);
                	    node();
                	    _fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

                  System.out.println( 
                      "\n"
                    + "    );\n"
                    + "}\n"
                  );
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end gen_past_nqp


    // $ANTLR start node
    // src/antlr3/GenPastNqp.g:43:1: node : ( ^( ECHO node ) | ^( VAR_DUMP node ) | NOQUOTE_STRING | SINGLEQUOTE_STRING | DOUBLEQUOTE_STRING | NUMBER | INTEGER | ^(infix= ( PLUS | MINUS | MUL_OP | BITWISE_OP ) node node ) | ^(prefix= PREFIX node ) | ^( REL_OP node node ) | ^( IF node node ( node )? ) | ^( STMTS ( node )* ) | ^( ASSIGN_OP node node ) | SCALAR | ^( ARRAY node ) );
    public final void node() throws RecognitionException {
        CommonTree infix=null;
        CommonTree prefix=null;
        CommonTree NOQUOTE_STRING1=null;
        CommonTree SINGLEQUOTE_STRING2=null;
        CommonTree DOUBLEQUOTE_STRING3=null;
        CommonTree NUMBER4=null;
        CommonTree INTEGER5=null;
        CommonTree REL_OP6=null;
        CommonTree SCALAR7=null;
        CommonTree ARRAY8=null;

        try {
            // src/antlr3/GenPastNqp.g:44:3: ( ^( ECHO node ) | ^( VAR_DUMP node ) | NOQUOTE_STRING | SINGLEQUOTE_STRING | DOUBLEQUOTE_STRING | NUMBER | INTEGER | ^(infix= ( PLUS | MINUS | MUL_OP | BITWISE_OP ) node node ) | ^(prefix= PREFIX node ) | ^( REL_OP node node ) | ^( IF node node ( node )? ) | ^( STMTS ( node )* ) | ^( ASSIGN_OP node node ) | SCALAR | ^( ARRAY node ) )
            int alt4=15;
            switch ( input.LA(1) ) {
            case ECHO:
                {
                alt4=1;
                }
                break;
            case VAR_DUMP:
                {
                alt4=2;
                }
                break;
            case NOQUOTE_STRING:
                {
                alt4=3;
                }
                break;
            case SINGLEQUOTE_STRING:
                {
                alt4=4;
                }
                break;
            case DOUBLEQUOTE_STRING:
                {
                alt4=5;
                }
                break;
            case NUMBER:
                {
                alt4=6;
                }
                break;
            case INTEGER:
                {
                alt4=7;
                }
                break;
            case MINUS:
            case PLUS:
            case MUL_OP:
            case BITWISE_OP:
                {
                alt4=8;
                }
                break;
            case PREFIX:
                {
                alt4=9;
                }
                break;
            case REL_OP:
                {
                alt4=10;
                }
                break;
            case IF:
                {
                alt4=11;
                }
                break;
            case STMTS:
                {
                alt4=12;
                }
                break;
            case ASSIGN_OP:
                {
                alt4=13;
                }
                break;
            case SCALAR:
                {
                alt4=14;
                }
                break;
            case ARRAY:
                {
                alt4=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("43:1: node : ( ^( ECHO node ) | ^( VAR_DUMP node ) | NOQUOTE_STRING | SINGLEQUOTE_STRING | DOUBLEQUOTE_STRING | NUMBER | INTEGER | ^(infix= ( PLUS | MINUS | MUL_OP | BITWISE_OP ) node node ) | ^(prefix= PREFIX node ) | ^( REL_OP node node ) | ^( IF node node ( node )? ) | ^( STMTS ( node )* ) | ^( ASSIGN_OP node node ) | SCALAR | ^( ARRAY node ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // src/antlr3/GenPastNqp.g:44:5: ^( ECHO node )
                    {

                          System.out.println( 
                              "    PAST::Op.new(                                                   \n"
                            + "       :name( 'echo' ),                                             \n"
                          );
                        
                    match(input,ECHO,FOLLOW_ECHO_in_node100); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_node_in_node102);
                    node();
                    _fsp--;


                    match(input, Token.UP, null); 

                          System.out.println(  
                              "    ),                                                            \n"
                          );
                        

                    }
                    break;
                case 2 :
                    // src/antlr3/GenPastNqp.g:56:5: ^( VAR_DUMP node )
                    {

                          System.out.println( 
                              "    PAST::Op.new(                                                   \n"
                            + "       :name( 'var_dump' ),                                             \n"
                          );
                        
                    match(input,VAR_DUMP,FOLLOW_VAR_DUMP_in_node124); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_node_in_node126);
                    node();
                    _fsp--;


                    match(input, Token.UP, null); 

                          System.out.println(  
                              "    ),                                                            \n"
                          );
                        

                    }
                    break;
                case 3 :
                    // src/antlr3/GenPastNqp.g:68:5: NOQUOTE_STRING
                    {
                    NOQUOTE_STRING1=(CommonTree)input.LT(1);
                    match(input,NOQUOTE_STRING,FOLLOW_NOQUOTE_STRING_in_node140); 

                          String noquote = NOQUOTE_STRING1.getText();
                          noquote = noquote.replace( "\n", "\\n" );
                          System.out.println( 
                              "     # NOQUOTE_STRING \n"
                            + "     PAST::Val.new(\n"
                            + "         :returns( 'String' ),\n"
                            + "         :value(\"" + noquote + "\")\n"
                            + "      ),\n"
                          );
                        

                    }
                    break;
                case 4 :
                    // src/antlr3/GenPastNqp.g:80:5: SINGLEQUOTE_STRING
                    {
                    SINGLEQUOTE_STRING2=(CommonTree)input.LT(1);
                    match(input,SINGLEQUOTE_STRING,FOLLOW_SINGLEQUOTE_STRING_in_node152); 

                          String singlequote = SINGLEQUOTE_STRING2.getText();
                          singlequote = singlequote.replace( "\n", "\\n" );
                          System.out.println( 
                              " # SINGLEQUOTE_STRING \n"
                            + "     PAST::Val.new(                                              \n"
                            + "         :returns( 'String' ),                                   \n"
                            + "         :value(" + singlequote + ")                             \n"
                            + "      ),                                                         \n"
                          );
                        

                    }
                    break;
                case 5 :
                    // src/antlr3/GenPastNqp.g:92:5: DOUBLEQUOTE_STRING
                    {
                    DOUBLEQUOTE_STRING3=(CommonTree)input.LT(1);
                    match(input,DOUBLEQUOTE_STRING,FOLLOW_DOUBLEQUOTE_STRING_in_node164); 

                          String doublequote = DOUBLEQUOTE_STRING3.getText();
                          doublequote = doublequote.replace( "\n", "\\n" );
                          System.out.println( 
                              " # DOUBLEQUOTE_STRING \n"
                            + "     PAST::Val.new(                                              \n"
                            + "         :returns( 'String' ),                                   \n"
                            + "         :value(" + doublequote + ")                          \n"
                            + "      ),                                                         \n"
                          );
                        

                    }
                    break;
                case 6 :
                    // src/antlr3/GenPastNqp.g:104:5: NUMBER
                    {
                    NUMBER4=(CommonTree)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_node176); 

                          System.out.println( 
                              "     PAST::Val.new(                                              \n"
                            + "         :returns( 'Float' ),                                    \n"
                            + "         :value('" + NUMBER4.getText() + "')                          \n"
                            + "      ),                                                         \n"
                          );
                        

                    }
                    break;
                case 7 :
                    // src/antlr3/GenPastNqp.g:113:5: INTEGER
                    {
                    INTEGER5=(CommonTree)input.LT(1);
                    match(input,INTEGER,FOLLOW_INTEGER_in_node188); 

                          System.out.println( 
                              "     PAST::Val.new(                                              \n"
                            + "         :returns( 'Integer' ),                                  \n"
                            + "         :value('" + INTEGER5.getText() + "')                         \n"
                            + "      ),                                                         \n"
                          );
                        

                    }
                    break;
                case 8 :
                    // src/antlr3/GenPastNqp.g:122:5: ^(infix= ( PLUS | MINUS | MUL_OP | BITWISE_OP ) node node )
                    {
                    infix=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=MINUS && input.LA(1)<=BITWISE_OP) ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_node204);    throw mse;
                    }


                     
                             // Todo. This is not nice, handle pirops in Pipp.g
                             String op = infix.getText();
                             String pirop = "";
                             if      ( op.equals( "+" ) )  { pirop = "n_add"; }
                             else if ( op.equals( "-" ) )  { pirop = "n_sub"; }
                             else if ( op.equals( "/" ) )  { pirop = "n_div"; }
                             else if ( op.equals( "*" ) )  { pirop = "n_mul"; }
                             else if ( op.equals( "%" ) ) { pirop = "n_mod"; }
                             
                             String name = op;
                             if      ( op.equals( "&" ) )  { name = "+&"; }
                             else if ( op.equals( "|" ) )  { name = "+|"; }
                             else if ( op.equals( "^" ) )  { name = "+^"; }
                             name = "infix:" + name;
                             System.out.println( 
                                 "    PAST::Op.new(\n"
                               + "        :pirop( '" + pirop + "' ),\n"
                               + "        :name( '" + name + "' ),\n"
                             );
                           

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_node_in_node231);
                    node();
                    _fsp--;

                    pushFollow(FOLLOW_node_in_node233);
                    node();
                    _fsp--;


                    match(input, Token.UP, null); 

                          System.out.print( 
                              "    ),\n"
                          );
                        

                    }
                    break;
                case 9 :
                    // src/antlr3/GenPastNqp.g:149:5: ^(prefix= PREFIX node )
                    {
                    prefix=(CommonTree)input.LT(1);
                    match(input,PREFIX,FOLLOW_PREFIX_in_node251); 


                             System.out.println( 
                                 "    PAST::Op.new(                                                   \n"
                               + "        :name( 'prefix:" + prefix.getText() + "' ),                     \n"
                             );
                           

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_node_in_node263);
                    node();
                    _fsp--;


                    match(input, Token.UP, null); 

                          System.out.print( 
                              "      ),                                                            \n"
                          );
                        

                    }
                    break;
                case 10 :
                    // src/antlr3/GenPastNqp.g:161:5: ^( REL_OP node node )
                    {
                    REL_OP6=(CommonTree)input.LT(1);
                    match(input,REL_OP,FOLLOW_REL_OP_in_node279); 


                                    String name = REL_OP6.getText();
                                    if      ( name.equals( "==" ) )  { name = "eq"; }
                                    else if ( name.equals( "!=" ) )  { name = "ne"; }
                                    name = "infix:" + name;
                                    System.out.println( 
                                        "    PAST::Op.new(\n"
                                      + "        :name( '" + name + "' ),\n"
                                    );
                                  

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_node_in_node283);
                    node();
                    _fsp--;

                    pushFollow(FOLLOW_node_in_node285);
                    node();
                    _fsp--;


                    match(input, Token.UP, null); 

                          System.out.print( 
                              "    ),\n"
                          );
                        

                    }
                    break;
                case 11 :
                    // src/antlr3/GenPastNqp.g:176:5: ^( IF node node ( node )? )
                    {

                          System.out.println( 
                              "    PAST::Op.new(\n"
                            + "       :pasttype( 'if' ),\n"
                          );
                        
                    match(input,IF,FOLLOW_IF_in_node307); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_node_in_node309);
                    node();
                    _fsp--;

                    pushFollow(FOLLOW_node_in_node311);
                    node();
                    _fsp--;

                    // src/antlr3/GenPastNqp.g:182:21: ( node )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=NOQUOTE_STRING && LA2_0<=ARRAY)||LA2_0==PREFIX||(LA2_0>=DOUBLEQUOTE_STRING && LA2_0<=VAR_DUMP)||(LA2_0>=INTEGER && LA2_0<=IF)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // src/antlr3/GenPastNqp.g:182:21: node
                            {
                            pushFollow(FOLLOW_node_in_node313);
                            node();
                            _fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                          System.out.print( 
                              "      ),                                                            \n"
                          );
                        

                    }
                    break;
                case 12 :
                    // src/antlr3/GenPastNqp.g:188:5: ^( STMTS ( node )* )
                    {

                          System.out.print( 
                              "                                                                       \n"
                            + "        PAST::Stmts.new(                                               \n"
                          );
                        
                    match(input,STMTS,FOLLOW_STMTS_in_node336); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // src/antlr3/GenPastNqp.g:194:14: ( node )*
                        loop3:
                        do {
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>=NOQUOTE_STRING && LA3_0<=ARRAY)||LA3_0==PREFIX||(LA3_0>=DOUBLEQUOTE_STRING && LA3_0<=VAR_DUMP)||(LA3_0>=INTEGER && LA3_0<=IF)) ) {
                                alt3=1;
                            }


                            switch (alt3) {
                        	case 1 :
                        	    // src/antlr3/GenPastNqp.g:194:14: node
                        	    {
                        	    pushFollow(FOLLOW_node_in_node338);
                        	    node();
                        	    _fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop3;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }

                          System.out.print( 
                              "        ),                                                             \n"
                          );
                        

                    }
                    break;
                case 13 :
                    // src/antlr3/GenPastNqp.g:200:5: ^( ASSIGN_OP node node )
                    {

                          System.out.print( 
                              "    PAST::Op.new(\n"
                            + "        :name( 'infix:=' ),\n"
                            + "        :pasttype( 'bind' ),\n"
                          );
                        
                    match(input,ASSIGN_OP,FOLLOW_ASSIGN_OP_in_node361); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_node_in_node363);
                    node();
                    _fsp--;

                    pushFollow(FOLLOW_node_in_node365);
                    node();
                    _fsp--;


                    match(input, Token.UP, null); 

                          System.out.print( 
                              "        ),                                                             \n"
                          );
                        

                    }
                    break;
                case 14 :
                    // src/antlr3/GenPastNqp.g:213:5: SCALAR
                    {
                    SCALAR7=(CommonTree)input.LT(1);
                    match(input,SCALAR,FOLLOW_SCALAR_in_node379); 

                          System.out.println( 
                              "     PAST::Var.new(\n"
                            + "         :name( '" + SCALAR7.getText() + "' ),\n"
                            + "         :scope('package'),\n"
                            + "         :viviself('Undef'),\n"
                            + "         :lvalue('1'),\n"
                            + "      ),\n"
                          );
                        

                    }
                    break;
                case 15 :
                    // src/antlr3/GenPastNqp.g:224:5: ^( ARRAY node )
                    {
                    ARRAY8=(CommonTree)input.LT(1);
                    match(input,ARRAY,FOLLOW_ARRAY_in_node393); 


                                   System.out.println( 
                                       "PAST::Var.new(\n"
                                     + "    :scope( 'keyed' ),\n"
                                     + "    :viviself( 'Undef' ),\n"
                                     + "    :lvalue( '1' ),\n"
                                     + "    PAST::Var.new(\n"
                                     + "        :viviself( 'Hash' ),\n"
                                     + "        :scope( 'package' ),\n"
                                     + "        :lvalue( '1' ),\n"
                                     + "        :name( '" + ARRAY8.getText() + "' ),\n"
                                     + "    ),\n"
                                   );
                                 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_node_in_node397);
                    node();
                    _fsp--;


                    match(input, Token.UP, null); 

                          System.out.print( 
                              "        ),                                                             \n"
                          );
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end node


 

    public static final BitSet FOLLOW_PROGRAM_in_gen_past_nqp68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_gen_past_nqp70 = new BitSet(new long[]{0x00000001FF0785E8L});
    public static final BitSet FOLLOW_ECHO_in_node100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DUMP_in_node124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOQUOTE_STRING_in_node140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLEQUOTE_STRING_in_node152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLEQUOTE_STRING_in_node164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_node176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_node188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_node204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node231 = new BitSet(new long[]{0x00000001FF0785E0L});
    public static final BitSet FOLLOW_node_in_node233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIX_in_node251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REL_OP_in_node279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node283 = new BitSet(new long[]{0x00000001FF0785E0L});
    public static final BitSet FOLLOW_node_in_node285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_node307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node309 = new BitSet(new long[]{0x00000001FF0785E0L});
    public static final BitSet FOLLOW_node_in_node311 = new BitSet(new long[]{0x00000001FF0785E8L});
    public static final BitSet FOLLOW_node_in_node313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STMTS_in_node336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node338 = new BitSet(new long[]{0x00000001FF0785E8L});
    public static final BitSet FOLLOW_ASSIGN_OP_in_node361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node363 = new BitSet(new long[]{0x00000001FF0785E0L});
    public static final BitSet FOLLOW_node_in_node365 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCALAR_in_node379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_node393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node397 = new BitSet(new long[]{0x0000000000000008L});

}