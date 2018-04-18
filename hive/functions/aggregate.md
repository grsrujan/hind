## avg(col)   
Returns the average of the elements in the group or the average of the distinct values of the column in the group.  
## count([DISTINCT] col)  
count(*) - Returns the total number of retrieved rows, including rows containing NULL values. count(expr) - Returns the number of rows for which the supplied expression is non-NULL. count(DISTINCT expr[, expr]) - Returns the number of rows for which the supplied expression(s) are unique and non-NULL. Execution of this can be optimized with hive.optimize.distinct.rewrite.
## stddev_pop(col)  
Returns the standard deviation of a numeric column in the group.  
## stddev_samp(col) 
Returns the unbiased sample standard deviation of a numeric column in the group.  
## sum(col)  
Returns the sum of the elements in the group or the sum of the distinct values of the column in the group.  
## max(col)  
Returns the maximum value of the column in the group.  
## min(col)  
Returns the minimum of the column in the group.  
## corr(col1, col2)  
Returns the Pearson coefficient of correlation of a pair of a numeric columns in the group.  
## covar_pop(col1, col2)  
Returns the population covariance of a pair of numeric columns in the group.  
## covar_samp(col1, col2)  
Returns the sample covariance of a pair of a numeric columns in the group.  
## collect_set(col)  
Returns a set of objects with duplicate elements eliminated. 
## collect_list(col)  
Returns a list of objects with duplicates. (As of Hive 0.13.0.)
## array<struct {'x', 'y'}> histogram_numeric(col, b)  
Computes a histogram of a numeric column in the group using b non-uniformly spaced bins. The output is an array of size b of double-valued (x,y) coordinates that represent the bin centers and heights
## ntile(INT x)  
Divides an ordered partition into x groups called buckets and assigns a bucket number to each row in the partition. This allows easy calculation of tertiles, quartiles, deciles, percentiles and other common summary statistics. (As of Hive 0.11.0.)
## percentile(BIGINT col, p), array<DOUBLE> percentile(BIGINT col, array(p1 [, p2]...))  
Returns the exact pth percentile (or percentiles p1, p2, ..) of a column in the group (does not work with floating point types). p must be between 0 and 1. NOTE: A true percentile can only be computed for integer values. Use PERCENTILE_APPROX if your input is non-integral.  
  
## percentile_approx(DOUBLE col, p, [, B]), array<DOUBLE> percentile_approx(DOUBLE col, array(p1 [, p2]...), [, B])  
Returns an approximate pth percentile (or percentiles p1, p2, ..) of a numeric column (including floating point types) in the group. The B parameter controls approximation accuracy at the cost of memory. Higher values yield better approximations, and the default is 10,000. When the number of distinct values in col is smaller than B, this gives an exact percentile value.
  
## variance(col)  
Returns the variance of a numeric column in the group.
## var_pop(col)  
Returns the variance of a numeric column in the group. 
## var_samp(col)  
Returns the unbiased sample variance of a numeric column in the group.
## regr_avgx(T independent, T dependent)  
Equivalent to avg(dependent). As of Hive 2.2.0.
## regr_avgy(T independent, T dependent)  
Equivalent to avg(dependent). As of Hive 2.2.0.
## regr_count(T independent, T dependent)  
Returns the number of non-null pairs used to fit the linear regression line. As of Hive 2.2.0.
## regr_intercept(T independent, T dependent)  
Returns the y-intercept of the linear regression line, i.e. the value of b in the equation dependent = a * independent + b. As of Hive 2.2.0.
## regr_r2(T independent, T dependent)  
Returns the coefficient of determination for the regression. As of Hive 2.2.0.
## regr_slope(T independent, T dependent)  
Returns the slope of the linear regression line, i.e. the value of a in the equation dependent = a * independent + b. As of Hive 2.2.0.
## regr_sxx(T independent, T dependent)  
Equivalent to regr_count(independent, dependent) * var_pop(dependent). As of Hive 2.2.0.
## regr_sxy(T independent, T dependent)  
Equivalent to regr_count(independent, dependent) * covar_pop(independent, dependent). As of Hive 2.2.0.
## regr_syy(T independent, T dependent)  
Equivalent to regr_count(independent, dependent) * var_pop(independent). As of Hive 2.2.0.
