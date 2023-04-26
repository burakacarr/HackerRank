if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    # Remove duplicates and sort the list in descending order
unique_scores = sorted(set(arr), reverse=True)

# Print the runner-up score
print(unique_scores[1])