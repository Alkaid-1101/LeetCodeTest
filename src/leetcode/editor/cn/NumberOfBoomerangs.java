package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

//Java：447、回旋镖的数量
class NumberOfBoomerangs {
    public static void main(String[] args) {
        Solution solution = new NumberOfBoomerangs().new Solution();
        //int[][] points = {{0,0},{1,0},{2,0}};
        //int[][] points = {{1,1},{2,2},{3,3}};
        //int[][] points = {{1,1}};
        int[][] points = {{489,238},{323,460},{853,965},{327,426},{264,871},{580,947},{362,275},{241,772},{967,240},{68,847},{825,703},{922,898},{769,217},{23,160},{472,802},{755,313},{40,78},{125,246},{396,452},{672,660},{323,253},{607,37},{880,201},{161,847},{441,229},{46,266},{284,320},{516,53},{889,539},{565,713},{341,320},{26,381},{751,504},{979,147},{956,652},{807,632},{257,767},{669,489},{968,831},{336,409},{60,734},{27,697},{54,543},{750,944},{82,668},{657,423},{988,36},{156,91},{540,136},{238,496},{140,398},{128,397},{165,150},{238,133},{981,926},{894,393},{660,921},{90,66},{464,193},{10,898},{861,20},{321,201},{408,829},{293,948},{965,531},{796,457},{929,277},{206,446},{427,444},{931,760},{370,825},{153,30},{98,244},{449,914},{789,811},{812,650},{831,485},{203,239},{315,496},{539,632},{380,336},{442,661},{613,648},{108,392},{93,391},{152,815},{217,305},{198,667},{901,647},{934,690},{458,746},{692,642},{584,896},{233,251},{744,773},{235,124},{109,677},{786,74},{326,246},{466,771},{989,618},{586,558},{923,136},{226,177},{783,160},{867,594},{258,912},{236,842},{808,469},{445,552},{242,681},{29,703},{358,167},{777,36},{765,595},{807,754},{213,746},{313,489},{882,539},{666,18},{51,885},{612,309},{149,200},{504,957},{669,949},{862,264},{630,891},{319,341},{410,449},{377,175},{44,537},{929,610},{635,242},{99,869},{133,117},{887,184},{354,851},{846,504},{51,350},{813,73},{651,675},{337,634},{918,656},{975,328},{105,704},{503,502},{241,785},{112,876},{27,211},{98,513},{680,985},{697,386},{189,895},{890,240},{245,56},{313,897},{83,2},{531,2},{659,858},{682,116},{562,538},{618,804},{323,730},{32,702},{293,482},{215,325},{468,265},{64,657},{160,306},{249,406},{362,915},{655,446},{917,538},{800,576},{396,482},{45,310},{20,15},{466,343},{98,851},{46,743},{333,261},{421,801},{878,485},{810,39},{791,412},{797,154},{327,452},{600,244},{342,400},{173,90},{234,570},{400,255},{585,867},{950,683},{718,996},{779,51},{610,200},{205,488},{685,367},{879,476},{779,676},{982,458},{128,934},{703,822},{686,228},{912,921},{798,313},{176,735},{180,478},{771,898},{475,550},{301,437},{750,506},{277,787},{226,157},{615,5},{833,598},{816,314},{532,519},{136,219},{99,49},{492,249},{362,20},{984,894},{498,755},{144,325},{657,445},{762,407},{304,392},{546,530},{549,162},{887,734},{760,703},{48,644},{574,537},{215,673},{938,707},{922,652},{727,259},{546,226},{14,42},{551,24},{487,666},{783,143},{58,330},{673,959},{492,913},{693,604},{616,94},{248,191},{631,816},{216,569},{523,491},{573,603},{750,119},{181,116},{513,84},{140,0},{750,924},{496,160},{254,521},{119,98},{434,165},{702,51},{259,302},{594,242},{118,810},{163,994},{653,736},{597,403},{207,778},{520,720},{862,12},{72,965},{936,568},{125,542},{442,597},{640,876},{762,694},{279,373},{997,225},{967,467},{388,130},{461,41},{218,410},{445,425},{540,317},{497,403},{329,569},{720,266},{490,197},{808,932},{146,801},{160,260},{495,440},{633,844},{17,600},{312,405},{82,125},{447,300},{536,244},{77,76},{561,574},{831,890},{144,903},{508,986},{101,669},{918,599},{470,78},{860,965},{870,845},{810,888},{446,122},{645,880},{599,92},{181,487},{688,610},{916,249},{185,747},{492,681},{3,352},{667,456},{21,937},{55,491},{15,915},{457,238},{761,267},{478,559},{741,123},{439,692},{568,972},{180,256},{935,96},{858,120},{195,702},{801,198},{54,820},{654,76},{757,62},{567,772},{977,376},{362,90},{995,840},{1,88},{316,793},{781,884},{765,961},{492,700},{57,702},{172,604},{404,325},{803,459},{145,809},{887,902},{871,454},{27,201},{183,741},{643,178},{582,645},{267,250},{438,48},{134,555},{361,978},{608,770},{681,780},{374,437},{106,529},{896,603},{339,135},{858,562},{590,885},{115,125},{626,759},{303,560},{404,922},{810,842},{970,296},{397,683},{627,5},{453,308},{138,828},{745,596},{709,994},{199,48},{129,57},{963,71},{294,78},{196,273},{189,852},{833,593},{774,996},{787,97},{644,537},{780,271},{894,234},{579,32},{414,677},{628,123},{23,180},{524,504},{589,487},{576,884},{917,124},{157,107},{976,342},{52,103},{690,840},{200,335},{377,980},{606,271},{566,538},{656,980},{567,636},{456,590},{168,980},{94,758},{819,22},{994,88},{147,503},{195,475},{197,600},{578,888},{792,130},{223,169},{463,181},{792,29},{719,800},{10,286},{789,466},{228,957},{798,323},{715,617},{697,61},{705,196},{564,253},{672,762},{205,602},{650,997},{85,225},{518,548},{406,662},{577,478},{463,939},{116,252},{757,345},{561,555},{20,277},{524,717},{690,582},{914,255},{187,938},{17,392},{892,19},{741,977},{596,259},{525,2},{273,455},{832,736},{394,949},{340,504},{294,902},{59,314},{531,936},{383,221},{870,297},{828,57},{587,197},{801,480},{568,894},{457,164},{153,335},{519,426},{790,351},{515,536},{652,207},{40,946},{461,452},{612,344},{388,996},{918,610},{645,746},{19,233},{296,820},{65,864},{66,522},{29,219},{209,548},{997,351},{251,864},{888,904},{72,928},{202,885},{732,815},{230,472},{163,148},{82,160},{246,101},{745,542},{273,810},{407,339}};
        //int[][] points ={{0,0},{1,0},{-1,0},{0,1},{0,-1}};
        int i = solution.numberOfBoomerangs(points);
        System.out.println(i);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        for (int[] i : points) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int[] j : points) {
                int length = findLength(i, j);
                map.put(length,map.getOrDefault(length,0)+1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int value = entry.getValue();
                ans += value*(value-1);
            }
        }
        //O(n³)超时
        //for (int i = 0; i < points.length; i++) {
        //    for (int j = 0; j < points.length; j++) {
        //        for (int k = 0; k < points.length; k++) {
        //            int lengthIJ = findLength(points[i], points[j]);
        //            int lengthIK = findLength(points[i], points[k]);
        //            if (lengthIJ == lengthIK && i!=j && i!=k && j!=k) {
        //                ans++;
        //            }
        //        }
        //    }
        //}

        return ans;
    }
    //求x，y之间的距离x.length = 2;
    public int findLength(int[] x, int[] y){
        return (x[0] - y[0])*(x[0] - y[0]) + (x[1] - y[1])*(x[1] - y[1]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}