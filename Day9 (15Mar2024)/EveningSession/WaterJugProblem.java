public class WaterJugProblem {
    static final int MAX_SIZE = 100;
    static State[] stack = new State[MAX_SIZE];
    static int top = -1;
    static boolean[][] visited = new boolean[6][4]; // visited states for jug1 and jug2 capacities

    public static void main(String[] args) {
        int jug1Capacity = 5;
        int jug2Capacity = 3;
        int targetAmount = 4;

        push(new State(0, 0, ""));

        while (top != -1) {
            State currentState = pop();

            if (currentState.jug1 == targetAmount || currentState.jug2 == targetAmount) {
                System.out.println("");
                currentState.printPath();
                break;
            }
            else{
                System.out.println("Path to solution: ");
                currentState.printPath();
            }

            // Fill jug1
            if (currentState.jug1 < jug1Capacity && !visited[jug1Capacity][currentState.jug2]) {
                push(new State(5, currentState.jug2, "Fill jug1"));
                visited[currentState.jug1][currentState.jug2] = true;
            }

            // Fill jug2
            if (currentState.jug2 < jug2Capacity && !visited[currentState.jug1][jug2Capacity]) {
                push(new State(currentState.jug1, 3, "Fill jug2"));
                visited[currentState.jug1][currentState.jug2] = true;
            }

            // Empty jug1
            if (currentState.jug1 > 0 && !visited[0][currentState.jug2]) {
                push(new State(0, currentState.jug2, "Empty jug1"));
                visited[currentState.jug1][currentState.jug2] = true;
            }

            // Empty jug2
            if (currentState.jug2 > 0 && !visited[currentState.jug1][0]) {
                push(new State(currentState.jug1, 0, "Empty jug2"));
                visited[currentState.jug1][currentState.jug2] = true;
            }

            // Pour from jug1 to jug2
            if (currentState.jug1 > 0 && currentState.jug2 < jug2Capacity) {
                int amountToPour = Math.min(currentState.jug1, jug2Capacity - currentState.jug2);
                State newState = new State(currentState.jug1 - amountToPour, currentState.jug2 + amountToPour, "Pour from jug1 to jug2");
                if (!visited[newState.jug1][newState.jug2]) {
                    push(newState);
                    visited[currentState.jug1][currentState.jug2] = true;
                }
            }

            // Pour from jug2 to jug1
            if (currentState.jug2 > 0 && currentState.jug1 < jug1Capacity) {
                int amountToPour = Math.min(currentState.jug2, jug1Capacity - currentState.jug1);
                State newState = new State(currentState.jug1 + amountToPour, currentState.jug2 - amountToPour, "Pour from jug2 to jug1");
                if (!visited[newState.jug1][newState.jug2]) {
                    push(newState);
                    visited[currentState.jug1][currentState.jug2] = true;
                }
            }
        }
    }

    public static void push(State state) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = state;
    }

    public static State pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return null;
        }
        return stack[top--];
    }
}

class State {
    int jug1;
    int jug2;
    String action;
    State prevState;

    public State(int jug1, int jug2, String action) {
        this.jug1 = jug1;
        this.jug2 = jug2;
        this.action = action;
    }

    public void printPath() {
        if (prevState != null) {
            prevState.printPath();
        }
        System.out.println("(" + jug1 + ", " + jug2 + ") - " + action);
    }
}
