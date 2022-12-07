package hw20221207;

    public class CustomLinkedList implements CustomList {

        private Node head;
        private Node tail;

        private int size = 0;

        @Override
        public void pushToHead(int data) {
            if (size == 0) {
                head = new Node(data);
                tail = head;
            } else {
                head = new Node(data, head);
            }

            size++;
        }

        @Override
        public void pushToTail(int data) {
            if (size == 0) {
                tail = new Node(data);
                head = tail;
            } else {
                Node node = new Node(data);
                tail.next = node;
                tail = node;
            }

            size++;
        }

        @Override
        public void pushToIndex(int index, int data) {

            if(index == 0){
                this.pushToHead(data);
            }else if(index == this.size){
                this.pushToTail(data);
            } else {
                Node tmp1Node = this.head;
                for (int i = 0; i <= index; i++) {

                    if (i == index) {
                        Node tmpNode  = new Node(data);
                        tmpNode.next = tmp1Node.next;
                        tmp1Node.next = tmpNode;
                    } else {
                        tmp1Node = tmp1Node.next;
                    }
                }
                size++;
            }

        }

        @Override
        public void removeFirst() {

        }

        @Override
        public void removeLast() {

        }

        @Override
        public void remove(int index) {

        }

        @Override
        public int get(int index) {
            Node currentNode = null;

            for (int i = 0; i <= index; i++) {
                if (i == 0) {
                    currentNode = head;
                } else if (currentNode != null) {
                    currentNode = currentNode.getNext();
                }
            }

            if (currentNode == null) {
                throw new RuntimeException();
            }

            return currentNode.getValue();
        }

        @Override
        public void clear() {

        }

        @Override
        public void set(int index, int data) {

        }

        @Override
        public boolean contains(int data) {
            return false;
        }

        @Override
        public int size() { return size; }

        @Override
        public void print() {

        }

        private static class Node {
            private int value;
            private Node next;


            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }

            public Node(int value) {
                this.value = value;
            }

            public int getValue() {
                return value;
            }

            public Node getNext() {
                return next;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public void setNext(Node next) {
                this.next = next;
            }
        }
    }

