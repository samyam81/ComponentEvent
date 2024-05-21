# # Component Event Example

This Java program demonstrates the use of component events in a Swing application. It creates a JFrame with a JTextArea and listens for component resize events. When the frame is resized, the program updates the JTextArea to display the new size of the frame.

## How It Works

- The program creates a JFrame titled "Component Event Example" and a JTextArea.
- The JTextArea is added to the JFrame.
- A ComponentListener is added to the JFrame using the addComponentListener method.
- Inside the ComponentListener, a ComponentAdapter is used to override the componentResized method.
- When the frame is resized, the componentResized method is triggered.
- Inside this method, custom logic is performed to update the JTextArea with the new size of the frame.

## How to Run
1. Compile the Java file `ComponentEventExample.java`.
2. Run the compiled class file `ComponentEventExample.class`.
3. A JFrame window titled "Component Event Example" will appear.
4. Resize the frame by dragging its edges.
5. As you resize the frame, the JTextArea will display the new size of the frame.

Enjoy exploring component events in Swing applications!

