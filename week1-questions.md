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
