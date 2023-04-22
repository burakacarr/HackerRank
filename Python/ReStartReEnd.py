def find_substring_indices(s, k):
    found = False
    for i in range(len(s) - len(k) + 1):
        if s[i:i+len(k)] == k:
            found = True
            print(f"({i}, {i + len(k) - 1})")

    if not found:
        print("(-1, -1)")

s = input()
k = input()

find_substring_indices(s, k)
