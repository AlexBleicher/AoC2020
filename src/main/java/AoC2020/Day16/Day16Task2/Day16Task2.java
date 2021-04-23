package AoC2020.Day16.Day16Task2;

import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toMap;

public class Day16Task2 {

    private static String puzzleInput = "departure location: 30-260 or 284-950\n" +
            "departure station: 29-856 or 863-974\n" +
            "departure platform: 32-600 or 611-967\n" +
            "departure track: 44-452 or 473-965\n" +
            "departure date: 36-115 or 129-950\n" +
            "departure time: 50-766 or 776-972\n" +
            "arrival location: 40-90 or 104-961\n" +
            "arrival station: 40-864 or 887-971\n" +
            "arrival platform: 32-920 or 932-964\n" +
            "arrival track: 45-416 or 427-959\n" +
            "class: 47-536 or 557-964\n" +
            "duration: 33-229 or 246-969\n" +
            "price: 25-147 or 172-969\n" +
            "route: 32-328 or 349-970\n" +
            "row: 50-692 or 709-964\n" +
            "seat: 49-292 or 307-964\n" +
            "train: 28-726 or 748-954\n" +
            "type: 37-430 or 438-950\n" +
            "wagon: 46-628 or 638-973\n" +
            "zone: 39-786 or 807-969\n" +
            "\n" +
            "your ticket:\n" +
            "89,193,59,179,191,173,61,73,181,67,71,109,53,79,83,113,107,139,131,137\n" +
            "\n" +
            "nearby tickets:\n" +
            "499,362,657,143,723,763,935,454,473,586,372,489,214,753,765,65,307,56,853,934\n" +
            "228,664,709,361,856,645,363,171,901,199,62,513,667,808,350,890,715,687,257,721\n" +
            "531,490,628,88,947,252,832,917,686,571,362,874,837,588,849,140,655,407,90,611\n" +
            "777,194,111,386,90,598,153,363,373,566,191,945,559,819,289,487,480,590,691,756\n" +
            "186,366,196,844,655,659,845,109,355,330,71,176,397,380,822,776,369,447,658,949\n" +
            "783,763,570,184,260,448,856,717,913,646,774,657,841,917,910,193,941,408,110,577\n" +
            "378,832,670,59,155,911,209,74,57,947,144,514,411,89,690,856,854,286,597,132\n" +
            "319,684,204,909,342,206,204,943,620,52,516,115,430,319,84,618,593,211,596,581\n" +
            "66,146,910,225,107,112,918,679,255,757,125,946,863,892,78,525,373,913,87,838\n" +
            "674,653,588,220,448,941,112,924,474,358,513,649,766,500,847,197,639,836,373,573\n" +
            "76,115,776,726,598,361,480,772,356,129,506,380,202,810,932,756,408,81,786,889\n" +
            "311,620,848,357,483,754,181,300,284,60,259,674,596,289,397,113,894,82,291,754\n" +
            "84,600,751,223,595,478,198,2,402,428,355,517,947,933,624,59,598,711,752,513\n" +
            "286,664,786,775,510,363,666,229,914,938,196,509,410,528,681,943,477,850,640,595\n" +
            "365,17,624,375,640,483,208,258,189,222,889,655,852,326,109,428,758,616,889,288\n" +
            "566,195,201,949,205,517,672,762,180,886,679,63,596,664,678,596,894,384,321,212\n" +
            "576,316,480,579,925,328,498,194,191,132,106,863,210,416,351,663,643,218,366,942\n" +
            "776,60,256,400,368,664,469,53,949,689,569,253,319,717,387,591,845,66,499,566\n" +
            "620,831,379,712,614,176,682,666,83,197,438,916,535,504,218,377,627,155,429,855\n" +
            "853,525,865,487,190,940,810,251,786,618,895,580,908,86,578,136,781,562,498,759\n" +
            "671,625,256,592,177,500,523,50,443,692,650,128,441,832,626,491,252,405,661,756\n" +
            "597,722,922,721,319,388,653,484,83,142,781,451,106,499,515,672,113,374,911,311\n" +
            "211,716,176,715,627,286,327,531,566,587,916,431,57,371,894,677,778,193,710,447\n" +
            "559,508,196,178,844,78,114,662,142,558,514,378,375,694,718,314,384,89,816,562\n" +
            "290,578,105,478,229,260,752,496,187,937,137,898,69,399,980,638,441,84,589,574\n" +
            "413,592,841,498,793,214,947,582,827,940,446,572,259,623,213,355,853,360,60,195\n" +
            "481,764,308,384,131,247,595,756,221,361,175,256,407,255,155,752,781,524,403,640\n" +
            "74,765,914,319,715,86,316,612,197,640,827,760,926,106,520,818,229,824,623,404\n" +
            "576,504,694,379,75,528,638,257,482,852,837,563,575,389,686,217,852,684,314,184\n" +
            "481,679,312,796,358,71,376,830,209,946,69,591,939,357,59,284,522,626,218,825\n" +
            "355,812,691,377,833,938,139,233,643,764,663,692,722,576,495,843,450,536,359,174\n" +
            "367,749,373,379,69,753,711,81,445,265,405,624,759,814,311,623,228,290,682,195\n" +
            "475,841,833,415,13,809,478,70,191,228,934,760,765,508,398,655,907,850,487,54\n" +
            "198,841,184,84,492,945,429,72,753,572,510,408,827,289,177,559,890,837,987,291\n" +
            "427,198,192,666,319,369,565,861,512,216,81,899,388,761,683,933,529,515,673,674\n" +
            "355,188,827,614,178,600,641,181,915,728,934,526,904,136,74,649,187,77,381,498\n" +
            "751,317,780,190,897,781,65,852,933,69,657,811,517,564,842,877,382,84,56,576\n" +
            "946,839,941,322,409,318,751,850,215,750,394,578,95,284,902,396,409,51,309,938\n" +
            "54,400,54,307,290,665,125,507,220,600,214,405,864,217,763,284,382,820,129,910\n" +
            "722,68,841,521,597,286,722,481,451,145,448,389,61,844,650,487,250,781,149,70\n" +
            "175,323,322,831,857,137,616,686,408,175,709,903,214,917,414,108,367,827,684,593\n" +
            "321,820,388,220,368,137,403,523,914,839,64,724,482,307,284,448,585,208,764,988\n" +
            "86,926,414,213,825,682,473,67,318,144,51,311,814,709,520,687,623,396,949,387\n" +
            "522,369,139,593,122,210,716,906,406,488,681,753,852,189,71,203,51,145,639,412\n" +
            "322,368,18,663,903,574,203,363,391,643,205,474,182,517,855,486,890,315,725,82\n" +
            "60,582,819,529,180,140,570,402,191,594,863,146,614,631,51,593,828,583,184,78\n" +
            "856,622,291,412,503,532,563,217,404,352,349,406,675,277,292,765,748,493,691,626\n" +
            "647,849,636,64,479,715,623,132,322,408,524,385,212,328,289,104,82,689,908,650\n" +
            "197,444,249,763,892,86,775,441,172,664,379,596,910,584,574,376,665,899,174,847\n" +
            "375,906,894,75,895,82,250,367,350,581,912,927,370,888,938,413,109,909,570,481\n" +
            "104,831,565,413,849,533,861,394,361,511,292,573,567,218,832,135,717,851,134,223\n" +
            "847,59,369,147,509,80,184,527,199,430,614,687,621,823,132,787,569,109,665,112\n" +
            "109,983,680,682,191,65,139,643,687,228,828,317,211,784,851,757,672,64,616,173\n" +
            "403,640,763,704,504,381,201,933,144,597,825,79,496,246,783,113,84,650,720,81\n" +
            "356,82,615,375,222,361,182,255,112,845,612,298,891,887,382,839,380,691,405,660\n" +
            "251,535,590,228,181,710,663,485,856,929,389,892,573,247,856,313,679,397,50,850\n" +
            "895,673,675,513,838,181,135,696,599,327,583,720,486,104,691,777,115,536,724,920\n" +
            "519,3,55,711,820,572,614,401,751,664,856,779,726,687,672,415,680,536,481,684\n" +
            "692,781,22,72,586,906,845,356,852,590,777,372,593,579,369,663,619,317,134,138\n" +
            "623,484,723,936,810,940,824,676,362,172,494,864,360,133,402,911,307,634,828,428\n" +
            "899,308,410,558,557,452,69,84,65,5,187,849,493,223,441,349,499,677,67,915\n" +
            "222,758,668,351,782,373,825,839,369,615,904,186,815,379,897,380,863,911,60,981\n" +
            "576,710,508,63,506,888,638,476,626,616,863,494,434,898,715,759,946,208,932,84\n" +
            "495,255,259,810,586,387,804,69,564,73,140,628,890,205,213,363,709,683,401,78\n" +
            "79,582,688,536,114,106,622,289,395,417,786,384,175,55,850,855,327,189,135,254\n" +
            "379,895,255,498,766,523,291,782,944,839,615,687,892,824,479,77,619,359,702,680\n" +
            "250,144,611,936,220,851,509,379,260,821,532,859,79,673,906,624,211,780,349,448\n" +
            "75,643,392,826,139,579,479,618,372,563,823,913,106,286,639,594,455,895,388,776\n" +
            "370,785,939,918,661,841,582,655,678,109,850,673,423,864,290,677,762,834,383,686\n" +
            "19,906,528,475,779,174,519,389,715,816,247,500,350,250,54,897,57,942,369,443\n" +
            "114,684,251,944,56,944,228,217,666,778,650,605,488,284,643,516,754,561,659,938\n" +
            "292,429,906,605,935,88,140,197,721,438,257,590,324,900,325,785,290,522,491,619\n" +
            "249,52,649,558,605,914,494,286,373,132,892,766,709,355,655,321,218,473,906,562\n" +
            "612,908,180,854,475,825,61,516,363,945,896,176,563,763,361,221,847,205,631,112\n" +
            "936,57,379,279,534,211,889,254,198,381,645,764,318,377,619,850,78,750,181,83\n" +
            "413,130,497,366,65,307,255,686,181,368,997,560,781,205,69,863,401,809,829,683\n" +
            "137,227,53,486,826,676,221,896,219,358,981,370,638,528,649,404,482,942,809,676\n" +
            "918,172,942,948,821,911,291,906,393,438,757,702,215,383,178,219,350,894,757,403\n" +
            "526,913,180,376,653,617,837,935,896,373,343,184,257,660,784,406,901,904,377,689\n" +
            "189,388,628,55,723,82,51,369,808,365,137,668,664,596,325,672,360,316,797,939\n" +
            "88,905,90,284,619,394,326,415,836,891,618,207,754,226,766,572,444,567,177,991\n" +
            "685,531,67,314,673,136,325,283,659,374,403,60,914,492,478,648,190,320,592,692\n" +
            "137,146,504,678,691,247,673,438,999,315,639,536,917,416,212,187,896,198,785,452\n" +
            "855,205,111,600,562,785,489,226,209,941,518,384,700,579,315,657,74,654,591,558\n" +
            "444,360,672,367,819,108,757,136,621,838,323,785,478,809,492,376,161,508,901,586\n" +
            "205,500,513,902,408,909,573,663,891,290,326,389,477,376,810,392,596,382,846,989\n" +
            "141,366,489,481,716,350,589,63,655,558,451,143,289,594,866,933,711,63,213,380\n" +
            "320,144,949,726,314,576,639,80,287,143,616,713,945,623,228,927,374,385,856,499\n" +
            "215,135,351,409,69,619,658,639,567,716,227,888,768,66,115,320,77,718,748,369\n" +
            "614,894,572,515,842,371,253,570,479,574,292,394,463,659,840,227,763,757,777,83\n" +
            "401,887,116,854,751,683,137,898,104,649,596,779,935,65,570,220,147,850,781,379\n" +
            "353,808,187,909,895,710,192,903,784,779,755,788,896,292,719,428,843,681,407,313\n" +
            "83,722,826,829,392,616,655,484,520,720,53,243,145,360,63,594,512,443,850,200\n" +
            "588,889,187,889,581,215,290,319,821,440,601,220,482,307,217,690,758,512,942,372\n" +
            "722,183,134,843,807,783,509,657,411,859,561,401,763,719,756,380,756,375,443,207\n" +
            "289,853,562,190,181,652,988,942,315,225,813,355,404,107,429,442,311,377,259,855\n" +
            "527,780,526,323,449,218,721,714,84,200,806,717,619,587,821,399,570,518,778,893\n" +
            "836,309,893,780,943,779,657,256,528,296,512,476,131,641,828,223,807,683,562,313\n" +
            "855,192,440,557,427,710,776,755,653,920,191,763,631,664,897,580,845,916,659,66\n" +
            "179,559,920,399,906,720,822,942,852,408,617,690,599,937,949,356,195,982,251,318\n" +
            "942,990,386,328,473,669,52,324,531,889,854,322,594,762,536,135,672,501,612,229\n" +
            "627,500,725,255,136,370,403,58,77,838,674,620,858,307,438,189,392,674,568,446\n" +
            "529,415,438,661,287,511,200,250,179,388,596,582,176,529,514,978,945,106,312,564\n" +
            "587,392,947,762,110,387,495,115,452,572,416,676,189,751,208,985,478,828,442,638\n" +
            "439,935,614,357,919,131,385,247,674,113,835,766,908,373,134,257,996,487,145,836\n" +
            "855,619,843,711,577,427,392,661,485,257,293,504,315,450,190,389,581,197,823,711\n" +
            "617,816,838,636,257,58,935,668,501,386,226,838,919,660,755,643,438,216,526,753\n" +
            "685,288,86,781,908,140,310,144,258,52,132,560,803,622,591,134,218,248,566,518\n" +
            "782,290,896,384,324,452,671,562,508,653,475,996,683,624,494,597,145,682,67,910\n" +
            "567,532,719,399,50,616,922,914,310,612,353,653,400,384,562,684,492,568,135,689\n" +
            "170,749,486,901,108,825,887,210,519,226,762,188,590,903,452,617,615,834,363,517\n" +
            "308,497,496,400,530,512,939,647,514,359,435,625,186,580,66,206,718,491,657,50\n" +
            "558,698,326,195,809,89,135,378,518,846,692,204,716,573,176,369,583,752,227,651\n" +
            "399,982,611,404,619,317,86,486,524,673,51,489,751,318,766,486,826,249,381,815\n" +
            "597,856,16,375,61,137,906,888,439,669,782,893,902,398,785,900,671,319,710,136\n" +
            "311,653,224,823,442,220,902,603,367,54,945,195,897,67,60,360,814,450,246,665\n" +
            "358,579,849,813,315,308,825,681,827,114,857,352,481,440,212,944,836,312,501,439\n" +
            "55,129,66,942,133,137,208,50,478,205,200,916,851,487,889,824,989,691,490,364\n" +
            "308,381,688,440,135,516,816,504,287,625,750,355,663,714,176,391,229,989,904,284\n" +
            "213,780,407,912,573,535,585,825,897,842,588,469,893,321,567,831,90,138,613,863\n" +
            "853,119,581,373,84,761,217,640,752,383,226,650,357,322,438,503,292,559,291,492\n" +
            "684,874,935,786,89,852,940,397,643,51,722,647,79,50,817,86,585,822,611,575\n" +
            "777,890,911,915,114,452,635,204,79,289,310,449,628,247,358,948,894,307,350,893\n" +
            "724,685,936,485,887,82,835,870,481,615,616,751,131,505,111,82,912,438,50,405\n" +
            "520,826,224,592,411,284,834,668,902,657,661,897,758,369,933,809,704,501,222,777\n" +
            "624,628,105,260,663,502,447,436,310,851,836,208,911,591,718,755,844,647,854,497\n" +
            "762,175,201,4,644,111,427,490,713,409,531,143,577,75,287,663,172,411,911,57\n" +
            "285,225,187,359,57,911,315,56,892,398,216,533,784,916,10,690,912,133,939,328\n" +
            "754,649,519,319,315,807,640,749,668,404,594,514,175,587,637,582,188,90,219,427\n" +
            "906,146,274,173,229,562,480,518,897,821,53,913,319,63,189,571,485,613,509,353\n" +
            "502,646,58,352,505,660,575,133,671,811,586,350,850,802,474,360,911,136,564,753\n" +
            "106,62,354,247,935,626,978,371,834,214,586,76,659,532,938,444,388,443,668,574\n" +
            "132,473,368,718,80,754,751,947,903,772,284,256,650,258,251,682,197,619,758,501\n" +
            "77,892,401,675,270,935,183,658,578,497,373,209,807,187,209,85,205,251,367,57\n" +
            "750,209,834,811,665,898,361,64,114,685,258,943,644,532,129,614,924,76,377,405\n" +
            "195,428,488,67,935,19,375,392,484,450,892,416,260,650,256,194,397,483,113,557\n" +
            "474,852,196,427,375,977,639,643,536,785,66,452,326,623,828,309,909,373,138,113\n" +
            "219,225,818,84,639,380,856,676,372,82,76,577,517,758,942,182,604,194,400,357\n" +
            "908,622,568,81,183,901,868,354,818,835,894,430,482,824,856,839,190,77,88,840\n" +
            "641,572,228,286,936,889,818,777,778,846,643,113,150,138,754,934,582,581,627,685\n" +
            "898,891,841,0,62,908,110,888,74,831,286,653,407,138,653,932,514,853,357,598\n" +
            "622,413,899,828,185,194,173,571,481,670,315,515,562,207,836,708,766,683,488,372\n" +
            "248,457,934,372,564,414,662,665,949,642,202,144,189,842,214,592,374,888,211,247\n" +
            "668,139,115,132,522,683,205,849,784,481,713,776,689,63,563,658,361,982,196,897\n" +
            "289,407,60,434,323,561,196,319,517,846,686,855,173,864,611,814,717,618,313,687\n" +
            "474,892,536,259,888,86,81,328,687,402,375,891,291,666,805,909,386,193,511,898\n" +
            "131,210,638,840,392,765,565,841,394,781,813,562,316,145,526,528,826,803,87,197\n" +
            "841,557,935,116,837,478,174,839,623,752,71,484,709,685,495,360,327,143,440,908\n" +
            "452,86,411,358,847,632,853,716,410,491,934,86,196,598,600,486,402,212,493,714\n" +
            "766,663,131,474,888,85,569,710,251,225,846,194,692,925,398,783,226,291,189,488\n" +
            "657,560,388,477,509,87,139,911,258,671,947,753,865,913,324,638,366,526,584,429\n" +
            "658,181,83,611,259,561,752,121,758,561,612,478,518,763,896,596,68,328,173,446\n" +
            "625,810,62,508,458,355,847,896,220,838,933,536,376,112,427,190,511,403,479,675\n" +
            "367,495,523,441,694,656,286,309,203,839,481,848,646,830,383,221,848,185,615,208\n" +
            "311,526,497,750,473,916,393,396,564,191,479,723,627,182,444,484,173,754,661,8\n" +
            "759,848,112,516,668,189,217,617,598,117,831,251,906,905,560,86,573,938,63,908\n" +
            "188,889,534,86,999,187,441,186,762,61,827,106,222,756,814,113,716,54,200,808\n" +
            "809,259,908,290,905,316,761,593,846,408,509,780,516,447,311,201,773,217,948,932\n" +
            "210,253,621,481,900,557,318,379,909,511,985,904,681,716,115,70,214,385,825,427\n" +
            "533,130,571,599,621,141,612,786,838,402,662,186,297,820,759,381,208,592,576,318\n" +
            "320,253,349,831,394,557,105,752,522,191,181,891,200,13,409,762,833,317,683,55\n" +
            "401,416,920,309,583,665,570,369,199,54,455,185,513,80,527,912,442,783,615,85\n" +
            "365,190,504,219,595,618,593,350,782,809,66,919,427,474,406,137,81,14,189,442\n" +
            "135,187,428,506,662,209,850,905,184,855,935,584,606,944,819,371,825,720,598,912\n" +
            "622,620,408,224,530,792,894,855,372,667,653,820,514,180,479,685,190,196,107,560\n" +
            "205,848,375,252,628,479,670,147,413,156,759,949,489,719,681,493,70,508,807,835\n" +
            "776,676,62,512,658,477,215,748,911,186,500,557,213,862,905,373,677,250,410,250\n" +
            "58,88,684,855,626,498,574,631,503,749,75,59,641,207,440,404,139,887,751,363\n" +
            "113,186,66,204,104,726,115,137,617,832,90,755,664,517,452,635,594,749,892,363\n" +
            "356,863,658,575,896,903,373,645,192,907,277,816,844,532,519,520,402,390,623,507\n" +
            "83,514,383,674,628,832,584,723,639,307,144,569,191,199,990,718,76,415,193,756\n" +
            "308,267,503,448,842,228,55,371,63,724,590,894,566,621,477,448,566,752,530,675\n" +
            "569,327,379,64,84,51,273,863,721,501,592,688,406,814,498,292,505,487,901,398\n" +
            "830,855,66,534,710,441,623,816,324,368,318,450,232,407,619,639,50,530,413,428\n" +
            "477,579,480,721,16,713,673,53,687,256,624,444,534,725,653,227,76,750,411,104\n" +
            "720,405,915,676,80,623,757,141,901,847,493,485,123,379,444,349,832,711,77,73\n" +
            "528,50,913,528,50,61,354,489,838,600,193,387,382,621,191,822,119,82,211,836\n" +
            "516,565,76,906,586,638,755,716,588,822,502,15,492,896,391,503,685,382,188,940\n" +
            "318,583,260,677,873,822,364,255,624,624,147,721,63,218,215,567,136,493,87,511\n" +
            "58,446,210,582,133,814,719,476,412,863,492,901,580,845,87,179,629,177,915,322\n" +
            "112,712,386,667,624,369,650,317,177,230,532,56,360,482,479,818,893,835,258,495\n" +
            "51,492,763,777,287,508,827,138,620,635,915,311,808,510,82,360,564,251,446,138\n" +
            "198,678,855,410,568,899,712,442,173,438,18,86,777,83,752,144,207,721,587,590\n" +
            "79,352,414,777,786,384,671,346,600,591,829,316,374,939,229,199,216,219,109,210\n" +
            "508,154,508,677,510,212,529,903,758,410,199,131,88,476,481,508,825,393,784,287\n" +
            "55,652,686,521,620,388,785,907,535,683,631,363,186,487,289,406,481,572,360,574\n" +
            "133,507,413,366,838,939,131,589,678,440,520,912,142,533,909,17,588,753,833,657\n" +
            "111,356,638,172,491,684,110,846,384,433,679,647,289,846,916,946,352,196,786,479\n" +
            "567,224,907,310,488,763,195,139,595,512,687,680,493,401,130,749,273,353,498,679\n" +
            "814,988,813,443,662,948,136,503,517,392,815,317,723,416,400,318,627,780,836,890\n" +
            "328,196,856,288,623,257,525,285,679,512,564,170,723,534,916,179,67,651,557,834\n" +
            "450,484,381,441,774,570,664,815,147,319,173,316,137,532,327,657,749,510,200,199\n" +
            "902,650,327,258,647,667,250,77,579,598,723,473,510,364,923,369,493,357,318,359\n" +
            "314,824,689,488,809,892,530,384,809,399,497,413,935,133,641,360,996,643,615,215\n" +
            "365,756,249,585,913,613,821,353,646,851,411,54,710,153,289,199,617,200,383,528\n" +
            "824,257,831,938,481,841,576,179,321,938,919,81,479,766,705,257,513,112,353,200\n" +
            "71,748,208,75,250,319,498,179,997,394,409,764,377,678,534,320,113,512,669,115\n" +
            "260,587,57,671,366,248,175,727,814,596,309,664,757,781,940,62,187,809,642,816\n" +
            "406,205,569,108,817,414,366,474,86,311,901,682,589,256,283,814,393,596,856,321\n" +
            "920,613,190,616,616,614,897,384,213,222,158,359,80,837,140,709,854,356,838,820\n" +
            "496,508,512,509,675,180,89,182,838,208,392,771,177,934,88,513,61,943,903,666\n" +
            "311,509,478,439,890,692,682,361,914,802,720,600,675,576,664,224,522,252,898,650\n" +
            "384,587,250,396,715,840,595,679,900,135,141,438,844,122,310,566,850,291,205,676\n" +
            "414,810,370,856,785,628,172,781,88,450,675,339,308,210,832,660,595,77,475,438\n" +
            "648,77,650,473,817,977,819,524,846,751,323,823,104,67,112,451,394,627,725,578\n" +
            "620,327,676,194,664,51,140,368,782,528,111,280,145,73,582,486,821,530,372,764\n" +
            "370,364,79,252,718,204,370,835,825,904,698,312,137,586,387,360,713,229,725,318\n" +
            "192,776,258,495,644,836,759,139,147,702,658,779,615,816,478,812,657,712,362,839\n" +
            "386,530,409,863,110,290,938,75,406,457,190,513,368,133,203,753,514,825,644,687\n" +
            "615,862,808,721,579,671,807,228,848,307,760,74,451,509,484,403,216,710,892,667\n" +
            "494,763,935,569,778,396,362,723,113,495,897,486,735,495,288,715,937,590,575,687\n" +
            "478,108,831,687,817,753,687,528,321,201,574,572,444,897,489,568,876,512,508,288\n" +
            "829,312,350,843,478,252,584,361,625,307,929,570,514,72,219,825,686,570,655,667\n" +
            "172,910,658,834,657,182,941,182,246,907,373,147,271,183,77,785,429,320,847,726\n" +
            "855,523,364,690,564,979,145,892,354,525,326,510,723,856,560,445,620,813,525,618\n" +
            "748,916,783,872,646,676,596,691,316,373,512,915,512,724,831,723,842,324,908,899\n" +
            "88,766,253,446,940,533,398,506,751,912,18,130,134,477,855,59,516,395,384,76\n" +
            "795,638,507,766,947,400,474,505,864,612,653,212,529,378,255,911,358,83,51,491\n" +
            "765,827,584,196,941,390,402,713,901,82,659,623,345,177,309,191,198,223,863,937\n" +
            "517,635,510,64,415,765,901,365,723,574,623,850,191,917,943,643,413,523,757,830\n" +
            "218,854,225,812,523,170,593,357,761,291,621,914,584,60,64,198,65,501,848,939\n" +
            "83,683,222,750,135,847,864,325,80,668,717,630,757,427,137,430,176,777,809,670\n" +
            "285,570,846,471,759,572,627,721,753,68,414,920,521,677,517,713,901,475,569,67\n" +
            "135,319,70,328,495,618,78,479,414,782,107,64,489,378,227,444,861,314,441,179\n" +
            "766,557,983,577,443,573,225,74,259,680,659,932,916,452,560,763,374,214,446,644\n" +
            "54,509,310,204,580,484,889,371,935,619,520,188,622,653,491,229,66,926,828,688\n" +
            "560,311,146,911,907,864,696,386,328,776,393,387,947,364,212,688,677,446,361,64\n" +
            "79,259,476,926,67,375,59,397,750,909,652,947,568,786,208,107,200,830,527,173\n" +
            "88,836,587,134,901,176,896,287,68,574,903,562,82,877,75,651,561,813,569,209\n" +
            "480,566,575,639,198,80,935,142,446,948,784,360,716,835,318,171,536,112,843,835\n" +
            "519,711,796,581,590,382,317,514,389,488,410,663,840,578,450,906,947,841,507,663\n" +
            "87,569,890,497,368,361,58,413,145,592,144,221,292,445,72,941,791,60,218,814\n" +
            "389,810,597,156,190,186,507,725,638,349,86,405,644,947,254,201,391,573,758,826\n" +
            "500,829,643,858,193,191,485,584,370,940,841,820,832,327,565,389,816,677,819,485\n" +
            "81,499,388,812,201,848,823,288,715,650,868,307,322,53,780,360,650,491,711,896\n" +
            "816,443,408,197,316,936,487,792,350,492,287,717,350,201,444,111,579,73,409,289\n" +
            "509,369,890,671,529,444,428,783,170,139,889,649,905,511,508,410,380,399,203,310\n" +
            "808,711,711,500,512,227,85,810,940,604,786,74,667,684,400,174,480,224,522,88\n" +
            "105,897,172,780,432,722,287,529,824,524,52,250,136,219,223,249,384,938,559,856\n" +
            "827,618,152,625,143,933,529,254,400,257,780,144,182,599,576,376,113,199,353,624\n" +
            "515,253,651,450,659,382,814,254,522,535,906,180,350,358,725,441,135,591,921,54\n" +
            "290,354,895,627,399,945,355,311,385,496,756,986,893,80,52,308,414,313,572,599\n" +
            "211,363,501,189,635,891,131,623,493,109,854,572,190,246,206,562,808,365,889,250\n" +
            "63,792,659,400,946,835,724,641,566,180,824,892,199,528,175,563,687,571,314,557";

