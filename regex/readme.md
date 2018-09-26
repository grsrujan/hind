
| regex     |  description        |
| ------------- |:-------------:|
| [a-z] | any lowercase character , - within  [] represents range  |
| [A-Z] | any lowercase character  , - within  [] represents range |
| [0-9] | any digit  |
|\d | Matches any decimal digit; this is equivalent to the class d[0-9]c. |
|\D | Matches any non-digit character; this is equivalent to the class [^0-9]. |
|\s | Matches any whitespace character; this is equivalent to the class d[ \t\n\r\f\v]c. |
|\S | Matches any non-whitespace character; this is equivalent to the class [^ \t\n\r\f\v]. |
|\w | Matches any alphanumeric character; this is equivalent to the class d[a-zA-Z0-9 ]c. |
|\W | Matches any non-alphanumeric character; this is equivalent to the class [^a-zA-Z0-9_]. |
|\b| word boundary |
|\B| not word boundary |
| \< | start of word |
| \> | end of word |
| + | one or more characters |
| * | zero or more characters |
| ? | zero or one character |
| . | Any character except new line  |
| ^  | start of line  |
| $ | end of line  |
| [^..]  | doesnot start with   |
| (..) | capturing groups |
| \\. | escape period |
| \| | or in alternation |

Metacharacters( ^ , [  , . ,$,{,*,(,\,+,),|,?,<,>)
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


non-greedy qualifiers d*?c, d+?c, d??c, or d{m,n}?c,

