# Linked List

My own implementation of the linked list data structure using java. Right now it only supports integers.

## References


<details><summary><span style="font-size: 1.2em; font-weight: bold;">Singly Linked List</span></summary>


For example purposes we will consider this as "exampleList" : 

    {12, 34, 52, 16, 9, 29}

---

<details>
<summary><strong>getFirst()</strong></summary>

> Gets the value of the first node.

**Returns :** *int*

**Args :** *None*

**Example :**

    exampleList.getFirst();

*Return value:*

    12    

</details>

---

<details>
<summary><strong>getLast()</strong></summary>

> Gets the value of the last node.

**Returns :** *int*

**Args :** *None*

**Example : **

    exampleList.getLast();

*Return value:*

    29

</details>

---

<details>
<summary><strong>get(int index)</strong></summary>

> Gets the value of the node with a given index.

**Returns :** *int*

**Args :** *index (int)*

**Example :**

    exampleList.get(3);

*Return value:*

    16

</details>

---

<details>
<summary><strong>addFirst(int value)</strong></summary>

> Adds a node with a given value to the front of the list.

**Returns :** *None*

**Args :** *value (int)*

**Example :**

    exampleList.addFirst(72);

*Updated exampleList:*

    {72, 12, 34, 52, 16, 9, 29}

</details>

---

<details>
<summary><strong>add(int value)</strong></summary>

> Adds a node with a given value to the end of the list.

**Returns :** *None*

**Args :** *value (int)*

**Example :**

    exampleList.add(72);

*Updated exampleList:*

    {12, 34, 52, 16, 9, 29, 72}

</details>

---

<details>
<summary><strong>insertAt(int index, int value)</strong></summary>

> Inserts a node with a given value between two other nodes according to a given index.

**Returns :** *None*

**Args :** *index (int), value (int)*

**Example :**

    exampleList.insertAt(2, 23);

*Updated exampleList:*

    {12, 34, 23, 52, 16, 9, 29}

</details>

---

<details>
<summary><strong>addAll(List&lt;int&gt; values)</strong></summary>

> Adds a collection of values to the end of the list.

**Returns :** *None*

**Args :** *values (List<int>)*

**Example :**

    List<int> listToAdd = new ArrayList<>(45, 67, 81);

    exampleList.addAll(listToAdd);

*Updated exampleList:*

    {12, 34, 52, 16, 9, 29, 45, 67, 81}

</details>

---

<details>
<summary><strong>isEmpty()</strong></summary>

> Checks whether a list is empty or not.

**Returns :** *boolean*

**Args :** *None*

**Example :**

    exampleList.isEmpty();

*Return value:*

    false

</details>

---

<details>
<summary><strong>size()</strong></summary>

> Gets the size (amount of values) inside the list.

**Returns :** *integer*

**Args :** *None*

**Example :**

    exampleList.size();

*Return value:*

    6

</details>

---

<details>
<summary><strong>cloneList()</strong></summary>

> Creates a deep copy of the list.

**Returns :** *SinglyLinkedList*

**Args :** *None*

**Example :**

    exampleList.cloneList();

*Return value:*

    SinglyLinkedList

</details>

---

<details>
<summary><strong>contains(int value)</strong></summary>

> Checks whether a given value is inside the list.

**Returns :** *boolean*

**Args :** *value (int)*

**Example :**

    exampleList.contains(9);

*Return value:*

    true

</details>

---

<details>
<summary><strong>indexOf(int value)</strong></summary>

> Gets the index of a given value inside the list.

**Returns :** *int*

**Args :** *value (int)*

**Example :**

    exampleList.indexOf(16);

*Return value:*

    3

</details>

---

<details>
<summary><strong>remove(int value)</strong></summary>

>Removes a given value from the list.

**Returns :** *None*

**Args :** *value (int)*

**Example :**

    exampleList.remove(52);

*Updated exampleList:*

    {12, 34, 16, 9, 29}

</details>

---

<details>
<summary><strong>removeAt(int index)</strong></summary>

> Removes a value at a given index from the list.

**Returns :** *None*

**Args :** *index (int)*

**Example :**

    exampleList.removeAt(0);

*Updated exampleList:*

    {34, 52, 16, 9, 29}

</details>

---

<details>
<summary><strong>print()</strong></summary>

> Prints all values of the list.

**Returns :** *None*

**Args :** *None*

**Example :**

    exampleList.print()

*Output:*

    12, 34, 52, 16, 9, 29,

</details>

</details>



