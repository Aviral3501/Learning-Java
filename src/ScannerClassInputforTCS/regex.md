In Java DSA questions, `String.split(regex)` and regex patterns are used a lot for **fast input parsing**, **token extraction**, and **string manipulation**.

Here are the most common regex patterns and practical DSA use-cases you should know.

---

# 1. Split by Multiple Delimiters

```java
String[] arr = s.split("[,;\\s]+");
```

This splits using:

* `,`
* `;`
* spaces/tabs/newlines (`\\s`)

### Example

```java
String s = "10,20;30 40";

String[] arr = s.split("[,;\\s]+");

System.out.println(Arrays.toString(arr));
```

Output:

```java
[10, 20, 30, 40]
```

---

# 2. Split by Spaces

```java
split("\\s+")
```

### Meaning

* `\\s` = whitespace
* `+` = one or more

Useful when input contains multiple spaces.

### Example

```java
String s = "hello    world   java";

String[] arr = s.split("\\s+");
```

Output:

```java
[hello, world, java]
```

---

# 3. Split by Comma with Optional Spaces

Very common in parsing arrays.

```java
split("\\s*,\\s*")
```

### Meaning

* `\\s*` = zero or more spaces
* `,` = comma

### Example

```java
String s = "1, 2,   3,4";

String[] arr = s.split("\\s*,\\s*");
```

Output:

```java
[1, 2, 3, 4]
```

---

# 4. Extract Only Numbers

Pattern:

```java
\\d+
```

### Meaning

* `\\d` = digit (0–9)
* `+` = one or more

Useful in:

* parsing IDs
* extracting integers
* competitive programming

### Example

```java
Pattern p = Pattern.compile("\\d+");
Matcher m = p.matcher("abc123xyz45");

while(m.find()) {
    System.out.println(m.group());
}
```

Output:

```java
123
45
```

---

# 5. Extract Only Words

```java
[a-zA-Z]+
```

### Meaning

* lowercase letters
* uppercase letters
* one or more

### Example

```java
Pattern p = Pattern.compile("[a-zA-Z]+");
Matcher m = p.matcher("abc123Java45");

while(m.find()) {
    System.out.println(m.group());
}
```

Output:

```java
abc
Java
```

---

# 6. Alphanumeric Tokens

```java
[a-zA-Z0-9]+
```

Useful for:

* usernames
* mixed tokens
* identifiers

### Example

```java
Pattern p = Pattern.compile("[a-zA-Z0-9]+");
```

Matches:

```text
abc123
hello99
A1B2
```

---

# 7. Remove Empty Tokens

Very important in DSA parsing.

BAD:

```java
split(",")
```

Problem:

```java
"a,,b".split(",")
```

Output:

```java
[a, , b]
```

BETTER:

```java
split("[,\\s]+")
```

`+` merges consecutive delimiters.

---

# 8. Split Character by Character

```java
split("")
```

### Example

```java
String s = "abcd";

String[] arr = s.split("");
```

Output:

```java
[a, b, c, d]
```

Useful in:

* frequency problems
* permutations
* palindrome questions

---

# 9. Remove Special Characters

```java
replaceAll("[^a-zA-Z0-9]", "")
```

### Meaning

* `^` inside `[]` means NOT

### Example

```java
String s = "a@b#12$c";

System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
```

Output:

```java
ab12c
```

Useful for:

* sanitization
* palindrome ignoring punctuation

---

# 10. Keep Only Digits

```java
replaceAll("\\D", "")
```

### Meaning

* `\\D` = non-digit

### Example

```java
String s = "ph: 987-654";

System.out.println(s.replaceAll("\\D", ""));
```

Output:

```java
987654
```

---

# 11. Keep Only Alphabets

```java
replaceAll("[^a-zA-Z]", "")
```

Useful in:

* string cleaning
* text normalization

---

# 12. Validate Integer

```java
str.matches("-?\\d+")
```

### Meaning

* `-?` = optional minus
* `\\d+` = digits

Checks:

* `123`
* `-45`

---

# 13. Validate Decimal Number

```java
str.matches("-?\\d+(\\.\\d+)?")
```

Matches:

```text
12
-45
3.14
-0.99
```

---

# 14. Binary String Validation

```java
str.matches("[01]+")
```

Useful in bit manipulation problems.

---

# 15. Lowercase Letters Only

```java
str.matches("[a-z]+")
```

Common in:

* hashing
* trie
* frequency array problems

---

# 16. Remove Multiple Spaces

```java
s.replaceAll("\\s+", " ")
```

### Example

```java
"hello     world"
```

↓

```java
"hello world"
```

---

# 17. Reverse Words Problem Trick

```java
String[] words = s.trim().split("\\s+");
```

VERY common LeetCode pattern.

Handles:

* leading spaces
* trailing spaces
* multiple spaces

---

# 18. Tokenize Mixed Input

Input:

```text
12,apple;45 banana
```

Use:

```java
split("[,;\\s]+")
```

Output:

```java
[12, apple, 45, banana]
```

---

# 19. Regex Cheat Sheet

| Regex      | Meaning           |
| ---------- | ----------------- |
| `\\d`      | digit             |
| `\\D`      | non-digit         |
| `\\s`      | whitespace        |
| `\\S`      | non-whitespace    |
| `[a-z]`    | lowercase         |
| `[A-Z]`    | uppercase         |
| `[a-zA-Z]` | letters           |
| `[0-9]`    | digits            |
| `+`        | one or more       |
| `*`        | zero or more      |
| `?`        | optional          |
| `^`        | NOT (inside `[]`) |
| `.`        | any character     |

---

# Most Important DSA Regex Patterns

These are used constantly:

```java
split("\\s+")
split("[,;\\s]+")
replaceAll("\\s+", " ")
replaceAll("[^a-zA-Z0-9]", "")
matches("\\d+")
```

---

# Common Interview/LeetCode Situations

| Problem Type                  | Regex Trick                      |
| ----------------------------- | -------------------------------- |
| Reverse words                 | `trim().split("\\s+")`           |
| Valid number                  | `matches()`                      |
| Clean string                  | `replaceAll()`                   |
| Extract integers              | `\\d+`                           |
| Token parsing                 | `split("[,;\\s]+")`              |
| Ignore punctuation palindrome | `replaceAll("[^a-zA-Z0-9]", "")` |

---

# One Important Java Escape Rule

In Java strings:

```java
"\\d"
```

means regex:

```text
\d
```

Because Java itself uses `\`.

So:

| Want Regex | Write in Java |
| ---------- | ------------- |
| `\d`       | `"\\d"`       |
| `\s+`      | `"\\s+"`      |
| `\.`       | `"\\."`       |

---

# Most Useful Competitive Programming Template

```java
String[] input = line.trim().split("[,;\\s]+");
```

This handles:

* spaces
* tabs
* commas
* semicolons
* multiple delimiters together

Very robust for contests/interviews.
