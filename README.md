This is a basic perceptron algorithm for machine learning.
It is only effective on linearly seperable data.

### EXAMPLE OUTPUT

```
Creating 1000 random datapoints in 2 dimensions
Positive classifications: 58
Negative classifications: 942
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 5 steps to find the hyperplane. Time elapsed: 1ms
True hyperplane f(x): {w0: -0.77, w1: 0.68, w2: 0.47}
Trained hyperplane g(x): {w0: -0.77, w1: 0.71, w2: 0.41}
Average error^2 vector of final hyperplane: 0.0022749154370089193 (lower is better)
```
```
Creating 1000 random datapoints in 3 dimensions
Positive classifications: 839
Negative classifications: 161
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 151 steps to find the hyperplane. Time elapsed: 6ms
True hyperplane f(x): {w0: 0.62, w1: -0.17, w2: 0.67, w3: -0.57}
Trained hyperplane g(x): {w0: 0.62, w1: -0.15, w2: 0.68, w3: -0.57}
Average error^2 vector of final hyperplane: 9.90146486815812E-5 (lower is better)
```
```
Creating 1000 random datapoints in 4 dimensions
Positive classifications: 949
Negative classifications: 51
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 70 steps to find the hyperplane. Time elapsed: 2ms
True hyperplane f(x): {w0: 0.79, w1: -0.52, w2: 0.48, w3: 0.12, w4: -0.49}
Trained hyperplane g(x): {w0: 0.79, w1: -0.52, w2: 0.49, w3: 0.13, w4: -0.49}
Average error^2 vector of final hyperplane: 3.2965796749930396E-5 (lower is better)
```
```
Creating 1000 random datapoints in 5 dimensions
Positive classifications: 402
Negative classifications: 598
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 106 steps to find the hyperplane. Time elapsed: 5ms
True hyperplane f(x): {w0: -0.15, w1: 0.82, w2: -0.51, w3: -0.48, w4: -0.66, w5: -0.28}
Trained hyperplane g(x): {w0: -0.15, w1: 0.83, w2: -0.52, w3: -0.48, w4: -0.67, w5: -0.29}
Average error^2 vector of final hyperplane: 7.315179552615797E-5 (lower is better)
```
```
Creating 1000 random datapoints in 6 dimensions
Positive classifications: 743
Negative classifications: 257
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 28 steps to find the hyperplane. Time elapsed: 0ms
True hyperplane f(x): {w0: 0.61, w1: -0.58, w2: -0.11, w3: 0.71, w4: 0.93, w5: 0.79, w6: -0.59}
Trained hyperplane g(x): {w0: 0.61, w1: -0.58, w2: -0.12, w3: 0.69, w4: 0.94, w5: 0.79, w6: -0.58}
Average error^2 vector of final hyperplane: 6.866579839798888E-5 (lower is better)
```
```
Creating 1000 random datapoints in 7 dimensions
Positive classifications: 497
Negative classifications: 503
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 132 steps to find the hyperplane. Time elapsed: 3ms
True hyperplane f(x): {w0: -0.05, w1: 0.87, w2: 0.13, w3: -0.41, w4: -0.71, w5: 0.92, w6: 0.57, w7: -0.07}
Trained hyperplane g(x): {w0: -0.05, w1: 0.93, w2: 0.10, w3: -0.42, w4: -0.74, w5: 0.95, w6: 0.59, w7: -0.06}
Average error^2 vector of final hyperplane: 0.0011171811170798426 (lower is better)
```
```
Creating 1000 random datapoints in 8 dimensions
Positive classifications: 399
Negative classifications: 601
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 2537 steps to find the hyperplane. Time elapsed: 58ms
True hyperplane f(x): {w0: -0.26, w1: 0.58, w2: 0.89, w3: 0.34, w4: -0.18, w5: -0.62, w6: -0.93, w7: -0.43, w8: 0.32}
Trained hyperplane g(x): {w0: -0.26, w1: 0.59, w2: 0.90, w3: 0.35, w4: -0.19, w5: -0.64, w6: -0.94, w7: -0.43, w8: 0.31}
Average error^2 vector of final hyperplane: 7.695164705533342E-5 (lower is better)
```
```
Creating 1000 random datapoints in 9 dimensions
Positive classifications: 391
Negative classifications: 609
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 343 steps to find the hyperplane. Time elapsed: 8ms
True hyperplane f(x): {w0: -0.33, w1: 0.52, w2: -0.21, w3: 0.98, w4: -0.10, w5: 0.60, w6: 0.11, w7: -0.93, w8: 0.65, w9: -0.75}
Trained hyperplane g(x): {w0: -0.33, w1: 0.54, w2: -0.23, w3: 0.96, w4: -0.11, w5: 0.58, w6: 0.11, w7: -0.93, w8: 0.64, w9: -0.72}
Average error^2 vector of final hyperplane: 3.065350086825893E-4 (lower is better)
```
```
Creating 1000 random datapoints in 10 dimensions
Positive classifications: 441
Negative classifications: 559
Attempting to run the perceptron algorithm to find the hyperplane...
Success! The perceptron algorithm took 170 steps to find the hyperplane. Time elapsed: 4ms
True hyperplane f(x): {w0: -0.13, w1: 0.06, w2: -0.52, w3: 0.84, w4: -0.60, w5: 0.03, w6: -0.37, w7: -0.44, w8: 0.30, w9: -0.96, w10: -0.92}
Trained hyperplane g(x): {w0: -0.13, w1: 0.07, w2: -0.52, w3: 0.83, w4: -0.60, w5: 0.05, w6: -0.37, w7: -0.42, w8: 0.28, w9: -0.96, w10: -0.92}
Average error^2 vector of final hyperplane: 1.0941876225374332E-4 (lower is better)
```
```
STRESS TEST! 50D hyperplane with 100,000 datapoints!

Creating 100000 random datapoints in 50 dimensions
Positive classifications: 45591
Negative classifications: 54409
Attempting to run the perceptron algorithm to find the hyperplane...
```