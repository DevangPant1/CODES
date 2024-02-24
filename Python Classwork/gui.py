import tkinter as tk

# Create the main window
root = tk.Tk()

# Set the window title and size
root.title("Happy Birthday")
root.geometry("400x400")

# Create a label to display the text
label = tk.Label(root, text="HAPPY BIRTHDAY", font=("Arial", 40))

# Place the label in the center of the window
label.place(relx=0.5, rely=0.5, anchor=tk.CENTER)

# Start the GUI main loop
root.mainloop()
