import matplotlib.pyplot as plt

# Antal element i respektive datafil (Fyll i rätt värden!)
antal_element = [3643, 3644, 7664, 10820, 15326, 22989, 45438]

# Exekveringstider (sekunder)
method2 = [0.059, 0.058, 0.004, 0.508, 0.009, 0.017, 0.079]
method4 = [0.002, 0.002, 0.005, 0.007, 0.011, 0.016, 0.040]

plt.figure()

plt.plot(antal_element, method2, marker='o', label='Method 2')
plt.plot(antal_element, method4, marker='o', label='Method 4')

plt.xlabel('Antal element (n)')
plt.ylabel('Exekveringstid (sekunder)')
plt.title('Exekveringstid för Method 2 och Method 4')
plt.legend()
plt.grid(True)

plt.show()
