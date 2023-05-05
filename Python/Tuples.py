def compute_hash(n, elements):
    t = tuple(elements)
    return hash(t)

# Read input
n = int(input())
elements = list(map(int, input().split()))

# Compute hash and print result
result = compute_hash(n, elements)
print(result)
