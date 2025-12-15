import numpy as np
import matplotlib.pyplot as plt

n = np.array([3643, 3644, 7664, 10820, 15326, 22989, 45438])

method1 = np.array([0.39, 0.053, 0.845, 0.649, 3.339, 7.346, 33.247])
method3 = np.array([0.477, 0.001, 1.356, 0.000, 5.277, 11.493, 56.528])

plt.figure()
plt.loglog(n, method1, 'o-', label='Method 1')
plt.loglog(n, method3, 'o-', label='Method 3')

ref_n2 = n**2
ref_n2 = ref_n2 / ref_n2.max() * method1.max()

plt.loglog(n, ref_n2, '--', label='Referens: O(n^2)')

plt.xlabel('log(n)')
plt.ylabel('log(tid)')
plt.title('Log-log-plot för Method 1 och Method 3')
plt.legend()
plt.grid(True)

plt.xlim(min(n) * 0.8, max(n) * 1.2)
plt.ylim(1e-4, 1e2)

plt.show()
