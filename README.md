# Java TreeMap Practice

This small Java program demonstrates how `java.util.TreeMap` works with both `Integer` and `String` keys. It focuses on key properties such as natural sorting of keys, handling of duplicate keys, and storage of key–value pairs.

## Description

The program contains:

- `class y` with two static methods:
  - `display()` (note: in your code named `dispaly()`) uses a `TreeMap<Integer, Integer>` to show:
    - How integer keys are stored in **sorted order**
    - What happens when the same key is inserted multiple times
  - `output()` uses a `TreeMap<String, Integer>` to show:
    - Natural alphabetical ordering of string keys
    - Overwriting values when duplicate string keys are used
- `public class treemap` with `main()` that calls both methods and prints the maps to the console.

This is a simple console example meant for collections revision and interview preparation.

## What the Code Demonstrates

1. **Natural ordering of keys**

   `TreeMap` automatically stores keys in ascending order:
   - Integer keys: `1, 2, 3, 4, 6, 8`
   - String keys: `"a", "b", "c", ... "h"`

2. **Duplicate keys overwrite values**

   When you do:
a.put(1, 2);
a.put(1, 2);
a.put(2, 2);
a.put(2, 3);the last value for key `1` or `2` is kept, earlier values are overwritten.

3. **TreeMap does not allow `null` keys**

The commented lines with `a.put(null, null);` indicate that using a `null` key in `TreeMap` will throw a `NullPointerException`.

4. **Iteration order is not insertion order**

Even though values are inserted in a certain order, printing the map shows them sorted by key.

## How to Run

1. Ensure you have Java (JDK) installed and configured in your system `PATH`.
2. Create a package folder structure:

- Project folder:
  - `src/collections/treemap.java`

3. Put this code in `treemap.java` (keeping `package collections;` at the top).
4. From the project root, compile and run:


5. Check the console output to understand how the map stores and prints the data.

## Possible Improvements

- Rename `y` to a meaningful name like `TreeMapDemo`.
- Fix the typo `dispaly()` → `display()`.
- Add comments printing explanations before each map output.
- Add more examples:
- Using `TreeMap` with custom comparator.
- Iterating using `entrySet()`, `keySet()`, and `values()`.
- Demonstrating methods like `firstKey()`, `lastKey()`, `higherKey()`, `lowerKey()`.