    private static List<Ticket> allNearbyTickets = new ArrayList<>();
    private static List<Field> allFields = new ArrayList<>();
    private static List<Ticket> allTickets = new ArrayList<>();
    private static Set<Integer> allowedNumbers = new HashSet<>();

    public static void main(String[] args) {
        String[] splitPuzzleInput = splitPuzzleInput(puzzleInput, "\n\n");
        createAllFields(splitPuzzleInput[0]);
        createAllOtherTickets(splitPuzzleInput[2]);
        Ticket myTicket = createMyTicket(splitPuzzleInput[1]);
        createAllTickets(myTicket);
        determineFieldIndex();
        List<Field> allDepartureFields = getAllDepartureFields();
        System.out.println(solve(allDepartureFields, myTicket));
    }

    public static String[] splitPuzzleInput(String input, String splitValue) {
        return input.split(splitValue);
    }

    public static void createAllOtherTickets(String input) {
        String allNumbersInString = splitPuzzleInput(input, ":\n")[1];
        String[] allRows = splitPuzzleInput(allNumbersInString, "\n");
        for (String allRow : allRows) {
            String[] allValuesAsString = splitPuzzleInput(allRow, ",");
            List<Integer> values = new ArrayList<>();
            for (String s : allValuesAsString) {
                int value = Integer.parseInt(s);
                values.add(value);
            }
            Ticket t = new Ticket(values);
            allNearbyTickets.add(t);
        }
    }

