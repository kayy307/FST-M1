while True:
    user1 = input("do u want to select rock , paper or scissors")
    user2 = input("do u want to select rock , paper or scissors")
    if user1 == user2:
        print("game tie")
    elif user1 == 'paper':
        if user2 == 'scissors':
            print("scissors wins")
        else:
            print("paper wins")
    elif user1 == 'rock':
        if user2 == 'scissors':
            print("rock wins")
        else:
            print("scissors wins")
    elif user1 == 'rock':
        if user2 == 'paper':
            print("paper wins")
        else:
            print("rock wins")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")
    again = input("dp u want to play the game again yes/no  ").lower()
    if (again == "yes"):
        pass
    elif (again == "no"):
        raise SystemExit
    else:
        print(("invalid option"))
        raise SystemExit




