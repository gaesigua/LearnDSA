# BUBBLE SORT IMPLEMENTATION

my_array = [64, 34, 25, 12, 22, 11, 90, 5]

n = len(my_array);

for i in range(n-1):
    for j in range(n-i-1):
        if(my_array[j] > my_array[j+1]):
            my_array[j], my_array[j+1] = my_array[j+1], my_array[j]

print("Sorted Array: ", my_array)


# The Bubble Sort algorithm can be improved a little bit more.
# Imagine that the array is almost sorted already, with the lowest numbers at the start, like this for example:
# the array will be sorted after the first run, but the Bubble Sort algorithm will continue to run, without swapping elements, and that is not necessary.
# If the algorithm goes through the array one time without swapping any values, the array must be finished sorted, and we can stop the algorithm:

my_array2 = [7, 3, 9, 12, 11]

n = len(my_array2)

for i in range(n-1):

    swapped = False

    for j in range(n-i-1):

        if(my_array2[j] > my_array2[j+1]):

            my_array2[j], my_array2[j+1] = my_array2[j+1], my_array2[j]

            swapped = True

        if not swapped:
            break

    print("Sorted Array: ", my_array2)

