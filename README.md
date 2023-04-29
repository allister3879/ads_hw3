## Method  'push' - stack

__Definition__ - implementation of method to add element to stack

__Explanation:__  func take element and add to the top of list. Print about successful operation

__Solution__ ->

```java
    public void push(E element) {
        list.add(element); // add element to the top of list
        System.out.println("element "+element+" added");
    }
```
---
## Method  'pop' - stack

__Definition__ - implementation of method to remove element from the top

__Explanation:__  func try get index of last element in list and remove. Return the prev element as a new top element. If catch the exceptions empty stack or index out of bounds print that method unavailable.

__Solution__ ->

```java
    public void pop(){
        try{
        int index = list.getSize()-1; // index of element
        list.remove(index);
        System.out.println("current top: "+list.getElement(list.getSize()-1)); // return top element
        } catch (EmptyStackException emptyStackException){
            System.out.println("the method is no longer available :(");
        }catch (IndexOutOfBoundsException i){
            System.out.println("the method is no longer available :(");
        }
    }
```
---
## Method  peek - stack

__Definition__ - implementation of method to return top element

__Explanation:__  func try return last element in the list. If catch the exceptions print that method unavailable, cause stack is empty.

__Solution__ ->

```java
    public void peek() {
        try{
            System.out.println("current top: "+list.getElement(list.getSize()-1)); // return top element
        } catch (EmptyStackException emptyStackException){
            System.out.println("the method is no longer available :(");
        }catch (IndexOutOfBoundsException i){
            System.out.println("the method is no longer available :(");
        }
    }

```
---
## Method  isEmpty - stack

__Definition__ - implementation of method to check if stack empty

__Explanation:__  func empty() return true if size of stack equals to 0, else return false. Func isEmpty()  print message according to return value.

__Solution__ ->

```java
    public void isEmpty(){
        if(empty())
            System.out.println("stack is empty");
        else
            System.out.println("stack is not empty");  // print result
    }

    private boolean empty(){
        return list.getSize() == 0;
    }
```
---
## Method  size - stack

__Definition__ - implementation of method get number of elements

__Explanation:__  return number of elements.

__Solution__ ->

```java
    public void size(){
        System.out.println("number of elements: "+list.getSize()); // return number of elements
    }
```
---
## Method  'enqueue' - queue

__Definition__ - implementation of method to add element

__Explanation:__  func take element and add to the list and print about successful operation.

__Solution__ ->

```java
    public void enqueue(E element){
        list.add(element); // add element to the list
        System.out.println("element "+element+" added");
    }
```
---
## Method  dequeue - queue

__Definition__ - implementation of method to remove element

__Explanation:__  func try remove the 0th index from queue and print new first element. If catch exceptions print that method is unavailable.

__Solution__ ->

```java
    public void dequeue(){
        try{
        list.remove(0);
        System.out.println("first in queue: "+list.getElement(0));
        } catch (NoSuchElementException noSuchElementException){
            System.out.println("method is no longer available :(");
        }catch (IndexOutOfBoundsException i){
            System.out.println("the method is no longer available :(");
        }
    }
```
---
## Method  peek - queue

__Definition__ - implementation of method get first in queue

__Explanation:__  func try get first element in queue in the index 0 from list. If catch exceptions print that method is unavailable.

__Solution__ ->

```java
    public void peek(){
        try{
            System.out.println("first in queue: "+list.getElement(0));
        } catch (NoSuchElementException noSuchElementException){
            System.out.println("method is no longer available :(");
        }catch (IndexOutOfBoundsException i){
            System.out.println("the method is no longer available :(");
        }
    }
```
---
## Method  isEmpty - queue

__Definition__ - implementation of method check if queue empty

__Explanation:__  if size of list equals to 0 func print queue is empty, else not.

__Solution__ ->

```java
    public void isEmpty(){
        if(list.getSize() == 0)
            System.out.println("queue is empty");
        else
            System.out.println("queue is not empty");
    }
```
---
## Method size - queue 

__Definition__ - implementation of method get size

__Explanation:__  func print number of elements from queue.

__Solution__ ->

```java
    public void size(){
        System.out.println("number of elements: "+ list.getSize());
    }
```
