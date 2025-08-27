package recursion;

public class TowerOfHanoi {


    static void solution(int n, char a, char b, char c){

        if(n==0)
            return;

        solution(n-1,a,c,b);
        System.out.println(a + "->"+ c);
        solution(n-1,b,a,c);


    }

    public static void main(String[] args) {
        solution(3,'a','b','c');
    }
}
/**
solution(3, a, b, c)
│
        ├── solution(2, a, c, b)
│   │
        │   ├── solution(1, a, b, c)
│   │   │
        │   │   ├── solution(0, a, c, b)  // returns
│   │   ├── print a->c
│   │   └── solution(0, b, a, c)  // returns
│   │
        │   ├── print a->b
│   │
        │   └── solution(1, c, a, b)
│       │
        │       ├── solution(0, c, b, a)  // returns
│       ├── print c->b
│       └── solution(0, a, c, b)  // returns
│
        ├── print a->c
│
        └── solution(2, b, a, c)
    │
            ├── solution(1, b, c, a)
    │   │
            │   ├── solution(0, b, a, c)  // returns
    │   ├── print b->a
    │   └── solution(0, c, b, a)  // returns
    │
            ├── print b->c
    │
            └── solution(1, a, b, c)
        │
                ├── solution(0, a, c, b)  // returns
        ├── print a->c
        └── solution(0, b, a, c)  // returns
 **/
