package com.example.android.layoutprc05;

public class WordCons {

    String word, pronunciation, verb, verbt, verbi, noun,
            adj, adv, prep, conj, sentence, looklike, homoionym, antonym;
    int weight;

    public WordCons(String WORD, int WEIGHT, String PRONUNCIATION, String VERB, String VERBT,
                    String VERBI, String NOUN, String ADJ, String ADV, String PREP, String CONJ, String SENTENCE,
                    String LOOKLIKE, String HOMOIONYM, String ANTONYM ) {
        this.word = WORD;
        this.weight = WEIGHT;
        this.pronunciation = PRONUNCIATION;
        this.verb = VERB;
        this.verbt = VERBT;
        this.verbi = VERBI;
        this.noun = NOUN;
        this.adj = ADJ;
        this.adv = ADV;
        this.prep = PREP;
        this.conj = CONJ;
        this.sentence = SENTENCE;
        this.looklike = LOOKLIKE;
        this.homoionym = HOMOIONYM;
        this.antonym = ANTONYM;

    }

    public String output() {
        String out = word + weight + pronunciation + verb + verbt + verbi + noun +
                adj + adv + prep + conj + sentence + looklike + homoionym + antonym;
        return out;
    }

    public String printinOrder() {
        String output = (word + "\n" + pronunciation );
        if(verb != "") {
            output += ("v. " + verb );
        }
        if(verbt != "") {
            output += ("vt. " + verbt);
        }
        if(verbi != "") {
            output += ("vi. " + verbi);
        }
        if(noun != "") {
            output += ("n. " + noun);
        }
        if(adj != "") {
            output += ("adj. " + adj);
        }
        if(adv != "") {
            output += ("adv. " + adv);
        }
        if(prep != "") {
            output += ("prep. " + prep);
        }
        if(conj != "") {
            output += ("conj. " + conj);
        }
        if(sentence != "") {
            output += ("sentence. " + sentence);
        }
        if(looklike != "") {
            output += ("looklike. " + looklike);
        }
        if(homoionym != "") {
            output += ("homoionym. " + homoionym);
        }
        if(antonym != "") {
            output += ("antonym. " + antonym);
        }
        return output;
    }

}
