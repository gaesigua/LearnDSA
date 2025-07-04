# The Bubble Sort algorithm can be improved a little bit more.
# Imagine that the array is almost sorted already, with the lowest numbers at the start, like this for example:
# the array will be sorted after the first run, but the Bubble Sort algorithm will continue to run, without swapping elements, and that is not necessary.
# If the algorithm goes through the array one time without swapping any values, the array must be finished sorted, and we can stop the algorithm:

my_array = [7, 3, 9, 12, 11]

n = len(my_array)

for i in range(n-1):

    swapped = False

    for j in range(n-i-1):

        if(my_array[j] > my_array[j+1]):

            my_array[j], my_array[j+1] = my_array[j+1], my_array[j]

            swapped = True

        if not swapped:
            break

    print("Sorted Array: ", my_array)

