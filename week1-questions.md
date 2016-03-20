Lecture 1.3
===========
### def constOne(x: Int, y: => Int) = 1
evaluate this

```
constOne(1+2,loop)
 constOne(3,loop)
 1
```

```
constOne(loop, 1+2)
 constOne(loop, 1+2) //this loops
```

### if (b) e1 else e2
```
if (true) e1 else e2 --> e1
if (false) e1 else e2 ---> e2
```

Lecture 1.6
===========
```
val x = 0           //0
def (f: Int) = y + 1
val result = {
 val x = f(3)      // 3 +1 = 4
 x * x             // 4 * 4 = 16
} + x              // 16 + 0 = 16
```
