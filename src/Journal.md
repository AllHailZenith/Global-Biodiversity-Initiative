Phase 1
I created a HashMap to store five species and their population counts. A HashMap is better than an array or ArrayList because it uses species names as keys, making it easier to find and update population counts.

Phase 2
I checked whether each species was already in the HashMap. If it existed, I increased its count by one. If it was new, I added it with a count of one. The hardest part was making sure the file was in the correct location and reading each line properly.

Phase 3
I added a loop to find the species with the highest and lowest population counts. Looking up one species by name is faster because a HashMap usually provides constant-time lookup. Finding the highest and lowest counts requires checking every species.

Phase 4
I tested different field report scenarios to check how the program handles species counts. I also considered what happens when the file is empty or a species appears multiple times. An AI tutor could suggest checking for empty lines and handling a missing file. I would use those changes because they help prevent errors and make the program more reliable.