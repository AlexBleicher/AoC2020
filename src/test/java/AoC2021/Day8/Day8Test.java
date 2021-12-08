package AoC2021.Day8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Day8Test {

    @ParameterizedTest
    @MethodSource
    void task1(String input, int expectedResult) {
        Day8 testObject = new Day8(input);
        int result = testObject.task1();

        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> task1() {
        return Stream.of(
                Arguments.of("be cfbegad cbdgef fgaecd cgeb fdcge agebfd fecdb fabcd edb | fdgacbe cefdb cefbgd gcbe\n" +
                        "edbfga begcd cbg gc gcadebf fbgde acbgfd abcde gfcbed gfec | fcgedb cgb dgebacf gc\n" +
                        "fgaebd cg bdaec gdafb agbcfd gdcbef bgcad gfac gcb cdgabef | cg cg fdcagb cbg\n" +
                        "fbegcd cbd adcefb dageb afcb bc aefdc ecdab fgdeca fcdbega | efabcd cedba gadfec cb\n" +
                        "aecbfdg fbg gf bafeg dbefa fcge gcbea fcaegb dgceab fcbdga | gecf egdcabf bgf bfgea\n" +
                        "fgeab ca afcebg bdacfeg cfaedg gcfdb baec bfadeg bafgc acf | gebdcfa ecba ca fadegcb\n" +
                        "dbcfg fgd bdegcaf fgec aegbdf ecdfab fbedc dacgb gdcebf gf | cefg dcbef fcge gbcadfe\n" +
                        "bdfegc cbegaf gecbf dfcage bdacg ed bedf ced adcbefg gebcd | ed bcgafe cdgba cbgef\n" +
                        "egadfb cdbfeg cegd fecab cgb gbdefca cg fgcdab egfdb bfceg | gbdfcae bgc cg cgb\n" +
                        "gcafb gcf dcaebfg ecagb gf abcdeg gaef cafbge fdbac fegbdc | fgae cfgab fg bagce", 26),
                Arguments.of("fdgcea dgefa efabdg fdgcba dab baefc begd ebdfa db bafgdce | gfbcda cgfadb badcefg eacfgd\n" +
                        "eagfdb bafdec fdg edgca gf cdbafeg egfcdb bgaf aedfg defba | gfd edagcbf cdfebg gfedab\n" +
                        "faecdgb edgf decag cgf agdcbf aefcb gf dgebca fdaceg cefga | fcg fcbae fg aecgd\n" +
                        "abcgdfe gebfd eacbdf gc gbc cabdfg dcfab gdcfb gacd acfegb | fabdc cg bdfeg gbc\n" +
                        "bgcda cagdf geafdc fbcdge fedag fc egcabdf gfc gfedba acfe | cdegaf dbfgea adefbg afedcbg\n" +
                        "degfbc cdeg dcfbae debfc gbadecf begfca egb eg dbfge adgfb | egfdbc ecgfbd dbcagef cafbed\n" +
                        "gefacb cdg decgba badgfc edga eabcg dfacgeb dg efcbd dgbec | dg cgabe decfb dg\n" +
                        "bafdeg facdgbe dgba gcafbe bd bde gdbfe cegfd agefb ebcfda | gbafec bfgea fgecab cefdba\n" +
                        "bfcgea cadfb dfcg afbdcg cg ebgda bcgad acg edbcgaf ebfcda | acgfeb dgbca cegbfa cadbf\n" +
                        "bfeadcg gdcea bcagfe becdaf fcgbe bcd bd cbfdeg fdgb dbegc | dcb acged edbcfa dbgecaf\n" +
                        "bedafgc bagfce cadgf dbfcag dbca fbdga fgaced agb ab ebdfg | agb ba gdbaf fcbgea\n" +
                        "abcgf agdec agbcfd cfd df aefcbg decfba gafcd fbgd dbafegc | fcbag cegad gdace cdf\n" +
                        "cgb ecafdb bfdac cg cgfbd cbfega edbfg fbeagdc adcg dgcfba | gbfed fecagb fdbcga afcbd\n" +
                        "agcb cfaebdg bc bfedcg dcb degcab beadc dgeca ebfad fdgcea | acbg abcg gcba bc\n" +
                        "cgbf dafgce fadgbe bdecfg gdfbe cedab cg gce adfgcbe egdbc | cg cg ecfadg ecgdabf\n" +
                        "cd fecagd fbgca cdebfg cgfdb gdebf cbed gdcbfea gdefba dfc | cfd edcb bfdage edcb\n" +
                        "agbedc dcagbf af bcdaf bdagc gfbcae fgda bfa cbedf gcedabf | af gabecd dgfcaeb afb\n" +
                        "dgebfa adg gbed debfa dg adfgecb fcgea acdbef cafbgd gfade | adgef gd cgfbdae dgfacb\n" +
                        "fbc bcfgd fgdeba bdegacf bagfcd cbag afdgb bcdeaf fcgde cb | agfcdbe fcb cbf bc\n" +
                        "cgabd bgafc fcaedb bda bgecfad bfceag bd dagec fdbg dafgbc | cdgbefa bfacge ebcfga gfcab\n" +
                        "fba dabcge beacfg bdfc bagfd dcagb fgaed bf fbdagc dbcefag | gacbd dgeaf cfdb fab\n" +
                        "cebgd ade cbda cgfea dfabeg eadcg agdbec bgdecf ad deacbgf | ecadgfb dabgef beagdf ecgbd\n" +
                        "aedgc deafbc fgaedcb cdgfbe acfg edgfc ca cda dcgefa adbeg | acgf edcga cabgdfe gacf\n" +
                        "bcagde eg bfcea abgcd gdfcbe bge dabgcf bfegcad gceba aedg | acdgfb fbdgec agbec dbcefg\n" +
                        "ebacd decgb ebfac cbgdea adgb efabdcg bfdgec eda cfdaeg da | egdcb bgcdef da da\n" +
                        "cfgebd afebd cb cebda dgcae afgdcbe dgafeb bfca ceb bdcefa | bec gaced afedb eadgc\n" +
                        "bdcfea ge acfbg efagb bdaef badgefc gadbef eag gfde bdcgae | bcdaef bcefad efcadb gae\n" +
                        "befagd fd cbefa dcbega egacfbd efabd edcafg dgbf gedba fed | fde abedf def aedfb\n" +
                        "bcd abgcfde dbaf abecdg db dcbef abegcf efacb fabedc dgecf | ebcfd bfda dcb egcafbd\n" +
                        "fdbea caefbd gcdafe ecafd efb cedb be geabdcf gfbad fcaegb | baefgc defcab eb cadef\n" +
                        "dagec fadge dc cdg egacb adecfg bfgdeca fadegb dcabgf cdfe | fcde agcde efcd cgd\n" +
                        "dceabg fbaedc aegfdcb fc cfa cefgad bfadg bdcfa cbef eadbc | fc dcabf cebf afdbc\n" +
                        "defabcg febdg bdfega adfg fabcge edfba abedfc bdcge fg gfb | fgb fg fbdaec daefb\n" +
                        "fd gfbaec cdf fgced eacfg gfdebca fgda bdfeac cegdb cfadge | dfc gcfedba dfecg agfd\n" +
                        "ec bfeacg bdfca acdfe fagdbc eca febacdg ebcd eadgf cabedf | dfcae fecabgd eac aedfgcb\n" +
                        "edg dfceb egdcafb gcef dbcga cdafeb cgebd gdfbec eg gfdabe | fcdbeg ge bfaecd ebfcd\n" +
                        "ecg bcadfg egfac fgdca fgeab cfdage bceadg fced cgdebfa ce | egfba cfgae dcfe ec\n" +
                        "cdeg ec eac efdac dgcaf bagfec dbfeacg aegdfc bfdgca dfabe | efbad egdc afcbdg ce\n" +
                        "gbecda cbe egfcba abcdg agfcebd ecda bfedg adgcbf ce bdceg | ceagbd gdabc aced adec\n" +
                        "ecbagfd egfbd gafe gcadb bdgae gfbdea gefcbd bea ae cfabde | gdacfeb abedg fbgdec cbedagf\n" +
                        "bagfe fdeagc agfebd fbcea dfbca gcfbae cae bgce ec fgacbde | acdfeg ebagf ce efcgba\n" +
                        "bf dagcebf fdegc ebcfda geadcb bfc acbfgd acbdg fbga fdcgb | acfbde dbacge cadgb gfab\n" +
                        "cagbf bcde bdefag gcfde cdbefg deafgc bfd bdgfc bd dagbcef | fagdec becd dfb fgbca\n" +
                        "dbc db dgacbe bgced abde cdafebg dgfeac ebcfg daceg dcfgab | dgcfae dcb daeb bd\n" +
                        "bgdfca bag bacefd cbged acbgd faecbg fagd ga cgbafde fabdc | bfdagc acdgb bacdg dfga\n" +
                        "eafbcdg ebcafg bdge dga eafdg eafdc efgab dg agdfbc fdaebg | bcedgfa fgbcda bcgadf edgfab\n" +
                        "fc gbced efcgb fbage dbefac cgdaebf fcb fdebcg gacedb dcfg | gfcbade dafegbc adfgbce fbegc\n" +
                        "ebc cgbfe be bfcdga acfbegd abge abcfg dgfec cfdeba acbfge | dcegf eb badgcfe gabe\n" +
                        "decfbg cdbeag decgb fgebc cbf bf agefc fbdgcea becafd gfdb | dceagb dgbf bf fcb\n" +
                        "gcbfad aedcg egadb ecgdaf dcfgbae dc cefga fcde adc fabcge | acd bacegf gcefda gdeca\n" +
                        "cad fdcbega gedbc dbgfac efdgcb dbeagc eadfg ca daecg cbea | ca abce gfdea gbcfed\n" +
                        "afdegbc efgbad fcdge cafg fg efadc geadfc gfd bcdeg cbedfa | gf fgbaed fgabcde cdfge\n" +
                        "cefga fda gafced facgd degf fd efdgacb cebfag gbcad deabcf | gbecadf gfabec afd afgcde\n" +
                        "bedcf adc cdegbf aecb gcbeadf ebacdf ac eagfd cdfea cgdbaf | adc cbfgdea dca abcgfd\n" +
                        "dgab cfbdea gcadbef afdeg ebdfa fgdecb deafbg edg gd cgfae | ebdaf abdg gde cgeaf\n" +
                        "dfbae cgadf abfdgce ge ged aegfd debcfg eagdcf geac dfbcga | deg aebdf gcafd egac\n" +
                        "eagdb ecd afdc cd cfadgbe gfcdbe bfcgea efcdag adgce gceaf | fedcgb ecdga facd cd\n" +
                        "adbgcf fabced gfc afeg dfaec gecdf fg gfcadbe bdecg acgfde | cgf gfc decagf cdfae\n" +
                        "fgcda bfgcda bdecaf adc bcfag bdag beagcf ad fgcadeb dcfeg | dgfcba cad fcagd baecfd\n" +
                        "dcfe cbagd gdfabe ed abdfec ceabd bde becgaf eadgcfb fabec | dfce eagdbf faebc gacefb\n" +
                        "acefbgd abgfe cdgfbe abd fabdce dbfec da cgfdba edac dabfe | fbaeg eabcgdf eagfb afdbe\n" +
                        "ecgdfa bdfge bafdg fadcbe bfa bcag ba cgdaf geafdcb agfcdb | fadcg fagecbd baf cfeagd\n" +
                        "bcaegf dcfag def bedg gbaefd faged dfceab ed abgef fecbdga | ed dcagefb dgeabfc bdfeag\n" +
                        "ecfgadb fcb fgeac fdeba cfbead cefab cdba ecfbgd bc bdgfae | bfc gaebdf cfb afedcb\n" +
                        "fecbd efcgabd cfb cf dgbef abdce cbfgae faegbd fbcedg gfcd | febdg bdfegc gfcd defgb\n" +
                        "aecdgfb gedfbc agbf cefadb acf adfcbg fa dgfbc egcda dafcg | agfb gaebcdf bgedcaf caf\n" +
                        "gc dcbg eagcdb gce cfbgea faedg dceba abdcef acebdgf edagc | bdgfcea dbgc cbgfea bcaefd\n" +
                        "gcadb fegadbc afb ecgbfa cdbf bcfagd efagd bfagd abgedc fb | bfcage dbfga gadbf bagdf\n" +
                        "gadbefc abgdef gbcfde cef gbfae cdbaf ebfgca abcef ec ecag | fdbca acdbfeg ec ce\n" +
                        "adbec cgabfd afcbge dfbgae efcbagd bgeca gc agc bagef gefc | gafcbde gca cga dgcbfa\n" +
                        "fdcgba cedab debga cebg adbgef edabgfc bgcade cfade bc acb | gedcba cgbe cdgeab bc\n" +
                        "cedagf gcebda gacf afedc aefgd ca cea gdafbe bdgfcea ebfcd | ac cagf fbaedg afedc\n" +
                        "fa ecgbfa egabd gedafb dcabfeg gfa dgefa bdaf dcfeg agbedc | cgfbaed dbacgef aebgcf gfa\n" +
                        "dgebaf cfbgd dfaecb ef gacefbd bdfce faec ceadb feb cedabg | bdefcag bgfcd ef cdebf\n" +
                        "cgad afcbed fdgaceb bfgead egbadc cbedg gd bcade fcegb dgb | feadgbc gbedc bgeadc abdgef\n" +
                        "dbefga cbfad ebdcf gdabefc bfe gcfde cgfeda be cgdefb bcge | cgbe eb cebg geabfd\n" +
                        "fecda begacf bagfedc ga cag gfcdbe cebfg gabe fgbdca cgefa | efcbg gca eacfd dgcebf\n" +
                        "faegcb cfdbe gdfca afecgd cgbdaf adbg gdbfc bfg gb gcdebfa | fbdgac cfdga cadegfb cgfbd\n" +
                        "gdefac abecg dgebfca bf defb bgdeaf fgdea abf afegb cbgadf | fdgeab efbd fb abgce\n" +
                        "gcaed bdfgeca eafcgd dfegcb fdgce cae befacd ea dagbc feag | ecbdfag gbdac gcbedf cgfebd\n" +
                        "cge ce aedcg fagdbc dbgcef cbdaeg abec dfega egdbafc agdcb | dagfe ec adfeg ce\n" +
                        "dbfeg ebgdca dgfcab fcae bdfeagc abf gbeca bacfeg af gafbe | afec bfa fgbed fab\n" +
                        "gfc dcgae fdgeab abdfg bafc cegfbd cagfd fc fdgcab gbacedf | faedbg gfdba gfadb ebagdfc\n" +
                        "dbcega cedba cdg bgfca gd bagcd dfgceb becfda adge cdbgfea | gcd abfcg ebdcfga dbgca\n" +
                        "dbf gdafec aegbcdf db fbcdg afgdeb bfgce cdba abfdcg acdfg | egcabfd egcfb cdgfba fbd\n" +
                        "gdbca acbfg efcgab eagdfbc edgabf dga eabcd gd bcagdf fgdc | gad dagcb dcfageb cgafb\n" +
                        "cebfdg ecbg gdefb dgc cg gecdf egafdb fdcbeag abgcfd eadcf | dabgfec fbgacd badfgc abcdegf\n" +
                        "gfb gfcbe egadfb bgcde bdfc cefdbg cfage bfgceda bacdeg bf | fb fb fbg gcebd\n" +
                        "edcgfa abecgf dfagbc aef ea acbe fbgcead fdebg fbaeg gabfc | fae ceab fcageb ebfag\n" +
                        "bedfcg fgcade caf aefbg dgac ac efdgc fecga fgbecda bfedac | gfbea acf egbfdc agcd\n" +
                        "ecgda gab dfab bcgeaf fadegb ab gbfed dbgae dcebfag dcefgb | ebgfd dgbae gbfde gab\n" +
                        "aebcdg cgfeabd degba fb dafegb fdcga fdgab gbf abef ebcfdg | eafb eadgbc fgb dgfac\n" +
                        "gc cafbeg cdge abdfc fedbg cbg dbgefc edbfag gbcfd gefbdac | fceabg dcge cg gc\n" +
                        "eag cafde debg fbedgca bcgadf egafcb gdaec gecbda cdagb ge | gcabed gbcda gedb bdcga\n" +
                        "ea ceafgd bdae dcbage gae fgecb agecb abcdfg cgdba eabgcfd | cefgb dcbfag acgdef adgcfe\n" +
                        "fbgacde dbfeag bdgcf gaf ga gdacef afcdg afecd aefdbc geac | afg fga gacfd fgaced\n" +
                        "dfga acd dgfec acbged acfbe afdce bcdfeg da fagecbd decfga | cda aebgdc fagd caebgd\n" +
                        "ebgf edacfg acfedgb aefcb fcg gf ebcafd abcdg cfabg fgecba | cdfgae dbgca deacfb gf\n" +
                        "gacbfe abgef cbagf gecfdb fdbea agcdbf eg cgefdba egb agce | efdba eafgb dabfgec cgfadb\n" +
                        "afbegd acdgb aeg cegdfa aebdf dbafec gbdafce eg bfge bgeda | afbced bdfagce dacgb bfeg\n" +
                        "cag gc agcfde agecbf bceg acebfd agfbd efbac edgfbac gafcb | bfcag cgeb agc cgfabe\n" +
                        "ecadgb abe fgeb gbaedf adbfe fdage dgcafe bfdca cfgbade be | ebfcgad aedfg cafdeg dcefga\n" +
                        "eagfdbc fbcgea bgf afdbc bdgec faebcd fgcbd fg bgdcaf gdfa | dfbcae fdgcb efacbgd bdacegf\n" +
                        "dfag cdfegb fa edfbac cfa egcba fdgcb bfgca bgcdafe dgcfab | fgbca cbfagd acgbfde fca\n" +
                        "fb bdfg gfebc edbcg beadgc adfceb gcfea efb febcdg fdbecga | agcfe bf gbcef gdbec\n" +
                        "ecfgabd ebfcg decbaf cgfab ecfbdg be bce gedb dcgef fdcgea | begfc acbgf gfcba eb\n" +
                        "cg ebadgc dceba fegcba bcdfea acgdbfe cegd bcg abdgf dbagc | abcde cg gc gbc\n" +
                        "bfc acegbf febacd ecdba cf dcfa dbcef dfgeb bgdcae bcfdega | fbcgea fbc fbecda fdca\n" +
                        "agbfd gfeabc ad dfa adgc bagfc gfbacd gfdeb fegbadc fcdbae | fad dgca gdefb afbcg\n" +
                        "bcgead ecagb fcagb gcbedaf dage ea bea afedbc cdgfeb cebdg | gbdec eba edfbca agfdcbe\n" +
                        "abcg age eadcbf ga gdeafb ecfgd becda cegad efbcdga adcgbe | eabfdg fdceg cedga cgdae\n" +
                        "fbd cbgd dgcfa cbdaf fbdage db gecafd bacef cdbagf fcdbgea | facbd bgdc db cbaef\n" +
                        "fbdca fdcgeab gfbc gcbad gdc abged bafdgc gc gcdfea cdbeaf | adgcb fegacdb cafdeb geabd\n" +
                        "bdafc cegbdf gd gbafec fgecb fdg aebfgdc dbgfc abfdge edcg | cdfbg dg edcg afdbc\n" +
                        "gbaefd caefg dbgae fb ebafg cagdbe bcadfe fgdb ebf cedfgab | gedcba bf fgbd bdfeagc\n" +
                        "da abcfdg gaecf bdaf bcdgea gecafdb cad cgbefd fgcdb cdgaf | dbcaeg bdaegfc dbfcage bafd\n" +
                        "gecba aegcf aefcbd gecdbf af gdfa cfa fgaecd cbdfega dcgef | fa eadfbc cbega cfage\n" +
                        "be agfedc fdega egcfadb fbeg eba cfdeab afegdb dbega dbgca | adgef gebf gdfbace gfeb\n" +
                        "fg gfe bgfae gdfa dabcfe ebafdg fdcebg abdef gbeac bedfacg | gef adfg fg fge\n" +
                        "ad fdgceb becdag gecfd afdge daecgf fbegdca afcd dae geabf | cadf dbagce ad dfac\n" +
                        "fgaedbc dbfae ceda egbcf bacfdg efbdca fdeabg ca cfa cfabe | gdefbac abfed ac dfcaeb\n" +
                        "fgbdca cdaefg bafge ac gca cgebfd bafdecg cadb gdbcf bfacg | egdcaf cgebdf gca agc\n" +
                        "cg cdabfe bfaec bagfce gfdabc fcg efagc ebfgcda edfag cgbe | bgce cgf gfc gcadbf\n" +
                        "caeg gaf gfcade cgfad bedgcfa fdcea ga bdgfc aefbdc gdefba | cfaed cefad fadgeb dgfca\n" +
                        "fbgad gbf fcdabge cegfab gadbc gfead fb aedbfg befd adgcef | gabcd bf acgdb bf\n" +
                        "gebaf bgeadf gcabedf edfca feadg dg gfdbca eagbcf gdbe gad | egdb ebfag dga ebfacg\n" +
                        "dcgabe gcb adcfbg agfbe bc afgcd bfcga adfecg bcdf bfacged | dcgfa cb dgabfc cgb\n" +
                        "ebafc debc efgdab fcb aefbd gaefcdb bc dcgfab abefcd afecg | agefc baecf ecbd bcf\n" +
                        "gfbdc de badfcg dge befga gfebcd cdef egfdbca ebdgf bgedca | ecfd dfgcb edfcabg dcabgf\n" +
                        "gaceb bad dfgabe dbfecg fdebg cebagdf gdbae adfg dbfeac da | eabdg dgfa afegdb agebfcd\n" +
                        "dfabg gdfeb da gdcabf abgfc bcgafe fadc adbgec gda gcebdfa | gda ad afcgb efgbd\n" +
                        "fdcaebg dbagfc edagb ca gacbd gcfa acedbf gefcbd cab cdbfg | cba geabd cbgda bac\n" +
                        "dfegc agc ca bacfgde adfgce adceg fcad efbgdc geafbc daebg | gdaeb gbade gca gdace\n" +
                        "bfedgac gedb abefg dacef gedbaf gadfbc db dab cgbefa afbde | edabf gfcbad dafcgeb bad\n" +
                        "fcbgea gba decgba gfdace gdeac bgdac afcgedb bdge dafcb bg | begd gcbfdea bg daegc\n" +
                        "egfab afc cdgba gfcbad cbgeda bgafc dfabec gfdc bacefgd fc | fc bceafd gabcd dfabcge\n" +
                        "cf cdabge cegda fgec cbfade acf eagfcbd acgfd bfgad gcfaed | cefgdab cdaebg gedfcab facegd\n" +
                        "ca ebdcf cda dfeac fdgeba agfebdc dbcagf dfage afecdg gaec | eacg adc efdgab dac\n" +
                        "dc gfcdeab cgfaed facge gdeba dfcg dca bfaced gdaec aegcfb | fdcg fbecag egdafc efagbc\n" +
                        "dbcfa fdaecb afg cafgbed cadfbg ga cadgfe cbga fbedg dbfag | bdegf gcaefd dagbf fdeacb\n" +
                        "defbgc cfgeabd cefgd gdc eabfgc afedg afdgcb dc bcefg cdbe | gadbcfe ebfgc decfbg gfecdb\n" +
                        "egad fedac dgfeca cdg efacdb dcbafg fgcbe gd dcfeg cebfdga | cgd dg gdc gadbcf\n" +
                        "dfe gcde dgfbe fbecad gdbaf faebgc ed gfebcad ebfgdc bgfec | cdeg gdec ebfdgc ed\n" +
                        "dgabefc cdbefa aedfb abdc becfd fagedc dcf cd bcgfe fbgead | fdc dfc bcad dc\n" +
                        "acgbf ebgfad bgcad cdbge dfcebg dcaebg ecda da fbcgdea abd | facgb gacdb egcabfd dcbgef\n" +
                        "acbe afgbcd adc bedcag ebgcd gdeac eacgbfd fedga ac gfbcde | dcbeg aceb gbdce fedga\n" +
                        "gfabd gcedab eb ecgdbaf ecdb egdacf egb degca bdega bgfcae | be gfacedb cgdaefb ecbagd\n" +
                        "fadgc dgfe eafdgc agfedbc gbdeca gcafe gd cbgeaf bdafc dgc | gecdabf dbecga efadcg dafecg\n" +
                        "bgc aecfg fadceg bcgeaf fdagb afgcdbe febc bc fagcb egcabd | cfbe cbfag bdgfa cgeafb\n" +
                        "fadecg cea dagcf cfed ce bdgae geacd eabdgfc afbcge dfcagb | adgce dacfg gcaefb ce\n" +
                        "cb dcgb fbc abgfcd ebdgfa acdfbe efgca afdcbeg fbagd cfbga | cb bdfcea fcdagb dgcb\n" +
                        "gadebc ag cabgd acbed dgbfc eafbcd bfadecg abcegf bga aegd | aegd bedacf gade egad\n" +
                        "fdagc acegd aecdfb adfbeg abdce becdga egd agbdecf ge gceb | acdeg fdbaec ged gebc\n" +
                        "ade afbceg aefcg gdac da dgfae gbdef acdgef bdefgca adbfec | bgcfae ad bdgefca dgfae\n" +
                        "fdcage eafcg df fgecd bcafge cdf cgdafeb gbdce dbagfc fead | cegfa cgedb fd gaefc\n" +
                        "ebdac cbaefd dbaeg gbafec cfed ecfab bfdegca dcb bfacdg dc | dcagfb caebd fcbade bdc\n" +
                        "gdae eac ecdfgb afceg efdgc acefdg fbcag ae cfabedg abdefc | afdbcge eacfdbg cae dega\n" +
                        "facgb eacbdg efdcab cg acefbgd bafcd efagb cfbdga gcdf bcg | dbafc eafbg gdbace bgc\n" +
                        "cdb bd ecdfgb ecdbg dgcfe becga cbgadf fdgcea dbecgaf defb | bd bcgafd cbgafd gbdcfe\n" +
                        "dgfebac dcb dagec cgbe afdbe dceba dgbaec dcgfba fedgac bc | gecb bc gbce bc\n" +
                        "ecadbg eabgfd gfbc abgdcef dbcge bf dcebgf cdbfe fbd fdaec | cegfdab gdfeab fbd gfebdca\n" +
                        "gcdefa edab ed ecd cdbfea dfecbga cebfa dcbef abfgce gcbdf | bfcdg agdfecb gcabfde acgefd\n" +
                        "begacf bafce cfa fc beafd agbce cbgf gcdeba cfdaeg fcebagd | afecbg gabcfe fc cf\n" +
                        "dbacfg ab adbf caegfb abc gcdeafb dfgeca dacgb gcafd cebdg | ab bacdg ab gdbcfea\n" +
                        "dfga afcbd fbcag ceagdb fagcbd dac da gcaefbd fbdec ebfgac | dfecb bfcga da dcfeb\n" +
                        "bdeca bcfdg feabgd bgfecd eacfdbg cdfbag fgce debgc ebg eg | ge adfgcb gdaecfb eabdgf\n" +
                        "dfe aefcbgd dcgbe df dbfc gcdabe cedfbg gfbed abgfe efgadc | bfgced ecgbd egcdfa fd\n" +
                        "adebgf dbcae af dbgeac gedbcfa cdgef efa cbaf dbcfea efcda | acfb ecgabfd fa fea\n" +
                        "gd efgab egdf daegb bfgaedc edacb abcegf fcdbag gda agdebf | dag gbadfce gd bgdeafc\n" +
                        "dgcfb bcgafde fdc cfbeg gdefac fd gfbaec dfebcg befd bgadc | fd ebfd fd defb\n" +
                        "eafdg cdfgab bdac gfbda fdbgc abgfdec afb cbdgfe ab gefcba | efabcg abdc gcfdb afdge\n" +
                        "feadcb gdcbfa dbafc gfbdcae fedga aceb cgbefd faced ec cde | efdca cdaef ecbgfad fdcbag\n" +
                        "gade feagb dgefb fga bdfecg dgbacf ebfgda ga cbeaf bfeadgc | ebgfd cagdfb gfbdeac ag\n" +
                        "ebgdacf acdgb dfg dgacf cgefbd acgfed bgcafe fd cfega feda | cgeaf fcdega cadfeg dfgabce\n" +
                        "dcea egcfba de gecabdf degbfa fcbgd egd begca degabc bdgce | bgdeaf deg aedc edca\n" +
                        "fdagec dbfa acf af afbecdg edbgcf fgbcd bafgc bdagcf baceg | af acf bdfceg edbcfg\n" +
                        "gfeac bgfaec gdaebfc cb aefgdc beadf ceb acdbeg bcefa gfcb | cfebgad egcdba ebcfa bdgeac\n" +
                        "cfdbg dfbega agfbdc cdfa dagcbe dc dbfag dcaefbg begfc cdg | cd aegcbfd fbadg fdacebg\n" +
                        "fbagdec gbadfc egb ecgfba egfab gebdac fgec fbdae cgabf ge | abedf caegfbd afgcb beafcdg\n" +
                        "bgeadcf acdgb gfadbe fgcab efbcda dg bgdaec ebacd dgb cged | dg dbg gd gd\n" +
                        "dcbeg gab bafegcd cgdba acgefb bgafcd acfgd dfba ba eafgcd | dgcefa abg adfb gba\n" +
                        "fb acfgd fabedc acfbd debca gdcbae efbdgca afeb gdfebc bcf | dgafc agfcd fb fb\n" +
                        "cedgfb egdca gcabde ac dbecg cfbead bcedgaf gfdea cda agbc | ac gceda gbca agbc\n" +
                        "ceda cebagdf ec fagde cbfged fcedga gaecf ecg dbgefa cabgf | dace dacgef gec gfcedba\n" +
                        "ge egab febad fgaed fdgaeb afgdc fcgedb ged gadefbc bfedac | ge acegbfd egab ageb\n" +
                        "dgebfca fcd gbcfa cfadb cdfbeg fegcab adfbe bcfdga dc agdc | fcd ebfad gfcbda fcd\n" +
                        "cbgafd fgea bfedga dfa fgedbc bfdae efbdacg af febgd bdcea | dafbe dgbcfe efga af\n" +
                        "edcfba agfbd agcdfbe abg ga ecabfg aedbf aegd gdbcf fdaebg | faedb bag edfab fcdgb\n" +
                        "bed fecadg dabcge cadeg cgbd afcbe gedabf bd cabed faedbgc | deb fcdgeba gbeacd cedagf\n" +
                        "aefdcbg gedbfc fdg cgfb dfaeb fcagde dgcaeb gcedb efbgd fg | gdf bgdec bcegd gbedf\n" +
                        "beacdg gadcf bdcgefa bgdcfe fb eacbg beaf febacg bafcg fcb | dcaegfb cbf egdbca dgcfa\n" +
                        "dgcaf bdgaef egfbdca aef edcabf ef agdbe cagebd feagd efbg | badecg egfdba dbegafc gfbe\n" +
                        "ecfab fdgae cbdefa dafce acbegfd acd cbed cefgba cd acdfbg | ebcd fceadb cbeagf bdacef\n" +
                        "cdage aecfgd afecbdg dcafg adgcbe eagdfb fd gfcab edcf fdg | cgedab gdf fgd gdf\n" +
                        "gabfc bca cbefgd cgea abdecf ca cbfgead caefbg gfceb abfgd | begcdaf ca ceag fgceb\n" +
                        "cdfbgea gcad dfcbg cgbfea agf bcadgf fdabg aefdb cedgfb ga | gbdcf cdag bcdfg fdbegc\n" +
                        "fc gbefdc abfecg egcab aefc acgfb bcf fbeadgc adbegc agfbd | cfgba adfbgce cf cbagf\n" +
                        "beadcg cgbf dfegb bg adbfecg gecfdb fegad bfced eabfdc egb | gdfae cgbdef gadef gfcb\n" +
                        "gbeadfc dcebg gc dgac adegcb egbfd gec afbdec decab afbgec | egabcdf agcedb cfegab egbdc\n" +
                        "adgebc gea afcdg fgbade dbaec bcdfae cdfgaeb gcaed ge ecbg | ega dagebf gdfbae gbdeac", 0)
        );
    }

}