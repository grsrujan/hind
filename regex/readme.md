Metacharacters
---

repetition metacharacters(.,*,+)
.
+
*

Metasequence
---
{min,max}


character classes []
---
[rm]ohit - it checks for either rohit or mohit

character class metacharacter - (hyphen) --> indicates range of characters

12[a-z] will match with any one of 12a,12c,12f,12z

[0-9a-zA-Z] --> matches any number, uppercase letters,lower case letters  
[0-9a-z.?_] --> matches any number, lowercase letters, underscore,period,question mark

Negated character class [^]

Adding caret inside character class will behave differently
[^a-z] --> excludes characters from a to z


alternation |
---

```(ro|mo)hit```

```vi(rat|kram)```

A character class can match only single character whereas in alternation we can specify multiple characters  

```[rm]ohit    vs (ro|mo)hit or vi(rat|kram)```


If we are trying to extract date from a file we can use   

```(December|Dec)(thirty first|31 (st)?)```
 
Anchor
---
start and end of the line
^ (caret), $(dollar) - checks for matches in position rather than real text characters

^virat - matches a line which would start with virat

virat$ - matches  a line if it ends with virat


grouping
---

Escaping
---
 
 
greediness
---


