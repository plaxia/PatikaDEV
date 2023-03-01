
# Adventure Game
We are making a text-based adventure game with Java.

CHARACTERS

| Characters|ID   |Damage| Health  | Coin|
| ------------- | ---------------- |  ------------- | ------------- | ---|
| Samurai | 1 | 5 | 21 | 15 |
| Archer | 2 | 7 | 18 | 20 | 
| Warrior | 3 | 8 | 24 | 5 |

OBSTACLES

| Obstacle|ID   |Damage| Health  | Coin|
| :-------------: | :----------------: |  :-------------: | :-------------: | :---:|
| Zombie | 1 | 3 | 10 | 4 | 
| Vampire |2 | 4 | 14 | 7 |
| Bear | 3 | 7 | 20 | 12 |

TOOLS

| Tool |ID   |Damage|  Coin|
| :-------------: | :----------------: |  :-------------: | :-------------: |
| Pistol  | 1 | 2 |25| 
| Sword |2 | 3 | 35 | 
| Shotgun | 3 | 7 | 45 |


Armors

| Armor |ID   |Damage| Health  |
| :-------------: | :----------------: |  :-------------: | :-------------: |
| Iron | 1 | 1 | 15 | 
| Gold | 2 | 3 | 25 | 
| Diamond| 3 | 5 | 40 |

## Places

- Safe House
    - Feature : Your health will refresh.
- Cave

    - Obstacle : Zombie (1-3 Pieces)
    - Feature : Fight + Loot
    - Stuff :  Food

- Forest

    - Obstacle : Vampire (1-3 Pieces)
    - Feature : Fight + Loot
    - Stuff : Firewood

- River

    - Obstacle  : Bear (1-3 Pieces)
    - Feature : Fight + Loot
    - Stuff : Water

- Store
    - Feature : Buying Supporting Items
    - Tool : Pistol,Sword,Shotgun
    - Armor : Iron,Gold,Diamond

# UML Diagram

![class-diagram](class-diagram.jpg)

# Tasks

1. In order to finish the game, after all the enemies in the war zones are cleared, the player will receive the zone-specific reward.
   should be added to the inventory. If the player can collect all the prizes and return to the "Safe House", they win the game. Also the award
   It is not possible to re-enter the won zone.
## Awards :

- Cave => Food

- Forest => Firewood

- River => Water
## Features :

2. 50% chance to determine who will make the first move when the player encounters a monster.


3. The aim of "Mine" zone is to earn random coins, weapons or armor from defeated opponents.
   to have a possibility.

- Place  : Mine

- Obstacle : Snake (1-5 Pieces)

- Feature : Fight + Loot

- Stuff : Coin, Tool or Armor

### Snake Features :

- ID : 4

- Damage : Random (between 3 and 6)

- Health :12

- Coin : Not (Chances of getting items instead)

### Items dropped from a defeated opponent :

- Probablity of Winning Weapons : 15%

    - Shotgun : 20%

    - Sword	  : 30%

    - Pistol  : 50%

- Probablity of Winning Armors : 15%

    - Diamond Armor : 20%

    - Gold Armor : 30%

    - Iron Armor : 50%

- Probablity of Winning Coins : 25%

    - 10 Coins : 20%

    - 5 Coins: 30%

    - 1 Coins: 50%

- Chances of not winning anything : 45%