    public static void createAllFields(String input) {
        String[] allFieldsInInput = splitPuzzleInput(input, "\n");
        for (String s : allFieldsInInput) {
            String[] fieldDetails = s.split(": ");
            String fieldName = fieldDetails[0];
            List<Integer> fieldRange = getFieldRange(fieldDetails[1]);
            allowedNumbers.addAll(fieldRange);
            Field f = new Field(fieldName, fieldRange);
            allFields.add(f);
        }
    }

    public static List<Integer> getFieldRange(String input) {
        List<Integer> range = new ArrayList<>();
        int lowerRange = 0;
        int upperRange = 0;
        String[] sSplitIntoOr = input.split(" or ");
        for (int i = 0; i < 2; i++) {
            sSplitIntoOr[i].replaceAll("[^0-9-]", "");
            String[] currentRange = sSplitIntoOr[i].split("-");
            lowerRange = Integer.parseInt(currentRange[0]);
            upperRange = Integer.parseInt(currentRange[1]);
            for (int j = lowerRange; j <= upperRange; j++) {
                range.add(j);
            }
        }
        return range;
    }

    public static Ticket createMyTicket(String input) {
        String allNumbersInString = splitPuzzleInput(input, ":\n")[1];
        List<Integer> valuesOfYourTicket = new ArrayList<>();
        String[] allValuesInString = splitPuzzleInput(allNumbersInString, ",");
        for (String s : allValuesInString) {
            valuesOfYourTicket.add(Integer.parseInt(s));
        }
        return new Ticket(valuesOfYourTicket);
    }

