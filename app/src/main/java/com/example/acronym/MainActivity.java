package com.example.acronym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

import java.util.Random;

import static java.lang.Character.toUpperCase;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.editText);
        tv = findViewById(R.id.textView);
    }

        public void onClick(View v){
            String st = t1.getText().toString().trim().toLowerCase();
            int len = st.length();
            Random r = new Random();
            String res = "RESULT \n";
            for (int i1 = 0; i1 < len; i1++) {
                char ch = st.charAt(i1);
                res = res.concat(toUpperCase(ch) + " ");
                switch (ch) {
                    case 'a':
                        ArrayList<String> a = new ArrayList<>();
                        a.add("ADDICTED");
                        a.add("ADORABLE");
                        a.add("ACTIVE");
                        a.add("ACCLAIMED");
                        a.add("ADMIRED");
                        a.add("ADVENTUROUS");
                        a.add("AGGRESSIVE");
                        a.add("AMAZING");
                        a.add("ANNOYING");
                        a.add("ARROGANT");
                        a.add("ATTRACTIVE");
                        a.add("AWESOME");
                        a.add("AWKWARD");
                        int la = a.size();
                        int ra = r.nextInt(la);
                        res = res.concat(a.get(ra));
                        res = res.concat("\n");
                        break;
                    case 'b':
                        ArrayList<String> b = new ArrayList<>();
                        b.add("BEAUTIFUL");
                        b.add("BRAT");
                        b.add("BABY");
                        b.add("BELOVED");
                        b.add("BEST");
                        b.add("BEWITCHING BEAUTY");
                        b.add("BITTER");
                        b.add("BIZARRE");
                        b.add("BOLD");
                        b.add("BORING");
                        b.add("BRAINY");
                        b.add("BRILLIANT");
                        b.add("BRIGHT");
                        b.add("BRAVE");
                        b.add("BUSY");
                        int lb = b.size();
                        int rb = r.nextInt(lb);
                        res = res.concat(b.get(rb));
                        res = res.concat("\n");
                        break;
                    case 'c':
                        ArrayList<String> c = new ArrayList<>();
                        c.add("CUTE");
                        c.add("COLD");
                        c.add("CALM");
                        c.add("CANDID");
                        c.add("COOL");
                        c.add("CRAZY");
                        int lc = c.size();
                        int rc = r.nextInt(lc);
                        res = res.concat(c.get(rc));
                        res = res.concat("\n");
                        break;
                    case 'd':
                        ArrayList<String> d = new ArrayList<>();
                        d.add("DORK");
                        d.add("DREAMY");
                        d.add("DANGEROUS");
                        d.add("DARING");
                        d.add("DARLING");
                        d.add("DAZZLING");
                        d.add("DASHING");
                        d.add("DEADLY");
                        d.add("DEAR");
                        d.add("DECEITFUL");
                        d.add("DEFENSIVE");
                        d.add("DELICATE");
                        int ld = d.size();
                        int rd = r.nextInt(ld);
                        res = res.concat(d.get(rd));
                        res = res.concat("\n");
                        break;
                    case 'e':
                        ArrayList<String> e = new ArrayList<>();
                        e.add("ELEGANT");
                        e.add("EAGER");
                        e.add("ERNEST");
                        e.add("EASY-GOING");
                        e.add("EMOTIONAL");
                        e.add("ENTHUSIASTIC");
                        e.add("ENTERTAINING");
                        int le = e.size();
                        int re = r.nextInt(le);
                        res = res.concat(e.get(re));
                        res = res.concat("\n");
                        break;
                    case 'f':
                        ArrayList<String> f = new ArrayList<>();
                        f.add("FAMOUS");
                        f.add("FABULOUS");
                        f.add("FUNNY");
                        f.add("FANTASTIC");
                        f.add("FANCY");
                        f.add("FEARLESS");
                        int lf = f.size();
                        int rf = r.nextInt(lf);
                        res = res.concat(f.get(rf));
                        res = res.concat("\n");
                        break;
                    case 'g':
                        ArrayList<String> g = new ArrayList<>();
                        g.add("GORGEOUS");
                        g.add("GENTLE");
                        g.add("GENEROUS");
                        g.add("GREAT FRIEND");
                        g.add("GRAND PERSONA");
                        int lg = g.size();
                        int rg = r.nextInt(lg);
                        res = res.concat(g.get(rg));
                        res = res.concat("\n");
                        break;
                    case 'h':
                        ArrayList<String> h = new ArrayList<>();
                        h.add("HANDSOME");
                        h.add("HELPFUL");
                        h.add("HAPPY");
                        h.add("HAPPY-GO-LUCKY");
                        h.add("HEARTY");
                        h.add("HIGH");
                        h.add("HOT");
                        int lh = h.size();
                        int rh = r.nextInt(lh);
                        res = res.concat(h.get(rh));
                        res = res.concat("\n");
                        break;
                    case 'i':
                        ArrayList<String> i = new ArrayList<>();
                        i.add("IDEAL");
                        i.add("IGNORANT");
                        i.add("INTELLIGENT");
                        i.add("IMPORTANT");
                        i.add("IMMUNE");
                        i.add("INNOCENT");
                        i.add("INSTRUCTIVE");
                        int li = i.size();
                        int ri = r.nextInt(li);
                        res = res.concat(i.get(ri));
                        res = res.concat("\n");
                        break;
                    case 'j':
                        ArrayList<String> j = new ArrayList<>();
                        j.add("JOKER");
                        j.add("JEALOUS");
                        j.add("JOLLY");
                        j.add("JUDICIOUS");
                        int lj = j.size();
                        int rj = r.nextInt(lj);
                        res = res.concat(j.get(rj));
                        res = res.concat("\n");
                        break;
                    case 'k':
                        ArrayList<String> k = new ArrayList<>();
                        k.add("KEEN");
                        k.add("KIND");
                        k.add("KLUTZ");
                        k.add("KNOWLEDGEABLE");
                        int lk = k.size();
                        int rk = r.nextInt(lk);
                        res = res.concat(k.get(rk));
                        res = res.concat("\n");
                        break;
                    case 'l':
                        ArrayList<String> l = new ArrayList<>();
                        l.add("LAME");
                        l.add("LIVELY");
                        l.add("LEADING");
                        l.add("LAZY");
                        l.add("LIKEABLE");
                        l.add("LONELY");
                        l.add("LOVABLE");
                        int ll = l.size();
                        int rl = r.nextInt(ll);
                        res = res.concat(l.get(rl));
                        res = res.concat("\n");
                        break;
                    case 'm':
                        ArrayList<String> m = new ArrayList<>();
                        m.add("MOTHERLY");
                        m.add("MADDENING");
                        m.add("MERRY");
                        m.add("MACHO");
                        m.add("MAGNIFICENT");
                        m.add("MAJESTIC");
                        m.add("MERCIFUL");
                        int lm = m.size();
                        int rm = r.nextInt(lm);
                        res = res.concat(m.get(rm));
                        res = res.concat("\n");
                        break;
                    case 'n':
                        ArrayList<String> n = new ArrayList<>();
                        n.add("NEAT");
                        n.add("NAIVE");
                        n.add("NAUGHTY");
                        n.add("NERVOUS");
                        n.add("NICE");
                        int ln = n.size();
                        int rn = r.nextInt(ln);
                        res = res.concat(n.get(rn));
                        res = res.concat("\n");
                        break;
                    case 'o':
                        ArrayList<String> o = new ArrayList<>();
                        o.add("OBEDIENT");
                        o.add("OPTIMISTIC");
                        o.add("OBLIVIOUS");
                        int lo = o.size();
                        int ro = r.nextInt(lo);
                        res = res.concat(o.get(ro));
                        res = res.concat("\n");
                        break;
                    case 'p':
                        ArrayList<String> p = new ArrayList<>();
                        p.add("PASSIONATE");
                        p.add("PEACEFUL");
                        p.add("PATHETIC");
                        p.add("PERFECT");
                        p.add("PRETTY");
                        int lp = p.size();
                        int rp = r.nextInt(lp);
                        res = res.concat(p.get(rp));
                        res = res.concat("\n");
                        break;
                    case 'q':
                        ArrayList<String> q = new ArrayList<>();
                        q.add("QUEEN");
                        q.add("QUIET");
                        q.add("QUAINT");
                        int lq = q.size();
                        int rq = r.nextInt(lq);
                        res = res.concat(q.get(rq));
                        res = res.concat("\n");
                        break;
                    case 'r':
                        ArrayList<String> r1 = new ArrayList<>();
                        r1.add("RICH");
                        r1.add("RARE");
                        r1.add("REALISTIC");
                        r1.add("REASONABLE");
                        r1.add("RELIABLE");
                        r1.add("ROMANTIC");
                        r1.add("ROYAL");
                        int lr = r1.size();
                        int rr = r.nextInt(lr);
                        res = res.concat(r1.get(rr));
                        res = res.concat("\n");
                        break;
                    case 's':
                        ArrayList<String> s = new ArrayList<>();
                        s.add("SUNSHINE");
                        s.add("SANE");
                        s.add("SARCASTIC");
                        s.add("SCHOLAR");
                        s.add("SECRETIVE");
                        s.add("SHAMELESS");
                        s.add("SURPRISING");
                        s.add("SMART");
                        s.add("SOCIABLE");
                        s.add("SINCERE");
                        s.add("SIMPLE");
                        s.add("SKINNY");
                        s.add("SLEEPY");
                        s.add("STUDIOUS");
                        int ls = s.size();
                        int rs = r.nextInt(ls);
                        res = res.concat(s.get(rs));
                        res = res.concat("\n");
                        break;
                    case 't':
                        ArrayList<String> t = new ArrayList<>();
                        t.add("TINY");
                        t.add("TALENTED");
                        t.add("TALL");
                        t.add("TALKATIVE");
                        t.add("TEDIOUS");
                        t.add("TERRIBLE");
                        t.add("TERRIFIC");
                        t.add("THOUGHTFUL");
                        t.add("THREATENING");
                        t.add("TRUSTWORTHY");
                        int lt = t.size();
                        int rt = r.nextInt(lt);
                        res = res.concat(t.get(rt));
                        res = res.concat("\n");
                        break;
                    case 'u':
                        ArrayList<String> u = new ArrayList<>();
                        u.add("UGLY");
                        u.add("ULTIMATE");
                        u.add("UNBIASED");
                        u.add("UNDERSTANDING");
                        u.add("UNIQUE");
                        int lu = u.size();
                        int ru = r.nextInt(lu);
                        res = res.concat(u.get(ru));
                        res = res.concat("\n");
                        break;
                    case 'v':
                        ArrayList<String> v1 = new ArrayList<>();
                        v1.add("VERSATILE");
                        v1.add("VAGABOND");
                        v1.add("VALUABLE");
                        v1.add("VICTORIOUS");
                        v1.add("VIRTUOUS");
                        int lv = v1.size();
                        int rv = r.nextInt(lv);
                        res = res.concat(v1.get(rv));
                        res = res.concat("\n");
                        break;
                    case 'w':
                        ArrayList<String> w = new ArrayList<>();
                        w.add("WANDERER");
                        w.add("WARMHEARTED");
                        w.add("WATCHFUL");
                        w.add("WEALTHY");
                        w.add("WEIRD");
                        w.add("WILD");
                        int lw = w.size();
                        int rw = r.nextInt(lw);
                        res = res.concat(w.get(rw));
                        res = res.concat("\n");
                        break;
                    case 'x':
                        res = res.concat("XENOPHOBIC \n");
                        break;
                    case 'y':
                        ArrayList<String> y = new ArrayList<>();
                        y.add("YOUTHFUL");
                        y.add("YOUNG");
                        y.add("YUMMY");
                        int ly = y.size();
                        int ry = r.nextInt(ly);
                        res = res.concat(y.get(ry));
                        res = res.concat("\n");
                        break;
                    case 'z':
                        ArrayList<String> z = new ArrayList<>();
                        z.add("ZANY");
                        z.add("ZEALOUS");
                        z.add("ZESTY");
                        z.add("ZONKED");
                        int lz = z.size();
                        int rz = r.nextInt(lz);
                        res = res.concat(z.get(rz));
                        res = res.concat("\n");
                        break;
                    case ' ':
                        res = res.concat("\n");
                        break;
                    default:
                        res = "PLEASE ENTER ALPHABETS ONLY";
                }
            }
            tv.setText(res);
            tv.setVisibility(View.VISIBLE);
        }
    }
