Almost correct — the key idea is:

> `nextInt()`, `nextDouble()`, etc. do NOT consume the newline (`\n`)
> but `nextLine()` DOES consume the whole line.

That’s why you sometimes need an extra `nextLine()`.

---

# The Problem

Suppose input is:

```text id="db5v8j"
5
hello world
```

and code is:

```java id="5p85p7"
Scanner sc = new Scanner(System.in);

int x = sc.nextInt();
String s = sc.nextLine();

System.out.println(s);
```

Output:

```text id="eyrtr7"
```

(empty string)

---

# Why?

After:

```java id="w1rmko"
nextInt()
```

scanner reads:

```text id="k6f5cl"
5
```

BUT leaves:

```text id="oh6mlz"
\n
```

(newline) in buffer.

Then:

```java id="0a8mjlwm"
nextLine()
```

immediately consumes that leftover newline.

So actual `"hello world"` never gets read.

---

# Correct Fix

```java id="dd0d7g"
int x = sc.nextInt();
sc.nextLine(); // consume leftover newline

String s = sc.nextLine();
```

---

# Important Rule

| Method         | Leaves newline? |
| -------------- | --------------- |
| `nextInt()`    | YES             |
| `nextDouble()` | YES             |
| `next()`       | YES             |
| `nextLong()`   | YES             |
| `nextLine()`   | NO              |

---

# When You Need Extra `nextLine()`

ONLY when switching from:

```text id="l51cda"
nextInt()/next()/nextDouble()
```

TO:

```text id="v8ol3s"
nextLine()
```

---

# Example 1 (Needs Fix)

```java id="89jlwm"
int n = sc.nextInt();
String line = sc.nextLine();
```

Needs:

```java id="wjlwmc"
sc.nextLine();
```

between them.

---

# Example 2 (No Fix Needed)

```java id="vbjlwm"
String a = sc.nextLine();
String b = sc.nextLine();
```

Perfect already.

No extra call needed.

Because `nextLine()` fully consumes line.

---

# Example 3 (No Fix Needed)

```java id="sjlwmx"
int a = sc.nextInt();
int b = sc.nextInt();
```

No issue.

Because both are token-based methods.

---

# Easy Mental Model

---

## Token methods

These read only ONE token:

```java id="jlwm64"
nextInt()
next()
nextDouble()
nextLong()
```

They stop BEFORE newline.

---

## Line method

```java id="jlwm0a"
nextLine()
```

Reads EVERYTHING until newline and consumes newline too.

---

# Your Case

You had:

```java id="jlwmow"
int T = sc.nextInt();

for(...) {
    sc.nextLine();
    String inputLine = sc.nextLine();
}
```

This is wrong because:

* first iteration consumes leftover newline correctly
* later iterations accidentally skip actual input lines

---

# Correct Version

```java id="jlwmxk"
int T = sc.nextInt();
sc.nextLine();

for(...) {
    String inputLine = sc.nextLine();
}
```

Only ONE cleanup needed after `nextInt()`.

---

# Golden Rule for Interviews/CP

If using `nextLine()` after numeric input:

```java id="jlwmh1"
sc.nextLine();
```

once before reading the line.
