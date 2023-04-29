# Read the number of students' records
n = int(input())

# Initialize the dictionary for storing students' marks
students_marks = {}

# Read students' marks and store them in the dictionary
for _ in range(n):
    name, *marks = input().split()
    students_marks[name] = list(map(float, marks))

# Read the query_name
query_name = input()

# Calculate the average marks for the queried student
average_marks = sum(students_marks[query_name]) / len(students_marks[query_name])

# Print the average marks rounded to 2 decimal places
print("{:.2f}".format(average_marks))
