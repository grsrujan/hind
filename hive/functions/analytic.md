# cume_dist()  
# dense_rank() OVER([partition_by_clause] order_by_clause)  
Returns an ascending sequence of integers, starting with 1. The output sequence produces duplicate integers for duplicate values of the ORDER BY expressions.
# first_value(expr) OVER([partition_by_clause] order_by_clause [window_clause])  
Returns the expression value from the first row in the window. The return value is NULL if the input expression is NULL.
# lag(expr [, offset] [, default]) OVER ([partition_by_clause] order_by_clause)  
This function returns the value of an expression using column values from a preceding row. You specify an integer offset, which designates a row position some number of rows previous to the current row. Any column references in the expression argument refer to column values from that prior row.
# last_value(expr) OVER([partition_by_clause] order_by_clause [window_clause])  
Returns the expression value from the last row in the window. The return value is NULL if the input expression is NULL.
# lead(expr [, offset] [, default]) OVER([partition_by_clause] order_by_clause)  
This function returns the value of an expression using column values from a following row. You specify an integer offset, which designates a row position some number of rows after to the current row. Any column references in the expression argument refer to column values from that later row.
# ntile()  
# percent_rank()  
# rank() OVER([partition_by_clause] order_by_clause)  
Returns an ascending sequence of integers, starting with 1. The output sequence produces duplicate integers for duplicate values of the ORDER BY expressions. After generating duplicate output values for the "tied" input values, the function increments the sequence by the number of tied values.
# row_number() OVER([partition_by_clause] order_by_clause)  
Returns an ascending sequence of integers, starting with 1. Starts the sequence over for each group produced by the PARTITIONED BY clause. The output sequence includes different values for duplicate input values. Therefore, the sequence never contains any duplicates or gaps, regardless of duplicate input values.
