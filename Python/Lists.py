def process_commands(commands):
    result_list = []
    
    for command in commands:
        cmd_parts = command.split()
        cmd = cmd_parts[0]
        
        if cmd == "insert":
            i, e = int(cmd_parts[1]), int(cmd_parts[2])
            result_list.insert(i, e)
        elif cmd == "print":
            print(result_list)
        elif cmd == "remove":
            e = int(cmd_parts[1])
            result_list.remove(e)
        elif cmd == "append":
            e = int(cmd_parts[1])
            result_list.append(e)
        elif cmd == "sort":
            result_list.sort()
        elif cmd == "pop":
            result_list.pop()
        elif cmd == "reverse":
            result_list.reverse()

# Read the input and process the commands
n = int(input().strip())
commands = []
for _ in range(n):
    commands.append(input().strip())

process_commands(commands)
