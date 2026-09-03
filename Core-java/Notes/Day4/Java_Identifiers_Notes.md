# Java Identifiers —

## Q1. What is an Identifier?

An **identifier** is the *name* given to a programming element.

> A class name, a variable name, and a method name are \*\*technically called identifiers\*\*.

**Simple definition for students:**
"An identifier is the name that programmers give to classes, variables, and methods so that the compiler and other programmers can recognize and refer to them."

\---

## Q2. What happens if we don't provide a name to a class, variable, or method?

If we don't give a name, it leads to a **compile-time error**:

```
<identifier> expected
```

**Teaching point:** Java is strict — every class, variable, and method *must* have a name before it can even compile. There's no such thing as a "nameless" element in Java.

\---

## Q3. Why do we need an Identifier?

We need identifiers for **identifying / finding** a programming element from among other programming elements, so that we can **call and execute** them.

> If there is no name, we cannot call it and we cannot execute it.

**Real-time analogy for class:**
"Imagine a classroom full of students with no names or roll numbers. How would the teacher call on a specific student? Impossible, right? The same applies to Java — without an identifier, the compiler has no way to 'call' a variable, method, or class."

\---

## Diagram Concept (from notes)

```java
class Example {
    int a = 10;
    void m1() { }
}
```

Here:

* `Example` → identifier (class name)
* `a` → identifier (variable name)
* `m1` → identifier (method name)

All three are **arrows pointing to the concept of "Identifier"** — meaning every name used to define these programming elements is an identifier.

### Full Program Example (to write on board / show flow of diagram)

```java
class Example {
    int a = 10;          // 'a' is an identifier (variable)


    void m1() {          // 'm1' is an identifier (method)
        System.out.println("Value of a is: " + a);
    }

    public static void main(String [] args) {
        Example obj = new Example();   // 'obj' is also an identifier
        obj.m1();
    }
}
```

**Output:**

```
Value of a is: 10
```

Point at each name (`Example`, `a`, `m1`, `obj`, `args`, `main`) and say — *"This is an identifier because it names a programming element."*

\---

## The 7 Rules of Identifiers

|#|Rule|
|-|-|
|1|Can contain **letters** `\[a-z or A-Z]`|
|2|Can contain **digits** `\[0-9]`|
|3|Can contain **special characters only** `$` and `\_` (these can also be the **first character**)|
|4|Identifier **must not start with a digit**, but a digit **can be used from the second character onward**|
|5|Identifier **cannot contain any special character except** `$` and underscore `\_`|
|6|Identifier **must not contain spaces**|
|7|**Java is case-sensitive** → `A` and `a` are different (e.g., `Age` ≠ `age`)|

### Quick Valid / Invalid Chart

|Identifier|Valid?|Reason|
|-|-|-|
|`studentName`|✅|Starts with a letter|
|`\_marks`|✅|Starts with underscore|
|`$salary`|✅|Starts with `$`|
|`a1`|✅|Digit used after first character|
|`1a`|❌|Starts with a digit|
|`student name`|❌|Contains space|
|`emp-id`|❌|Contains `-` (not allowed)|
|`Age` vs `age`|Both ✅, but **different**|Case-sensitive|

\---

## Q6. Can we use a keyword as an identifier?

**No.** We **cannot** use a **keyword or reserved word** as a user-defined identifier.

**But** — we **can** use:

* a **predefined class name**
* a **predefined variable name**
* a **predefined method name**

...as a user-defined identifier. This is **not a compile error (not CE)**.

### Example to demonstrate this in class:

```java
class String {   // 'String' is a predefined class name, 
                  // but used here as a user-defined identifier — VALID (No CE)
    public static void main(String\[] args) {
        System.out.println("This works!");
    }
}
```

```java
class Demo {
    public static void main(String\[] args) {
        int class = 10;   // ❌ INVALID — 'class' is a RESERVED KEYWORD, cannot be used
    }
}
```

**Key distinction to emphasize:**

* **Keyword** (e.g., `class`, `int`, `public`, `static`, `void`) → Reserved by Java → **Never allowed** as identifier → Compile Error
* **Predefined name** (e.g., `String`, `System`, `main`) → Just a name Java already uses → **Allowed** to reuse as identifier (though not good practice) → No Compile Error

\---

## Summary Points for Students

1. Identifier = name of a class, variable, or method.
2. No name → Compile-time error (`<identifier> expected`).
3. We need identifiers to identify and call/execute programming elements.
4. 7 Rules: letters, digits, only `$` and `\_` as special characters, can't start with digit, no spaces, case-sensitive.
5. Keywords can NEVER be identifiers. Predefined names CAN be reused as identifiers (no error, but bad practice).

\---

### 

