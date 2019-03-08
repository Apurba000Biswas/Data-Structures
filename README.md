# Data-Structures

### List
1. ArrayList
2. LinkedList

#### (1) ArrayList
##### Key points:
  - Resizable
  - Allow retrieving elements by their index
  - Orderd collection
  - Allows Duplicate and null values

##### Trade Off:
  - Dose not support inserting data in the middle of the list
  - Dose not support primitive types

##### [Details and Methods](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

#### (2) LinkedList
##### Key points:
  - Almost like ArrayList
  - Internally way of storing data is different
  - It store an object called "nodes" which connect each other and form a chain
  - Allow inserting data in the middle of the list

##### Trade Off:
  - Uses more overall memory than a ArrayList
  - Slower when looking up a value in a random index

##### [Details and Methods](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html)

#### List Example: [ArrayList vs LinkedList](https://github.com/Apurba000Biswas/Data-Structures/blob/master/src/practise_set_1/ListExample.java)