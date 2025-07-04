# MANUAL RUN THROUGH

# Before we implement the Selection Sort algorithm in a programming language, let's manually run through a short array only one time, just to get the idea.

# Step 1: We start with an unsorted array.

# [ 7, 12, 9, 11, 3]

# Step 2: Go through the array, one value at a time. Which value is the lowest? 3, right?

# [ 7, 12, 9, 11, 3]

# Step 3: Move the lowest value 3 to the front of the array.

# [ 3, 7, 12, 9, 11]
# Step 4: Look through the rest of the values, starting with 7. 7 is the lowest value, and already at the front of the array, so we don't need to move it.

# [ 3, 7, 12, 9, 11]
# Step 5: Look through the rest of the array: 12, 9 and 11. 9 is the lowest value.

# [ 3, 7, 12, 9, 11]
# Step 6: Move 9 to the front.

# [ 3, 7, 9, 12, 11]
# Step 7: Looking at 12 and 11, 11 is the lowest.

# [ 3, 7, 9, 12, 11]
# Step 8: Move it to the front.

# [ 3, 7, 9, 11, 12]
# Finally, the array is sorted.


# SELECTION SORT IMPLEMENTATION

my_array = [64, 34, 25, 5, 22, 11, 90, 12]

n = len(my_array)

for i in range(n-1):

    min_index = i

    for j in range(i+1, n):
            if my_array[j] < my_array[min_index]:

                min_index = j
    min_value = my_array.pop(min_index)
    my_array.insert(i, min_value)

print("My Array is: ", my_array)



