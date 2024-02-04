This is a basic perceptron algorithm for machine learning.
It is only effective on linearly seperable data.

### EXAMPLE OUTPUT

Creating 1000 random datapoints in 2 dimensions
Positive classifications: 198
Negative classifications: 802
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 22 steps to find the hyperplane. Time elapsed: 2ms
Goal hyperplane: {w0: -0.35, w1: 0.55, w2: -0.46}
Found hyperplane: {w0: -0.35, w1: 0.54, w2: -0.47}
Average error^2 vector of final hyperplane: 1.550944653873566E-5 (lower is better)

Creating 1000 random datapoints in 3 dimensions
Positive classifications: 357
Negative classifications: 643
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 173 steps to find the hyperplane. Time elapsed: 8ms
Goal hyperplane: {w0: -0.30, w1: -0.91, w2: 0.52, w3: 0.66}
Found hyperplane: {w0: -0.30, w1: -0.90, w2: 0.52, w3: 0.66}
Average error^2 vector of final hyperplane: 5.080561670509716E-5 (lower is better)

Creating 1000 random datapoints in 4 dimensions
Positive classifications: 513
Negative classifications: 487
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 371 steps to find the hyperplane. Time elapsed: 13ms
Goal hyperplane: {w0: 0.01, w1: 0.43, w2: -0.46, w3: -0.40, w4: 0.26}
Found hyperplane: {w0: 0.01, w1: 0.42, w2: -0.44, w3: -0.39, w4: 0.25}
Average error^2 vector of final hyperplane: 2.077951761845838E-4 (lower is better)

Creating 1000 random datapoints in 5 dimensions
Positive classifications: 527
Negative classifications: 473
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 172 steps to find the hyperplane. Time elapsed: 8ms
Goal hyperplane: {w0: 0.07, w1: 0.31, w2: 0.86, w3: 0.68, w4: -0.99, w5: 0.69}
Found hyperplane: {w0: 0.07, w1: 0.32, w2: 0.94, w3: 0.74, w4: -1.07, w5: 0.74}
Average error^2 vector of final hyperplane: 0.003413070451100254 (lower is better)

Creating 1000 random datapoints in 6 dimensions
Positive classifications: 234
Negative classifications: 766
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 60 steps to find the hyperplane. Time elapsed: 2ms
Goal hyperplane: {w0: -0.61, w1: 0.66, w2: -0.11, w3: -0.88, w4: 0.58, w5: -0.23, w6: -0.37}
Found hyperplane: {w0: -0.61, w1: 0.66, w2: -0.12, w3: -0.88, w4: 0.57, w5: -0.24, w6: -0.35}
Average error^2 vector of final hyperplane: 1.3148512074140714E-4 (lower is better)

Creating 1000 random datapoints in 7 dimensions
Positive classifications: 103
Negative classifications: 897
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 607 steps to find the hyperplane. Time elapsed: 11ms
Goal hyperplane: {w0: -0.96, w1: -0.65, w2: 0.82, w3: -0.15, w4: 0.75, w5: -0.25, w6: 0.04, w7: -0.29}
Found hyperplane: {w0: -0.96, w1: -0.66, w2: 0.80, w3: -0.16, w4: 0.76, w5: -0.26, w6: 0.03, w7: -0.29}
Average error^2 vector of final hyperplane: 1.4824000338323708E-4 (lower is better)

Creating 1000 random datapoints in 8 dimensions
Positive classifications: 794
Negative classifications: 206
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 44 steps to find the hyperplane. Time elapsed: 1ms
Goal hyperplane: {w0: 0.63, w1: 0.58, w2: 0.23, w3: -0.11, w4: -0.08, w5: 0.77, w6: -0.64, w7: -0.40, w8: -0.69}
Found hyperplane: {w0: 0.63, w1: 0.58, w2: 0.22, w3: -0.12, w4: -0.08, w5: 0.78, w6: -0.64, w7: -0.41, w8: -0.70}
Average error^2 vector of final hyperplane: 6.639040013039245E-5 (lower is better)

Creating 1000 random datapoints in 9 dimensions
Positive classifications: 681
Negative classifications: 319
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 789 steps to find the hyperplane. Time elapsed: 21ms
Goal hyperplane: {w0: 0.58, w1: 0.40, w2: -0.87, w3: -0.26, w4: -0.04, w5: -0.05, w6: 0.62, w7: 0.87, w8: 0.87, w9: 1.00}
Found hyperplane: {w0: 0.58, w1: 0.36, w2: -0.87, w3: -0.25, w4: -0.03, w5: -0.04, w6: 0.59, w7: 0.86, w8: 0.89, w9: 0.98}
Average error^2 vector of final hyperplane: 3.2680012866116405E-4 (lower is better)

Creating 1000 random datapoints in 10 dimensions
Positive classifications: 175
Negative classifications: 825
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 145 steps to find the hyperplane. Time elapsed: 3ms
Goal hyperplane: {w0: -0.92, w1: -0.21, w2: -0.12, w3: 0.31, w4: 0.60, w5: -0.79, w6: -0.68, w7: 0.63, w8: 0.45, w9: -0.30, w10: 0.76}
Found hyperplane: {w0: -0.92, w1: -0.22, w2: -0.09, w3: 0.25, w4: 0.58, w5: -0.80, w6: -0.64, w7: 0.67, w8: 0.42, w9: -0.31, w10: 0.74}
Average error^2 vector of final hyperplane: 7.603808313134811E-4 (lower is better)

STRESS TEST! 50D hyperplane with 500,000 datapoints!

Creating 500000 random datapoints in 50 dimensions
Positive classifications: 268845
Negative classifications: 231155
Attempting to run the perceptron algorithm to find the hyperplane...