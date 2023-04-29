## Method  'push' - stack

__Definition__ - implementation of method to add element to stack

__Explanation:__  func take element and add to the top of list. Print about succes operation

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