    public static void createAllTickets(Ticket myTicket) {
        allTickets = allNearbyTickets;
        allTickets.add(myTicket);
        List<Ticket> ticketsToRemove = new ArrayList<>();
        for (Ticket ticket : allTickets) {
            List<Integer> values = ticket.getValues();
            for (Integer value : values) {
                if (!allowedNumbers.contains(value)) {
                    ticketsToRemove.add(ticket);
                }
            }
        }
        for (Ticket ticket : ticketsToRemove) {
            allTickets.remove(ticket);
        }
    }

    public static void determineFieldIndex() {
        Map<Integer, List<Field>> allIndexesWithAllPossibleFields = new HashMap<>();
        for (int index = 0; index < allFields.size(); index++) {
            List<Integer> allNumbersOnThisIndex = getAllNumbersOnThisIndex(index);
            List<Field> allPossibleFields = getAllPossibleFields(allNumbersOnThisIndex);
            allIndexesWithAllPossibleFields.put(index, allPossibleFields);
        }
        setIndexOnFields(allIndexesWithAllPossibleFields);
    }

    public static List<Integer> getAllNumbersOnThisIndex(int index) {
        List<Integer> allNumbersOnThisIndex = new ArrayList<>();
        for (Ticket ticket : allTickets) {
            allNumbersOnThisIndex.add(ticket.getValues().get(index));
        }
        return allNumbersOnThisIndex;
    }

