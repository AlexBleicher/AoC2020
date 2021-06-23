package AoC2020.Day19.Task1;

import java.util.*;

public class Input {

    private String input = "0: 4 1 5\n" +
            "1: 2 3 | 3 2\n" +
            "2: 4 4 | 5 5\n" +
            "3: 4 5 | 5 4\n" +
            "4: \"a\"\n" +
            "5: \"b\"\n" +
            "\n" +
            "ababbb\n" + //ababbb ->454555 -> 3 3 5 | 4 3 2 5 -> 4 1 5 -> 0
            "bababa\n" +
            "abbbab\n" +
            "aaabbb\n" +
            "aaaabbb\n" +
            "aa";

    private String inputTask = "21: 71 69\n" +
            "100: 92 69 | 13 54\n" +
            "116: 34 13 | 41 92\n" +
            "101: 92 93 | 13 96\n" +
            "122: 13 22 | 92 19\n" +
            "124: 70 13 | 76 92\n" +
            "29: 9 92 | 133 13\n" +
            "2: 13 75 | 92 73\n" +
            "117: 132 92 | 109 13\n" +
            "0: 8 11\n" +
            "43: 92 13 | 13 13\n" +
            "56: 41 13 | 34 92\n" +
            "54: 92 92\n" +
            "16: 92 128 | 13 106\n" +
            "39: 13 82 | 92 72\n" +
            "121: 99 13 | 70 92\n" +
            "110: 59 13 | 123 92\n" +
            "4: 63 13 | 33 92\n" +
            "120: 130 92 | 54 13\n" +
            "7: 41 71\n" +
            "119: 76 13 | 68 92\n" +
            "63: 13 99 | 92 76\n" +
            "44: 92 13 | 92 92\n" +
            "3: 57 92 | 117 13\n" +
            "30: 13 68\n" +
            "127: 91 13 | 1 92\n" +
            "49: 13 98 | 92 5\n" +
            "5: 41 13 | 112 92\n" +
            "74: 92 17 | 13 25\n" +
            "58: 13 34 | 92 68\n" +
            "128: 43 13\n" +
            "92: \"a\"\n" +
            "77: 13 37 | 92 128\n" +
            "112: 13 92\n" +
            "130: 92 92 | 13 13\n" +
            "46: 92 83 | 13 122\n" +
            "31: 13 3 | 92 26\n" +
            "85: 69 92 | 60 13\n" +
            "111: 13 41 | 92 70\n" +
            "76: 92 13\n" +
            "24: 76 13 | 70 92\n" +
            "93: 92 84 | 13 50\n" +
            "78: 92 21 | 13 135\n" +
            "57: 66 92 | 40 13\n" +
            "84: 13 45 | 92 41\n" +
            "109: 48 92 | 78 13\n" +
            "17: 92 60 | 13 43\n" +
            "103: 115 13 | 56 92\n" +
            "99: 13 92 | 71 13\n" +
            "65: 13 95 | 92 120\n" +
            "79: 121 92 | 128 13\n" +
            "134: 34 13 | 76 92\n" +
            "68: 13 92 | 92 13\n" +
            "14: 60 13 | 76 92\n" +
            "83: 4 92 | 27 13\n" +
            "70: 13 92 | 92 71\n" +
            "62: 92 79 | 13 90\n" +
            "66: 2 92 | 108 13\n" +
            "52: 54 92 | 130 13\n" +
            "47: 13 38 | 92 52\n" +
            "108: 119 13 | 134 92\n" +
            "33: 13 130 | 92 45\n" +
            "9: 13 43 | 92 69\n" +
            "64: 24 13 | 86 92\n" +
            "118: 71 70\n" +
            "6: 112 13 | 130 92\n" +
            "72: 71 43\n" +
            "69: 13 13 | 92 71\n" +
            "97: 89 92 | 62 13\n" +
            "135: 36 92 | 99 13\n" +
            "82: 13 70 | 92 54\n" +
            "61: 77 92 | 28 13\n" +
            "90: 92 125 | 13 100\n" +
            "129: 13 45 | 92 54\n" +
            "86: 130 92 | 41 13\n" +
            "106: 92 99 | 13 54\n" +
            "38: 92 99 | 13 69\n" +
            "126: 92 74 | 13 105\n" +
            "45: 13 92 | 13 13\n" +
            "10: 61 13 | 94 92\n" +
            "28: 30 13 | 35 92\n" +
            "71: 13 | 92\n" +
            "27: 118 92 | 9 13\n" +
            "1: 88 92 | 126 13\n" +
            "11: 42 31\n" +
            "105: 13 21 | 92 102\n" +
            "41: 92 92 | 13 92\n" +
            "34: 13 13\n" +
            "125: 60 13 | 112 92\n" +
            "55: 13 41 | 92 43\n" +
            "20: 13 45 | 92 60\n" +
            "113: 43 92\n" +
            "96: 13 111 | 92 113\n" +
            "104: 92 99 | 13 130\n" +
            "87: 54 92 | 112 13\n" +
            "132: 103 92 | 110 13\n" +
            "12: 124 13 | 20 92\n" +
            "133: 13 45 | 92 76\n" +
            "50: 54 13 | 76 92\n" +
            "26: 46 13 | 97 92\n" +
            "42: 13 127 | 92 67\n" +
            "131: 119 92 | 121 13\n" +
            "73: 92 36 | 13 76\n" +
            "19: 55 13 | 129 92\n" +
            "8: 42 | 42 8\n" +
            "75: 60 13 | 130 92\n" +
            "102: 13 68 | 92 99\n" +
            "13: \"b\"\n" +
            "22: 92 6 | 13 85\n" +
            "80: 13 54 | 92 70\n" +
            "107: 14 92 | 80 13\n" +
            "48: 92 58 | 13 21\n" +
            "23: 92 116 | 13 113\n" +
            "98: 70 92 | 69 13\n" +
            "37: 54 13 | 41 92\n" +
            "59: 13 76 | 92 45\n" +
            "35: 71 99\n" +
            "40: 92 15 | 13 23\n" +
            "81: 13 51 | 92 114\n" +
            "89: 92 49 | 13 32\n" +
            "94: 92 64 | 13 107\n" +
            "36: 71 71\n" +
            "18: 92 65 | 13 53\n" +
            "53: 92 7 | 13 100\n" +
            "15: 119 92 | 87 13\n" +
            "60: 13 71 | 92 92\n" +
            "115: 60 92 | 41 13\n" +
            "91: 92 18 | 13 101\n" +
            "123: 76 13 | 44 92\n" +
            "51: 47 92 | 29 13\n" +
            "114: 13 16 | 92 12\n" +
            "25: 60 13 | 99 92\n" +
            "88: 13 131 | 92 39\n" +
            "95: 92 45 | 13 68\n" +
            "67: 81 92 | 10 13\n" +
            "32: 50 13 | 104 92\n" +
            "\n" +
            "bbabbaaaabbaabbbaabbabaabbaabbaababaabab\n" +
            "abaababbbaaaaaabbabbabaabbabbaaaabaababbababbbab\n" +
            "baaabbbaabbabaabbbbbbbaa\n" +
            "bbaaaabababbbaaabbbabaab\n" +
            "ababbababbabbababaaababaabbbbaaaabbaabba\n" +
            "bbaabbabbbbbabbabaaabbbaabbabbab\n" +
            "bbabbaaaabbbabbaabbbabbabbabbbaa\n" +
            "abbbaaababbaaaaababaabaaaabababbabbaabab\n" +
            "abaabbabbbabaaaabaabaaba\n" +
            "aabaaabbaaaaabaabbabbbba\n" +
            "aabbbaaaaabbbbabbaabbbaabaabbbbbbbbababbbbbbaabbbbbaabaaabbbabbabbabaaaababaaaaabbbabbbabbaabbaa\n" +
            "abbaabaaabbaaabbaaaaaaabbbabababbbaabababbbaababaababbabbaabbaaaaaaaabbb\n" +
            "bbbbababbabbaabbbabaaabbaaaabbab\n" +
            "baaabababaabbbaabaabbaab\n" +
            "abbabbbbbbbbbbbaabaaabaaabbbbbababbabaaaabbbaaabbaaabaab\n" +
            "bbabababbaaabbbaaabaabbababbaabaaabbababbbbbbaaa\n" +
            "aaabbbaaaaaaababaabbaabb\n" +
            "ababbababaaabbabbbaaababbaaaaaaa\n" +
            "aaaaababbbabbaabbabaaabaabbababaaabbaaaa\n" +
            "aabaabbababababaabbabbab\n" +
            "babbbbbaaabbaaababbabbab\n" +
            "abaaaabbbabaaaabababaabb\n" +
            "babbbaaaabaaababaabababb\n" +
            "abaaaabbbaaaabaaaabaaaab\n" +
            "aabbaaabbaabbbaaabbbaaba\n" +
            "babbbaabababbbbbaabbbabbaaababbbbaabababaabaabaaabaaaaab\n" +
            "ababbabbbaaabaaaaababbabababbbaababaaaabababababbbbabababaaabaaaaabbbbaa\n" +
            "babaaabbbbaaabbabbbababa\n" +
            "bbbaababbbababaabbabbabb\n" +
            "babbabbbaaaabaaabaabaaaa\n" +
            "abaaaaaaaabbbabbbabbaabaaaaabbbb\n" +
            "bbaabaaaabaabaaaaabaaaabaabbbbbbbaaaabaaabbbaabababbbbbabaabaabbbbbababaabaababa\n" +
            "bbabaabbbababababbabbaabbbbababbaabbbbba\n" +
            "aaaabaabbaababbabbabbbaa\n" +
            "bbbbaabbbabaaaaaabbaaaba\n" +
            "aaaabbaaaabaabbbabbabbaabbbabaaa\n" +
            "abbbabaabbaababaaababaabbabbabab\n" +
            "bbbabbaabbbabbbabbababbabaaaababaababaaabbaabbaa\n" +
            "baabbbababbabbaaabaaababaabbbbba\n" +
            "bbbaabbabaabbbaabbaabbab\n" +
            "aaabbabbbbaabbabaabababa\n" +
            "aaaabaaaaabbbaaaabbaabbbabbabaaabbbabbbb\n" +
            "abbbabbbbbababbaababbaab\n" +
            "aababbbbbbabbbbbbaabbabaaabbbababbbbbaba\n" +
            "aabaabbbbaaababaabababaa\n" +
            "baaaaabaabbabbaaabbbbaaa\n" +
            "aaabbbabbbabbaaaabbbabab\n" +
            "bbababaabbaaabbbaaaaabaababaabaabaaabaab\n" +
            "abaabaababaababbbabbaababbaabbbbaabaabaa\n" +
            "abaaaabbbbabababaabbaaaa\n" +
            "babaabaaaaaabbaabbbbabbbabbabbbaaaabbabaaaabbbbbbabababaababbbbbbaaaaaab\n" +
            "abaabbababababbbbbaaabbaaabaaaaa\n" +
            "abbbaaabbbabaabbbababbaaaaaaaaba\n" +
            "abbabaabbbabababbbbbaabaaabbaabbaabaaabbaaabbbbaaaaabbabaaaaabaa\n" +
            "babbaaabbbbbbbbaababbaab\n" +
            "ababbabaababbaaabbabaaba\n" +
            "abababababababbbabaabbaa\n" +
            "abaabababbbbbbbaabbbbaaa\n" +
            "bbbbababbbaabbbbbababbab\n" +
            "bbaabbabababababbbaaaaba\n" +
            "aabaabbabbabbbaaabaaababbaaaaabaaabbbabbbaaabbabbaabbaba\n" +
            "baaabbaaaaababbabbbbabababaababaabbaaabbbbbbaaaabbababbb\n" +
            "baababbbbbbaaaabbbbbbbaaaaaababaabbaaabaaaabaabababaaaaa\n" +
            "bbabababaaabababaabbaabaabaaaabbababbbbaabaaaaab\n" +
            "abbabbbababaababaaaaabbbaabaaabb\n" +
            "babababbabbbbaabbbaaababaabbbaab\n" +
            "baabbbaaaaaabaaabbbaabbaaaabbabbaaaabbbbbaabbaaabbaaaabbbabaababbabbbbabaababbab\n" +
            "bbaaabaaaaabbbaababbaaabbabaaabbabbabbba\n" +
            "abaaababbabbabaaabababbbababaaaaabbaaaaa\n" +
            "abaababaaabbaaababaabbabaabbbbbb\n" +
            "abaababbbbbababbbbbaabbaaabbbaaaaabbbabb\n" +
            "aaabbbaabbaabababbabbbbb\n" +
            "abaaababbabbbaaababbbbbb\n" +
            "baaaabaaabbbabaabbaaabbb\n" +
            "babbaabbabaaaaaabbbbaabbaaaaaaabbbbbabbabbbbabaa\n" +
            "babaabbbaaaaaabbbaaaabbaaaabaaaababbaabbabbaababbbbaaabb\n" +
            "babaaabbabbbbababaaaaabababbabbabaaaaaababaabbbb\n" +
            "abaaaabababbaabbaabbabaaaaaabaabbbabbbbbabbbaaabbaaaabba\n" +
            "baabbbbaabbbbababbbbabaa\n" +
            "bbaaaaabbbbbbbbababaabbabbbbaaaaabbaaaab\n" +
            "abbbabbbbabababbaaabababaabababbbaaaaabaaaabbaaaabbabaaabbaabbba\n" +
            "baaaaabaaaababbbaaaaababbaaabaababaaabba\n" +
            "aaaabaabbbaabbababbababbabaaabbbbbaabbabaaabaaab\n" +
            "abbabaababaaaababbbbbbaabbaaaaaaaaaaaabb\n" +
            "aaaabbaababbabbabbaaabbb\n" +
            "baabababbabaabbaaabbabbbbbbbababbaababbaabbaabbbabaaabba\n" +
            "baaaabaabaabbabaabbbbbbbaaaababbaaabbaab\n" +
            "aabbbbbbabbbbaaaaabbbbbbbbbbabbb\n" +
            "baaabbaabbabababaaaabaabbbbaabbabaaaaaaaaabbbbababbbbbabaabbaaaaabaaabba\n" +
            "abaaababbabbbaaabaaaabaabbaaaabbaabaabaa\n" +
            "babbbabababaaaaaababbbab\n" +
            "baababbbbbaaabaabaabbbaaabbaabbaabbbabab\n" +
            "abaabbababbbbbbabbababaabbbbbbbaaaabaabbbaaaabbb\n" +
            "aaaaaaababaabbaaaabaaaaabbbabbbb\n" +
            "abbbabaabaabbbaabaabbaab\n" +
            "abbabbaaabbbbbbaaaabbaabbabbbaaababaabba\n" +
            "baaabababababaabaabbbabbabaabbabbabaaabbbabbabbbbbababbb\n" +
            "aaaaaaabaaababbababaaaba\n" +
            "bbaababababaaaabbbbbaaaa\n" +
            "bbbbaabbbbbbaabbbbbabaab\n" +
            "abaaaabaabbabaaaababababbbabbbbbbabbabab\n" +
            "babbaabbabbabbaaabbabbbbaabbbabbaabaaaaaaababbbb\n" +
            "babaaaabaaaabaaababbabaabbbbbbaababbaaaa\n" +
            "abbaabaaaaabbaaabbaaabbb\n" +
            "bbbabbabaaababbaabaabbbaaaaaabaa\n" +
            "bbaaabbababaabbbaaabababbabbaababbbbaabaabaabbaaaabaaabbbabaabbabaaabbababbaababbaabbaaa\n" +
            "bbbaaabababbabababaaaabaaabbabbbbaaabbabaaaabbbaabbababbbaaaabababaabaaabbbababb\n" +
            "babbbaaabbbbabababbbbabb\n" +
            "baaaaabbaabbaabaabbaabba\n" +
            "babbbaabbababaabaaaabaaaaaaabababbbaabbbababbabbbbabaabababbbabbaababaaa\n" +
            "baabbbbaaabaababababbaaa\n" +
            "abbbabbbaaabbaaababbabab\n" +
            "bbabbaabbbaabaabbbbaaabaabaaababbbabbaabbbabaaaaabbabaaabbababbbaababbaa\n" +
            "babaaabbbabaaabbbbabbaabbbbabaab\n" +
            "abbbbbaabaaaaabababaabbabaabbbaaabbbaaabbbbabababbabbbbbbaababbbaababbab\n" +
            "aaababbbbbaabbbaabbbabbaaaaaaaabbbaaaaaabbaaabbbbbbbbabb\n" +
            "ababbabaababbabbbaaabbbababbabbabbbbaaabbaabbaab\n" +
            "ababbabaaabaababbbabbabaaabbaaaabaaaabab\n" +
            "aabbaaaabaabbbbbaaabaaba\n" +
            "babbbbbaaaababbbbbaaaabbbbbbbababaabbbab\n" +
            "abbbbbbabababaabbabbbaabbbaabbaa\n" +
            "bbaaabaabbbaababbaaabbbb\n" +
            "aabbabaaaaabbbaaabababaa\n" +
            "aabbaaababbbbaabbaabaaab\n" +
            "bbbbbbabaaaabbbabbbbababaabbbaab\n" +
            "babbaabbbbbbbbbabbaaaaababbabbabaaaaabaa\n" +
            "bbbaaabaaaaabaabbaaaaaaabaabaaba\n" +
            "baabbabbbbaabbababbaaabbaaaababa\n" +
            "ababaaaaababbaababbbbbaabbbaaaaaaabaaaababbaaaab\n" +
            "abbaaabbbbaabbababbbabbaaabaabaaaaaababb\n" +
            "ababbaaabbaaaabbabbaaaaabbaabaabbbaaaaba\n" +
            "ababbbbbabaaaabaabaaaaab\n" +
            "babababbababbbaabbabbaab\n" +
            "baaaabaababbbbbaabbbabbaaaabababaaabbaaaaaaaabbbbabbababbbbaabbbabbaaaab\n" +
            "bbbbababaaaaaaabbaaabbabaabbabbaaaabbbbaabbbaaba\n" +
            "baaaaabaabaaababaaaaabbaaaabbaaaabbbaabb\n" +
            "bbbbabbabbabbbaabaabbbaaabaabaabbabbbabb\n" +
            "bbaaabaaaabaabbaaaaababb\n" +
            "abbababaaababaabbabbbbaa\n" +
            "aabaabbaaaaaababbabbaaabaaabaaba\n" +
            "abbbbaabbbbabbabaaaaaaaaaabbabbabbaabaaaaabbbbbaaaaaaabb\n" +
            "bbaaabbababbaaabbbaaabaaabbaaaaa\n" +
            "aabaaabbabbbaababababbaa\n" +
            "bbbbaababbabaaaaababbbba\n" +
            "abbbbaabbaaaaabbabbabaabbbbbaabbbbaabbabaabaaaaa\n" +
            "aaaabbbabaababbaabbbbbab\n" +
            "babababbaabbaaaaaabbbbaa\n" +
            "babbaaabaaabbabbabaabaababbaaaaabaabbbbb\n" +
            "bbaabbbaabaababbbbbaaabb\n" +
            "baaababaaabbaabaaabbaabb\n" +
            "baaaaabaabbbabbabbbaabbb\n" +
            "abaababbbbaabbbbabbbabaabbbaabbaababbbba\n" +
            "babababbabaaaaaaaababbbaabbaabbbaabababbaaaabbab\n" +
            "aababaabbabbaaabaaaababababaabbb\n" +
            "aaaaabbaaabbaaabbbaaaababbbbabbbabbabbbbaabababababaaababbaaabab\n" +
            "aaabbbabbbbbaaaaaabababb\n" +
            "bbbbbbaaaaabbabbabbbbbabbaaabaababbbaaabbbbbbabaabbbaaaa\n" +
            "ababbbbbbaaaaabaaaaabbaabaabbbbaababababbbbabaab\n" +
            "bbaaabaaababbabababaabbaaabbaaabaaabaaab\n" +
            "baaaabaaababababaababbaaaaaaabababaabbbabbaabaabbbbabbabbaaabbab\n" +
            "babbabbabaabababaaaaaabb\n" +
            "aaaabababbabbaaabbbbaabababaaaabbbaabababbabbbbb\n" +
            "baabbbabbbaaabaaabbbababaabbababbabaaabbbabaabaabaaababaabbabaaaaabbbaba\n" +
            "baaaaabbbabbbabaaaaaabaa\n" +
            "bbaabababbabbaaabbbaaababaaaabab\n" +
            "babbaaabbaaaaaabaabababa\n" +
            "bbabbabbbbbabababaaaabba\n" +
            "bbabbbaaababababaabaabbbaaababbbbabbbbaa\n" +
            "baaabbaaabbaaabbbaaaabba\n" +
            "abbbbbaababbbbbaabaaabba\n" +
            "aaabbbabbaabbbbabbaaaaaa\n" +
            "aaaababaabbbabaaabbabababaabaaabaaabbaba\n" +
            "bbbaabbaabaabababaaabbaaababbabb\n" +
            "bbbabbabbbaaaaabbaaaaaabbbababba\n" +
            "baabbaababbaaabbabbaaaabaabbaabbbaabbaaaabbbaaaa\n" +
            "abbabbbbaabaaaabaaaabaaabaaaababababbaaababbbaaaabbabbbbaabbbaaaaaaabaaaabbababbbaaabababbabbbba\n" +
            "bbaaabbabbaaabaababaabab\n" +
            "bbababaabababaabaaaaabaa\n" +
            "bbbaabaaabbaabaaaaaaaabb\n" +
            "abbabbaabaabbbaabbbaabbb\n" +
            "aabbbabbbabbbaabaabbaaabaaaababbaabbbbbb\n" +
            "abbbaaaaabaababbabbbbabb\n" +
            "bbbaaabaabbabaabaaabababbbbabbbaaaabbabbaababaabaaabaabb\n" +
            "bbbaabbabaaabbabbbaaaaaa\n" +
            "baabbbaaababaaabbbabbabaabaabababbbbaaaa\n" +
            "bbbbbbababbbabaaabababbbaaaababbabbbaaabaababbbbaabbbababbaaabbb\n" +
            "bbbabbabbaababbbbbabbbaaabbababbbabaaaba\n" +
            "aaababbabbbbababababbbba\n" +
            "bbbbbbabababbbaabbbbaabababaaaababbbaaaabaabbababbbbbbab\n" +
            "abaaababbaaababababbbabb\n" +
            "abbabbbaabbbbabbbaabbbababaaabbaababbbababaabbaabaaaaaab\n" +
            "abbabbbbaaaabaaaaabbbaba\n" +
            "bbbaaababbabaabbabaababbaabbaabb\n" +
            "aaababababbabbaabaabbaaa\n" +
            "babbabaaabbbbababababbaabbabbbbb\n" +
            "bbbabbaabbbabbbabaaabbaaaabbabbabbbabaaa\n" +
            "babbabaabaaaaaabbbbbbbbababaabaa\n" +
            "bbaabbbabaabbbbaababbbbbbbaababaabbaaaabaaabaaab\n" +
            "aababbbbbabbababbbababaabaaabbaa\n" +
            "aabbabbbbaabbbababaaabbb\n" +
            "aaababbbaabaababbbabbabaababaaba\n" +
            "abaaaaaaaaaababababbaaabbaaaaaababaaabababbababbbbabbaababbbbabbbbabbbab\n" +
            "abaaaabbbbbbbaabbbabbbaaabbbaabb\n" +
            "bbabaabbaaaabbbaabbbabbbabaaaaaabbaabbbbaabbaabbbbbaabbbbbabbbab\n" +
            "aabbabaabaababbababbbbbaabbaaabbbbbababbbbbababaabbbbabb\n" +
            "bbabaaaabbaaabbaabbbabab\n" +
            "babaaaabbaababbbbbaabbbabbbbbbbaaaaabababbabbaab\n" +
            "abaabbbaabaabababaababbababbbbaa\n" +
            "ababbbbbbbaababaaabbabbbababbbbaabaabbbb\n" +
            "aababbbaaabbaaabaabaaaaa\n" +
            "babbaaaaabbbbababbbaabaabaabbaaa\n" +
            "aabbbaaaabbaabbbbaababbababababaabababaabbbbaaaa\n" +
            "abaababaababbbaaaababaabbabababbababababaababaaabababbbb\n" +
            "aaaabbbaabaabaaaababbaabbbbbbbbb\n" +
            "baaabbabaabbabbbbaababbabaaaaaababbabbbb\n" +
            "babbaaaababaaaabaabaabbabbbaaabbaabbaabb\n" +
            "abbbaabbbaabbbbbbaaabaabaabbababbbbababa\n" +
            "aabbaaababbaabaabbabbaaababbaaabbabaaaaaaabbbbbbbabbbbbbabbabbba\n" +
            "abbbaababbababababbabbbabbababaaabbaaaaaaaabbbbb\n" +
            "aababbbaaaaabaababbaabba\n" +
            "abbbbababbbbbbbaabaabbabaaaabababaaaabbbaabaaabb\n" +
            "bbbaabbabbaaaaabbbabbbba\n" +
            "abbbaaaaaabbabbbaaabaaba\n" +
            "abababbbaabbaabababaabbabaaaabbb\n" +
            "abbaaaabbaababbbbaaaaababbabbababbbbababbbabaaababaaaabbabbbaabbabbbbababbaaabaaaabbaabbbbaaabaa\n" +
            "abaaaabaabababababbaaaaa\n" +
            "aabbaaaaaabaaabaaabaaaaa\n" +
            "babbbaaaaaaabbbaabaaaabbbababababaaababbbbbbbaba\n" +
            "abaaaabbaaaaabaabbabbbabbaabbbbabbabbabaaabaabbababbabbabbaaabbaabbbbbaabbbbaaab\n" +
            "bbaabababaabababababbabb\n" +
            "abbbbaabbababababbbbbbbb\n" +
            "aabbaabaaababaababababaabbbaabbabbbababaabaaabbbabaabaaaaabbbbaabaaabbaaabababbb\n" +
            "ababbbbbbbabbababbbbaababbbabbaaaabbabbaaababbaabbabaaba\n" +
            "abbaaaabababaabbbabbbbbbbbbaababbbbaabbbabbbaabababaaaabbaababaaabbabaab\n" +
            "bbbaaaaabbaaabababababaa\n" +
            "babaaabbabbbbbaabbbabbbababaabab\n" +
            "bbbbbbabbbbbbbbababbbababaaaaababbbbbaabaaaaabbbbaabaaaaaaaaaabb\n" +
            "baabbbbaaabbabbbbbabbbaaaabaaabb\n" +
            "aabaababbabbbabaaaabbabbbaabaaaa\n" +
            "aabbaababbbaaabaaaabbaab\n" +
            "babaaaaaaaabbbabbabbaaaaaaaaabbabbbaababbaaabbab\n" +
            "bbabbbbababbbbaaabbbbbabbbabaaaabbbaaababababababaabbbbbbbbaabbaabbbaaaa\n" +
            "bbababbabbbaabababbbbaabbbababbb\n" +
            "ababbbbbabbbabbbabaabbbb\n" +
            "bababaabbbababaabbaaabbaaabbabbabbaaaabb\n" +
            "abbaaaabbbabaaaaabbbaabbaabbaabbabaaaabaaababbbabaaaaababaabaabbaabbabbbabbbabba\n" +
            "baababbabbbbbaabbbbaaabb\n" +
            "bbbabbaaabbabaabaababaaa\n" +
            "baaaaabababbabaaaaabbbabbaababbabbbaabaaabbbbaabbbbabaab\n" +
            "aabbbbbabaaabaabaaabaaaa\n" +
            "abbbabbbaaaaaaababbbaaba\n" +
            "abbbabbaabbbbbbabbabbabb\n" +
            "bbbaaababbaabababababaababaaaabbabbabbbabbabbabbababbaaa\n" +
            "aaaaaaabaabbabaaaabaabaa\n" +
            "babbaabababbaaaaabbaabbbbabbabaaabbbbaabbbbbbaba\n" +
            "bbabbaaabaabbbababbaaabbbaaaaabaababbababbabbaaababaabbbabbbbbabaababbbb\n" +
            "babbbaabaabbabaaaabaabbaabaabbaa\n" +
            "bbababbabababaabaabaabbbaabbabaaaababbaaabbabbba\n" +
            "aaaaabbababaaaaabaaaaabaabaabaababaaaabbbaaabaaa\n" +
            "babaabaabbbbabaabbabaaabaabaaaab\n" +
            "bbbbbbabbaaabbbabbbababa\n" +
            "bbabbaaababbabaaaaabbbba\n" +
            "bbaaabaaaaaabaabaaabaaab\n" +
            "bbaabbabbaababaaabaabaabbbbbbaabbabbbabb\n" +
            "ababaaabbaabbbbabbbbababababbbbbbababaabbababbaaabbaaaba\n" +
            "bbaabbbaaabaaabbbbaaaabb\n" +
            "babbabbbabbbbbbababbbabbabaaabbbbbbaababbbbaabbbaabbaabaaaaaaaaababaaaaa\n" +
            "babaaabbaabbaabaababaaababbabbaaabbababaabbabbabbbbabaabbbbbbaaa\n" +
            "bbbbaaabaababbbaabbaababbbbbabaa\n" +
            "baaabbbaaaaabbbabbbbbaba\n" +
            "aababaababbbbabaaabaabbbbbbaababbabaaaabbbbbbaabaaababaa\n" +
            "bbbbabbaabbbaaaabbabababbbabaabbbbbbababbbbaaabbbbbaaabb\n" +
            "bbbaaaaabbabbabbbbabbabaaabbbaab\n" +
            "baabbbbabbbbbbbaabbabababbbababbababbabb\n" +
            "aabbabbbbbbabbabbaaaabbaaabbbbbbbabbababbbbbbabb\n" +
            "abbbabaaabaaaabaaaaabbab\n" +
            "aabaabbaabaababbaaaaaaababaabaababbaaaba\n" +
            "bbabbabababbabbbbabaabbb\n" +
            "bbaaaaabaabbbaaababbabbababbbbbbbbbabaaa\n" +
            "aabbaaababbbbabaaabbbbbb\n" +
            "aabbaabaaaaabbbbbaaabaaaabbbbbab\n" +
            "aaaabbaaaabbaababaaaaabbbaababbbbbbbbbbb\n" +
            "abaaababbababababaababbababaabbb\n" +
            "aaababbabbbaaabaababbaaa\n" +
            "abbbabbaabbbabaababbbabababbabbababbaabbaabaaababbbaaaabbabaabaabbaabaababbabbba\n" +
            "babbbbababbaaabaabbbbabbbbabaaba\n" +
            "aaaaabaaababaaaabababbbaababaaaaababbbbbbabbbabbbabbbbbb\n" +
            "abbaabbbbbbbaabbaaaabbbaabababaa\n" +
            "babbbbbaabbabababbaabbbbaabbaabb\n" +
            "bbbabbbabbbbaabbabbbaaab\n" +
            "babbbaaabbbabaabbbbaaabb\n" +
            "bbbbbbbaaaaaaaababbabbba\n" +
            "bbbbbbabaaabababbabbbbbabbaabbaabbbabaaa\n" +
            "bbaabbababbaaabbaabaababbaaaababaaabaabb\n" +
            "aaabbbaababbaabbabaaababbbbbbaabbababaaabbbaabbb\n" +
            "bbbabbbabbbaaaaabbaabbbbbabbbaabbabaaaba\n" +
            "abababbbaababbbabaababababbbaabb\n" +
            "bbbbbaabbabbaababbbababa\n" +
            "aaaabbbabbbaaaaaaabaaaba\n" +
            "aaaaaaaabbaabbabaaaabbbaababbaab\n" +
            "aaababbabbbbaabaabaabbbb\n" +
            "abaaabbbbabbbaabababbabababaaaababaaaaababbbababbbbbaabababaababaababbba\n" +
            "baaaabbbbbaabaaababbabab\n" +
            "aabaabbbbbaabbbabaaabbbbbababbabbaabbabaabaaabababbabaaabbabbaaa\n" +
            "baaabaabbabbbbaabbabaaabaabbbbbb\n" +
            "ababbbbbbaabbabbabaababaabbbbbab\n" +
            "baababbbbbbaaaaabbabbabb\n" +
            "babababbaaabbbabaaabababbbbababa\n" +
            "baabbaaaabbabaabbabaabaaaaabbabaababaabbabbababaababaaaabbbabbbb\n" +
            "aabaababaaabaabbbbbabbbbbabaabbb\n" +
            "aaaaabbabbababaaababbabaaabaaabbbabbbbbb\n" +
            "baabbababbbabbbaaabaaabaaaaaabbabaabaabaabaaaaaaabaabaaabbbbabbababaaaaa\n" +
            "babbabbabbbaabaaaaaaaaabaabbaaaa\n" +
            "baababaababbaaababaaabababaababbbbbababa\n" +
            "abbaabaaaabbbaaabbaaaaabbbaaaaabaabbaababbbababb\n" +
            "baabbbabaaaabbbaabbbbbaa\n" +
            "aaabbbabbaabbbbaababbaaa\n" +
            "abbabbbaabbbbabaaabaabbbbaabaabbaabababbbbaabbba\n" +
            "baabbaaabbbabbabbaaabbbbaaaaaabaaaaabbbabaaaaabbaabbabbaaabbbbbaaaabaaaa\n" +
            "baabbbaabbbaaaababbabbbbaaababbabbbbabbbaaaaaabbaaababbaaaaababa\n" +
            "baaabbabaabbabaabbbbbabb\n" +
            "ababbbbbabbbabaabbaaaabb\n" +
            "aaabbaababaababbabbbababbaababbababbbaaabaabbaaabbabbabbbabababa\n" +
            "aaaaaaabaabbabaaababbabaababaabb\n" +
            "baababaabbabbaaababbbaabaabbbabbaaaaabababaababaababaaaa\n" +
            "abaabaabaabbbabbaaaaaabb\n" +
            "bbaabbbbbabaaaabbbbbbbabaabbbaba\n" +
            "baabbbaabbaaaaabbbbabbbbbbaaabbbaabbbbaaaababaaabaababaa\n" +
            "bababababbaaabbabbbbbbbaabbbaaaaababbaaa\n" +
            "abbbbbaabbababbaabababab\n" +
            "bbaaababbaababaabbbabbabbbbabbababbaaabbabaaabba\n" +
            "abbbabbabbaaabbababaaaba\n" +
            "abaabbabababbbbbabbabbaabbbabbbb\n" +
            "aaaabaaaabaabbabbbabbabb\n" +
            "bbbbbbababbaabaaaabbaaaa\n" +
            "babbaaababbbaaabaabbbbbbaabbabaaabbbababbbabbababbbaabaaaaabbaabbbbbbbaa\n" +
            "babaaaabbabaabbaaaaabaaaababbabb\n" +
            "abbbbaabaaabbbabbbaabbbbbbaababaaaaababbaabbaabb\n" +
            "bbbabaaabbbbbbabaabaabbabbbbbabababababaabbabbbaabaaabaaaaababbbabbababaabbbbbaa\n" +
            "baaaabaababbbaababbbbbaaaaaababaaababbbb\n" +
            "bababbaabaaaaaaabbbbbbbbbbbbbbbbabbbbaaa\n" +
            "bbbbaaabaabbabbbbabbaabbaaabbbabbbbaaaaaabbaaaab\n" +
            "abbabababaababababaaaaaabbbbbbaaabbbbbbaaaaabbbbabbaaaabaaaabbabababaaba\n" +
            "baabbbaaabaabbaaabbabbababbaaaaaabababba\n" +
            "abaaabaabbabbbaabbbababbaaabaaba\n" +
            "baabbbbabaababababbaaaab\n" +
            "abbabababbaaabbabbbbaabbaabababa\n" +
            "abbabbbbabbbabaaabbbbbbb\n" +
            "aaabbbbaabbaabaaababbbbabbbbaabbaababbbaababbaaaababbbbbbbbbaaab\n" +
            "abaabababbbaababbabaaaabababababbaaababbaabababb\n" +
            "babbabbaabbbbababababbaaaabbbbaabbabbbbaaabbbbbababbbaaabbbbbaaabbabbabb\n" +
            "abbaaabbababbabaabaaaaaabbaabbbaabaabbabaababbaabaaaabbabbbababaaababbbb\n" +
            "aababaabaaabababbbabaaab\n" +
            "aabbabbabbbaababbbaabaaa\n" +
            "abbbabaaaababbbabaabababbabbbaaabababaaa\n" +
            "abbbbaabbbbaabbaaaaaabbb\n" +
            "aabaababbbabababbaabbbbaabbbaaaabaaabababababbabaaabaaaaabbbaababaaabbbb\n" +
            "aaaabbaabbababaababababaaababbbb\n" +
            "bbaaabaaabbaaabbbbbbbaaa\n" +
            "bbaabbbbbbbbaaabbabbbbbaabbbaaba\n" +
            "abbabaabaaabbaaaaaabbbaa\n" +
            "baababaabbbbbaabbaabbaba\n" +
            "aabaabaaabaaaabaabbbabbabbbabbbaaabaaaabaaababbb\n" +
            "babbbaabaaabbaaaaabaabbababababbaaaaabbbabababaabbabaaab\n" +
            "abababaabbaaabbbaaabbaabaabababa\n" +
            "abaababbbbbabbbabbabbbba\n" +
            "bbbbbbabbbbabbabaaabbbaaababaaaa\n" +
            "aabbbabbaaabbbababbabbba\n" +
            "baababaabaaaaababbaaabaaabbabbbbbabaabab\n" +
            "aaababbabaababbbbbbbababbbbbaaabbaaabbaababbabab\n" +
            "aaabbaaaabaababbaaaabaaababbaababaaabaaa\n" +
            "baabbbaababbabbabbabbbab\n" +
            "abbbabbaabaabababaaabbbb\n" +
            "aaabbaaaabaaaabaaabbbaaaaaabbbaabbbaababaaaababbbaabaabbaabbbbbb\n" +
            "babbabaaabbabbbbbbbbbabbaabbbbbabbaaabbabbaaaabaabbbbbabbaaaabbbbbaabbbbaabbabbaabbabaaa\n" +
            "aaabbaaababaabbaaaaaaabb\n" +
            "abaaaabbabbabaabaaaabbab\n" +
            "bbbbabababbbbabaabaaaaaaaaaabaaaababbabbabbaabbabbbabbbbabbababb\n" +
            "abbabaaaaababbbababbaaaaaaabbbaaaaaaabbb\n" +
            "bbbaabaababaaabbbbbbaaabababaabb\n" +
            "abbbabbabbbabbaaaaababbabaababbaaabaaaab\n" +
            "bbbabbaababaabbaaababbaa\n" +
            "bbbbbbbababbbbbababbaabaaabaaabbaababbaaabbbbbabbabbbabbaababbaa\n" +
            "baabbbaaaababaabaabbbaab\n" +
            "bbaaabaaaaaabbaaabaaabaaaabbbbbabbbabbbb\n" +
            "abbaabaabababaabbabbabaaabbababa\n" +
            "babbbaababbaaabbbaaababb\n" +
            "bbbbaababaaaabaaaaabbbbb\n" +
            "aabbbaaabbababaaaaaaaaabbaaaaaaa\n" +
            "abaababaaaababbabbbabbaabaabbabbababaaabaababaabababaaaa\n" +
            "ababbbaaaaabbbaaabbbabab\n" +
            "bbbabbaabaaabbbabaabaaaa\n" +
            "bbbbababbaaaabbbbababbbbbaabbbaabaaaaabb\n" +
            "abaaababbaababbababababbababababbbbbabbb\n" +
            "babaaaaaaabaaaaaabaabaaa\n" +
            "babbaabbbbbbababbabbbbbb\n" +
            "bbbaabaababababaaaaaaabb";


    private String[] splitInput = inputTask.split("\n\n");

    public Map<Integer, String> getAllRules() {
        String rulesInputString = splitInput[0];
        String[] allRulesSplit = rulesInputString.split("\n");
        Map<Integer, String> allRules = new TreeMap<>();
        for (String s : allRulesSplit) {
            String[] ruleParts = s.split(": ");
            allRules.put(Integer.parseInt(ruleParts[0]), ruleParts[1]);
        }
        return allRules;
    }

    public List<String> getAllLines() {
        String lineInputString = splitInput[1];
        String[] allLinesSplit = lineInputString.split("\n");
        List<String> allLines = new ArrayList<>();
        Collections.addAll(allLines, allLinesSplit);
        return allLines;
    }

}
