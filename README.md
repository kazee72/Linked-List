# Linked List

My own implementation of the linked list data structure using java. Right now it only supports integers.

## References

## Singly Linked List

This linked list is singly linked, meaning each node only points to the next one.<br>
When initializing the list it can take an initial list of integers that get added to the list in the constructor.<br>
When the initial list is not provided the list is considered empty but is initialized with a head / tail that are null.

---

<details><summary><span style="font-size: 1.5em; font-weight: bold;">Node</span></summary>

The Node class consists of a value and a pointer to the next Node.<br>
Each node object represents a single element in the list.<br>
A tail node points to null. If a node's next is null, it is considered the tail.

The following methods exist for each node:

<details>
<summary>getValue()</summary>

*Gets the value of the node.*

- **Returns:** *int*
- **Args:** *None*
</details>

<details>
<summary>getNext()</summary>

*Gets the next node.*

- **Returns:** *Node*
- **Args:** *None*
</details>

<details>
<summary>setNext(Node next)</summary>

*Sets the next node.*

- **Returns:** *None*
- **Args:** *next (Node)*
</details>



</details>

---

<details><summary><span style="font-size: 1.5em; font-weight: bold;">Methods</span></summary>

---

For example purposes we will consider:
```java
List<Integer> initialValues = new ArrayList<>(Arrays.asList(12,34,52,16,9,29));

SinglyLinkedList exampleList = new SinglyLinkedList(initialValues);
```
So exampleList is:
```java
{12, 34, 52, 16, 9, 29}
```
---

<details>
<summary><strong>getFirst()</strong></summary>

*Gets the value of the first node.*

- **Returns:** *int*

- **Args:** *None*

**Example:**
```java
exampleList.getFirst();
```
*Return value:*
```java
12
```

**Exceptions:**

*If the list is empty the method returns ```-1```.*
</details>

---

<details>
<summary><strong>getLast()</strong></summary>

*Gets the value of the last node.*

- **Returns:** *int*

- **Args:** *None*

**Example:**
```java
exampleList.getLast();
```
*Return value:*
```java
29
```

**Exceptions:**

*If the list is empty the method returns ```-1```.*
</details>

---

<details>
<summary><strong>get(int index)</strong></summary>

*Gets the value of the node with a given index.*

- **Returns:** *int*

- **Args:** *index (int)*

**Example:**
```java
exampleList.get(3);
```
*Return value:*
```java
16
```

**Exceptions:**

*If the list is empty or the index is invalid the method returns ```-1```.*
</details>

---

<details>
<summary><strong>addFirst(int value)</strong></summary>

*Adds a node with a given value to the front of the list.*

- **Returns:** *None*

- **Args:** *value (int)*

**Example:**
```java
exampleList.addFirst(72);
```
*Updated exampleList:*
```java
{72, 12, 34, 52, 16, 9, 29}
```

**Exceptions:**

*None*
</details>

---

<details>
<summary><strong>add(int value)</strong></summary>

*Adds a node with a given value to the end of the list.*

- **Returns:** *None*

- **Args:** *value (int)*

**Example:**
```java
exampleList.add(72);
```
*Updated exampleList:*
```java
{12, 34, 52, 16, 9, 29, 72}
```

**Exceptions:**

*None*
</details>

---

<details>
<summary><strong>insertAt(int index, int value)</strong></summary>

*Inserts a node with a given value between two other nodes according to a given index.*

- **Returns:** *None*

- **Args:** *index (int), value (int)*

**Example:**
```java
exampleList.insertAt(2, 23);
```
*Updated exampleList:*
```java
{12, 34, 23, 52, 16, 9, 29}
```

**Exceptions:**

*If the index is invalid, the method performs no action.*
</details>

---

<details>
<summary><strong>addAll(List&lt;Integer&gt; values)</strong></summary>

*Adds a collection of values to the end of the list.*

- **Returns:** *None*

- **Args:** *values (List<Integer>)*

**Example:**
```java
List<Integer> listToAdd = new ArrayList<>(Arrays.asList(45, 67, 81));

exampleList.addAll(listToAdd);
```
*Updated exampleList:*
```java
{12, 34, 52, 16, 9, 29, 45, 67, 81}
```

**Exceptions:**

*None*
</details>

---

<details>
<summary><strong>isEmpty()</strong></summary>

*Checks whether a list is empty or not.*

- **Returns:** *boolean*

- **Args:** *None*

**Example:**
```java
exampleList.isEmpty();
```
*Return value:*
```java
false
```

**Exceptions:**

*None*
</details>

---

<details>
<summary><strong>size()</strong></summary>

*Gets the size (amount of values) inside the list.*

- **Returns:** *integer*

- **Args:** *None*

**Example:**
```java
exampleList.size();
```
*Return value:*
```java
6
```

**Exceptions:**

*None*
</details>

---

<details>
<summary><strong>cloneList()</strong></summary>

*Creates a deep copy of the list.*

- **Returns:** *SinglyLinkedList*

- **Args:** *None*

**Example:**
```java
exampleList.cloneList();
```
*Return value:*
```java
SinglyLinkedList {12, 34, 52, 16, 9, 29}
```

**Exceptions:**

*None*
</details>

---

<details>
<summary><strong>contains(int value)</strong></summary>

*Checks whether a given value is inside the list.*

- **Returns:** *boolean*

- **Args:** *value (int)*

**Example:**
```java
exampleList.contains(9);
```
*Return value:*
```java
true
```

**Exceptions:**

*None*
</details>

---

<details>
<summary><strong>indexOf(int value)</strong></summary>

*Gets the index of a given value inside the list.*

- **Returns:** *int*

- **Args:** *value (int)*

**Example:**
```java
exampleList.indexOf(16);
```
*Return value:*
```java
3
```

**Exceptions:**

*If the value is not in the list the method returns ```-1```.*
</details>

---

<details>
<summary><strong>remove(int value)</strong></summary>

*Removes a node with a given value from the list.*

- **Returns:** *None*

- **Args:** *value (int)*

**Example:**
```java
exampleList.remove(52);
```
*Updated exampleList:*
```java
{12, 34, 16, 9, 29}
```

**Exceptions:**

*If the list is empty or no node with the given value was found, the method performs no action.*
</details>

---

<details>
<summary><strong>removeAt(int index)</strong></summary>

*Removes a value at a given index from the list.*

- **Returns:** *None*

- **Args:** *index (int)*

**Example:**
```java
exampleList.removeAt(0);
```
*Updated exampleList:*
```java
{34, 52, 16, 9, 29}
```

**Exceptions:**

*If the list is empty or the index is invalid, the method performs no action.*
</details>

---

<details>
<summary><strong>print()</strong></summary>

*Prints all values of the list.*

- **Returns:** *None*

- **Args:** *None*

**Example:**
```java
exampleList.print();
```
*Output:*
```java
12, 34, 52, 16, 9, 29,
```

**Exceptions:**

*None*
</details>

</details>



