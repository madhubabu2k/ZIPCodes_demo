# ZIPCodes_demo

Runtime Complexity
Linear, O(n)


Memory Complexity
O(n), worst case (Any non-overlapping elements in the array)

Here is the approach that we are following.

List of Zipcodes is given, and we'll keep merged zipcodes in output list
For each zipcode interval in the input list

if the input zipcode  interval is overlapping with the last interval in output list then we'll merge these two intervals and update last interval of output list with merged zip codes
otherwise, we'll add input interval to the output list.
