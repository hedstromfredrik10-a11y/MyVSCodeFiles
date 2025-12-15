import numpy as np
import matplotlib.pyplot as plt

# Antal element i respektive datafil (Fyll i rätt värden!)
n = [3643, 3644, 7664, 10820, 15326, 22989, 45438]

method2 = np.array([0.059, 0.058, 0.004, 0.508, 0.009, 0.017, 0.079])
method4 = np.array([0.002, 0.002, 0.005, 0.007, 0.011, 0.016, 0.040])

plt.figure()
plt.loglog(n, method2, 'o-', label='Method 2')
plt.loglog(n, method4, 'o-', label='Method 4')

ref_nlogn = n * np.log2(n)
ref_nlogn = ref_nlogn / ref_nlogn.max() * max(method2.max(), method4.max())

plt.loglog(n, ref_nlogn, '--', label='Referens: O(n log n)')

plt.xlabel('log(n)')
plt.ylabel('log(tid)')
plt.title('Log-log-plot för Method 2 och Method 4')
plt.legend()
plt.grid(True)

plt.xlim(min(n) * 0.8, max(n) * 1.2)
plt.ylim(1e-3, 1e0)

plt.show()
