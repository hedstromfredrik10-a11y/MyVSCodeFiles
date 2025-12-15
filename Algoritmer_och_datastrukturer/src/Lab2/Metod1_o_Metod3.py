import matplotlib.pyplot as plt

# Antal element i respektive datafil (Fyll i rätt värden!)
antal_element = [3643, 3644, 7664, 10820, 15326, 22989, 45438]

# Exekveringstider (sekunder)
method1 = [0.39, 0.053, 0.845, 0.649, 3.339, 7.346, 33.247]
method3 = [0.477, 0.001, 1.356, 0.000, 5.277, 11.493, 56.528]

plt.figure()

plt.plot(antal_element, method1, marker='o', label='Method 1')
plt.plot(antal_element, method3, marker='o', label='Method 3')

plt.xlabel('Antal element (n)')
plt.ylabel('Exekveringstid (sekunder)')
plt.title('Exekveringstid för Method 1 och Method 3')
plt.legend()
plt.grid(True)

plt.show()
