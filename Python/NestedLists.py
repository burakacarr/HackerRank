if __name__ == '__main__':
    students = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name, score])
        
    # Find the unique grades and sort them
    unique_grades = sorted(set([s[1] for s in students]))

    # Find the second lowest grade
    second_lowest_grade = unique_grades[1]

    # Find the students with the second lowest grade
    second_lowest_students = sorted([s[0] for s in students if s[1] == second_lowest_grade])

    # Print the names of the students with the second lowest grade
    for student in second_lowest_students:
        print(student)
