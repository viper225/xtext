package org.eclipse.xtend.macro.lang.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMacroLexer extends Lexer {
    public static final int RULE_COMMENT_RICH_TEXT_INBETWEEN=12;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_COMMENT_RICH_TEXT_END=14;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_HEX=5;
    public static final int T__90=90;
    public static final int RULE_RICH_TEXT_END=13;
    public static final int RULE_DECIMAL=7;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RULE_IN_RICH_STRING=15;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_STRING=8;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_RICH_TEXT_START=10;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int RULE_RICH_TEXT=9;
    public static final int T__63=63;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=6;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=17;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_RICH_TEXT_INBETWEEN=11;
    public static final int RULE_WS=18;

    // delegates
    // delegators

    public InternalMacroLexer() {;} 
    public InternalMacroLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMacroLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:11:7: ( '=' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:12:7: ( '+=' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:12:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:13:7: ( '||' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:13:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:14:7: ( '&&' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:14:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:15:7: ( 'create' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:15:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:16:7: ( 'annotation' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:16:9: 'annotation'
            {
            match("annotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:17:7: ( 'field' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:17:9: 'field'
            {
            match("field"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:18:7: ( 'method' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:18:9: 'method'
            {
            match("method"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:19:7: ( 'parameter' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:19:9: 'parameter'
            {
            match("parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:20:7: ( 'constructor' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:20:9: 'constructor'
            {
            match("constructor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:21:7: ( 'macro' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:21:9: 'macro'
            {
            match("macro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:22:7: ( 'var' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:22:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:23:7: ( 'def' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:23:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:24:7: ( '==' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:24:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25:7: ( '!=' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:26:7: ( '>=' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:26:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:27:7: ( '<=' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:27:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:28:7: ( '>' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:28:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:29:7: ( '<' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:29:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:30:7: ( '->' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:30:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:31:7: ( '..' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:31:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:32:7: ( '=>' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:32:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:33:7: ( '<>' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:33:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:34:7: ( '?:' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:34:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:35:7: ( '<=>' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:35:9: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:36:7: ( '+' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:36:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:37:7: ( '-' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:37:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:38:7: ( '*' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:38:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:39:7: ( '**' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:39:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:40:7: ( '/' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:40:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:41:7: ( '%' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:41:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:42:7: ( '!' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:42:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:43:7: ( '.' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:43:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:44:7: ( 'val' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:44:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:45:7: ( 'super' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:45:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:46:7: ( 'false' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:46:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:47:7: ( 'class' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:47:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:48:7: ( 'public' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:48:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:49:7: ( 'protected' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:49:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:50:7: ( 'private' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:50:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:51:7: ( 'package' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:51:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:52:7: ( ';' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:52:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:53:7: ( '{' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:53:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:54:7: ( '}' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:54:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:55:7: ( '@' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:55:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:56:7: ( 'for' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:56:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:57:7: ( ',' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:57:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:58:7: ( 'register' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:58:9: 'register'
            {
            match("register"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:59:7: ( 'process' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:59:9: 'process'
            {
            match("process"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:60:7: ( ')' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:60:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:61:7: ( '(' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:61:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:62:7: ( 'throws' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:62:9: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:63:7: ( 'new' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:63:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:64:7: ( ':' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:64:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:65:7: ( 'FOR' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:65:9: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:66:7: ( 'ENDFOR' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:66:9: 'ENDFOR'
            {
            match("ENDFOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:67:7: ( 'BEFORE' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:67:9: 'BEFORE'
            {
            match("BEFORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:68:7: ( 'SEPARATOR' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:68:9: 'SEPARATOR'
            {
            match("SEPARATOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:69:7: ( 'AFTER' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:69:9: 'AFTER'
            {
            match("AFTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:70:7: ( 'IF' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:70:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:71:7: ( 'ENDIF' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:71:9: 'ENDIF'
            {
            match("ENDIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:72:7: ( 'ELSE' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:72:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:73:7: ( 'ELSEIF' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:73:9: 'ELSEIF'
            {
            match("ELSEIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:74:7: ( 'instanceof' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:74:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:75:7: ( 'as' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:75:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:76:7: ( ']' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:76:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:77:7: ( '[' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:77:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:78:7: ( 'if' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:78:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:79:7: ( 'else' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:79:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:80:7: ( 'switch' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:80:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:81:7: ( 'default' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:81:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:82:7: ( 'case' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:82:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:83:7: ( 'while' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:83:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:84:7: ( 'do' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:84:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:85:7: ( '::' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:85:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:86:7: ( 'null' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:86:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:87:7: ( 'typeof' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:87:9: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:88:7: ( 'throw' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:88:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:89:7: ( 'return' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:89:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:90:7: ( 'try' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:90:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:91:8: ( 'finally' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:91:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:92:8: ( 'catch' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:92:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:93:8: ( '?' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:93:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:94:8: ( 'extends' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:94:10: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:95:8: ( '&' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:95:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:96:8: ( 'import' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:96:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:97:8: ( 'static' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:97:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:98:8: ( 'each' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:98:10: 'each'
            {
            match("each"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:99:8: ( 'extension' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:99:10: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:100:8: ( 'override' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:100:10: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:101:8: ( 'dispatch' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:101:10: 'dispatch'
            {
            match("dispatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:102:8: ( '...' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:102:10: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:103:8: ( '?.' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:103:10: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:104:8: ( '*.' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:104:10: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:105:8: ( '|' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:105:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:106:8: ( 'true' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:106:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "RULE_RICH_TEXT"
    public final void mRULE_RICH_TEXT() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25799:16: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25799:18: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25799:27: ( RULE_IN_RICH_STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='\'') ) {
                        int LA1_4 = input.LA(3);

                        if ( ((LA1_4>='\u0000' && LA1_4<='&')||(LA1_4>='(' && LA1_4<='\u00AA')||(LA1_4>='\u00AC' && LA1_4<='\uFFFF')) ) {
                            alt1=1;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='&')||(LA1_1>='(' && LA1_1<='\u00AA')||(LA1_1>='\u00AC' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\u00AA')||(LA1_0>='\u00AC' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25799:27: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25799:48: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\'') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\'') ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3=='\'') ) {
                        alt4=1;
                    }
                    else {
                        alt4=2;}
                }
                else {
                    alt4=2;}
            }
            else {
                alt4=2;}
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25799:49: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25799:58: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25799:58: ( '\\'' ( '\\'' )? )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\'') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25799:59: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25799:64: ( '\\'' )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0=='\'') ) {
                                alt2=1;
                            }
                            switch (alt2) {
                                case 1 :
                                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25799:64: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT"

    // $ANTLR start "RULE_RICH_TEXT_START"
    public final void mRULE_RICH_TEXT_START() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25801:22: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25801:24: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match("'''"); 

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25801:33: ( RULE_IN_RICH_STRING )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\'') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='\'') ) {
                        int LA5_4 = input.LA(3);

                        if ( ((LA5_4>='\u0000' && LA5_4<='&')||(LA5_4>='(' && LA5_4<='\u00AA')||(LA5_4>='\u00AC' && LA5_4<='\uFFFF')) ) {
                            alt5=1;
                        }


                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='&')||(LA5_1>='(' && LA5_1<='\u00AA')||(LA5_1>='\u00AC' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\u00AA')||(LA5_0>='\u00AC' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25801:33: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25801:54: ( '\\'' ( '\\'' )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\'') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25801:55: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25801:60: ( '\\'' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\'') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25801:60: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_START"

    // $ANTLR start "RULE_RICH_TEXT_END"
    public final void mRULE_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25803:20: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25803:22: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00BB'); 
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25803:31: ( RULE_IN_RICH_STRING )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\'') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='\'') ) {
                        int LA8_4 = input.LA(3);

                        if ( ((LA8_4>='\u0000' && LA8_4<='&')||(LA8_4>='(' && LA8_4<='\u00AA')||(LA8_4>='\u00AC' && LA8_4<='\uFFFF')) ) {
                            alt8=1;
                        }


                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='&')||(LA8_1>='(' && LA8_1<='\u00AA')||(LA8_1>='\u00AC' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='\u00AA')||(LA8_0>='\u00AC' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25803:31: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25803:52: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\'') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='\'') ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3=='\'') ) {
                        alt11=1;
                    }
                    else {
                        alt11=2;}
                }
                else {
                    alt11=2;}
            }
            else {
                alt11=2;}
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25803:53: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25803:62: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25803:62: ( '\\'' ( '\\'' )? )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\'') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25803:63: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25803:68: ( '\\'' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='\'') ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25803:68: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_END"

    // $ANTLR start "RULE_RICH_TEXT_INBETWEEN"
    public final void mRULE_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25805:26: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25805:28: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match('\u00BB'); 
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25805:37: ( RULE_IN_RICH_STRING )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\'') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='\'') ) {
                        int LA12_4 = input.LA(3);

                        if ( ((LA12_4>='\u0000' && LA12_4<='&')||(LA12_4>='(' && LA12_4<='\u00AA')||(LA12_4>='\u00AC' && LA12_4<='\uFFFF')) ) {
                            alt12=1;
                        }


                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='&')||(LA12_1>='(' && LA12_1<='\u00AA')||(LA12_1>='\u00AC' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='\u00AA')||(LA12_0>='\u00AC' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25805:37: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25805:58: ( '\\'' ( '\\'' )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\'') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25805:59: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25805:64: ( '\\'' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\'') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25805:64: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_INBETWEEN"
    public final void mRULE_COMMENT_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:34: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )? )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:36: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            {
            match("\u00AB\u00AB"); 

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:51: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:51: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:67: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:68: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
                    {
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:68: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:68: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:79: ( RULE_IN_RICH_STRING )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\'') ) {
                            int LA17_1 = input.LA(2);

                            if ( (LA17_1=='\'') ) {
                                int LA17_4 = input.LA(3);

                                if ( ((LA17_4>='\u0000' && LA17_4<='&')||(LA17_4>='(' && LA17_4<='\u00AA')||(LA17_4>='\u00AC' && LA17_4<='\uFFFF')) ) {
                                    alt17=1;
                                }


                            }
                            else if ( ((LA17_1>='\u0000' && LA17_1<='&')||(LA17_1>='(' && LA17_1<='\u00AA')||(LA17_1>='\u00AC' && LA17_1<='\uFFFF')) ) {
                                alt17=1;
                            }


                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='\u00AA')||(LA17_0>='\u00AC' && LA17_0<='\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:79: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:100: ( '\\'' ( '\\'' )? )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\'') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:101: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:106: ( '\\'' )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0=='\'') ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25807:106: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match('\u00AB'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_END"
    public final void mRULE_COMMENT_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:28: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF ) )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:30: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            {
            match("\u00AB\u00AB"); 

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:45: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:45: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:61: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\n'||LA27_0=='\r') ) {
                alt27=1;
            }
            else {
                alt27=2;}
            switch (alt27) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:62: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    {
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:62: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:62: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:73: ( RULE_IN_RICH_STRING )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\'') ) {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1=='\'') ) {
                                int LA23_4 = input.LA(3);

                                if ( ((LA23_4>='\u0000' && LA23_4<='&')||(LA23_4>='(' && LA23_4<='\u00AA')||(LA23_4>='\u00AC' && LA23_4<='\uFFFF')) ) {
                                    alt23=1;
                                }


                            }
                            else if ( ((LA23_1>='\u0000' && LA23_1<='&')||(LA23_1>='(' && LA23_1<='\u00AA')||(LA23_1>='\u00AC' && LA23_1<='\uFFFF')) ) {
                                alt23=1;
                            }


                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='&')||(LA23_0>='(' && LA23_0<='\u00AA')||(LA23_0>='\u00AC' && LA23_0<='\uFFFF')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:73: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:94: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\'') ) {
                        int LA26_1 = input.LA(2);

                        if ( (LA26_1=='\'') ) {
                            int LA26_3 = input.LA(3);

                            if ( (LA26_3=='\'') ) {
                                alt26=1;
                            }
                            else {
                                alt26=2;}
                        }
                        else {
                            alt26=2;}
                    }
                    else {
                        alt26=2;}
                    switch (alt26) {
                        case 1 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:95: '\\'\\'\\''
                            {
                            match("'''"); 


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:104: ( '\\'' ( '\\'' )? )? EOF
                            {
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:104: ( '\\'' ( '\\'' )? )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0=='\'') ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:105: '\\'' ( '\\'' )?
                                    {
                                    match('\''); 
                                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:110: ( '\\'' )?
                                    int alt24=2;
                                    int LA24_0 = input.LA(1);

                                    if ( (LA24_0=='\'') ) {
                                        alt24=1;
                                    }
                                    switch (alt24) {
                                        case 1 :
                                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:110: '\\''
                                            {
                                            match('\''); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            match(EOF); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25809:123: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_END"

    // $ANTLR start "RULE_IN_RICH_STRING"
    public final void mRULE_IN_RICH_STRING() throws RecognitionException {
        try {
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25811:30: ( ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) ) )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25811:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            {
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25811:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\'') ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1=='\'') ) {
                    alt28=1;
                }
                else if ( ((LA28_1>='\u0000' && LA28_1<='&')||(LA28_1>='(' && LA28_1<='\u00AA')||(LA28_1>='\u00AC' && LA28_1<='\uFFFF')) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA28_0>='\u0000' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='\u00AA')||(LA28_0>='\u00AC' && LA28_0<='\uFFFF')) ) {
                alt28=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25811:33: '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match("''"); 

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25811:59: '\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match('\''); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25811:83: ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_RICH_STRING"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25813:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25813:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25813:12: ( '0x' | '0X' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='0') ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1=='x') ) {
                    alt29=1;
                }
                else if ( (LA29_1=='X') ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25813:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25813:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25813:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='0' && LA30_0<='9')||(LA30_0>='A' && LA30_0<='F')||LA30_0=='_'||(LA30_0>='a' && LA30_0<='f')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25813:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='#') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25813:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25813:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='B'||LA31_0=='b') ) {
                        alt31=1;
                    }
                    else if ( (LA31_0=='L'||LA31_0=='l') ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25813:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25813:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25815:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25815:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25815:21: ( '0' .. '9' | '_' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='0' && LA33_0<='9')||LA33_0=='_') ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25817:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25817:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25817:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='E'||LA35_0=='e') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25817:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25817:36: ( '+' | '-' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0=='+'||LA34_0=='-') ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25817:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='B'||LA36_0=='b') ) {
                alt36=1;
            }
            else if ( (LA36_0=='D'||LA36_0=='F'||LA36_0=='L'||LA36_0=='d'||LA36_0=='f'||LA36_0=='l') ) {
                alt36=2;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25817:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25817:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25819:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25819:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25819:11: ( '^' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='^') ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25819:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25819:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0=='$'||(LA38_0>='0' && LA38_0<='9')||(LA38_0>='A' && LA38_0<='Z')||LA38_0=='_'||(LA38_0>='a' && LA38_0<='z')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25821:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25821:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25821:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='\"') ) {
                alt41=1;
            }
            else if ( (LA41_0=='\'') ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25821:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25821:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop39:
                    do {
                        int alt39=3;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0=='\\') ) {
                            alt39=1;
                        }
                        else if ( ((LA39_0>='\u0000' && LA39_0<='!')||(LA39_0>='#' && LA39_0<='[')||(LA39_0>=']' && LA39_0<='\uFFFF')) ) {
                            alt39=2;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25821:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25821:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25821:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25821:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop40:
                    do {
                        int alt40=3;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0=='\\') ) {
                            alt40=1;
                        }
                        else if ( ((LA40_0>='\u0000' && LA40_0<='&')||(LA40_0>='(' && LA40_0<='[')||(LA40_0>=']' && LA40_0<='\uFFFF')) ) {
                            alt40=2;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25821:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25821:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25823:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25823:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25823:24: ( options {greedy=false; } : . )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0=='*') ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1=='/') ) {
                        alt42=2;
                    }
                    else if ( ((LA42_1>='\u0000' && LA42_1<='.')||(LA42_1>='0' && LA42_1<='\uFFFF')) ) {
                        alt42=1;
                    }


                }
                else if ( ((LA42_0>='\u0000' && LA42_0<=')')||(LA42_0>='+' && LA42_0<='\uFFFF')) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25823:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25825:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25825:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25825:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>='\u0000' && LA43_0<='\t')||(LA43_0>='\u000B' && LA43_0<='\f')||(LA43_0>='\u000E' && LA43_0<='\uFFFF')) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25825:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25825:40: ( ( '\\r' )? '\\n' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='\n'||LA45_0=='\r') ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25825:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25825:41: ( '\\r' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0=='\r') ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25825:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25827:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25827:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25827:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>='\t' && LA46_0<='\n')||LA46_0=='\r'||LA46_0==' ') ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25829:16: ( . )
            // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:25829:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt47=111;
        alt47 = dfa47.predict(input);
        switch (alt47) {
            case 1 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:178: T__48
                {
                mT__48(); 

                }
                break;
            case 30 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:184: T__49
                {
                mT__49(); 

                }
                break;
            case 31 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:190: T__50
                {
                mT__50(); 

                }
                break;
            case 32 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:196: T__51
                {
                mT__51(); 

                }
                break;
            case 33 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:202: T__52
                {
                mT__52(); 

                }
                break;
            case 34 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:208: T__53
                {
                mT__53(); 

                }
                break;
            case 35 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:214: T__54
                {
                mT__54(); 

                }
                break;
            case 36 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:220: T__55
                {
                mT__55(); 

                }
                break;
            case 37 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:226: T__56
                {
                mT__56(); 

                }
                break;
            case 38 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:232: T__57
                {
                mT__57(); 

                }
                break;
            case 39 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:238: T__58
                {
                mT__58(); 

                }
                break;
            case 40 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:244: T__59
                {
                mT__59(); 

                }
                break;
            case 41 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:250: T__60
                {
                mT__60(); 

                }
                break;
            case 42 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:256: T__61
                {
                mT__61(); 

                }
                break;
            case 43 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:262: T__62
                {
                mT__62(); 

                }
                break;
            case 44 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:268: T__63
                {
                mT__63(); 

                }
                break;
            case 45 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:274: T__64
                {
                mT__64(); 

                }
                break;
            case 46 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:280: T__65
                {
                mT__65(); 

                }
                break;
            case 47 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:286: T__66
                {
                mT__66(); 

                }
                break;
            case 48 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:292: T__67
                {
                mT__67(); 

                }
                break;
            case 49 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:298: T__68
                {
                mT__68(); 

                }
                break;
            case 50 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:304: T__69
                {
                mT__69(); 

                }
                break;
            case 51 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:310: T__70
                {
                mT__70(); 

                }
                break;
            case 52 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:316: T__71
                {
                mT__71(); 

                }
                break;
            case 53 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:322: T__72
                {
                mT__72(); 

                }
                break;
            case 54 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:328: T__73
                {
                mT__73(); 

                }
                break;
            case 55 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:334: T__74
                {
                mT__74(); 

                }
                break;
            case 56 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:340: T__75
                {
                mT__75(); 

                }
                break;
            case 57 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:346: T__76
                {
                mT__76(); 

                }
                break;
            case 58 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:352: T__77
                {
                mT__77(); 

                }
                break;
            case 59 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:358: T__78
                {
                mT__78(); 

                }
                break;
            case 60 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:364: T__79
                {
                mT__79(); 

                }
                break;
            case 61 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:370: T__80
                {
                mT__80(); 

                }
                break;
            case 62 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:376: T__81
                {
                mT__81(); 

                }
                break;
            case 63 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:382: T__82
                {
                mT__82(); 

                }
                break;
            case 64 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:388: T__83
                {
                mT__83(); 

                }
                break;
            case 65 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:394: T__84
                {
                mT__84(); 

                }
                break;
            case 66 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:400: T__85
                {
                mT__85(); 

                }
                break;
            case 67 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:406: T__86
                {
                mT__86(); 

                }
                break;
            case 68 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:412: T__87
                {
                mT__87(); 

                }
                break;
            case 69 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:418: T__88
                {
                mT__88(); 

                }
                break;
            case 70 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:424: T__89
                {
                mT__89(); 

                }
                break;
            case 71 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:430: T__90
                {
                mT__90(); 

                }
                break;
            case 72 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:436: T__91
                {
                mT__91(); 

                }
                break;
            case 73 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:442: T__92
                {
                mT__92(); 

                }
                break;
            case 74 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:448: T__93
                {
                mT__93(); 

                }
                break;
            case 75 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:454: T__94
                {
                mT__94(); 

                }
                break;
            case 76 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:460: T__95
                {
                mT__95(); 

                }
                break;
            case 77 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:466: T__96
                {
                mT__96(); 

                }
                break;
            case 78 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:472: T__97
                {
                mT__97(); 

                }
                break;
            case 79 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:478: T__98
                {
                mT__98(); 

                }
                break;
            case 80 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:484: T__99
                {
                mT__99(); 

                }
                break;
            case 81 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:490: T__100
                {
                mT__100(); 

                }
                break;
            case 82 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:497: T__101
                {
                mT__101(); 

                }
                break;
            case 83 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:504: T__102
                {
                mT__102(); 

                }
                break;
            case 84 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:511: T__103
                {
                mT__103(); 

                }
                break;
            case 85 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:518: T__104
                {
                mT__104(); 

                }
                break;
            case 86 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:525: T__105
                {
                mT__105(); 

                }
                break;
            case 87 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:532: T__106
                {
                mT__106(); 

                }
                break;
            case 88 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:539: T__107
                {
                mT__107(); 

                }
                break;
            case 89 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:546: T__108
                {
                mT__108(); 

                }
                break;
            case 90 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:553: T__109
                {
                mT__109(); 

                }
                break;
            case 91 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:560: T__110
                {
                mT__110(); 

                }
                break;
            case 92 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:567: T__111
                {
                mT__111(); 

                }
                break;
            case 93 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:574: T__112
                {
                mT__112(); 

                }
                break;
            case 94 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:581: T__113
                {
                mT__113(); 

                }
                break;
            case 95 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:588: T__114
                {
                mT__114(); 

                }
                break;
            case 96 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:595: T__115
                {
                mT__115(); 

                }
                break;
            case 97 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:602: RULE_RICH_TEXT
                {
                mRULE_RICH_TEXT(); 

                }
                break;
            case 98 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:617: RULE_RICH_TEXT_START
                {
                mRULE_RICH_TEXT_START(); 

                }
                break;
            case 99 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:638: RULE_RICH_TEXT_END
                {
                mRULE_RICH_TEXT_END(); 

                }
                break;
            case 100 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:657: RULE_RICH_TEXT_INBETWEEN
                {
                mRULE_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 101 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:682: RULE_COMMENT_RICH_TEXT_INBETWEEN
                {
                mRULE_COMMENT_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 102 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:715: RULE_COMMENT_RICH_TEXT_END
                {
                mRULE_COMMENT_RICH_TEXT_END(); 

                }
                break;
            case 103 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:742: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 104 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:751: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 105 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:760: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 106 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:773: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 107 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:781: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 108 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:793: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 109 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:809: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 110 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:825: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 111 :
                // ../org.eclipse.xtend.macro.lang.ui/src-gen/org/eclipse/xtend/macro/lang/ui/contentassist/antlr/internal/InternalMacro.g:1:833: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA47 dfa47 = new DFA47(this);
    static final String DFA47_eotS =
        "\1\uffff\1\71\1\73\1\75\1\77\7\104\1\124\1\126\1\131\1\133\1\135"+
        "\1\140\1\143\1\146\1\uffff\1\104\5\uffff\1\104\2\uffff\2\104\1\171"+
        "\7\104\2\uffff\3\104\1\66\1\u008f\1\66\2\u0093\1\66\1\uffff\1\66"+
        "\13\uffff\4\104\1\uffff\1\104\1\u009d\12\104\1\u00ac\1\104\4\uffff"+
        "\1\u00af\4\uffff\1\u00b1\13\uffff\3\104\5\uffff\1\104\2\uffff\5"+
        "\104\2\uffff\6\104\1\u00c3\1\104\1\u00c5\1\104\2\uffff\5\104\1\u008c"+
        "\1\uffff\2\u008f\2\uffff\1\u00d2\2\uffff\1\u0093\2\uffff\6\104\1"+
        "\uffff\3\104\1\u00dc\7\104\1\u00e5\1\u00e6\1\u00e8\1\uffff\1\104"+
        "\4\uffff\7\104\1\u00f1\1\104\1\u00f3\1\104\1\u00f5\5\104\1\uffff"+
        "\1\104\1\uffff\6\104\1\u0106\2\u008f\1\u00d2\1\uffff\1\u010a\1\uffff"+
        "\3\104\1\u010e\5\104\1\uffff\10\104\2\uffff\1\104\1\uffff\10\104"+
        "\1\uffff\1\u0125\1\uffff\1\u0126\1\uffff\2\104\1\u012a\5\104\1\u0130"+
        "\1\104\1\u0132\2\104\2\u0106\2\uffff\1\u008f\2\u010a\1\uffff\2\104"+
        "\1\u013b\1\uffff\1\u013c\1\104\1\u013e\1\104\1\u0140\1\104\1\u0142"+
        "\10\104\1\u014b\4\104\1\u0151\1\104\2\uffff\1\104\1\u0154\1\104"+
        "\1\uffff\2\104\1\u0158\2\104\1\uffff\1\104\1\uffff\1\u015d\1\104"+
        "\2\u0106\2\u010a\1\u0161\1\104\2\uffff\1\104\1\uffff\1\104\1\uffff"+
        "\1\u0165\1\uffff\2\104\1\u0168\5\104\1\uffff\1\u016e\1\u016f\1\104"+
        "\1\u0171\1\u0172\1\uffff\1\u0173\1\u0174\1\uffff\1\u0175\1\u0176"+
        "\1\104\1\uffff\1\104\1\u0179\2\104\1\uffff\1\104\1\u0106\1\u010a"+
        "\1\uffff\2\104\1\u017f\1\uffff\1\104\1\u0181\1\uffff\1\104\1\u0183"+
        "\1\u0184\1\u0185\1\104\2\uffff\1\104\6\uffff\2\104\1\uffff\1\u018a"+
        "\4\104\1\uffff\1\104\1\uffff\1\104\3\uffff\1\u0191\1\u0192\2\104"+
        "\1\uffff\1\104\1\u0196\2\104\1\u0199\1\u019a\2\uffff\1\u019b\1\104"+
        "\1\u019d\1\uffff\1\104\1\u019f\3\uffff\1\u01a0\1\uffff\1\u01a1\3"+
        "\uffff";
    static final String DFA47_eofS =
        "\u01a2\uffff";
    static final String DFA47_minS =
        "\1\0\2\75\1\174\1\46\1\141\1\156\4\141\1\145\3\75\1\76\2\56\2\52"+
        "\1\uffff\1\164\5\uffff\1\145\2\uffff\1\150\1\145\1\72\1\117\1\114"+
        "\2\105\2\106\1\146\2\uffff\1\141\1\150\1\166\2\0\1\u00ab\2\60\1"+
        "\44\1\uffff\1\0\13\uffff\1\145\1\156\1\141\1\163\1\uffff\1\156\1"+
        "\44\1\145\1\154\1\162\1\164\2\143\1\142\1\151\1\154\1\146\1\44\1"+
        "\163\4\uffff\1\76\4\uffff\1\56\13\uffff\1\160\1\151\1\141\5\uffff"+
        "\1\147\2\uffff\1\162\1\160\1\165\1\167\1\154\2\uffff\1\122\1\104"+
        "\1\123\1\106\1\120\1\124\1\44\1\163\1\44\1\160\2\uffff\1\163\1\164"+
        "\1\143\1\151\1\145\1\47\1\uffff\2\0\2\uffff\1\0\2\uffff\1\60\2\uffff"+
        "\1\141\2\163\1\145\1\143\1\157\1\uffff\1\154\1\141\1\163\1\44\1"+
        "\150\1\162\1\141\1\153\1\154\1\143\1\166\3\44\1\uffff\1\160\4\uffff"+
        "\1\145\2\164\1\151\1\165\1\157\1\145\1\44\1\145\1\44\1\154\1\44"+
        "\1\106\1\105\1\117\1\101\1\105\1\uffff\1\164\1\uffff\1\157\2\145"+
        "\1\150\1\154\1\162\4\0\1\12\1\0\1\uffff\2\164\1\163\1\44\1\150\1"+
        "\164\1\144\1\154\1\145\1\uffff\2\157\1\155\1\141\1\151\2\145\1\141"+
        "\2\uffff\1\165\1\uffff\1\141\1\162\1\143\1\151\1\163\1\162\1\167"+
        "\1\157\1\uffff\1\44\1\uffff\1\44\1\uffff\1\117\1\106\1\44\3\122"+
        "\1\141\1\162\1\44\1\156\1\44\1\145\1\162\2\0\2\uffff\3\0\1\uffff"+
        "\1\145\1\162\1\44\1\uffff\1\44\1\141\1\44\1\154\1\44\1\144\1\44"+
        "\1\145\1\147\2\143\1\163\1\164\1\154\1\164\1\44\1\150\1\143\1\164"+
        "\1\156\1\44\1\146\2\uffff\1\122\1\44\1\106\1\uffff\1\105\1\101\1"+
        "\44\1\156\1\164\1\uffff\1\144\1\uffff\1\44\1\151\4\0\1\44\1\165"+
        "\2\uffff\1\164\1\uffff\1\171\1\uffff\1\44\1\uffff\1\164\1\145\1"+
        "\44\1\164\1\163\1\145\1\164\1\143\1\uffff\2\44\1\145\2\44\1\uffff"+
        "\2\44\1\uffff\2\44\1\124\1\uffff\1\143\1\44\1\163\1\151\1\uffff"+
        "\1\144\2\0\1\uffff\1\143\1\151\1\44\1\uffff\1\145\1\44\1\uffff\1"+
        "\145\3\44\1\150\2\uffff\1\162\6\uffff\1\117\1\145\1\uffff\1\44\1"+
        "\157\1\145\1\164\1\157\1\uffff\1\162\1\uffff\1\144\3\uffff\2\44"+
        "\1\122\1\157\1\uffff\1\156\1\44\1\157\1\156\2\44\2\uffff\1\44\1"+
        "\146\1\44\1\uffff\1\162\1\44\3\uffff\1\44\1\uffff\1\44\3\uffff";
    static final String DFA47_maxS =
        "\1\uffff\1\76\1\75\1\174\1\46\1\162\1\163\1\157\1\145\1\165\1\141"+
        "\1\157\2\75\2\76\1\56\1\72\1\56\1\57\1\uffff\1\167\5\uffff\1\145"+
        "\2\uffff\1\171\1\165\1\72\1\117\1\116\2\105\2\106\1\156\2\uffff"+
        "\1\170\1\150\1\166\2\uffff\1\u00ab\1\170\1\154\1\172\1\uffff\1\uffff"+
        "\13\uffff\1\145\1\156\1\141\1\164\1\uffff\1\156\1\172\1\156\1\154"+
        "\1\162\1\164\1\143\1\162\1\142\1\157\1\162\1\146\1\172\1\163\4\uffff"+
        "\1\76\4\uffff\1\56\13\uffff\1\160\1\151\1\141\5\uffff\1\164\2\uffff"+
        "\1\162\1\160\1\171\1\167\1\154\2\uffff\1\122\1\104\1\123\1\106\1"+
        "\120\1\124\1\172\1\163\1\172\1\160\2\uffff\1\163\1\164\1\143\1\151"+
        "\1\145\1\47\1\uffff\2\uffff\2\uffff\1\uffff\2\uffff\1\154\2\uffff"+
        "\1\141\2\163\1\145\1\143\1\157\1\uffff\1\154\1\141\1\163\1\172\1"+
        "\150\1\162\1\141\1\153\1\154\1\164\1\166\3\172\1\uffff\1\160\4\uffff"+
        "\1\145\2\164\1\151\1\165\1\157\1\145\1\172\1\145\1\172\1\154\1\172"+
        "\1\111\1\105\1\117\1\101\1\105\1\uffff\1\164\1\uffff\1\157\2\145"+
        "\1\150\1\154\1\162\4\uffff\1\12\1\uffff\1\uffff\2\164\1\163\1\172"+
        "\1\150\1\164\1\144\1\154\1\145\1\uffff\2\157\1\155\1\141\1\151\2"+
        "\145\1\141\2\uffff\1\165\1\uffff\1\141\1\162\1\143\1\151\1\163\1"+
        "\162\1\167\1\157\1\uffff\1\172\1\uffff\1\172\1\uffff\1\117\1\106"+
        "\1\172\3\122\1\141\1\162\1\172\1\156\1\172\1\145\1\162\2\uffff\2"+
        "\uffff\3\uffff\1\uffff\1\145\1\162\1\172\1\uffff\1\172\1\141\1\172"+
        "\1\154\1\172\1\144\1\172\1\145\1\147\2\143\1\163\1\164\1\154\1\164"+
        "\1\172\1\150\1\143\1\164\1\156\1\172\1\146\2\uffff\1\122\1\172\1"+
        "\106\1\uffff\1\105\1\101\1\172\1\156\1\164\1\uffff\1\163\1\uffff"+
        "\1\172\1\151\4\uffff\1\172\1\165\2\uffff\1\164\1\uffff\1\171\1\uffff"+
        "\1\172\1\uffff\1\164\1\145\1\172\1\164\1\163\1\145\1\164\1\143\1"+
        "\uffff\2\172\1\145\2\172\1\uffff\2\172\1\uffff\2\172\1\124\1\uffff"+
        "\1\143\1\172\1\163\1\151\1\uffff\1\144\2\uffff\1\uffff\1\143\1\151"+
        "\1\172\1\uffff\1\145\1\172\1\uffff\1\145\3\172\1\150\2\uffff\1\162"+
        "\6\uffff\1\117\1\145\1\uffff\1\172\1\157\1\145\1\164\1\157\1\uffff"+
        "\1\162\1\uffff\1\144\3\uffff\2\172\1\122\1\157\1\uffff\1\156\1\172"+
        "\1\157\1\156\2\172\2\uffff\1\172\1\146\1\172\1\uffff\1\162\1\172"+
        "\3\uffff\1\172\1\uffff\1\172\3\uffff";
    static final String DFA47_acceptS =
        "\24\uffff\1\37\1\uffff\1\52\1\53\1\54\1\55\1\57\1\uffff\1\62\1\63"+
        "\12\uffff\1\102\1\103\11\uffff\1\152\1\uffff\1\156\1\157\1\16\1"+
        "\26\1\1\1\2\1\32\1\3\1\137\1\4\1\125\4\uffff\1\152\16\uffff\1\17"+
        "\1\40\1\20\1\22\1\uffff\1\27\1\23\1\24\1\33\1\uffff\1\41\1\30\1"+
        "\135\1\123\1\35\1\136\1\34\1\154\1\155\1\36\1\37\3\uffff\1\52\1"+
        "\53\1\54\1\55\1\57\1\uffff\1\62\1\63\5\uffff\1\113\1\66\12\uffff"+
        "\1\102\1\103\6\uffff\1\153\2\uffff\1\143\1\144\1\uffff\1\147\1\150"+
        "\1\uffff\1\151\1\156\6\uffff\1\101\16\uffff\1\112\1\uffff\1\31\1"+
        "\21\1\134\1\25\21\uffff\1\74\1\uffff\1\104\14\uffff\1\145\11\uffff"+
        "\1\56\10\uffff\1\14\1\42\1\uffff\1\15\10\uffff\1\120\1\uffff\1\65"+
        "\1\uffff\1\67\17\uffff\1\142\1\141\3\uffff\1\146\3\uffff\1\110\26"+
        "\uffff\1\140\1\114\3\uffff\1\76\5\uffff\1\105\1\uffff\1\130\10\uffff"+
        "\1\45\1\122\1\uffff\1\7\1\uffff\1\44\1\uffff\1\13\10\uffff\1\43"+
        "\5\uffff\1\116\2\uffff\1\75\3\uffff\1\73\4\uffff\1\111\3\uffff\1"+
        "\5\3\uffff\1\10\2\uffff\1\46\5\uffff\1\106\1\127\1\uffff\1\117\1"+
        "\64\1\115\1\70\1\77\1\71\2\uffff\1\126\5\uffff\1\121\1\uffff\1\51"+
        "\1\uffff\1\61\1\50\1\107\4\uffff\1\124\6\uffff\1\133\1\60\3\uffff"+
        "\1\132\2\uffff\1\11\1\47\1\72\1\uffff\1\131\1\uffff\1\6\1\100\1"+
        "\12";
    static final String DFA47_specialS =
        "\1\15\54\uffff\1\2\1\23\5\uffff\1\20\130\uffff\1\16\1\5\2\uffff"+
        "\1\10\72\uffff\1\17\1\22\1\7\1\26\1\uffff\1\0\61\uffff\1\3\1\13"+
        "\2\uffff\1\11\1\4\1\24\53\uffff\1\12\1\14\1\1\1\25\46\uffff\1\6"+
        "\1\21\101\uffff}>";
    static final String[] DFA47_transitionS = {
            "\11\66\2\65\2\66\1\65\22\66\1\65\1\14\1\64\1\66\1\63\1\24\1"+
            "\4\1\55\1\35\1\34\1\22\1\2\1\32\1\17\1\20\1\23\1\60\11\61\1"+
            "\40\1\26\1\16\1\1\1\15\1\21\1\31\1\45\1\43\2\63\1\42\1\41\2"+
            "\63\1\46\11\63\1\44\7\63\1\51\1\66\1\50\1\62\1\63\1\66\1\6\1"+
            "\63\1\5\1\13\1\52\1\7\2\63\1\47\3\63\1\10\1\37\1\54\1\11\1\63"+
            "\1\33\1\25\1\36\1\63\1\12\1\53\3\63\1\27\1\3\1\30\55\66\1\57"+
            "\17\66\1\56\uff44\66",
            "\1\67\1\70",
            "\1\72",
            "\1\74",
            "\1\76",
            "\1\103\12\uffff\1\102\2\uffff\1\101\2\uffff\1\100",
            "\1\105\4\uffff\1\106",
            "\1\110\7\uffff\1\107\5\uffff\1\111",
            "\1\113\3\uffff\1\112",
            "\1\114\20\uffff\1\116\2\uffff\1\115",
            "\1\117",
            "\1\120\3\uffff\1\122\5\uffff\1\121",
            "\1\123",
            "\1\125",
            "\1\127\1\130",
            "\1\132",
            "\1\134",
            "\1\137\13\uffff\1\136",
            "\1\141\3\uffff\1\142",
            "\1\144\4\uffff\1\145",
            "",
            "\1\152\1\150\1\uffff\1\151",
            "",
            "",
            "",
            "",
            "",
            "\1\160",
            "",
            "",
            "\1\163\11\uffff\1\165\6\uffff\1\164",
            "\1\166\17\uffff\1\167",
            "\1\170",
            "\1\172",
            "\1\174\1\uffff\1\173",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0082\6\uffff\1\u0083\1\u0081",
            "",
            "",
            "\1\u0088\12\uffff\1\u0086\13\uffff\1\u0087",
            "\1\u0089",
            "\1\u008a",
            "\47\u008c\1\u008b\uffd8\u008c",
            "\47\u008e\1\u008d\u0083\u008e\1\u0090\uff54\u008e",
            "\1\u0091",
            "\12\u0094\10\uffff\1\u0095\1\uffff\3\u0095\5\uffff\1\u0095"+
            "\13\uffff\1\u0092\6\uffff\1\u0094\2\uffff\1\u0095\1\uffff\3"+
            "\u0095\5\uffff\1\u0095\13\uffff\1\u0092",
            "\12\u0094\10\uffff\1\u0095\1\uffff\3\u0095\5\uffff\1\u0095"+
            "\22\uffff\1\u0094\2\uffff\1\u0095\1\uffff\3\u0095\5\uffff\1"+
            "\u0095",
            "\1\104\34\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "",
            "\0\u008c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a\1\u009b",
            "",
            "\1\u009c",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u009e\10\uffff\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a5\16\uffff\1\u00a4",
            "\1\u00a6",
            "\1\u00a8\5\uffff\1\u00a7",
            "\1\u00aa\5\uffff\1\u00a9",
            "\1\u00ab",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u00ad",
            "",
            "",
            "",
            "",
            "\1\u00ae",
            "",
            "",
            "",
            "",
            "\1\u00b0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b5\14\uffff\1\u00b6",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00ba\3\uffff\1\u00b9",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u00c4",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u00c6",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\47\u00ce\1\u00cd\u0083\u00ce\1\u0090\uff54\u00ce",
            "\47\u008e\1\u008d\u0083\u008e\1\u0090\uff54\u008e",
            "",
            "",
            "\12\u00cf\1\u00d1\2\u00cf\1\u00d0\ufff2\u00cf",
            "",
            "",
            "\12\u0094\10\uffff\1\u0095\1\uffff\3\u0095\5\uffff\1\u0095"+
            "\22\uffff\1\u0094\2\uffff\1\u0095\1\uffff\3\u0095\5\uffff\1"+
            "\u0095",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e3\20\uffff\1\u00e2",
            "\1\u00e4",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\1\u00e7\31\104",
            "",
            "\1\u00e9",
            "",
            "",
            "",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u00f2",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u00f4",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u00f6\2\uffff\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\47\u0104\1\u0103\u0083\u0104\1\u0105\uff54\u0104",
            "\47\u0107\1\uffff\u0083\u0107\1\u0090\uff54\u0107",
            "\47\u008e\1\u008d\u0083\u008e\1\u0090\uff54\u008e",
            "\12\u00cf\1\u00d1\2\u00cf\1\u00d0\ufff2\u00cf",
            "\1\u00d1",
            "\47\u0109\1\u0108\u0083\u0109\1\u00d2\uff54\u0109",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "",
            "",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\104\13\uffff\12\104\7\uffff\10\104\1\u0129\21\104\4\uffff"+
            "\1\104\1\uffff\32\104",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0131",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0133",
            "\1\u0134",
            "\47\u0136\1\u0135\u0083\u0136\1\u0105\uff54\u0136",
            "\47\u0104\1\u0103\u0083\u0104\1\u0105\uff54\u0104",
            "",
            "",
            "\47\u008e\1\u008d\u0083\u008e\1\u0090\uff54\u008e",
            "\47\u0138\1\u0137\u0083\u0138\1\u00d2\uff54\u0138",
            "\47\u0109\1\u0108\u0083\u0109\1\u00d2\uff54\u0109",
            "",
            "\1\u0139",
            "\1\u013a",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u013d",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u013f",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0141",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\22\104\1\u0150\7\104",
            "\1\u0152",
            "",
            "",
            "\1\u0153",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0155",
            "",
            "\1\u0156",
            "\1\u0157",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0159",
            "\1\u015a",
            "",
            "\1\u015b\16\uffff\1\u015c",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u015e",
            "\47\u015f\1\uffff\u0083\u015f\1\u0105\uff54\u015f",
            "\47\u0104\1\u0103\u0083\u0104\1\u0105\uff54\u0104",
            "\47\u0160\1\uffff\u0083\u0160\1\u00d2\uff54\u0160",
            "\47\u0109\1\u0108\u0083\u0109\1\u00d2\uff54\u0109",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0162",
            "",
            "",
            "\1\u0163",
            "",
            "\1\u0164",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0170",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u017a",
            "\1\u017b",
            "",
            "\1\u017c",
            "\47\u0104\1\u0103\u0083\u0104\1\u0105\uff54\u0104",
            "\47\u0109\1\u0108\u0083\u0109\1\u00d2\uff54\u0109",
            "",
            "\1\u017d",
            "\1\u017e",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\u0180",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\u0182",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0186",
            "",
            "",
            "\1\u0187",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0188",
            "\1\u0189",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "",
            "\1\u018f",
            "",
            "\1\u0190",
            "",
            "",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0193",
            "\1\u0194",
            "",
            "\1\u0195",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0197",
            "\1\u0198",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u019c",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\u019e",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\104\13\uffff\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_209 = input.LA(1);

                        s = -1;
                        if ( (LA47_209=='\'') ) {s = 264;}

                        else if ( ((LA47_209>='\u0000' && LA47_209<='&')||(LA47_209>='(' && LA47_209<='\u00AA')||(LA47_209>='\u00AC' && LA47_209<='\uFFFF')) ) {s = 265;}

                        else if ( (LA47_209=='\u00AB') ) {s = 210;}

                        else s = 266;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_311 = input.LA(1);

                        s = -1;
                        if ( ((LA47_311>='\u0000' && LA47_311<='&')||(LA47_311>='(' && LA47_311<='\u00AA')||(LA47_311>='\u00AC' && LA47_311<='\uFFFF')) ) {s = 352;}

                        else if ( (LA47_311=='\u00AB') ) {s = 210;}

                        else s = 266;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_45 = input.LA(1);

                        s = -1;
                        if ( (LA47_45=='\'') ) {s = 139;}

                        else if ( ((LA47_45>='\u0000' && LA47_45<='&')||(LA47_45>='(' && LA47_45<='\uFFFF')) ) {s = 140;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA47_259 = input.LA(1);

                        s = -1;
                        if ( (LA47_259=='\'') ) {s = 309;}

                        else if ( ((LA47_259>='\u0000' && LA47_259<='&')||(LA47_259>='(' && LA47_259<='\u00AA')||(LA47_259>='\u00AC' && LA47_259<='\uFFFF')) ) {s = 310;}

                        else if ( (LA47_259=='\u00AB') ) {s = 261;}

                        else s = 262;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA47_264 = input.LA(1);

                        s = -1;
                        if ( (LA47_264=='\'') ) {s = 311;}

                        else if ( ((LA47_264>='\u0000' && LA47_264<='&')||(LA47_264>='(' && LA47_264<='\u00AA')||(LA47_264>='\u00AC' && LA47_264<='\uFFFF')) ) {s = 312;}

                        else if ( (LA47_264=='\u00AB') ) {s = 210;}

                        else s = 266;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA47_142 = input.LA(1);

                        s = -1;
                        if ( (LA47_142=='\'') ) {s = 141;}

                        else if ( (LA47_142=='\u00AB') ) {s = 144;}

                        else if ( ((LA47_142>='\u0000' && LA47_142<='&')||(LA47_142>='(' && LA47_142<='\u00AA')||(LA47_142>='\u00AC' && LA47_142<='\uFFFF')) ) {s = 142;}

                        else s = 143;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA47_351 = input.LA(1);

                        s = -1;
                        if ( (LA47_351=='\'') ) {s = 259;}

                        else if ( ((LA47_351>='\u0000' && LA47_351<='&')||(LA47_351>='(' && LA47_351<='\u00AA')||(LA47_351>='\u00AC' && LA47_351<='\uFFFF')) ) {s = 260;}

                        else if ( (LA47_351=='\u00AB') ) {s = 261;}

                        else s = 262;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA47_206 = input.LA(1);

                        s = -1;
                        if ( (LA47_206=='\'') ) {s = 141;}

                        else if ( ((LA47_206>='\u0000' && LA47_206<='&')||(LA47_206>='(' && LA47_206<='\u00AA')||(LA47_206>='\u00AC' && LA47_206<='\uFFFF')) ) {s = 142;}

                        else if ( (LA47_206=='\u00AB') ) {s = 144;}

                        else s = 143;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA47_145 = input.LA(1);

                        s = -1;
                        if ( ((LA47_145>='\u0000' && LA47_145<='\t')||(LA47_145>='\u000B' && LA47_145<='\f')||(LA47_145>='\u000E' && LA47_145<='\uFFFF')) ) {s = 207;}

                        else if ( (LA47_145=='\r') ) {s = 208;}

                        else if ( (LA47_145=='\n') ) {s = 209;}

                        else s = 210;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA47_263 = input.LA(1);

                        s = -1;
                        if ( (LA47_263=='\'') ) {s = 141;}

                        else if ( (LA47_263=='\u00AB') ) {s = 144;}

                        else if ( ((LA47_263>='\u0000' && LA47_263<='&')||(LA47_263>='(' && LA47_263<='\u00AA')||(LA47_263>='\u00AC' && LA47_263<='\uFFFF')) ) {s = 142;}

                        else s = 143;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA47_309 = input.LA(1);

                        s = -1;
                        if ( ((LA47_309>='\u0000' && LA47_309<='&')||(LA47_309>='(' && LA47_309<='\u00AA')||(LA47_309>='\u00AC' && LA47_309<='\uFFFF')) ) {s = 351;}

                        else if ( (LA47_309=='\u00AB') ) {s = 261;}

                        else s = 262;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA47_260 = input.LA(1);

                        s = -1;
                        if ( (LA47_260=='\'') ) {s = 259;}

                        else if ( ((LA47_260>='\u0000' && LA47_260<='&')||(LA47_260>='(' && LA47_260<='\u00AA')||(LA47_260>='\u00AC' && LA47_260<='\uFFFF')) ) {s = 260;}

                        else if ( (LA47_260=='\u00AB') ) {s = 261;}

                        else s = 262;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA47_310 = input.LA(1);

                        s = -1;
                        if ( (LA47_310=='\'') ) {s = 259;}

                        else if ( ((LA47_310>='\u0000' && LA47_310<='&')||(LA47_310>='(' && LA47_310<='\u00AA')||(LA47_310>='\u00AC' && LA47_310<='\uFFFF')) ) {s = 260;}

                        else if ( (LA47_310=='\u00AB') ) {s = 261;}

                        else s = 262;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA47_0 = input.LA(1);

                        s = -1;
                        if ( (LA47_0=='=') ) {s = 1;}

                        else if ( (LA47_0=='+') ) {s = 2;}

                        else if ( (LA47_0=='|') ) {s = 3;}

                        else if ( (LA47_0=='&') ) {s = 4;}

                        else if ( (LA47_0=='c') ) {s = 5;}

                        else if ( (LA47_0=='a') ) {s = 6;}

                        else if ( (LA47_0=='f') ) {s = 7;}

                        else if ( (LA47_0=='m') ) {s = 8;}

                        else if ( (LA47_0=='p') ) {s = 9;}

                        else if ( (LA47_0=='v') ) {s = 10;}

                        else if ( (LA47_0=='d') ) {s = 11;}

                        else if ( (LA47_0=='!') ) {s = 12;}

                        else if ( (LA47_0=='>') ) {s = 13;}

                        else if ( (LA47_0=='<') ) {s = 14;}

                        else if ( (LA47_0=='-') ) {s = 15;}

                        else if ( (LA47_0=='.') ) {s = 16;}

                        else if ( (LA47_0=='?') ) {s = 17;}

                        else if ( (LA47_0=='*') ) {s = 18;}

                        else if ( (LA47_0=='/') ) {s = 19;}

                        else if ( (LA47_0=='%') ) {s = 20;}

                        else if ( (LA47_0=='s') ) {s = 21;}

                        else if ( (LA47_0==';') ) {s = 22;}

                        else if ( (LA47_0=='{') ) {s = 23;}

                        else if ( (LA47_0=='}') ) {s = 24;}

                        else if ( (LA47_0=='@') ) {s = 25;}

                        else if ( (LA47_0==',') ) {s = 26;}

                        else if ( (LA47_0=='r') ) {s = 27;}

                        else if ( (LA47_0==')') ) {s = 28;}

                        else if ( (LA47_0=='(') ) {s = 29;}

                        else if ( (LA47_0=='t') ) {s = 30;}

                        else if ( (LA47_0=='n') ) {s = 31;}

                        else if ( (LA47_0==':') ) {s = 32;}

                        else if ( (LA47_0=='F') ) {s = 33;}

                        else if ( (LA47_0=='E') ) {s = 34;}

                        else if ( (LA47_0=='B') ) {s = 35;}

                        else if ( (LA47_0=='S') ) {s = 36;}

                        else if ( (LA47_0=='A') ) {s = 37;}

                        else if ( (LA47_0=='I') ) {s = 38;}

                        else if ( (LA47_0=='i') ) {s = 39;}

                        else if ( (LA47_0==']') ) {s = 40;}

                        else if ( (LA47_0=='[') ) {s = 41;}

                        else if ( (LA47_0=='e') ) {s = 42;}

                        else if ( (LA47_0=='w') ) {s = 43;}

                        else if ( (LA47_0=='o') ) {s = 44;}

                        else if ( (LA47_0=='\'') ) {s = 45;}

                        else if ( (LA47_0=='\u00BB') ) {s = 46;}

                        else if ( (LA47_0=='\u00AB') ) {s = 47;}

                        else if ( (LA47_0=='0') ) {s = 48;}

                        else if ( ((LA47_0>='1' && LA47_0<='9')) ) {s = 49;}

                        else if ( (LA47_0=='^') ) {s = 50;}

                        else if ( (LA47_0=='$'||(LA47_0>='C' && LA47_0<='D')||(LA47_0>='G' && LA47_0<='H')||(LA47_0>='J' && LA47_0<='R')||(LA47_0>='T' && LA47_0<='Z')||LA47_0=='_'||LA47_0=='b'||(LA47_0>='g' && LA47_0<='h')||(LA47_0>='j' && LA47_0<='l')||LA47_0=='q'||LA47_0=='u'||(LA47_0>='x' && LA47_0<='z')) ) {s = 51;}

                        else if ( (LA47_0=='\"') ) {s = 52;}

                        else if ( ((LA47_0>='\t' && LA47_0<='\n')||LA47_0=='\r'||LA47_0==' ') ) {s = 53;}

                        else if ( ((LA47_0>='\u0000' && LA47_0<='\b')||(LA47_0>='\u000B' && LA47_0<='\f')||(LA47_0>='\u000E' && LA47_0<='\u001F')||LA47_0=='#'||LA47_0=='\\'||LA47_0=='`'||(LA47_0>='~' && LA47_0<='\u00AA')||(LA47_0>='\u00AC' && LA47_0<='\u00BA')||(LA47_0>='\u00BC' && LA47_0<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA47_141 = input.LA(1);

                        s = -1;
                        if ( (LA47_141=='\'') ) {s = 205;}

                        else if ( ((LA47_141>='\u0000' && LA47_141<='&')||(LA47_141>='(' && LA47_141<='\u00AA')||(LA47_141>='\u00AC' && LA47_141<='\uFFFF')) ) {s = 206;}

                        else if ( (LA47_141=='\u00AB') ) {s = 144;}

                        else s = 143;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA47_204 = input.LA(1);

                        s = -1;
                        if ( (LA47_204=='\'') ) {s = 259;}

                        else if ( ((LA47_204>='\u0000' && LA47_204<='&')||(LA47_204>='(' && LA47_204<='\u00AA')||(LA47_204>='\u00AC' && LA47_204<='\uFFFF')) ) {s = 260;}

                        else if ( (LA47_204=='\u00AB') ) {s = 261;}

                        else s = 262;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA47_52 = input.LA(1);

                        s = -1;
                        if ( ((LA47_52>='\u0000' && LA47_52<='\uFFFF')) ) {s = 140;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA47_352 = input.LA(1);

                        s = -1;
                        if ( (LA47_352=='\'') ) {s = 264;}

                        else if ( ((LA47_352>='\u0000' && LA47_352<='&')||(LA47_352>='(' && LA47_352<='\u00AA')||(LA47_352>='\u00AC' && LA47_352<='\uFFFF')) ) {s = 265;}

                        else if ( (LA47_352=='\u00AB') ) {s = 210;}

                        else s = 266;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA47_205 = input.LA(1);

                        s = -1;
                        if ( ((LA47_205>='\u0000' && LA47_205<='&')||(LA47_205>='(' && LA47_205<='\u00AA')||(LA47_205>='\u00AC' && LA47_205<='\uFFFF')) ) {s = 263;}

                        else if ( (LA47_205=='\u00AB') ) {s = 144;}

                        else s = 143;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA47_46 = input.LA(1);

                        s = -1;
                        if ( (LA47_46=='\'') ) {s = 141;}

                        else if ( ((LA47_46>='\u0000' && LA47_46<='&')||(LA47_46>='(' && LA47_46<='\u00AA')||(LA47_46>='\u00AC' && LA47_46<='\uFFFF')) ) {s = 142;}

                        else if ( (LA47_46=='\u00AB') ) {s = 144;}

                        else s = 143;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA47_265 = input.LA(1);

                        s = -1;
                        if ( (LA47_265=='\'') ) {s = 264;}

                        else if ( ((LA47_265>='\u0000' && LA47_265<='&')||(LA47_265>='(' && LA47_265<='\u00AA')||(LA47_265>='\u00AC' && LA47_265<='\uFFFF')) ) {s = 265;}

                        else if ( (LA47_265=='\u00AB') ) {s = 210;}

                        else s = 266;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA47_312 = input.LA(1);

                        s = -1;
                        if ( (LA47_312=='\'') ) {s = 264;}

                        else if ( (LA47_312=='\u00AB') ) {s = 210;}

                        else if ( ((LA47_312>='\u0000' && LA47_312<='&')||(LA47_312>='(' && LA47_312<='\u00AA')||(LA47_312>='\u00AC' && LA47_312<='\uFFFF')) ) {s = 265;}

                        else s = 266;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA47_207 = input.LA(1);

                        s = -1;
                        if ( (LA47_207=='\r') ) {s = 208;}

                        else if ( (LA47_207=='\n') ) {s = 209;}

                        else if ( ((LA47_207>='\u0000' && LA47_207<='\t')||(LA47_207>='\u000B' && LA47_207<='\f')||(LA47_207>='\u000E' && LA47_207<='\uFFFF')) ) {s = 207;}

                        else s = 210;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}