    public static List<Field> getAllPossibleFields(List<Integer> allNumbersOnIndex) {
        List<Field> allPossibleFields = new ArrayList<>();
        for (Field allField : allFields) {
            allPossibleFields.add(allField);
        }
        List<Field> allFieldsToRemove = new ArrayList<>();
        for (Field field : allFields) {
            for (Integer number : allNumbersOnIndex) {
                if (!field.numberIsInRange(number)) {
                    allFieldsToRemove.add(field);
                    break;
                }
            }
        }
        removeFields(allPossibleFields, allFieldsToRemove);
        return allPossibleFields;
    }

    public static void removeFields(List<Field> originalFields, List<Field> fieldsToRemove) {
        originalFields.removeAll(fieldsToRemove);
    }

    public static void setIndexOnFields(Map<Integer, List<Field>> originalMap) {
        Map<Integer, List<Field>> sortedMap = sortByResultSize(originalMap);
        List<Integer> allKeysInSortedOrder = new ArrayList<>();
        for (Integer integer : sortedMap.keySet()) {
            allKeysInSortedOrder.add(integer);
        }
        int i = sortedMap.entrySet().size() - 2;
        int j = i++;
        while (i > 0) {
            List<Field> currentFields = sortedMap.get(allKeysInSortedOrder.get(j));
            List<Field> nextFields = sortedMap.get(allKeysInSortedOrder.get(i));
            removeFields(nextFields, currentFields);
            nextFields.get(0).setIndex(allKeysInSortedOrder.get(j + 1)); //j+1 = Index
            System.out.println("Feldname: " + nextFields.get(0).getFieldName() + " hat den Index: " + nextFields.get(0).getIndex());
            i--;
            j--;
        }
    }

    public static Map<Integer, List<Field>> sortByResultSize(Map<Integer, List<Field>> notSortedMap) {
        Map<Integer, List<Field>> sortedMap = notSortedMap.entrySet().stream()
                .sorted(comparingInt(e -> e.getValue().size()))
                .collect(toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));
        return sortedMap;
    }

    public static List<Field> getAllDepartureFields() {
        List<Field> allDepartureFields = new ArrayList<>();
        for (Field field : allFields) {
            if (field.getFieldName().contains("departure")) {
                System.out.println(field.getFieldName() + " index: " + field.getIndex());
                allDepartureFields.add(field);
            }
        }
        return allDepartureFields;
    }

    public static long solve(List<Field> allDepartureFields, Ticket myTicket) {
        List<Integer> allIndexes = new ArrayList<>();
        long result = 1;
        for (Field field : allDepartureFields) {
            allIndexes.add(field.getIndex());
        }
        for (Integer allIndex : allIndexes) {
            long ticketValueAtIndex = myTicket.getValues().get(allIndex);
            result = result * ticketValueAtIndex;
        }
        return result;
    }
}
